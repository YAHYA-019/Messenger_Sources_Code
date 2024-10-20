package X;

/* loaded from: Lqg.class */
public final /* synthetic */ class Lqg implements Runnable {
    public static final String __redex_internal_original_name = "AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda10";
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ 6Wx A03;

    public /* synthetic */ Lqg(6Wx r302, int i, long j, long j2) {
        this.A03 = r302;
        this.A00 = i;
        this.A01 = j;
        this.A02 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        6Wx r0 = this.A03;
        int i = this.A00;
        r0.A01.BkG(this.A01, this.A02, i);
    }
}
