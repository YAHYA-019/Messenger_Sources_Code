package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: Ij2.class */
public final class Ij2 implements JLR, JJF {
    public final Hy2 A00 = new Hy2();
    public final HyR A01 = new HyR();
    public final HashMap A02 = AnonymousClass001.A0u();

    public void CZQ(JJD jjd) {
        CZR(jjd, null);
    }

    public void CZR(JJD jjd, JJE jje) {
        HC9 BHT = jjd.BHT();
        if (BHT.isCacheableEvent) {
            this.A02.put(BHT, jjd);
        }
        Hy2 hy2 = this.A00;
        if (!hy2.A01.get()) {
            return;
        }
        List list = hy2.A00.A00;
        int size = list.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return;
            }
            HZi hZi = (HZi) list.get(i2);
            if ((jje == null || jje == hZi.A00) && hZi.A01.contains(BHT)) {
                hZi.A00.CGa(jjd);
            }
            i = i2 + 1;
        }
    }

    public void CcL(JJE jje, HC9 hc9) {
        Hy2 hy2 = this.A00;
        HZi A00 = Hy2.A00(hy2, jje);
        if (A00 == null) {
            A00 = new HZi(jje);
            hy2.A00.A02(A00);
        }
        A00.A01.add(hc9);
        HyR hyR = this.A01;
        if (hc9.shouldNotifyEventListenerRegistration) {
            int ordinal = hc9.ordinal();
            hyR.A02[ordinal] = true;
            JKX[] jkxArr = hyR.A01;
            if (jkxArr[ordinal] != null && hyR.A00.get()) {
                jkxArr[ordinal].enable();
            }
        }
        JJD jjd = (JJD) this.A02.get(hc9);
        if (jjd != null) {
            jje.CGa(jjd);
        }
    }

    public void D5x(JJE jje) {
        int ordinal;
        JKX jkx;
        Hy2 hy2 = this.A00;
        HZi A00 = Hy2.A00(hy2, jje);
        if (A00 != null) {
            A00.A01.clear();
            hy2.A00.A03(A00);
        }
        HC9[] values = HC9.values();
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            HC9 hc9 = values[i2];
            List list = hy2.A00.A00;
            int size = list.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    HyR hyR = this.A01;
                    if (hc9.shouldNotifyEventListenerRegistration && (jkx = hyR.A01[(ordinal = hc9.ordinal())]) != null) {
                        boolean[] zArr = hyR.A02;
                        if (zArr[ordinal]) {
                            zArr[ordinal] = false;
                            jkx.disable();
                        }
                    }
                } else if (!((HZi) list.get(i3)).A01.contains(hc9)) {
                    i3++;
                }
            }
            i = i2 + 1;
        }
    }

    public void D5y(JJE jje, HC9 hc9) {
        int ordinal;
        JKX jkx;
        Hy2 hy2 = this.A00;
        HZi A00 = Hy2.A00(hy2, jje);
        if (A00 != null) {
            HashSet hashSet = A00.A01;
            hashSet.remove(hc9);
            if (hashSet.isEmpty()) {
                hy2.A00.A03(A00);
            }
        }
        List list = hy2.A00.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((HZi) list.get(i)).A01.contains(hc9)) {
                return;
            }
        }
        HyR hyR = this.A01;
        if (!hc9.shouldNotifyEventListenerRegistration || (jkx = hyR.A01[(ordinal = hc9.ordinal())]) == null) {
            return;
        }
        boolean[] zArr = hyR.A02;
        if (zArr[ordinal]) {
            zArr[ordinal] = false;
            jkx.disable();
        }
    }
}
