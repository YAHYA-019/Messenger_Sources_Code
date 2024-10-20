package X;

/* renamed from: X.3fs, reason: invalid class name */
/* loaded from: 3fs.class */
public final class C3fs implements Runnable {
    public static final String __redex_internal_original_name = "ClientSubscriptionManager$6";
    public final /* synthetic */ C1u9 A00;

    public C3fs(C1u9 c1u9) {
        this.A00 = c1u9;
    }

    @Override // java.lang.Runnable
    public void run() {
        0fH.A0A(C1u9.class, "Disconnected from MQTT push service");
        this.A00.A00 = null;
    }
}
