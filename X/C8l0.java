package X;

/* renamed from: X.8l0, reason: invalid class name */
/* loaded from: 8l0.class */
public final class C8l0 extends C1rj {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public 1Im A05;
    public 78G A06;

    public C8l0() {
        super("AudioGlyphComponent");
        this.A00 = 2132345370;
        this.A02 = 2132410440;
        this.A03 = 2132345371;
    }

    public final Object[] A0k() {
        return new Object[]{Integer.valueOf(this.A00), Integer.valueOf(this.A01), this.A06, Integer.valueOf(this.A02), Integer.valueOf(this.A03), Integer.valueOf(this.A04)};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        78G r0 = this.A06;
        int i = this.A01;
        int i2 = this.A04;
        int i3 = this.A00;
        int i4 = this.A03;
        int i5 = this.A02;
        11T.A0F(r302, 0);
        C2cm A00 = C2cl.A00(r302);
        7zL.A1J(A00);
        A00.A1I(i5);
        if (r0 == null || !r0.A05) {
            i = i2;
        }
        A00.A2X(i);
        A00.A1J(2131952950);
        7zN.A1C(A00, r302, C8l0.class, "AudioGlyphComponent");
        if (r0 == null || !r0.A05) {
            i3 = i4;
        }
        A00.A2a(i3);
        return 7zN.A09(A00);
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
        78G r05 = ((C8l0) r03).A06;
        1BK.A1M(r04, r05);
        1LI r06 = r04.A02;
        if (r06 == null || (r0 = ((C8l0) r06).A05) == null) {
            return null;
        }
        7zR.A1E(r0, new 7Bk(r05.getClass(), false));
        return null;
    }
}
