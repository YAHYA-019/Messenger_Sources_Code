package X;

/* loaded from: N8n.class */
public final class N8n implements Runnable {
    public static final String __redex_internal_original_name = "FailedUploadRetryTask$maybeExecuteNow$1";
    public final /* synthetic */ N6c A00;

    public N8n(N6c n6c) {
        this.A00 = n6c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        N6c n6c = this.A00;
        if (!((C08644nd) 1Br.A0B(n6c.A02)).A00() || n6c.A00 == null) {
            return;
        }
        n6c.A00(-1);
        4YV.A11(n6c.A03).execute(new N8o(n6c.A00));
    }
}
