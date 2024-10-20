package X;

/* loaded from: Iw7.class */
public final class Iw7 implements Runnable {
    public static final String __redex_internal_original_name = "LifecycleAwareCallback$onFailure$$inlined$onMainThread$1";
    public final /* synthetic */ InE A00;
    public final /* synthetic */ Throwable A01;

    public Iw7(InE inE, Throwable th) {
        this.A00 = inE;
        this.A01 = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JIM jim = this.A00.A00;
        if (jim != null) {
            jim.onFailure(this.A01);
        }
    }
}
