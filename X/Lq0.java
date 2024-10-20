package X;

/* loaded from: Lq0.class */
public final class Lq0 implements Runnable {
    public static final String __redex_internal_original_name = "VideoRendererEventListener$EventDispatcher$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ 6Yl A01;
    public final /* synthetic */ 6WT A02;

    public Lq0(6Yl r302, 6WT r303, int i) {
        this.A02 = r303;
        this.A00 = i;
        this.A01 = r302;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A02.A01.Bsv(this.A01, this.A00);
    }
}
