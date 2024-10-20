package X;

/* loaded from: G20.class */
public final class G20 implements Runnable {
    public static final String __redex_internal_original_name = "XplatCameraCoreEffectManager$loadEffectInternalV2$loadToken$1$handleLoadEffectSuccess$2";
    public final /* synthetic */ JHj A00;
    public final /* synthetic */ Hpi A01;

    public G20(JHj jHj, Hpi hpi) {
        this.A00 = jHj;
        this.A01 = hpi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.onSuccess(this.A01);
    }
}
