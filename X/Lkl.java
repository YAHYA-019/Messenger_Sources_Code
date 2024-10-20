package X;

/* loaded from: Lkl.class */
public final class Lkl implements Runnable {
    public static final String __redex_internal_original_name = "AnimatedDrawable2$1";
    public final /* synthetic */ JVb A00;

    public Lkl(JVb jVb) {
        this.A00 = jVb;
    }

    @Override // java.lang.Runnable
    public void run() {
        JVb jVb = this.A00;
        jVb.unscheduleSelf(jVb.A0B);
        jVb.invalidateSelf();
    }
}
