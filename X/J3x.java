package X;

/* loaded from: J3x.class */
public final class J3x implements Runnable {
    public static final String __redex_internal_original_name = "GrootPlayerLogger$logEndBuffering$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ IHX A04;
    public final /* synthetic */ Hzz A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public J3x(IHX ihx, Hzz hzz, int i, long j, long j2, long j3, boolean z, boolean z2) {
        this.A04 = ihx;
        this.A00 = i;
        this.A01 = j;
        this.A06 = z;
        this.A07 = z2;
        this.A03 = j2;
        this.A02 = j3;
        this.A05 = hzz;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JOD jod = this.A04.A03;
        int i = this.A00;
        long j = this.A01;
        boolean z = this.A06;
        boolean z2 = this.A07;
        jod.Ba0(this.A05, i, j, this.A03, this.A02, z, z2);
    }
}
