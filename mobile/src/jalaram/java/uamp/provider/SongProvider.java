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
    private static final String AARTI_LYRICS = "ઉતારો આરતી, જલિયાણ ઘેર આવ્યા (2)\n" +
            "વીરપુર વાળા, રૂડા રામ ઘેર આવ્યા  (2)\n" +
            "\n" +
            "રે કંકુ ચોખલિયે  ને ફૂલ રે વધાવ્યા રે \n" +
            "ઉતારો આરતી, જલિયાણ ઘેર આવ્યા (2)\n" +
            "\n" +
            "દયા કરીને વાલે દર્શનયા રે દીધા \n" +
            "ભક્તો ને ઘેર બાપા ભોજનિયાં રે લીધા\n" +
            "\n" +
            "રે ખમ્મા ખમ્મા રે માતા રાજબાઈ ના જાયા રે \n" +
            "\n" +
            "ઉતારો આરતી, જલિયાણ ઘેર આવ્યા (2)\n" +
            "રે કંકુ ચોખલિયે  ને ફૂલ રે વધાવ્યા રે \n" +
            "ઉતારો આરતી, જલિયાણ ઘેર આવ્યા (2)\n" +
            "\n" +
            "આશા ઓ પુરી બાપા કારજડા રે ઠાલ્યા\n" +
            "વાંઢીયા ને ઘેર બાપા પરણિયા બંધાવ્યા\n" +
            "\n" +
            "રે કરુણા ના મીઠા મીઠા મેઘ વરસાવ્યા રે \n" +
            "\n" +
            "ઉતારો આરતી, જલિયાણ ઘેર આવ્યા (2)\n" +
            "રે કંકુ ચોખલિયે  ને ફૂલ રે વધાવ્યા રે \n" +
            "ઉતારો આરતી, જલિયાણ ઘેર આવ્યા (2)\n" +
            "\n" +
            "શ્રદ્ધાળુ જન ના બાપા કાજ રે સુધાર્યા\n" +
            "સેવકજન ના બાપા દુઃખદ નિવાર્યા \n" +
            "રે દીધા વરદાન માંગ્યા સુખડા છલકાવ્યા રે   \n" +
            "\n" +
            "ઉતારો આરતી, જલિયાણ ઘેર આવ્યા (2)\n" +
            "રે કંકુ ચોખલિયે  ને ફૂલ રે વધાવ્યા રે \n" +
            "ઉતારો આરતી, જલિયાણ ઘેર આવ્યા (2)\n";

    private static final String STUTI_LYRICS = "વીરપુરવાસી સુખડા શ્રીરામ કરુણા કરો \n" +
            "બધું કરો હે બાપજી ! ભંડાર સુખ ના ભરો\n" +
            "\n" +
            "કૃપા કરીને કાજ સર્વ દાસના સુધારજો\n" +
            "જલા દયાળુ જોગીડા સુણીને સાદ આવજો\n" +
            "\n" +
            "સુજે ના પંથ મોહરા ત્રીછૈઇ તીનીર ઘોર છે\n" +
            "ડગૈડ ધીમહિ મનાવડુ,સમય પવન નું જોર છે \n" +
            "\n" +
            "ચીવારી વારી વિનંતી,કૃપાળુ કાષ્ટ કાપજો \n" +
            "જલા દયાળુ જોગીડા સુણીને સાદ આવજો\n" +
            "\n" +
            "કેમેં કરી સંસાર કર્મ બંધનો છૂટે નહી\n" +
            "બન્યા કરું ભવાટવિમાં પંથડા ખૂટે નહી\n" +
            "\n" +
            "બધું કરીને દાસને ભાવપેઢી પાર તારજો\n" +
            "જલા દયાળુ જોગીડા સુણીને સાદ આવજો\n" +
            "\n" +
            "અમોઘ સુખ પામીયે સદાય સત્ય સંદ માં \n" +
            "દયા કરો હે ચિતડું ચોંટે શ્રીરામ રંગ માં  \n" +
            "\n" +
            "અવતારીયો લીયા અમારા વિઘ્ન ને વિદારજો \n" +
            "જલા દયાળુ જોગીડા સુણીને સાદ આવજો\n" +
            "\n" +
            "હૃદય માં કામ ક્રોધ ના નગાડા ઘોર દરદરે\n" +
            "વિષય વિકાર મોહ દ્રોહ વેર ઝેર ઉછ્છળે \n" +
            "\n" +
            "સમર્થ સંત શ્રાપ તાપ અત્રિપ્તા પતાળજો\n" +
            "જલા દયાળુ જોગીડા સુણીને સાદ આવજો\n" +
            "\n" +
            "રઘુવંશી હે રામ સહારો અમારો એક છો    \n" +
            "અપાર ઊડાન હે બાપજી સાંભળનાર છેક છો \n" +
            "\n" +
            "સંભાળજો સુધારજો ઉદારજો ઉદ્ધારજો  \n" +
            "જલા દયાળુ જોગીડા સુણીને સાદ આવજો\n" +
            "\n" +
            "કરીને ધૂપ દીપ દિવ્ય આરતી ઉતારીએ  \n" +
            "નમાવી શીશ હાથ જોડી આય થાઓ વારીએ\n" +
            "\n" +
            "જલિયાણ જોગીડા અમારે ઝૂંપડે પધારજો \n" +
            "જલા દયાળુ જોગીડા સુણીને સાદ આવજો\n" +
            "\n" +
            "અચૂક શામ આવજો ધરીને ભાવ બેઠજો \n" +
            "વહાવી વહાલ વહાલ માં વિયોગ દુઃખ મેટજો \n" +
            "\n" +
            "સમીપ દેવ આવીને સમ્મુખ દર્શ આપજો  \n" +
            "જલા દયાળુ જોગીડા સુણીને સાદ આવજો (3)";


    @Override
    public List<SongEntity> getSongs() {
        List<SongEntity> songList = new ArrayList<>();
        songList.add(new SongEntity("Jalaram Aarti", AARTI_LYRICS, "Hemant Chauhan", "aarti.mp3", "https://jayjaliyan.files.wordpress.com/2012/02/j11.jpg?w=840", 1, 3, 251, 0));
        songList.add(new SongEntity("Jalaram Stuti", STUTI_LYRICS, "Hemant Chauhan", "stuti.mp3", "https://jayjaliyan.files.wordpress.com/2012/02/j12.jpg", 2, 3, 237, 0));
        songList.add(new SongEntity("Jalaram Dhun", "Jalaram", "Hemant Chauhan", "dhun.mp3", "http://www.jaijaliyaan.com/images/bapa_small.jpg", 3, 3, 480, 0));
        songList.add(new SongEntity("Mane Lagan Lagi", "Jalaram", "Hemant Chauhan", "https://firebasestorage.googleapis.com/v0/b/musicapp-24257.appspot.com/o/music%2Fmane%20lagi%20dhun.mp3?alt=media&token=f56234b3-56ec-41f6-bb25-abcdee6e2f80", "http://www.jaijaliyaan.com/images/bapa_small.jpg", 3, 3, 294, 0));
        songList.add(new SongEntity("Jena Mukh ma Jala", "Jalaram", "Hemant Chauhan", "https://firebasestorage.googleapis.com/v0/b/musicapp-24257.appspot.com/o/music%2Fjena%20mukh%20ma%20jala.mp3?alt=media&token=861bfec2-7d3f-4b1c-b7d7-b86e7948d8db", "http://www.jaijaliyaan.com/images/bapa_small.jpg", 3, 3, 306, 0));
        songList.add(new SongEntity("Lejo Lejo re", "Jalaram", "Hemant Chauhan", "https://firebasestorage.googleapis.com/v0/b/musicapp-24257.appspot.com/o/music%2Flejo%20lejo%20re.mp3?alt=media&token=0000a326-d4df-46b5-8d6b-d236f5eec33f", "http://www.jaijaliyaan.com/images/bapa_small.jpg", 3, 3, 187, 0));
        songList.add(new SongEntity("Dhun(Ashok Bhayani)", "Jalaram", "Hemant Chauhan", "https://firebasestorage.googleapis.com/v0/b/musicapp-24257.appspot.com/o/music%2FAshok%20-%20Bhayani.mp3?alt=media&token=ea9365b2-b747-4f91-b1c6-967207e6950b", "http://www.jaijaliyaan.com/images/bapa_small.jpg", 3, 3, 1752, 0));
        return songList;
    }

};



