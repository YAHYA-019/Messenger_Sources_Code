package X;

import com.facebook.common.callercontext.CallerContext;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.4rt, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4rt.class */
public final class C09894rt {
    public final C4qy A00 = (C4qy) 1Bi.A03(84632);

    public void A00(CallerContext callerContext, C04033zm c04033zm, Iterable iterable, String str) {
        C4qz c4qz = new C4qz(this.A00);
        HashMap hashMap = new HashMap();
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            4qU r0 = (4qU) it.next();
            Iterable B0L = r0.B0L();
            hashMap.put(r0, B0L);
            Iterator it2 = B0L.iterator();
            while (it2.hasNext()) {
                c4qz.A02((C4r6) it2.next());
                i++;
            }
        }
        if (i > 0) {
            c4qz.A00(callerContext, c04033zm, str);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            4qU r02 = (4qU) entry.getKey();
            HashMap hashMap2 = new HashMap();
            Iterator it3 = ((Iterable) entry.getValue()).iterator();
            while (it3.hasNext()) {
                String str2 = ((C4r6) it3.next()).A04;
                hashMap2.put(str2, c4qz.A06.get(str2));
            }
            r02.CA9(hashMap2);
        }
    }
}
