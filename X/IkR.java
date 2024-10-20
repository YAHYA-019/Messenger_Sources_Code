package X;

import java.util.List;

/* loaded from: IkR.class */
public final class IkR implements JNB {
    public final HkB A00;
    public final N1C A01;

    public IkR(HkB hkB, N1C n1c) {
        this.A00 = hkB;
        this.A01 = n1c;
    }

    public void Bmk(Exception exc) {
    }

    public void CEI(float f) {
    }

    public void CMg(Hqo hqo) {
    }

    public void CMv(QxZ qxZ) {
    }

    public void COl(Rac rac) {
    }

    public void CRU(HDB hdb) {
    }

    public void CRV(Hqj hqj, I8v i8v) {
    }

    /* JADX WARN: Type inference failed for: r0v41, types: [X.N3b, java.lang.Object] */
    public void CRW(I9d i9d, Hqo hqo, List list, boolean z) {
        List list2;
        boolean z2 = false;
        IDe iDe = (IDe) list.get(0);
        if (iDe != null) {
            HkB hkB = this.A00;
            int i = iDe.A0B;
            hkB.A01 = i;
            int i2 = iDe.A0D;
            hkB.A02 = i2;
            int i3 = (int) iDe.A0I;
            hkB.A03 = i3;
            N1C n1c = this.A01;
            if (n1c != null) {
                ?? obj = new Object();
                int i4 = iDe.A07;
                int i5 = iDe.A06;
                int i6 = (int) iDe.A0H;
                int i7 = iDe.A05;
                int i8 = iDe.A0A;
                if (i4 <= 1) {
                    i4 = 720;
                }
                if (i5 <= 1) {
                    i5 = 1280;
                }
                if (i6 <= 1) {
                    i6 = 1000000;
                }
                if (i7 <= 1) {
                    i7 = 30;
                }
                if (i2 <= 1) {
                    i2 = 720;
                }
                if (i <= 1) {
                    i = 1280;
                }
                if (i3 <= 1) {
                    i3 = 1000000;
                }
                if (i8 <= 1) {
                    i8 = 30;
                }
                hkB.A00 = N3b.A02(n1c, obj, i6, i7, i5, i4, i3, i8, i, i2, false).A00 * 100.0d;
            }
        }
        I8v i8v = hqo.A0Q;
        if (hqo.A00() || hqo.A0e || (i8v != null && (list2 = i8v.A0J) != null && !list2.isEmpty())) {
            z2 = true;
        }
        this.A00.A08 = z2;
    }

    public void CRa(Exception exc, java.util.Map map, int i) {
    }

    public void CRe() {
    }

    public void CRh(java.util.Map map) {
    }

    public void onFailure(Exception exc) {
    }
}
