package X;

/* loaded from: J3y.class */
public final class J3y implements Runnable {
    public static final String __redex_internal_original_name = "GrootPlayerLogger$logErrorRecoveryAttempt$1";
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ IHX A03;
    public final /* synthetic */ 7uY A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public J3y(IHX ihx, 7uY r303, String str, String str2, String str3, long j, long j2, long j3) {
        this.A03 = ihx;
        this.A00 = j;
        this.A07 = str;
        this.A04 = r303;
        this.A05 = str2;
        this.A02 = j2;
        this.A01 = j3;
        this.A06 = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JNa jNa = this.A03.A02;
        long j = this.A00;
        String str = this.A07;
        jNa.Ba4(this.A04, str, this.A05, this.A06, j, this.A02, this.A01);
    }
}
