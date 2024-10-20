package X;

import android.media.MediaFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: I9s.class */
public abstract class I9s {
    public static HfI A00(JN4 jn4) {
        HfI hfI;
        ArrayList A03 = A03(jn4, "audio/");
        if (!A03.isEmpty()) {
            Iterator it = A03.iterator();
            while (it.hasNext()) {
                hfI = (HfI) it.next();
                String str = hfI.A02;
                if (str.startsWith(HBJ.A02.value) || str.startsWith(HBJ.A05.value)) {
                    if (A03.size() > 1) {
                        A02(A03);
                        return hfI;
                    }
                }
            }
            throw new Exception(0Pz.A0W("Unsupported audio codec. Contained ", A02(A03)));
        }
        hfI = null;
        return hfI;
    }

    public static HfI A01(JN4 jn4) {
        ArrayList A03 = A03(jn4, "video/");
        if (A03.isEmpty()) {
            throw new Exception(0Pz.A0W("No video track exception. Track Info List: ", A02(A03(jn4, ""))));
        }
        Iterator it = A03.iterator();
        while (it.hasNext()) {
            HfI hfI = (HfI) it.next();
            if (IEP.A04(hfI.A02)) {
                if (A03.size() > 1) {
                    A02(A03);
                }
                return hfI;
            }
        }
        throw new Exception(0Pz.A0W("Unsupported video codec. Contained ", A02(A03)));
    }

    public static String A02(List list) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0s.add(((HfI) it.next()).A02);
        }
        int size = list.size();
        Iterator it2 = A0s.iterator();
        StringBuilder A0k = AnonymousClass001.A0k();
        if (it2.hasNext()) {
            while (true) {
                A0k.append(it2.next());
                if (!it2.hasNext()) {
                    break;
                }
                A0k.append(", ");
            }
        } else {
            A0k.append("null, input is empty");
        }
        return 0Pz.A0E(size, "", " tracks: ", A0k.toString());
    }

    public static ArrayList A03(JN4 jn4, String str) {
        ArrayList A0s = AnonymousClass001.A0s();
        int BGf = jn4.BGf();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= BGf) {
                return A0s;
            }
            MediaFormat BGh = jn4.BGh(i2);
            String string = BGh.getString("mime");
            if (string != null && string.startsWith(str)) {
                A0s.add(new HfI(BGh, string, i2));
            }
            i = i2 + 1;
        }
    }
}
