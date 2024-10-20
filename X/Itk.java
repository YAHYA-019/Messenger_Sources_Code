package X;

/* loaded from: Itk.class */
public final class Itk implements Runnable {
    public static final String __redex_internal_original_name = "FbHeroPlayer$SurfaceUnavailableCallbackRunnable$1";
    public final /* synthetic */ IyW A00;

    public Itk(IyW iyW) {
        this.A00 = iyW;
    }

    @Override // java.lang.Runnable
    public void run() {
        6dI r0 = this.A00.A01;
        if (r0 != null) {
            r0.ATC();
        }
    }
}
