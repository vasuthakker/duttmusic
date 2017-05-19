package com.example.android.uamp.provider;

import com.example.android.uamp.interfaces.DataProvider;
import com.example.android.uamp.model.SongEntity;

import java.util.ArrayList;
import java.util.List;

import static com.example.android.uamp.provider.Lyrics.LYRICS;


/**
 * Created by vasu on 4/1/2017.
 */

public class SongProvider implements DataProvider {
    private static final String TAG = "DataProvider";

    @Override
    public List<SongEntity> getSongs() {
        List<SongEntity> songList = new ArrayList<>();
        songList.add(new SongEntity("Aanand no garbo", LYRICS, "Hari Cassettes", "anand.mp3", "", 1, 1, 2160,0));
        return songList;
    }

}



