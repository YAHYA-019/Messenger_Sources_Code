package X;

/* loaded from: D6n.class */
public final class D6n implements Runnable {
    public static final String __redex_internal_original_name = "MessagesSyncThreadsFetcher$4$1";
    public final /* synthetic */ D0T A00;

    public D6n(D0T d0t) {
        this.A00 = d0t;
    }

    @Override // java.lang.Runnable
    public void run() {
        0fH.A0j(Cbg.__redex_internal_original_name, "Kick fetchThreadsAndMessagesWithBackoff if it is scheduled");
        ((F9D) this.A00.A02).A01();
    }
}
