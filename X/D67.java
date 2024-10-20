package X;

/* loaded from: D67.class */
public final class D67 implements Runnable {
    public static final String __redex_internal_original_name = "BroadcastChannelsBadgeController$checkIfBadgeStateChanged$1";
    public final /* synthetic */ 6BU A00;

    public D67(6BU r302) {
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public final void run() {
        6BU r0 = this.A00;
        r0.A04(new 2QC(r0.A03.get() ? 1 : 0, "RED_WITH_TEXT"));
    }
}
