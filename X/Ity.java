package X;

/* loaded from: Ity.class */
public final class Ity implements Runnable {
    public static final String __redex_internal_original_name = "GrootPlayerImpl$releaseSurface$1";
    public final /* synthetic */ Runnable A00;

    public Ity(Runnable runnable) {
        this.A00 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IhE.A0h.post(this.A00);
    }
}
