package X;

/* loaded from: ACw.class */
public final class ACw implements Runnable {
    public static final String __redex_internal_original_name = "MontageChangedEventNotifier$handleOnRefreshMontageBusEvent$1";
    public final /* synthetic */ C5d0 A00;

    public ACw(C5d0 c5d0) {
        this.A00 = c5d0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5cv c5cv = this.A00.A01;
        if (c5cv != null) {
            c5cv.CGE();
        }
    }
}
