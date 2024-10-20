package X;

/* loaded from: Isd.class */
public final class Isd implements Runnable {
    public static final String __redex_internal_original_name = "RendererSurfacePipeComponent$2";
    public final /* synthetic */ Gts A00;

    public Isd(Gts gts) {
        this.A00 = gts;
    }

    @Override // java.lang.Runnable
    public void run() {
        Gts gts = this.A00;
        IGl iGl = gts.A0K;
        gts.A0K = null;
        if (iGl != null) {
            iGl.A01();
        }
    }
}
