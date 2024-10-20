package X;

/* loaded from: Lkk.class */
public final class Lkk implements Runnable {
    public static final String __redex_internal_original_name = "AnimationBackendDelegateWithInactivityCheck$1";
    public final /* synthetic */ C3298Jpt A00;

    public Lkk(C3298Jpt c3298Jpt) {
        this.A00 = c3298Jpt;
    }

    @Override // java.lang.Runnable
    public void run() {
        C3298Jpt c3298Jpt = this.A00;
        synchronized (c3298Jpt) {
            c3298Jpt.A02 = false;
            if (c3298Jpt.A03.now() - c3298Jpt.A00 > 2000) {
                LVx lVx = c3298Jpt.A01;
                if (lVx != null) {
                    if (lVx.A0A) {
                        MKZ mkz = lVx.A08;
                        if (mkz != null) {
                            mkz.onStop();
                        }
                    } else {
                        lVx.clear();
                    }
                }
            } else {
                C3298Jpt.A00(c3298Jpt);
            }
        }
    }
}
