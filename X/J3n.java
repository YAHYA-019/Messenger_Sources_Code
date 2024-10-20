package X;

/* loaded from: J3n.class */
public final /* synthetic */ class J3n implements Runnable {
    public static final String __redex_internal_original_name = "RtcSurfacePipeComponent$$ExternalSyntheticLambda2";
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ Gtq A05;
    public final /* synthetic */ boolean A06;

    public /* synthetic */ J3n(Gtq gtq, int i, int i2, int i3, int i4, int i5, boolean z) {
        this.A05 = gtq;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A04 = i5;
        this.A06 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Gtq gtq = this.A05;
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A02;
        int i4 = this.A03;
        int i5 = this.A04;
        boolean z = this.A06;
        boolean z2 = gtq.A0B;
        int i6 = gtq.A00;
        gtq.A03 = i;
        gtq.A02 = i2;
        gtq.A04 = i3;
        gtq.A05 = i4;
        gtq.A01 = i5;
        gtq.A0C = z;
        gtq.A0B = z2;
        gtq.A00 = i6;
        Gtq.A03(gtq);
    }
}
