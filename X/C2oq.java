package X;

import java.util.Iterator;

/* renamed from: X.2oq, reason: invalid class name */
/* loaded from: 2oq.class */
public abstract class C2oq {
    public static final 1LI A00(1Iw r301, C2on c2on, Object obj, Object obj2) {
        1LI r309;
        11T.A0F(r301, 0);
        11T.A0F(c2on, 1);
        11T.A0F(obj, 2);
        Iterator AUf = c2on.A01.AUf(obj);
        while (true) {
            if (!AUf.hasNext()) {
                r309 = null;
                break;
            }
            C2ot c2ot = (C2ot) AUf.next();
            r309 = c2ot.CfM(r301, obj, obj2);
            if (r309 != null) {
                Iterator it = c2on.A00.AUm(c2ot, obj).iterator();
                while (it.hasNext()) {
                    r309 = ((2pC) it.next()).AMJ(r309, r301, obj, obj2);
                }
            }
        }
        return r309;
    }
}
