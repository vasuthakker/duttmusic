package uamp.provider;

import com.example.android.uamp.interfaces.DataProvider;
import com.example.android.uamp.model.SongEntity;

import java.util.ArrayList;
import java.util.List;

import static uamp.provider.Lyrics.AARTI_LYRICS;
import static uamp.provider.Lyrics.DHUN_LYRICS;
import static uamp.provider.Lyrics.JENA_LYRICS;
import static uamp.provider.Lyrics.LAGAN_LYRICS;
import static uamp.provider.Lyrics.LEJO_LYRICS;
import static uamp.provider.Lyrics.STUTI_LYRICS;


/**
 * Created by vasu on 4/1/2017.
 */

public class SongProvider implements DataProvider {
    private static final String TAG = "DataProvider";



    @Override
    public List<SongEntity> getSongs() {
        List<SongEntity> songList = new ArrayList<>();
        songList.add(new SongEntity("Jalaram Aarti", AARTI_LYRICS, "Hemant Chauhan", "aarti.mp3", "https://jayjaliyan.files.wordpress.com/2012/02/j11.jpg?w=840", 1, 3, 251, 0));
        songList.add(new SongEntity("Jalaram Stuti", STUTI_LYRICS, "Hemant Chauhan", "stuti.mp3", "https://jayjaliyan.files.wordpress.com/2012/02/j12.jpg", 2, 3, 237, 0));
        songList.add(new SongEntity("Jalaram Dhun", DHUN_LYRICS, "Hemant Chauhan", "dhun.mp3", "http://www.jaijaliyaan.com/images/bapa_small.jpg", 3, 3, 480, 0));
        songList.add(new SongEntity("Mane Lagan Lagi", LAGAN_LYRICS, "Hemant Chauhan", "https://firebasestorage.googleapis.com/v0/b/musicapp-24257.appspot.com/o/music%2Fmane%20lagi%20dhun.mp3?alt=media&token=f56234b3-56ec-41f6-bb25-abcdee6e2f80", "http://www.jaijaliyaan.com/images/bapa_small.jpg", 3, 3, 294, 0));
        songList.add(new SongEntity("Jena Mukh ma Jala", JENA_LYRICS, "Hemant Chauhan", "https://firebasestorage.googleapis.com/v0/b/musicapp-24257.appspot.com/o/music%2Fjena%20mukh%20ma%20jala.mp3?alt=media&token=861bfec2-7d3f-4b1c-b7d7-b86e7948d8db", "http://www.jaijaliyaan.com/images/bapa_small.jpg", 3, 3, 306, 0));
        songList.add(new SongEntity("Lejo Lejo re", LEJO_LYRICS, "Hemant Chauhan", "https://firebasestorage.googleapis.com/v0/b/musicapp-24257.appspot.com/o/music%2Flejo%20lejo%20re.mp3?alt=media&token=0000a326-d4df-46b5-8d6b-d236f5eec33f", "http://www.jaijaliyaan.com/images/bapa_small.jpg", 3, 3, 187, 0));
        songList.add(new SongEntity("Dhun(Ashok Bhayani)", "Coming Soon", "Hemant Chauhan", "https://firebasestorage.googleapis.com/v0/b/musicapp-24257.appspot.com/o/music%2FAshok%20-%20Bhayani.mp3?alt=media&token=ea9365b2-b747-4f91-b1c6-967207e6950b", "http://www.jaijaliyaan.com/images/bapa_small.jpg", 3, 3, 1752, 0));
        return songList;
    }


};



