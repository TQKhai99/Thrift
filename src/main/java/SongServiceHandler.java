
import org.apache.thrift.TException;

import java.util.*;

public class SongServiceHandler implements SongService.Iface{
    private HashMap<Integer, SongStruct> songs = new HashMap();
    public boolean put(String title, List<String> singers) throws TException {
        int id = songs.size();
        songs.put(id, new SongStruct(id, title, singers, 0, 0));
        return true;
    }

    public SongStruct get(int id){

        if(songs.containsKey(id)){
            return songs.get(id);
        }
        return new SongStruct();
    }

    public boolean remove(int id){
        if(songs.containsKey(id)) {
            songs.remove(id);
            return true;
        }
        return false;
    }

    public boolean stream(int id){
        if(songs.containsKey(id)) {
            SongStruct song = songs.get(id);
            song.setStream(song.stream + 1);
            songs.put(id, song);
            return true;
        }
        return false;
    }
    public boolean like(int id){
        if(songs.containsKey(id)){
            SongStruct song = songs.get(id);
            song.setLike(song.like + 1);
            songs.put(id, song);
            return true;
        }
        return false;
    }

    public boolean unlike(int id){
        if(songs.containsKey(id)){
            SongStruct song = songs.get(id);
            song.setLike(song.like - 1);
            songs.put(id, song);
            return true;
        }
        return false;
    }

    public List<Integer> getTop5(boolean stream){
        ArrayList<Integer> res = new ArrayList<>(songs.keySet());


        if(stream == true){ // sort by stream
            for(int i = 0; i < res.size(); i++){
                for(int j = i + 1; j < res.size(); j++){
                    if(songs.get(res.get(i)).stream < songs.get(res.get(j)).stream){
                        int t = res.get(i);
                        res.set(i, res.get(j));
                        res.set(j, t);
                    }
                }
            }
        } else { // sort by like
            for(int i = 0; i < res.size(); i++){
                for(int j = i + 1; j < res.size(); j++){
                    if(songs.get(res.get(i)).like < songs.get(res.get(j)).like){
                        int t = res.get(i);
                        res.set(i, res.get(j));
                        res.set(j, t);
                    }
                }
            }
        }
        return res.subList(0,5);
    }
}

