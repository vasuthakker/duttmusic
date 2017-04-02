package com.example.android.uamp.interfaces;

import com.example.android.uamp.model.SongEntity;

import java.util.List;

/**
 * Created by vasu on 4/1/2017.
 */

public interface DataProvider {
    List<SongEntity> getSongs(int type);
}
