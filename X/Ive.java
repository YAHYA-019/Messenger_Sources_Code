package X;

/* loaded from: Ive.class */
public final class Ive implements Runnable {
    public static final String __redex_internal_original_name = "ForegroundEligibilityStatus$whenSafe$3$1";
    public final /* synthetic */ C05804f0 A00;
    public final /* synthetic */ C00m A01;

    public Ive(C05804f0 c05804f0, C00m c00m) {
        this.A00 = c05804f0;
        this.A01 = c00m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A04.remove(this.A01);
    }
}
