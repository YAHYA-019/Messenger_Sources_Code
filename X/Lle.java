package X;

/* loaded from: Lle.class */
public final class Lle implements Runnable {
    public static final String __redex_internal_original_name = "BubbleConfettiDrawable$draw$2";
    public final /* synthetic */ JVP A00;

    public Lle(JVP jvp) {
        this.A00 = jvp;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.invalidateSelf();
    }
}
