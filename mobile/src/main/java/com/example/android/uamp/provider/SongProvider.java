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

    private static List<SongEntity> getJalaramList() {
        List<SongEntity> songList = new ArrayList<>();
        songList.add(new SongEntity("Jalaram Aarti", "Jalaram", "Hemant Chauhan", "aarti.mp3", "https://jayjaliyan.files.wordpress.com/2012/02/j11.jpg?w=840", 1, 3, 251,0));
        songList.add(new SongEntity("Jalaram Stuti", "Jalaram", "Hemant Chauhan", "stuti.mp3", "https://jayjaliyan.files.wordpress.com/2012/02/j12.jpg", 2, 3, 237,0));
        songList.add(new SongEntity("Jalaram Dhun", "Jalaram", "Hemant Chauhan", "dhun.mp3", "http://www.jaijaliyaan.com/images/bapa_small.jpg", 3, 3, 480,0));
        return songList;
    }

    @Override
    public List<SongEntity> getSongs(int type) {
        switch (type) {
            case TypeConstnts.JALARAM:
                return getJalaramList();
            case TypeConstnts.SLEEPING_TUNES:
                return getSleepingList();
        }
        return null;
    }

    private List<SongEntity> getSleepingList() {
        List<SongEntity> songList = new ArrayList<>();
        songList.add(new SongEntity("Chanda Hai tu", "Jalaram", "Hemant Chauhan", "chanda.mp3", "https://jayjaliyan.files.wordpress.com/2012/02/j11.jpg?w=840", 1, 1, 248,0));
        songList.add(new SongEntity("Chandaniya", "Jalaram", "Hemant Chauhan", "chandan.mp3", "https://jayjaliyan.files.wordpress.com/2012/02/j12.jpg", 1, 1, 231,0));
        songList.add(new SongEntity("Dikro Maro Ladakvayo", "Jalaram", "Hemant Chauhan", "dikro.mp3", "http://www.jaijaliyaan.com/images/bapa_small.jpg", 1, 1, 348,0));
        songList.add(new SongEntity("Gopal Maro Palaniye", "Jalaram", "Hemant Chauhan", "gopal.mp3", "http://www.jaijaliyaan.com/images/bapa_small.jpg", 1, 1, 210,0));
        songList.add(new SongEntity("Hala Karu Vala Karu", "Jalaram", "Hemant Chauhan", "hala.mp3", "http://www.jaijaliyaan.com/images/bapa_small.jpg", 1, 1, 217,0));
        songList.add(new SongEntity("Lakdi Ki Kathi", "Jalaram", "Hemant Chauhan", "lakdi.mp3", "http://www.jaijaliyaan.com/images/bapa_small.jpg", 1, 1, 238,0));
        songList.add(new SongEntity("Mere Ghar Aayi Pari", "Jalaram", "Hemant Chauhan", "pari.mp3", "http://www.jaijaliyaan.com/images/bapa_small.jpg", 7, 1, 117,0));
        songList.add(new SongEntity("Phoolon Jaisi", "Jalaram", "Hemant Chauhan", "phool.mp3", "http://www.jaijaliyaan.com/images/bapa_small.jpg", 1, 1, 324,0));
        songList.add(new SongEntity("Tame Mara Dev", "Jalaram", "Hemant Chauhan", "tame.mp3", "http://www.jaijaliyaan.com/images/bapa_small.jpg", 1, 1, 205,0));
        return songList;
    }
}



