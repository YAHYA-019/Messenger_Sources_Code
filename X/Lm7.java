package X;

/* loaded from: Lm7.class */
public final class Lm7 implements Runnable {
    public static final String __redex_internal_original_name = "RippleHostView$setRippleState$2";
    public final /* synthetic */ JXk A00;

    public Lm7(JXk jXk) {
        this.A00 = jXk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JXk jXk = this.A00;
        JVe jVe = jXk.A00;
        if (jVe != null) {
            jVe.setState(JXk.A06);
        }
        jXk.A03 = null;
    }
}
