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
        topLike.remove((Object) id);
        topStream.remove((Object) id);
        // cap nhat list song of artist
        for(String i : songs.get(id).singers){
            List<Integer> list = listSongOfArtist.get(i);
            if(list.size() == 0){
                listSongOfArtist.remove(i);
                continue;
            }
            list.remove((Object) id);
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

    public void sortTop(int mode){
        int n = (mode == 0) ? topLike.size() : topStream.size();
        for(int i = 0; i < n; i++)
            for(int j = i + 1; j < n; j++){
                if(_check(mode, i, j)){
                    _swap(mode, i, j);
                }
            }

    }

    // private
    private void _swap(int mode, int i, int j){
        if(mode == 0){
            // mode = 0: like
            int temp = topLike.get(i);
            topLike.set(i, topLike.get(j));
            topLike.set(j, temp);
        }
        else {
            int temp = topStream.get(i);
            topStream.set(i, topStream.get(j));
            topStream.set(j, temp);
        }
    }

    private boolean _check(int mode, int i, int j){
        if(mode == 0){
            // mode = 0: like
            return songs.get(topLike.get(i)).like < songs.get(topLike.get(j)).like;
        }
        return songs.get(topStream.get(i)).stream < songs.get(topStream.get(j)).stream;
    }
}
