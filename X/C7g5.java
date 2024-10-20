package X;

/* renamed from: X.7g5, reason: invalid class name */
/* loaded from: 7g5.class */
public final class C7g5 extends C1rj {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public 1Im A05;
    public 78G A06;
    public boolean A07;

    public C7g5() {
        super("AudioTrashGlyphComponent");
        this.A00 = 2132345370;
        this.A03 = 2132345371;
    }

    public final Object[] A0k() {
        return new Object[]{Integer.valueOf(this.A00), Integer.valueOf(this.A01), this.A06, Boolean.valueOf(this.A07), Integer.valueOf(this.A02), Integer.valueOf(this.A03), Integer.valueOf(this.A04)};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        78G r0 = this.A06;
        int i = this.A01;
        int i2 = this.A04;
        boolean z = this.A07;
        int i3 = this.A02;
        int i4 = this.A00;
        int i5 = this.A03;
        11T.A0F(r0, 1);
        C2cm A00 = C2cl.A00(r302);
        A00.A0F("android.widget.Button");
        A00.A1I(2132410440);
        if (z) {
            i = i3;
        } else if (!r0.A05) {
            i = i2;
        }
        A00.A2X(i);
        float f = 0.0f;
        if (z) {
            f = -15.0f;
        }
        A00.A0u(f);
        float f2 = 1.0f;
        if (z) {
            f2 = 1.6f;
        }
        A00.A0v(f2);
        A00.A1J(2131954663);
        A00.A2T(1LI.A06(r302, C7g5.class, "AudioTrashGlyphComponent"));
        A00.A2L("TRASH_GLYPH_TRANSITION_KEY");
        if (!r0.A05) {
            i4 = i5;
        }
        A00.A2a(i4);
        A00.A0J();
        C2cl c2cl = A00.A00;
        11T.A0A(c2cl);
        return c2cl;
    }

    @Override // X.C1rj
    public C3s9 A13(1Iw r302) {
        5X3 A00 = C3s9.A00(C3s9.A04, "TRASH_GLYPH_TRANSITION_KEY");
        A00.A06(new C2jo[]{C2jm.A04, C2jm.A09, C2jm.A02});
        ((5X4) A00).A02 = new C5X0(500);
        return A00;
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return 4YV.A0M(c1qp);
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.7GA, java.lang.Object] */
    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1351902487) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        1LI r0 = r302.A00.A00.A02;
        1Im r307 = r0 == null ? null : ((C7g5) r0).A05;
        7BZ r02 = 7BZ.A02;
        ?? obj2 = new Object();
        ((7GA) obj2).A00 = r02;
        r307.A00((Object) obj2);
        return null;
    }
}
