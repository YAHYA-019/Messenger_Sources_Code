package X;

/* renamed from: X.0jv, reason: invalid class name */
/* loaded from: 0jv.class */
public abstract class C0jv implements Runnable {
    public static final String __redex_internal_original_name = "InstrumentRunnable";
    public final Runnable A00;

    public C0jv(Runnable runnable) {
        this.A00 = runnable;
    }

    public abstract void A00();

    public abstract void A01();

    public abstract void A02(Throwable th);

    @Override // java.lang.Runnable
    public final void run() {
        try {
            A01();
            this.A00.run();
        } catch (Throwable th) {
            try {
                A02(th);
                throw th;
            } finally {
                A00();
            }
        }
    }
}
