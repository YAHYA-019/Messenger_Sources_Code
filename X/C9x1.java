package X;

import android.net.Uri;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.9x1, reason: invalid class name */
/* loaded from: 9x1.class */
public final class C9x1 implements 50Z {
    public final C00i A01 = 1BQ.A02(99390);
    public final C00i A02 = 1BQ.A02(33013);
    public final C00i A03 = 1BV.A00(49445);
    public final C00i A00 = 1BV.A00(49442);

    public void AF8(java.util.Map map) {
        int size = map.size();
        C00i c00i = this.A00;
        if (size >= ((50W) c00i.get()).A00()) {
            long A08 = 1BL.A08(this.A01);
            Iterator A1A = 1BK.A1A(map);
            while (A1A.hasNext()) {
                if (A08 - ((C50c) A1A.next()).A00 > ((50W) c00i.get()).A01()) {
                    A1A.remove();
                }
            }
        }
    }

    public void BPL(java.util.Map map) {
        this.A03.get();
        C00i c00i = this.A02;
        HashMap A00 = C50a.A00(1BK.A0R(c00i));
        HashSet A0v = AnonymousClass001.A0v();
        Iterator A0x = AnonymousClass001.A0x(A00);
        while (A0x.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0x);
            Object key = A0z.getKey();
            if (1BL.A08(this.A01) - ((C50c) A0z.getValue()).A00 > ((50W) this.A00.get()).A01()) {
                A0v.add(key);
                A0x.remove();
            }
        }
        if (!A0v.isEmpty()) {
            1Ql A0V = 1BL.A0V(c00i);
            Iterator it = A0v.iterator();
            while (it.hasNext()) {
                A0V.CfI(1G3.A01(C50b.A04, Uri.encode(AnonymousClass001.A0i(it))));
            }
            A0V.commit();
        }
        Iterator A0x2 = AnonymousClass001.A0x(A00);
        while (A0x2.hasNext()) {
            Map.Entry A0z2 = AnonymousClass001.A0z(A0x2);
            map.put(A0z2.getKey(), A0z2.getValue());
        }
    }
}
