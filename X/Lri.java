package X;

/* loaded from: Lri.class */
public final class Lri implements Runnable, MHY {
    public static final String __redex_internal_original_name = "Scheduler$DisposeTask";
    public Thread A00;
    public final Lhv A01;
    public final Runnable A02;

    public Lri(Lhv lhv, Runnable runnable) {
        this.A02 = runnable;
        this.A01 = lhv;
    }

    public void dispose() {
        if (this.A00 == Thread.currentThread()) {
            JSW jsw = this.A01;
            if (jsw instanceof JSW) {
                JSW jsw2 = jsw;
                if (jsw2.A01) {
                    return;
                }
                jsw2.A01 = true;
                jsw2.A00.shutdown();
                return;
            }
        }
        this.A01.dispose();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A00 = Thread.currentThread();
        try {
            this.A02.run();
        } finally {
            dispose();
            this.A00 = null;
        }
    }
}
