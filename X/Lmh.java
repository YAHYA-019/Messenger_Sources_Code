package X;

/* loaded from: Lmh.class */
public final /* synthetic */ class Lmh implements Runnable {
    public static final String __redex_internal_original_name = "WorkForegroundRunnable$$ExternalSyntheticLambda0";
    public final /* synthetic */ JRq A00;
    public final /* synthetic */ C4Ks A01;

    public /* synthetic */ Lmh(JRq jRq, C4Ks c4Ks) {
        this.A00 = jRq;
        this.A01 = c4Ks;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JRq jRq = this.A00;
        C4Ks c4Ks = this.A01;
        if (jRq.A04.isCancelled()) {
            c4Ks.cancel(true);
        } else {
            c4Ks.A05(jRq.A02.getForegroundInfoAsync());
        }
    }
}
