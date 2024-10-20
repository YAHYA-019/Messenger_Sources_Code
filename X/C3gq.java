package X;

/* renamed from: X.3gq, reason: invalid class name */
/* loaded from: 3gq.class */
public final class C3gq implements Runnable {
    public static final String __redex_internal_original_name = "JewelBadgeController$actionReceiver$1$onReceive$1";
    public final /* synthetic */ C04744bu A00;
    public final /* synthetic */ boolean A01;

    public C3gq(C04744bu c04744bu, boolean z) {
        this.A01 = z;
        this.A00 = c04744bu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A04(this.A01 ? new 2QC(1, "RED_DOT") : 2QC.A03);
    }
}
