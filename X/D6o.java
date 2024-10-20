package X;

/* loaded from: D6o.class */
public final class D6o implements Runnable {
    public static final String __redex_internal_original_name = "ThreadListQueryDeduper$2";
    public final /* synthetic */ C5B A00;

    public D6o(C5B c5b) {
        this.A00 = c5b;
    }

    @Override // java.lang.Runnable
    public void run() {
        C5B c5b = this.A00;
        synchronized (c5b) {
            c5b.A01 = null;
            c5b.A00 = null;
        }
    }
}
