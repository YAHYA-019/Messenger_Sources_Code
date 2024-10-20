package X;

/* loaded from: AFw.class */
public final class AFw implements Runnable {
    public static final String __redex_internal_original_name = "GeneratedThemeLoadingStateComponent$getTextCyclingRunnable$1";
    public final /* synthetic */ long A00;
    public final /* synthetic */ C2lh A01;
    public final /* synthetic */ 8Z3 A02;

    public AFw(C2lh c2lh, 8Z3 r303, long j) {
        this.A01 = c2lh;
        this.A02 = r303;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public void run() {
        C2lh c2lh = this.A01;
        8Z3 r0 = this.A02;
        c2lh.A05(AV4.A00(r0, 25));
        r0.A00.postDelayed(this, this.A00);
    }
}
