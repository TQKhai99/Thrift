package com.khaitq2.handler;

import com.khaitq2.data.Data;
import com.khaitq2.songservice.*;
import com.khaitq2.songservice.Error;
import org.apache.thrift.TException;

import java.util.*;

public class SongServiceHandler implements SongService.Iface {
    private Data data;

    public SongServiceHandler() {
        data = Data.getInstance();
    }

    @Override
    public Error put(String title, List<String> singers) {
        return data.put(title, singers);
    }

    @Override
    public SongResult get(int id) {
        return data.get(id);
    }

    @Override
    public Error remove(int id) {
        return data.remove(id);
    }

    @Override
    public Error stream(int id) {
        return data.stream(id);
    }

    @Override
    public Error like(int id) {
        return data.like(id);
    }

    @Override
    public Error unlike(int id) {
        return data.unlike(id);
    }

    @Override
    public ListSongResult getTopStream(int topX) {
        return data.getTopStream(topX);
    }

    @Override
    public ListSongResult getTopLike(int topX) {
        return data.getTopLike(topX);
    }

    @Override
    public ListSongResult getListSongOfSinger(String name) {
        return data.getListSongOfSinger(name);
    }

    @Override
    public Error edit(int id, String title) {
        return data.edit(id, title);
    }

    public void sortTopStream() {
        data.sortTop(1);
    }

    public void sortTopLike() {
        data.sortTop(0);
    }
}

