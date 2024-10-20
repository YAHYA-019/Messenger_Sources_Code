package X;

import java.util.List;

/* loaded from: E0m.class */
public final class E0m extends 2Yf {
    public FHD A00;
    public List A01;

    public E0m() {
        super("InstantGameArcadeCardsSection");
    }

    public 2Ys A0d(C1qb c1qb) {
        List list = this.A01;
        FHD fhd = this.A00;
        4YV.A1N(c1qb, fhd);
        2Yr r0 = new 2Yr();
        C2hf A0I = C2he.A0I(c1qb);
        A0I.A06(1BK.A17(list));
        A0I.A05(2Yg.A0A(c1qb, E0m.class, "InstantGameArcadeCardsSection", 239195397));
        r0.A00(A0I);
        2hP A0I2 = 2hO.A0I(c1qb);
        A0I2.A05(fhd.A08 ? 7zL.A0Y() : FGt.A00((Dky) null, c1qb, 2Yg.A09(c1qb, E0m.class, "InstantGameArcadeCardsSection", 1965408848)));
        r0.A00(A0I2);
        2hP A0I3 = 2hO.A0I(c1qb);
        A0I3.A05(fhd.A08 ? 7zL.A0Y() : FGt.A00((Dky) null, c1qb, (1Im) null));
        r0.A00(A0I3);
        2Ys r02 = r0.A00;
        11T.A0A(r02);
        return r02;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.2hj, java.lang.Object] */
    public Object A0e(1Im r302, Object obj) {
        2JY A0B;
        int i = r302.A01;
        if (i == 239195397) {
            1Iw r0 = r302.A00.A00;
            2JY r02 = (2JY) ((C2i6) obj).A01;
            11T.A0F(r02, 1);
            ?? obj2 = new Object();
            2JY A0L = AbM.A0L(r02, C2247Di3.class, 1796225757);
            return 7zM.A0t(FGt.A00((A0L == null || (A0B = 1BK.A0B(A0L, C2246Di2.class, 3619493, -2031950737)) == null) ? null : DKG.A0P(A0B), r0, (1Im) null), (C2hj) obj2);
        }
        if (i != 1965408848) {
            return null;
        }
        FHD fhd = r302.A00.A01.A00;
        11T.A0F(fhd, 1);
        FAX fax = fhd.A0K;
        Er6 er6 = fax.A03;
        if (er6 != null) {
            if (fhd.A08) {
                return null;
            }
            AbI.A0o(fhd.A0I).A08(C2083Db8.A00(fhd, 40), "instant_game_arcade_fetch_query", new G6l(fhd, fax.A09, er6.A0g, 1));
            return null;
        }
        Ew5 ew5 = fhd.A06;
        if (ew5 == null) {
            return null;
        }
        DZV.A03(ew5.A00, true);
        return null;
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            E0m e0m = (E0m) r302;
            List list = this.A01;
            List list2 = e0m.A01;
            if (list != null) {
                if (!list.equals(list2)) {
                    return false;
                }
            } else if (list2 != null) {
                return false;
            }
            FHD fhd = this.A00;
            FHD fhd2 = e0m.A00;
            if (fhd != null) {
                if (!fhd.equals(fhd2)) {
                    return false;
                }
            } else if (fhd2 != null) {
                return false;
            }
        }
        return true;
    }
}
