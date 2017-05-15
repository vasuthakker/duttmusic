package uamp.provider;

import com.example.android.uamp.interfaces.DataProvider;
import com.example.android.uamp.model.SongEntity;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by vasu on 4/1/2017.
 */

public class SongProvider implements DataProvider {
    private static final String TAG = "DataProvider";
    private static final String AARTI_LYRICS="સોરઠ ભૂમિ પાવન ધામ , વીરપુર  નામે  એમાં  ગામ \n" +
            "\n" +
            "પ્રગટ્યા ત્યાં  શ્રી  જય  જલારામ  જનસેવાનું  કરવા  કામ \n" +
            "રાજબાઇ  માતાનું  નામ , પ્રધાનજી  પિતાનું  નામ \n" +
            "\n" +
            "Lohana Gnati Harkhay, Naam Samarta Raji Thay\n" +
            "Sant Padharya Ene Dwar, Rajbai A Kidho Satkar\n" +
            "\n" +
            "Ujjaval Thashe tari KuKh, Evu Bholya A NijMukh\n" +
            "Savant Atharso Chhapan Mahi, Kartak Sud Satamni Chhayn\n" +
            "\n" +
            "Ashrivadthi Pragatya Ram,Naam Padyu Shree Jay Jalaram\n" +
            "Vrudh sant Avya Te Tham, Olkhiya Shree Jay Jalaram\n" +
            "\n" +
            "Mata Pita Swadhame Gaya, Kakane Tinya Mota Thaya\n" +
            "Savant Atharso Siter Manhi, Yagyo Pavitno Vidhi Thay\n" +
            "\n" +
            "Savant Atharrso Boter Manhi; Prabhtama Pagala Mandi\n" +
            "Kakanu Sambhade Haat, Dharm Danana Manma Ghat\n" +
            "\n" +
            "Sadhu Santne Deta Dan, Raghuvirnu A Dharta Dhyan\n" +
            "Ek Same Santono Sangh, Aavi Jamavyo Bhaktino Rang\n" +
            "\n" +
            "Jalaramni Pase Aaj, Aviya Sidhu Leva Kaj\n" +
            "Jalaram Lai Mathe Bhar, Deva Chalya Ene Dvar\n" +
            "\n" +
            "Padoshine Lagi Lhay, Te Kaka Ne Kahewa Jay\n" +
            "Vahala Kaka Do Dya Tinyay, Jinya Jalaram Devane Jay\n" +
            "\n" +
            "Gabharaman Chhtuti tevar, Pat Rakhe Chhe Deen Dayal\n" +
            "Chhana Kahiya To Chhana thay, Gheena Badle Jal Dekhay\n" +
            "\n" +
            "Padoshi to Bhotho Thay, Durijan Karmo Thi Pastay\n" +
            "Jala Bhaktne Lagni Thai, Bhitar Bari Ughadi Gai\n" +
            "\n" +
            "Yatra Karva Kidhi Haam, Pachhi Fariya ae chare Dham\n" +
            "GuruKaravane Pragtya bhav, Fatepur Jai Lidho Lhaw\n" +
            "\n" +
            "Bhoja Bhagat kidha Gurudev, Vrat le Karve Sachi Seva\n" +
            "Savant Adharso chhoter Manhi, Sada vratnu Sthapan Thay\n" +
            "\n" +
            "Virbai Sulakshna chhe Nar, Sevani RakheSambhal\n" +
            "Sadhu Santo Ave Nitya, Jala Bapani Joyi Ne Prit\n" +
            "\n" +
            "Ann Tana Nidhi Chhalkya, Badha Akhadithi Dukh Jay\n" +
            "Bapa Sauma Bhale Ram, Khauravine Le Aram\n" +
            "\n" +
            "Gada Bhari Ann Ave Jay, Sadhu Santo Khub Ja Khay\n" +
            "Tan Man Dhanthi Dukhiya Jan, Avi Nit Kare Bhajan\n" +
            "\n" +
            "Bapa Sauna Dukh Harnara, Bhed Na Rakhe, Koyi Lager\n" +
            "Thoda Janna kahu Chhu Nam, Maliyo Chhe Jene Aram\n" +
            "\n" +
            "Jamal Ghanchi Je Kahevay, Dikro Teno Sajo Thay\n" +
            "Hariji Darjine Petnu Dukh, Tali Tyan Pamyo Chhe Sukh\n" +
            "\n" +
            "Mrutyu Pamyo Koli ek, Pita Teno Kargariyo Chhe\n" +
            "Bapa Haiye Karuna Thay. Ramnamni Dhun Machai\n" +
            "\n" +
            "Thayo Sajivan Teno Bal, Ramnamno Jay Jay Kar\n" +
            "Punya Tapyu Bapanu Ahin, Vhalo Utaryo Avani Manhi\n" +
            "\n" +
            "Kari Kasoti Magi Nar, Jova Kevu Dil Udar\n" +
            "Dhanya Dhanya Chhe Virbainar, Prabhu Sam Janyo Chhe Bharthar\n" +
            "\n" +
            "Agaya Apo Chhu Taiyar, Seva Santni Sacho sar\n" +
            "Seva Karva Gaya Sati, Jani Tribhuvana Ae Pati\n" +
            "\n" +
            "Akashvanima Sambhaday, Dhanya Jala Bhakti Ae Kahevaya\n" +
            "Dando Zodi Virbai Hath, Daine Alop Thaya Chhe Nath\n" +
            "\n" +
            "Vayak Pahonchya Virpur Gam, Saue Samarya Sitaram\n" +
            "Aaje Pan Virpur Ni Manhi, Saunse Aena Darshan Thay\n" +
            "\n" +
            "Janseva To Khubaj Kari, Tharya Saune Pote Thari\n" +
            "Savant Augnise Sadtris Manhi, Bapa Sidhavya Vainkunth Dham\n" +
            "\n" +
            "Manudas Je Bavani Gay, Dukhthi Chhuti Sukhai Thay\n" +
            "Virpur Ma Kidho Chhe Vas, Bhakatjanoni Purva Aash\n" +
            "\n" +
            "Jala Bhakta Sau Gunla gay, Dukh Daridra Tena Jay\n" +
            "Sorath bhumi Pavan Dham, Virput Nam Ema Gam\n";

    @Override
    public List<SongEntity> getSongs() {
        List<SongEntity> songList = new ArrayList<>();
        songList.add(new SongEntity("Jalaram Aarti", AARTI_LYRICS, "Hemant Chauhan", "aarti.mp3", "https://jayjaliyan.files.wordpress.com/2012/02/j11.jpg?w=840", 1, 3, 251,0));
        songList.add(new SongEntity("Jalaram Stuti", "Jalaram", "Hemant Chauhan", "stuti.mp3", "https://jayjaliyan.files.wordpress.com/2012/02/j12.jpg", 2, 3, 237,0));
        songList.add(new SongEntity("Jalaram Dhun", "Jalaram", "Hemant Chauhan", "dhun.mp3", "http://www.jaijaliyaan.com/images/bapa_small.jpg", 3, 3, 480,0));
        songList.add(new SongEntity("Mane Lagan Lagi", "Jalaram", "Hemant Chauhan", "https://firebasestorage.googleapis.com/v0/b/musicapp-24257.appspot.com/o/music%2Fmane%20lagi%20dhun.mp3?alt=media&token=f56234b3-56ec-41f6-bb25-abcdee6e2f80", "http://www.jaijaliyaan.com/images/bapa_small.jpg", 3, 3, 294,0));
        songList.add(new SongEntity("Jena Mukh ma Jala", "Jalaram", "Hemant Chauhan", "https://firebasestorage.googleapis.com/v0/b/musicapp-24257.appspot.com/o/music%2Fjena%20mukh%20ma%20jala.mp3?alt=media&token=861bfec2-7d3f-4b1c-b7d7-b86e7948d8db", "http://www.jaijaliyaan.com/images/bapa_small.jpg", 3, 3, 306,0));
        songList.add(new SongEntity("Lejo Lejo re", "Jalaram", "Hemant Chauhan", "https://firebasestorage.googleapis.com/v0/b/musicapp-24257.appspot.com/o/music%2Flejo%20lejo%20re.mp3?alt=media&token=0000a326-d4df-46b5-8d6b-d236f5eec33f", "http://www.jaijaliyaan.com/images/bapa_small.jpg", 3, 3, 187,0));
        songList.add(new SongEntity("Dhun(Ashok Bhayani)", "Jalaram", "Hemant Chauhan", "https://firebasestorage.googleapis.com/v0/b/musicapp-24257.appspot.com/o/music%2FAshok%20-%20Bhayani.mp3?alt=media&token=ea9365b2-b747-4f91-b1c6-967207e6950b", "http://www.jaijaliyaan.com/images/bapa_small.jpg", 3, 3, 1752,0));
        return songList;
    }

};



