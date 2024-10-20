package X;

/* loaded from: J1g.class */
public final class J1g implements Runnable {
    public static final String __redex_internal_original_name = "AudioMessagePlayerView$7";
    public final /* synthetic */ float A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ H5r A02;

    public J1g(H5r h5r, float f, long j) {
        this.A02 = h5r;
        this.A01 = j;
        this.A00 = f;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A02.A02(this.A01, this.A00);
    }
}
