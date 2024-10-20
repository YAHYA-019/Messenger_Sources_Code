package X;

/* loaded from: D6m.class */
public final class D6m implements Runnable {
    public static final String __redex_internal_original_name = "MessagesSyncConnectionHandler$3$1";
    public final /* synthetic */ D0S A00;

    public D6m(D0S d0s) {
        this.A00 = d0s;
    }

    @Override // java.lang.Runnable
    public void run() {
        0fH.A0j("MessagesSyncConnectionHandler", "kick createQueue if it is scheduled.");
        ((F9D) this.A00.A02).A01();
    }
}
