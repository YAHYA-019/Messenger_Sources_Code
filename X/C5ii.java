package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.5ii, reason: invalid class name */
/* loaded from: 5ii.class */
public final class C5ii extends C5ij {
    public final C03903zR A01 = (C03903zR) 1Bi.A03(32845);
    public final C5ik A00 = (C5ik) 1Bi.A03(49833);
    public final C00i A02 = new 1BQ(16385);

    @Override // X.C5ij, X.C1ph
    public void Bth(2Ov r302) {
        String str;
        java.util.Map AWe;
        if (r302 instanceof C2vj) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(1BJ.A00(555), C01e.A00(r302.getClass()));
        if (r302 instanceof 1lN) {
            str = ((1lN) r302).AWg();
            if ((r302 instanceof C1lM) && (AWe = ((C1lM) r302).AWe()) != null) {
                if (1BK.A0N(this.A02).AZk(36314639977422931L)) {
                    Iterator A0y = AnonymousClass001.A0y(AWe);
                    while (A0y.hasNext()) {
                        Map.Entry A0z = AnonymousClass001.A0z(A0y);
                        hashMap.put(0Pz.A0W("_source_", AnonymousClass001.A0j(A0z)), A0z.getValue());
                    }
                } else {
                    hashMap.putAll(AWe);
                }
            }
        } else {
            str = "dialog";
        }
        Iterator it = this.A00.A00.iterator();
        while (it.hasNext()) {
            ((C1is) it.next()).A0H(str, hashMap);
        }
    }
}
