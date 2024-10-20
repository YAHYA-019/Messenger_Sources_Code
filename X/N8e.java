package X;

/* loaded from: N8e.class */
public final class N8e implements Runnable {
    public static final String __redex_internal_original_name = "AppwideAnimationTracker$enable$1";
    public final /* synthetic */ N0u A00;

    public N8e(N0u n0u) {
        this.A00 = n0u;
    }

    @Override // java.lang.Runnable
    public final void run() {
        N0u n0u = this.A00;
        if (n0u.A03) {
            return;
        }
        n0u.A03 = true;
    }
}
