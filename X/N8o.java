package X;

/* loaded from: N8o.class */
public final class N8o implements Runnable {
    public static final String __redex_internal_original_name = "FailedUploadRetryTask$start$1";
    public final /* synthetic */ NAF A00;

    public N8o(NAF naf) {
        this.A00 = naf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NAF naf = this.A00;
        if (naf == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        naf.Cjl("Scheduled retry");
    }
}
