package com.example.android.uamp.provider;

import com.example.android.uamp.interfaces.DataProvider;
import com.example.android.uamp.model.SongEntity;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by vasu on 4/1/2017.
 */

public class SongProvider implements DataProvider {
    private static final String TAG = "DataProvider";

    @Override
    public List<SongEntity> getSongs() {
        List<SongEntity> songList = new ArrayList<>();
        songList.add(new SongEntity("Dutt Bavani", "Jalaram", "Hari Cassettes", "datt.mp3", "", 1, 1, 442,0));
        return songList;
    }

}



