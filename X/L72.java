package X;

import com.facebook.common.dextricks.OdexSchemeArtXdex;

/* loaded from: L72.class */
public final class L72 {
    public static long A00;
    public static L8p A01;

    public static L8p A00() {
        synchronized (L72.class) {
            L8p l8p = A01;
            if (l8p == null) {
                return new L8p();
            }
            A01 = l8p.A02;
            l8p.A02 = null;
            A00 -= OdexSchemeArtXdex.STATE_PGO_ATTEMPTED;
            return l8p;
        }
    }

    public static void A01(L8p l8p) {
        if (l8p.A02 != null || l8p.A03 != null) {
            throw JQx.A0n();
        }
        if (l8p.A05) {
            return;
        }
        synchronized (L72.class) {
            long j = A00 + OdexSchemeArtXdex.STATE_PGO_ATTEMPTED;
            if (j <= OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_FINISHED) {
                A00 = j;
                l8p.A02 = A01;
                l8p.A00 = 0;
                l8p.A01 = 0;
                A01 = l8p;
            }
        }
    }
}
