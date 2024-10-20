package X;

/* renamed from: X.2f3, reason: invalid class name */
/* loaded from: 2f3.class */
public final class C2f3 {
    public final C00i A00 = new 1BQ(16754);
    public final C00i A01 = new 1BQ(16461);
    public final Object A02 = new Object();
    public volatile boolean A04 = true;
    public final Runnable A03 = new Runnable() { // from class: X.2f4
        public static final String __redex_internal_original_name = "ThreadListLoadingSignalSender$1";

        @Override // java.lang.Runnable
        public void run() {
            C2f3.this.A00();
        }
    };

    public void A00() {
        if (this.A04) {
            return;
        }
        this.A04 = true;
        ((C1fj) this.A00.get()).A02(this.A02);
    }
}
