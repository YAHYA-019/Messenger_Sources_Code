package X;

/* renamed from: X.8kw, reason: invalid class name */
/* loaded from: 8kw.class */
public final class C8kw extends C1rj {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public 1Im A04;
    public AnonymousClass781 A05;

    public C8kw() {
        super("GalleryGlyphComponent");
        this.A00 = 2132345405;
        this.A02 = 2132345406;
    }

    public final Object[] A0k() {
        return new Object[]{Integer.valueOf(this.A00), Integer.valueOf(this.A01), Integer.valueOf(this.A02), Integer.valueOf(this.A03), this.A05};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        AnonymousClass781 anonymousClass781 = this.A05;
        int i = this.A01;
        int i2 = this.A03;
        int i3 = this.A00;
        int i4 = this.A02;
        C2cm A00 = C2cl.A00(r302);
        7zL.A1J(A00);
        A00.A1I(2132410440);
        7zN.A1C(A00, r302, C8kw.class, "GalleryGlyphComponent");
        boolean z = anonymousClass781.A06;
        if (!z) {
            i = i2;
        }
        A00.A2X(i);
        A00.A1J(2131957116);
        if (!z) {
            i3 = i4;
        }
        A00.A2a(i3);
        return 7zL.A0J(A00);
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return 4YV.A0M(c1qp);
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        1Im r0;
        int i = r302.A01;
        if (i != -1351902487) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        1Iv r02 = r302.A00;
        1Is r03 = r02.A01;
        1Iw r04 = r02.A00;
        AnonymousClass781 anonymousClass781 = ((C8kw) r03).A05;
        1LI r05 = r04.A02;
        if (r05 == null || (r0 = ((C8kw) r05).A04) == null) {
            return null;
        }
        7zR.A1E(r0, new 70D(4YV.A0d(anonymousClass781, 0)));
        return null;
    }
}
