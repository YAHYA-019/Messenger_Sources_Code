package X;

import java.util.List;

/* loaded from: Kvi.class */
public abstract class Kvi {
    public static final void A00(C11424wg c11424wg, 8Lu r302) {
        11T.A0F(c11424wg, 0);
        String str = c11424wg.A08.A01;
        if (str != null) {
            C82b c82b = c11424wg.A0I;
            ((List) 7zV.A0Y(str, (java.util.Map) c82b.A02)).add(r302);
            String A01 = LDu.A01(str);
            if (A01 != null) {
                ((List) 7zV.A0Y(A01, (java.util.Map) c82b.A01)).add(r302);
            }
        }
    }

    public static void A01(C11424wg c11424wg, 8Lt r302, Integer num) {
        A00(c11424wg, new 8Lu(r302, num));
    }
}
