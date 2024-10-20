package X;

/* loaded from: G0g.class */
public final class G0g implements Runnable {
    public static final String __redex_internal_original_name = "QuicksilverSDKController$3$2";
    public final /* synthetic */ EtO A00;

    public G0g(EtO etO) {
        this.A00 = etO;
    }

    @Override // java.lang.Runnable
    public void run() {
        EtO etO = this.A00;
        FJB.A06(etO.A00, etO.A01, "Failed to persist player data due to a network issue", "NETWORK_FAILURE");
    }
}
