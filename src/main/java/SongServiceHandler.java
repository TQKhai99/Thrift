
import org.apache.thrift.TException;

import java.util.*;

public class SongServiceHandler implements SongService.Iface{
    private Map<Integer, SongStruct> songs = new HashMap<>(); // luu danh sach bai hat
    private List<Integer> topLike = new LinkedList<>(); // luu list id bai hat theo like
    private List<Integer> topStream = new LinkedList<>(); // luu list id bai hat theo stream
    private Map<String, List<Integer>> listSongOfArtist = new HashMap<>(); // luu ten ca si + list id bai hat
    private int maxId = 0;
    public SongServiceHandler() {
        put("Hello", Arrays.asList("Adele"));
        put("Hello2", Arrays.asList("Adele", "BP"));
        put("HBPD", Arrays.asList("Adele"));
        put("HBNY", Arrays.asList("BP"));
        put("School", Arrays.asList("Adele"));
        put("Class", Arrays.asList("Adele", "BP"));
    }

    @Override
    public int put(String title, List<String> singers) {

        int id = maxId;
        maxId += 1;
        songs.put(id, new SongStruct(id, title, singers, 0, 0));

        topLike.add(id);
        topStream.add(id);
        for(String singer: singers){
            List<Integer> listsong = new LinkedList<>();
            //add new song
            listsong.add(id);
            // check list cu
            if(listSongOfArtist.containsKey(singer)){
                listsong.addAll(listSongOfArtist.get(singer));
            }
            listSongOfArtist.put(singer, listsong);
        }
        return 200;
    }

    @Override
    public SongResult get(int id){
        SongResult res = new SongResult(404);
        if(!songs.containsKey(id)){
            return res;
        }
        res.setError(200);
        res.setSong(songs.get(id));
        return res;
    }

    @Override
    public int remove(int id){
        if(songs.containsKey(id)) {
            topLike.remove(id);
            topStream.remove(id);
            songs.remove(id);
            return 200;
        }
        return 404;
    }

    private int _search(List<Integer> a, int val){
        for(int i = 0; i < a.size(); i++)
            if(a.get(i) == val) return i;
            return -1;
    }

    @Override
    public int stream(int id){
        if(songs.containsKey(id)) {
            SongStruct song = songs.get(id);
            song.setStream(song.stream + 1);
            songs.put(id, song);

            int index = _search(topStream, id) - 1;
            while(index >=0 && song.stream > songs.get(topStream.get(index)).stream){
                topStream.set(index + 1, topStream.get(index));
                index -= 1;
            }
            topStream.set(index + 1, id);
            return 200;
        }
        return 404;
    }

    @Override
    public int like(int id){
        if(songs.containsKey(id)){
            SongStruct song = songs.get(id);
            song.setLike(song.like + 1);
            songs.put(id, song);

            int index = _search(topLike, id) - 1;
            while(index >=0 && song.like > songs.get(topLike.get(index)).like){
                topLike.set(index + 1, topLike.get(index));
                index -= 1;
            }
            topLike.set(index + 1, id);
            return 200;
        }
        return 404;
    }

    @Override
    public int unlike(int id){
        if(songs.containsKey(id)){
            SongStruct song = songs.get(id);
            song.setLike(song.like - 1);
            songs.put(id, song);

            int index = _search(topLike, id) + 1;
            while(index < topLike.size() && song.like < songs.get(topLike.get(index)).like){
                topLike.set(index - 1, topLike.get(index));
                index += 1;
            }
            topLike.set(index - 1, id);

            return 200;
        }
        return 404;
    }

    @Override
    public SongResult getTop5Stream(){
        SongResult res = new SongResult(200);
        res.setListsong(topStream.subList(0,5));
        return res;
    }

    @Override
    public SongResult getTop5Like(){
        SongResult res = new SongResult(200);
        res.setListsong(topLike.subList(0,5));
        return res;
    }

    @Override
    public SongResult getListSongOfSinger(String name) throws TException {
        SongResult res = new SongResult(200);
        if(!listSongOfArtist.containsKey(name)) {
            res.setError(404);
            return res;
        }
        res.setListsong(listSongOfArtist.get(name));
        return res;
    }
}

