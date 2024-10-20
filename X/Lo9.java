package X;

/* loaded from: Lo9.class */
public final /* synthetic */ class Lo9 implements Runnable {
    public static final String __redex_internal_original_name = "ExoPlayerImplInternal$$ExternalSyntheticLambda0";
    public final /* synthetic */ 6YV A00;
    public final /* synthetic */ 6Yp A01;

    public /* synthetic */ Lo9(6YV r302, 6Yp r303) {
        this.A00 = r302;
        this.A01 = r303;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            6YV.A0H(this.A01);
        } catch (6ZU e) {
            android.util.Log.e("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw AnonymousClass001.A0U(e);
        }
    }
}
