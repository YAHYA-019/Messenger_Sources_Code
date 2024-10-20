package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* loaded from: L87.class */
public final class L87 {
    public final java.util.Map A00;
    public final java.util.Map A01;
    public final java.util.Map A02;
    public final Random A03;

    public L87() {
        Random random = new Random();
        this.A02 = AnonymousClass001.A0u();
        this.A03 = random;
        this.A01 = AnonymousClass001.A0u();
        this.A00 = AnonymousClass001.A0u();
    }

    public static ArrayList A00(L87 l87, List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        java.util.Map map = l87.A01;
        A01(map, elapsedRealtime);
        java.util.Map map2 = l87.A00;
        A01(map2, elapsedRealtime);
        ArrayList A0s = AnonymousClass001.A0s();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                return A0s;
            }
            Krl krl = (Krl) list.get(i2);
            if (!map.containsKey(krl.A02) && !map2.containsKey(Integer.valueOf(krl.A00))) {
                A0s.add(krl);
            }
            i = i2 + 1;
        }
    }

    public static void A01(java.util.Map map, long j) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator A0y = AnonymousClass001.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            if (AnonymousClass001.A05(A0z.getValue()) <= j) {
                A0s.add(A0z.getKey());
            }
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= A0s.size()) {
                return;
            }
            map.remove(A0s.get(i2));
            i = i2 + 1;
        }
    }

    public Krl A02(List list) {
        Krl krl;
        Krl krl2;
        Object obj;
        ArrayList A00 = A00(this, list);
        if (A00.size() >= 2) {
            Collections.sort(A00, new Ls8(10));
            ArrayList A0s = AnonymousClass001.A0s();
            int i = 0;
            int i2 = ((Krl) A00.get(0)).A00;
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 >= A00.size()) {
                    break;
                }
                Krl krl3 = (Krl) A00.get(i4);
                if (i2 == krl3.A00) {
                    4YU.A1R(krl3.A02, Integer.valueOf(krl3.A01), A0s);
                    i3 = i4 + 1;
                } else if (A0s.size() == 1) {
                    obj = A00.get(0);
                }
            }
            java.util.Map map = this.A02;
            krl = (Krl) map.get(A0s);
            if (krl == null) {
                List subList = A00.subList(0, A0s.size());
                int i5 = 0;
                for (int i6 = 0; i6 < subList.size(); i6++) {
                    i5 += ((Krl) subList.get(i6)).A01;
                }
                int nextInt = this.A03.nextInt(i5);
                int i7 = 0;
                while (true) {
                    if (i >= subList.size()) {
                        krl2 = (Krl) 2Ri.A08(subList);
                        break;
                    }
                    krl2 = (Krl) subList.get(i);
                    i7 += krl2.A01;
                    if (nextInt < i7) {
                        break;
                    }
                    i++;
                }
                map.put(A0s, krl2);
                return krl2;
            }
            return krl;
        }
        obj = 2Ri.A0D(A00, (Object) null);
        krl = (Krl) obj;
        return krl;
    }
}
