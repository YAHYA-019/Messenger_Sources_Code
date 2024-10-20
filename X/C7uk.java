package X;

import com.facebook.acra.constants.ActionId;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;

/* renamed from: X.7uk, reason: invalid class name */
/* loaded from: 7uk.class */
public abstract class C7uk {
    public static final String[] A00;

    static {
        String[] strArr = new String[192];
        System.arraycopy(new String[]{"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient"}, 0, strArr, 0, 27);
        System.arraycopy(new String[]{"Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk"}, 0, strArr, 27, 27);
        System.arraycopy(new String[]{"Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk"}, 0, strArr, 54, 27);
        System.arraycopy(new String[]{"Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass"}, 0, strArr, 81, 27);
        System.arraycopy(new String[]{"Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk"}, 0, strArr, 108, 27);
        System.arraycopy(new String[]{"Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo"}, 0, strArr, ActionId.MQTT_CONNECTING, 27);
        System.arraycopy(new String[]{"Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk"}, 0, strArr, ActionId.ASYNC_FAIL, 27);
        System.arraycopy(new String[]{"Dubstep", "Garage Rock", "Psybient"}, 0, strArr, 189, 3);
        A00 = strArr;
    }

    public static Id3Frame A00(6aO r301, String str, int i, boolean z, boolean z2) {
        int i2;
        r301.A0Q(4);
        if (r301.A02() == 1684108385) {
            r301.A0Q(8);
            i2 = r301.A07();
        } else {
            5My.A04("MetadataUtil", "Failed to parse uint8 attribute value");
            i2 = -1;
        }
        if (z2) {
            i2 = Math.min(1, i2);
        }
        if (i2 >= 0) {
            return z ? new TextInformationFrame(str, null, 6Xe.A01(new String[]{Integer.toString(i2)})) : new CommentFrame("und", str, Integer.toString(i2));
        }
        4YV.A15(i, "Failed to parse uint8 attribute: ");
        return null;
    }

    public static TextInformationFrame A01(6aO r301, String str, int i) {
        int A02 = r301.A02();
        if (r301.A02() == 1684108385 && A02 >= 22) {
            r301.A0Q(10);
            int A0A = r301.A0A();
            if (A0A > 0) {
                String A0T = 0Pz.A0T("", A0A);
                int A0A2 = r301.A0A();
                if (A0A2 > 0) {
                    A0T = AnonymousClass001.A0e("/", AnonymousClass001.A0n(A0T), A0A2);
                }
                return new TextInformationFrame(str, null, 6Xe.A01(new String[]{A0T}));
            }
        }
        4YV.A15(i, "Failed to parse index/count attribute: ");
        return null;
    }

    public static TextInformationFrame A02(6aO r301, String str, int i) {
        int A02 = r301.A02();
        if (r301.A02() == 1684108385) {
            r301.A0Q(8);
            return new TextInformationFrame(str, null, 6Xe.A01(new String[]{r301.A0H(A02 - 16)}));
        }
        4YV.A15(i, "Failed to parse text attribute: ");
        return null;
    }
}
