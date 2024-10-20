package X;

/* loaded from: J3z.class */
public final class J3z implements Runnable {
    public static final String __redex_internal_original_name = "GrootPlayerLogger$logStartBuffering$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ IHX A02;
    public final /* synthetic */ 6Ud A03;
    public final /* synthetic */ 6Uc A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public J3z(IHX ihx, 6Ud r303, 6Uc r304, String str, int i, long j, boolean z, boolean z2) {
        this.A02 = ihx;
        this.A00 = i;
        this.A04 = r304;
        this.A03 = r303;
        this.A07 = z;
        this.A06 = z2;
        this.A01 = j;
        this.A05 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JOD jod = this.A02.A03;
        int i = this.A00;
        6Uc r0 = this.A04;
        6Ud r02 = this.A03;
        boolean z = this.A07;
        boolean z2 = this.A06;
        jod.Bbg(r02, r0, this.A05, i, this.A01, z, z2);
    }
}
