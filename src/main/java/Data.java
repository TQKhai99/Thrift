import java.util.*;

public class Data {
    private static Data instance;

    private Map<Integer, SongStruct> songs = new HashMap<>(); // luu danh sach bai hat
    private List<Integer> topLike = new LinkedList<>(); // luu list id bai hat theo like
    private List<Integer> topStream = new LinkedList<>(); // luu list id bai hat theo stream
    private Map<String, List<Integer>> listSongOfArtist = new HashMap<>(); // luu ten ca si + list id bai hat

    private int maxId = 0;

    private Object lockLike = new Object();
    private Object lockStream = new Object();
    private Object lockID = new Object();
    
    
    // constructor singleton
    private Data(){
        put("Hello", Arrays.asList("Adele"));
        put("Hello2", Arrays.asList("Adele", "BP"));
        put("HBPD", Arrays.asList("Adele"));
        put("HBNY", Arrays.asList("BP"));
        put("School", Arrays.asList("Adele"));
        put("Class", Arrays.asList("Adele", "BP"));
    }
    public static Data getInstance(){
        return (instance == null) ? new Data() : instance;
    }

    public Error put(String title, List<String> singers) {
        int id;
        synchronized (lockID){
            id = maxId;
            maxId += 1;
        }
        songs.put(id, new SongStruct(id, title, singers, 0, 0));
        topLike.add(id);
        topStream.add(id);
        for(String singer: singers){
            List<Integer> listSong = listSongOfArtist.get(singer);
            if(listSong == null){
                listSong = new LinkedList<>();
                listSongOfArtist.put(singer, listSong);
            }
            listSong.add(id);
        }
        return Error.SUCCESS;
    }

    public SongResult get(int id){
        SongResult res = new SongResult();
        if(!songs.containsKey(id)){
            res.setError(Error.INVALID_DATA);
            return res;
        }
        res.setError(Error.SUCCESS);
        res.setSong(songs.get(id));
        return res;
    }

    
    public Error remove(int id){
        if(!songs.containsKey(id)) {
            return Error.INVALID_DATA;
        }
        topLike.remove(id);
        topStream.remove(id);
        // remove trong danh sach ca si
        for(String i: songs.get(id).singers){
            listSongOfArtist.get(i).remove(_search(listSongOfArtist.get(i), id));
        }
        songs.remove(id);
        return Error.SUCCESS;
    }

    
    public Error stream(int id){
        if(!songs.containsKey(id)) {
            return Error.INVALID_DATA;
        }
        synchronized (lockStream){
            SongStruct song = songs.get(id);
            song.setStream(song.stream + 1);
            songs.put(id, song);
        }
        return Error.SUCCESS;

    }

    
    public Error like(int id){
        if(!songs.containsKey(id)){
            return Error.INVALID_DATA;
        }
        synchronized (lockLike){
            SongStruct song = songs.get(id);
            song.setLike(song.like + 1);
            songs.put(id, song);
        }
        return Error.SUCCESS;
    }

    
    public Error unlike(int id){
        if(!songs.containsKey(id)){
            return Error.INVALID_DATA;
        }
        synchronized (lockLike){
            SongStruct song = songs.get(id);
            song.setLike((song.like > 0) ? song.like - 1 : 0);
            songs.put(id, song);
        }
        return Error.SUCCESS;
    }

    
    public ListSongResult getTopStream(int topX){
        ListSongResult res = new ListSongResult(Error.SUCCESS);
        res.setListSong(topStream.subList(0, (topX > topStream.size()) ? topStream.size() : topX));
        return res;
    }

    
    public ListSongResult getTopLike(int topX){
        ListSongResult res = new ListSongResult(Error.SUCCESS);
        res.setListSong(topLike.subList(0, (topX > topLike.size()) ? topLike.size() : topX));
        return res;
    }

    
    public ListSongResult getListSongOfSinger(String name) {
        ListSongResult res = new ListSongResult();
        if(!listSongOfArtist.containsKey(name)) {
            res.setError(Error.INVALID_DATA);
            return res;
        }
        res.setError(Error.SUCCESS);
        res.setListSong(listSongOfArtist.get(name));
        return res;
    }

    public void sortTopStream(){
        int n = topStream.size();
        for(int i = 1; i < n; i++){
            int key = songs.get(topStream.get(i)).stream;
            int j = i - 1;
            while (j >= 0 && songs.get(topStream.get(j)).stream < key){
                topStream.set(j + 1, j);
                j -= 1;
            }
            topStream.set(j + 1, i);
        }
    }

    public void sortTopLike(){
        int n = topLike.size();
        for(int i = 1; i < n; i++){
            int key = songs.get(topLike.get(i)).like;
            int j = i - 1;
            while (j >= 0 && songs.get(topLike.get(j)).like < key){
                topLike.set(j + 1, j);
                j -= 1;
            }
            topLike.set(j + 1, i);
        }
    }

    // private

    private int _search(List<Integer> a, int val){
        for(int i = 0; i < a.size(); i++)
            if(a.get(i) == val) return i;
        return -1;
    }
    
}
