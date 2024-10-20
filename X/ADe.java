package X;

/* loaded from: ADe.class */
public final class ADe implements Runnable {
    public static final String __redex_internal_original_name = "MultiCallActivityBinder$removeMultiCallFragment$2$1";
    public final /* synthetic */ C00m A00;

    public ADe(C00m c00m) {
        this.A00 = c00m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.A00.invoke();
        } catch (IllegalStateException unused) {
            IDO.A00.A03("MultiCallActivityBinder", "Failed to remove MultiCallFragment.", (Throwable) null);
        }
    }
}
