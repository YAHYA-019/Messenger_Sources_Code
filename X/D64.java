package X;

/* loaded from: D64.class */
public final class D64 implements Runnable {
    public static final String __redex_internal_original_name = "ActiveStatusUnpauseScheduleHelper$scheduleTurningOffPause$1";
    public final /* synthetic */ C7l A00;

    public D64(C7l c7l) {
        this.A00 = c7l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C00i c00i = this.A00.A02.A00;
        ((1X6) c00i.get()).A06(true);
        ((1X6) c00i.get()).A03(0L);
    }
}
