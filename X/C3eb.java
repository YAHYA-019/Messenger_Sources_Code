package X;

/* renamed from: X.3eb, reason: invalid class name */
/* loaded from: 3eb.class */
public final class C3eb implements Runnable {
    public static final String __redex_internal_original_name = "CancellableRunnable";
    public volatile Runnable A00;

    @Override // java.lang.Runnable
    public void run() {
        Runnable runnable = this.A00;
        if (runnable != null) {
            runnable.run();
        }
    }
}
