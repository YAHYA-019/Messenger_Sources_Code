package X;

/* loaded from: J0z.class */
public final class J0z implements Runnable {
    public static final String __redex_internal_original_name = "FrameCallback$onFrame$1$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Hsz A02;

    public J0z(Hsz hsz, int i, int i2) {
        this.A02 = hsz;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HVm hVm = this.A02.A00;
        if (hVm != null) {
            hVm.A00.A0A.onVideoSizeChanged(this.A01, this.A00);
        }
    }
}
