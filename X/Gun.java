package X;

import android.graphics.Rect;
import java.util.List;

/* loaded from: Gun.class */
public final class Gun extends IA2 {
    public Guh A00;
    public IDB A01;

    public static boolean A00(IDB idb, HX7 hx7, int i, boolean z) {
        return z | IDB.A01(idb, hx7, Integer.valueOf(i));
    }

    public static boolean A01(IDB idb, HX7 hx7, boolean z, boolean z2) {
        return z2 | IDB.A01(idb, hx7, Boolean.valueOf(z));
    }

    public void A02() {
        A04(((IA2) this).A00.A01());
    }

    public void A03() {
        Guh guh = this.A00;
        Rect rect = I9y.A00;
        List A1H = GOn.A1H(I1R.A0w, guh);
        int i = 4;
        if (!GOo.A1U(4, A1H)) {
            i = 1;
            if (!GOo.A1U(1, A1H)) {
                i = 6;
                if (!GOo.A1U(6, A1H)) {
                    return;
                }
            }
        }
        I4E.A00(I82.A0D, ((IA2) this).A00, i);
    }

    public void A04(Hqp hqp) {
        Guk guk;
        ((IA2) this).A00 = new I4E();
        IDB idb = this.A01;
        try {
            guk = (Guk) idb.A02.clone();
        } catch (CloneNotSupportedException e) {
            android.util.Log.e("ParametersModificationApplier", "Could not clone the camera settings", e);
            guk = null;
        }
        boolean A01 = hqp.A12 ? IDB.A01(idb, I82.A0D, Integer.valueOf(hqp.A0C)) : false;
        if (hqp.A0b) {
            A01 = A00(idb, I82.A00, hqp.A06, A01);
        }
        if (hqp.A0t) {
            A01 = A00(idb, I82.A07, hqp.A08, A01);
        }
        if (hqp.A0l) {
            A01 = A01(idb, I82.A0P, hqp.A0k, A01);
        }
        if (hqp.A0p) {
            A01 = A01(idb, I82.A0R, hqp.A0o, A01);
        }
        if (hqp.A10) {
            A01 = A00(idb, I82.A0B, hqp.A0B, A01);
        }
        if (hqp.A0w) {
            A01 = A00(idb, I82.A09, hqp.A0A, A01);
        }
        if (hqp.A11) {
            A01 |= IDB.A01(idb, I82.A0C, hqp.A0Z);
        }
        if (hqp.A1J) {
            A01 = A00(idb, I82.A0a, hqp.A0E, A01);
        }
        if (hqp.A1K) {
            A01 = A00(idb, I82.A0b, hqp.A0F, A01);
        }
        if (hqp.A1L) {
            A01 |= IDB.A01(idb, I82.A0c, hqp.A0S);
        }
        if (hqp.A1O) {
            A01 |= IDB.A01(idb, I82.A0f, hqp.A0a);
        }
        if (hqp.A1S) {
            A01 = A00(idb, I82.A0i, hqp.A0I, A01);
        }
        if (hqp.A1T) {
            A01 |= IDB.A01(idb, I82.A0k, hqp.A0T);
        }
        if (hqp.A1U) {
            A01 = A00(idb, I82.A0m, hqp.A0J, A01);
        }
        if (hqp.A1W) {
            A01 = A00(idb, I82.A0o, hqp.A0K, A01);
        }
        if (hqp.A1V) {
            A01 |= IDB.A01(idb, I82.A0n, hqp.A1o);
        }
        if (hqp.A1X) {
            A01 |= IDB.A01(idb, I82.A0q, hqp.A0U);
        }
        if (hqp.A1c) {
            A01 = A00(idb, I82.A0s, hqp.A0L, A01);
        }
        if (hqp.A1i) {
            A01 = A01(idb, I82.A0Z, hqp.A1h, A01);
        }
        if (hqp.A1g) {
            A01 |= IDB.A01(idb, I82.A0y, hqp.A0V);
        }
        if (hqp.A1j) {
            A01 = A00(idb, I82.A0z, hqp.A0N, A01);
        }
        if (hqp.A1l) {
            A01 = A00(idb, I82.A11, hqp.A0O, A01);
        }
        if (hqp.A1F) {
            A01 = A01(idb, I82.A0W, hqp.A1E, A01);
        }
        if (hqp.A1b) {
            A01 = A01(idb, I82.A0r, hqp.A1a, A01);
        }
        if (hqp.A15) {
            A01 |= IDB.A01(idb, I82.A0E, Double.valueOf(hqp.A00));
        }
        if (hqp.A16) {
            A01 |= IDB.A01(idb, I82.A0F, Double.valueOf(hqp.A01));
        }
        if (hqp.A17) {
            A01 |= IDB.A01(idb, I82.A0G, Double.valueOf(hqp.A02));
        }
        if (hqp.A18) {
            A01 |= IDB.A01(idb, I82.A0H, hqp.A0X);
        }
        if (hqp.A19) {
            A01 |= IDB.A01(idb, I82.A0I, Long.valueOf(hqp.A0Q));
        }
        if (hqp.A1R) {
            A01 = A00(idb, I82.A0g, hqp.A0H, A01);
        }
        if (hqp.A1f) {
            A01 = A00(idb, I82.A0x, hqp.A0M, A01);
        }
        if (hqp.A1I) {
            A01 = A00(idb, I82.A0L, hqp.A0D, A01);
        }
        if (hqp.A0v) {
            A01 |= IDB.A01(idb, I82.A0l, (Object) null);
        }
        if (hqp.A1H) {
            A01 = A01(idb, I82.A0V, hqp.A1G, A01);
        }
        if (hqp.A0h) {
            A01 = A01(idb, I82.A0N, hqp.A0g, A01);
        }
        if (A01) {
            int incrementAndGet = IDB.A05.incrementAndGet();
            try {
                ID3.A00(34, incrementAndGet, (Object) null);
                if (L64.A02(N1z.A01)) {
                    android.util.Log.i("ParametersModificationApplier", 0Pz.A0W("applyModifications: [modification] ", hqp.A00()));
                }
                idb.A01.setParameters(idb.A00);
                ID3.A00(35, incrementAndGet, (Object) null);
            } catch (RuntimeException e2) {
                ID3.A00(36, incrementAndGet, e2);
                throw new RuntimeException(String.format("Failed to apply parameters. previous settings: (%s), new settings: (%s), parameters: (%s), modifications: (%s)", guk != null ? guk.A06() : "null", idb.A02.A06(), idb.A00.flatten(), hqp.A00()), e2);
            }
        }
    }
}
