package X;

/* loaded from: J39.class */
public final class J39 implements Runnable {
    public static final String __redex_internal_original_name = "GrootPlayerLogger$logRequestedPlaying$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ IHX A03;
    public final /* synthetic */ String A04;

    public J39(IHX ihx, String str, int i, long j, long j2) {
        this.A03 = ihx;
        this.A00 = i;
        this.A02 = j;
        this.A01 = j2;
        this.A04 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A03.A02.BbM(null, this.A04, this.A00, this.A02, this.A01);
    }
}
