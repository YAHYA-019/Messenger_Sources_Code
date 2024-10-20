package X;

/* loaded from: Irn.class */
public final class Irn implements Runnable {
    public static final String __redex_internal_original_name = "RtcMediaGridView$onSizeChanged$1";
    public final /* synthetic */ GvN A00;

    public Irn(GvN gvN) {
        this.A00 = gvN;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.requestLayout();
    }
}
