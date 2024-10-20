package X;

/* loaded from: G1r.class */
public final class G1r implements Runnable {
    public static final String __redex_internal_original_name = "BaseOffsiteFbPaySDKController$initAvailabilityRequest$1";
    public final /* synthetic */ JgX A00;
    public final /* synthetic */ DaX A01;

    public G1r(JgX jgX, DaX daX) {
        this.A01 = daX;
        this.A00 = jgX;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C01i c01i = this.A01.A05;
        if (c01i != null) {
            c01i.getValue();
            throw AnonymousClass001.A0Q("getOffsiteJavascriptFetchedLD");
        }
        11T.A0L("checkoutHandler");
        throw 0Q8.createAndThrow();
    }
}
