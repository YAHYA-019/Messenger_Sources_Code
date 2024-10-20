package X;

/* loaded from: Llh.class */
public final class Llh implements Runnable {
    public static final String __redex_internal_original_name = "GiftBoxOverlayView$onCompleteDetachRunnable$1";
    public final /* synthetic */ JXq A00;

    public Llh(JXq jXq) {
        this.A00 = jXq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JXq jXq = this.A00;
        jXq.removeCallbacks(jXq.A04);
        jXq.removeCallbacks(jXq.A03);
        jXq.A02 = true;
        JVX jvx = jXq.A01;
        if (jvx != null) {
            LQZ lqz = jvx.A03;
            if (lqz != null) {
                lqz.A02();
            }
            jvx.A03 = null;
        }
    }
}
