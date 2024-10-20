package X;

/* loaded from: Lqj.class */
public final /* synthetic */ class Lqj implements Runnable {
    public static final String __redex_internal_original_name = "BandwidthMeter$EventListener$EventDispatcher$$ExternalSyntheticLambda0";
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ 7rI A03;

    public /* synthetic */ Lqj(7rI r302, int i, long j, long j2) {
        this.A03 = r302;
        this.A00 = i;
        this.A01 = j;
        this.A02 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        7rI r0 = this.A03;
        int i = this.A00;
        r0.A02.Bkn(this.A01, this.A02, i);
    }
}
