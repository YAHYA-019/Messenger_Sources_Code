package X;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/* loaded from: E0t.class */
public final class E0t extends 2Yf {
    public C2kx A00;
    public FyG A01;
    public List A02;

    public E0t() {
        super("NTScreenListItemSection");
    }

    public static QOc A0I(C1qb c1qb, GFE gfe, FyG fyG, List list) {
        QOJ qoj = new QOJ(c1qb, new QOc());
        QOc qOc = qoj.A01;
        qOc.A03 = list;
        BitSet bitSet = qoj.A02;
        bitSet.set(1);
        qOc.A02 = fyG;
        bitSet.set(0);
        qOc.A00 = gfe;
        2hQ.A00(bitSet, qoj.A03, 2);
        return qOc;
    }

    public void A0Y(C1qp c1qp) {
        if (c1qp != null) {
            this.A00 = (C2kx) c1qp.A01(C2kx.class);
        }
    }

    public 2Ys A0d(C1qb c1qb) {
        QOc qOg;
        66W r0;
        List list = this.A02;
        FyG fyG = this.A01;
        C2kx c2kx = this.A00;
        FkZ fkZ = (FkZ) 1Hv.A02(((1Iw) c1qb).A0D, 99550);
        2Yr r02 = new 2Yr();
        ArrayList A0s = AnonymousClass001.A0s();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                return r02.A00;
            }
            GL7 A0n = DKC.A0n(list, i2);
            if (A0n.BDE() == 50162 && c2kx != null && (r0 = (66W) FJ3.A07(A0n, fyG)) != null) {
                r0.A00 = c2kx;
            }
            FJ3.A01(fyG);
            11T.A0F(fyG, 2);
            int BDE = A0n.BDE();
            if (BDE == 50213) {
                qOg = new QOg();
                ((QOg) qOg).A01 = A0n;
                ((QOg) qOg).A02 = EWp.A00(fyG, "typeaheadResultsSection");
            } else if (BDE != 50254) {
                A0s.add(A0n);
                if (i2 == AnonymousClass001.A04(list)) {
                    qOg = A0I(c1qb, fkZ, fyG, A0s);
                    r02.A01(qOg);
                    i = i2 + 1;
                } else {
                    i = i2 + 1;
                }
            } else {
                qOg = new E0t();
                qOg.A02 = GL7.A0A(A0n);
                qOg.A01 = fyG;
            }
            r02.A01(A0I(c1qb, fkZ, fyG, A0s));
            A0s = AnonymousClass001.A0s();
            r02.A01(qOg);
            i = i2 + 1;
        }
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            E0t e0t = (E0t) r302;
            FyG fyG = this.A01;
            FyG fyG2 = e0t.A01;
            if (fyG != null) {
                if (!fyG.equals(fyG2)) {
                    return false;
                }
            } else if (fyG2 != null) {
                return false;
            }
            List list = this.A02;
            List list2 = e0t.A02;
            if (list != null) {
                if (!list.equals(list2)) {
                    return false;
                }
            } else if (list2 != null) {
                return false;
            }
            C2kx c2kx = this.A00;
            C2kx c2kx2 = e0t.A00;
            if (c2kx != null) {
                if (!c2kx.equals(c2kx2)) {
                    return false;
                }
            } else if (c2kx2 != null) {
                return false;
            }
        }
        return true;
    }
}
