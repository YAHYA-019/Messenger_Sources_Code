package X;

/* loaded from: Lk9.class */
public final /* synthetic */ class Lk9 implements Runnable {
    public static final String __redex_internal_original_name = "LottieDrawable$$ExternalSyntheticLambda1";
    public final /* synthetic */ JVZ A00;

    @Override // java.lang.Runnable
    public final void run() {
        JVZ jvz = this.A00;
        C3125Jjw c3125Jjw = jvz.A0G;
        if (c3125Jjw != null) {
            try {
                jvz.A0X.acquire();
                c3125Jjw.A0A(jvz.A0V.A02());
            } catch (InterruptedException unused) {
            } catch (Throwable th) {
                jvz.A0X.release();
                throw th;
            }
            jvz.A0X.release();
        }
    }
}
