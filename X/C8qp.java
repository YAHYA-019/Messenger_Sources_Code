package X;

/* renamed from: X.8qp, reason: invalid class name */
/* loaded from: 8qp.class */
public final class C8qp extends 2Yf {
    public static final 1Br A07 = 1BK.A0C();
    public 1Im A00;
    public 1Im A01;
    public 1Im A02;
    public 79M A03;
    public C6wc A04;
    public 6wK A05;
    public boolean A06;

    public C8qp() {
        super("GalleryGroupSection");
    }

    public void A0X(2Yv r302, 2Yv r303) {
        ((8pB) r303).A00 = ((8pB) r302).A00;
    }

    public void A0a(C1qb c1qb) {
        8pB r0 = ((2Yf) this).A03;
        11T.A0F(c1qb, 0);
        6wC A00 = ((C6qn) 1Bn.A0A(50174)).A00(4YU.A0E(c1qb).getDimensionPixelSize(2132279527));
        A00.A01 = 0;
        r0.A00 = A00;
    }

    public 2Ys A0d(C1qb c1qb) {
        6wK r0 = this.A05;
        C6wc c6wc = this.A04;
        79M r02 = this.A03;
        7zT.A1S(c1qb, r0, c6wc);
        2Yr A0l = 7zL.A0l();
        C8qi c8qi = new C8qi();
        c8qi.A04 = r0;
        c8qi.A02 = c6wc;
        c8qi.A00 = 2Yg.A05(c1qb, C8qp.class, "GalleryGroupSection");
        ((2Yf) c8qi).A01 = 2Yg.A0A(c1qb, C8qp.class, "GalleryGroupSection", -939748803);
        c8qi.A01 = r02;
        return 7zO.A0Y(A0l, c8qi);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0300, code lost:
    
        if (r0 != null) goto L59;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v54, types: [X.9MF, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r307v6, types: [java.lang.Object, X.7DI] */
    /* JADX WARN: Type inference failed for: r307v9, types: [X.9Pw, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A0e(X.1Im r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 1153
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8qp.A0e(X.1Im, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    public /* bridge */ /* synthetic */ 2Yv A0f() {
        return new Object();
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            C8qp c8qp = (C8qp) r302;
            C6wc c6wc = this.A04;
            C6wc c6wc2 = c8qp.A04;
            if (c6wc != null) {
                if (!c6wc.equals(c6wc2)) {
                    return false;
                }
            } else if (c6wc2 != null) {
                return false;
            }
            if (this.A06 != c8qp.A06) {
                return false;
            }
            6wK r0 = this.A05;
            6wK r02 = c8qp.A05;
            if (r0 != null) {
                if (!r0.equals(r02)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
            1Im r03 = this.A01;
            1Im r04 = c8qp.A01;
            if (r03 != null) {
                if (!r03.A01(r04)) {
                    return false;
                }
            } else if (r04 != null) {
                return false;
            }
            79M r05 = this.A03;
            79M r06 = c8qp.A03;
            if (r05 != null) {
                if (!r05.equals(r06)) {
                    return false;
                }
            } else if (r06 != null) {
                return false;
            }
        }
        return true;
    }
}
