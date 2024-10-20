package X;

/* loaded from: J3m.class */
public final /* synthetic */ class J3m implements Runnable {
    public static final String __redex_internal_original_name = "BasicSurfacePipeComponent$$ExternalSyntheticLambda4";
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ Gtr A05;
    public final /* synthetic */ boolean A06;

    public /* synthetic */ J3m(Gtr gtr, int i, int i2, int i3, int i4, int i5, boolean z) {
        this.A05 = gtr;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A04 = i5;
        this.A06 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Gtr gtr = this.A05;
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A02;
        int i4 = this.A03;
        int i5 = this.A04;
        boolean z = this.A06;
        boolean z2 = gtr.A0G;
        int i6 = gtr.A00;
        gtr.A03 = i;
        gtr.A02 = i2;
        gtr.A06 = i3;
        gtr.A07 = i4;
        gtr.A01 = i5;
        gtr.A0H = z;
        gtr.A0G = z2;
        gtr.A00 = i6;
        Gtr.A03(gtr);
    }
}
