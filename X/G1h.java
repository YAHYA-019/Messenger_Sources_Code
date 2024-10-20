package X;

/* loaded from: G1h.class */
public final /* synthetic */ class G1h implements Runnable {
    public static final String __redex_internal_original_name = "BloksSurface$$ExternalSyntheticLambda0";
    public final /* synthetic */ int A00;
    public final /* synthetic */ FxL A01;

    public /* synthetic */ G1h(FxL fxL, int i) {
        this.A01 = fxL;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FxL fxL = this.A01;
        int i = this.A00;
        if (i != -1) {
            FxL.A00(fxL, i);
        }
    }
}
