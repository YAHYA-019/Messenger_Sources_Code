package X;

/* loaded from: J1h.class */
public final class J1h implements Runnable {
    public static final String __redex_internal_original_name = "AudioMessageWaveformsPlayerView$runUpdateProgressOnUiThread$1";
    public final /* synthetic */ float A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ GPV A02;

    public J1h(GPV gpv, float f, long j) {
        this.A02 = gpv;
        this.A01 = j;
        this.A00 = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A02.A08(this.A01, this.A00);
    }
}
