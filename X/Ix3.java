package X;

/* loaded from: Ix3.class */
public final class Ix3 implements Runnable {
    public static final String __redex_internal_original_name = "DedupedOrientationEventListener$triggerListener$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ GTv A01;

    public Ix3(GTv gTv, int i) {
        this.A01 = gTv;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JFm jFm = this.A01.A01;
        if (jFm != null) {
            jFm.onRotationChanged(this.A00);
        }
    }
}
