package X;

/* loaded from: J3p.class */
public final class J3p implements Runnable {
    public static final String __redex_internal_original_name = "GrootPlayerLogger$logError$1";
    public final /* synthetic */ IHX A00;
    public final /* synthetic */ Hzz A01;
    public final /* synthetic */ 7uY A02;
    public final /* synthetic */ 6Ud A03;
    public final /* synthetic */ 6Uc A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public J3p(IHX ihx, Hzz hzz, 7uY r304, 6Ud r305, 6Uc r306, String str, boolean z) {
        this.A00 = ihx;
        this.A04 = r306;
        this.A03 = r305;
        this.A01 = hzz;
        this.A02 = r304;
        this.A06 = z;
        this.A05 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JNa jNa = this.A00.A02;
        6Uc r0 = this.A04;
        6Ud r02 = this.A03;
        jNa.Ba3(this.A01, this.A02, r02, r0, this.A05, this.A06);
    }
}
