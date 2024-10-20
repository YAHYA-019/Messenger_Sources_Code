package X;

import java.util.BitSet;
import java.util.List;

/* loaded from: E0k.class */
public final class E0k extends 2Yf {
    public Dky A00;
    public F90 A01;
    public Aak A02;
    public FAX A03;
    public FHD A04;
    public List A05;
    public boolean A06;

    public E0k() {
        super("InstantGameArcadeScrollSection");
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [X.1rs, X.Drf] */
    public 2Ys A0d(C1qb c1qb) {
        FHD fhd = this.A04;
        FAX fax = this.A03;
        List list = this.A05;
        Dky dky = this.A00;
        boolean z = this.A06;
        Aak aak = this.A02;
        F90 f90 = this.A01;
        7zT.A1S(c1qb, fhd, fax);
        2Yr r0 = new 2Yr();
        Er6 er6 = fax.A03;
        11T.A0A(fax.A05);
        if (er6 == null) {
            return null;
        }
        if (!z || aak == null) {
            2hP A0I = 2hO.A0I(c1qb);
            C8j6 c8j6 = new C8j6();
            ?? c1rs = new C1rs(c8j6, c1qb, 0, 0);
            c1rs.A01 = c8j6;
            c1rs.A00 = c1qb;
            c8j6.A00 = dky;
            c1rs.A0J();
            A0I.A05(c1rs.A01);
            r0.A00(A0I);
            2hP A0I2 = 2hO.A0I(c1qb);
            A0I2.A05(new 1LH());
            r0.A00(A0I2);
            E0m e0m = new E0m();
            e0m.A01 = list;
            e0m.A00 = fhd;
            r0.A00.A00.add(e0m);
        } else {
            2hP A0I3 = 2hO.A0I(c1qb);
            Dtx dtx = new Dtx(c1qb, new Dx7());
            Dx7 dx7 = dtx.A01;
            dx7.A01 = aak;
            BitSet bitSet = dtx.A02;
            bitSet.set(0);
            dx7.A00 = f90;
            C1rs.A01(bitSet, dtx.A03);
            dtx.A0J();
            A0I3.A05(dx7);
            r0.A00(A0I3);
        }
        return r0.A00;
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            E0k e0k = (E0k) r302;
            F90 f90 = this.A01;
            F90 f902 = e0k.A01;
            if (f90 != null) {
                if (!f90.equals(f902)) {
                    return false;
                }
            } else if (f902 != null) {
                return false;
            }
            Aak aak = this.A02;
            Aak aak2 = e0k.A02;
            if (aak != null) {
                if (!aak.equals(aak2)) {
                    return false;
                }
            } else if (aak2 != null) {
                return false;
            }
            List list = this.A05;
            List list2 = e0k.A05;
            if (list != null) {
                if (!list.equals(list2)) {
                    return false;
                }
            } else if (list2 != null) {
                return false;
            }
            FAX fax = this.A03;
            FAX fax2 = e0k.A03;
            if (fax != null) {
                if (!fax.equals(fax2)) {
                    return false;
                }
            } else if (fax2 != null) {
                return false;
            }
            FHD fhd = this.A04;
            FHD fhd2 = e0k.A04;
            if (fhd != null) {
                if (!fhd.equals(fhd2)) {
                    return false;
                }
            } else if (fhd2 != null) {
                return false;
            }
            if (this.A06 != e0k.A06) {
                return false;
            }
            Dky dky = this.A00;
            Dky dky2 = e0k.A00;
            if (dky != null) {
                if (!dky.equals(dky2)) {
                    return false;
                }
            } else if (dky2 != null) {
                return false;
            }
        }
        return true;
    }
}
