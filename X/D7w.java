package X;

/* loaded from: D7w.class */
public final class D7w implements Runnable {
    public static final String __redex_internal_original_name = "BusinessInboxCatalogSendHandler$sendProducts$1$onCompletion$1";
    public final /* synthetic */ DHD A00;
    public final /* synthetic */ boolean A01;

    public D7w(DHD dhd, boolean z) {
        this.A01 = z;
        this.A00 = dhd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.A01;
        DHD dhd = this.A00;
        if (z) {
            dhd.onSuccess();
        } else {
            dhd.onFailure(AbF.A1D("Send failure"));
        }
    }
}
