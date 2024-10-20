package X;

/* renamed from: X.2ds, reason: invalid class name */
/* loaded from: 2ds.class */
public final class C2ds implements Runnable {
    public static final String __redex_internal_original_name = "ConnectionStatusNotificationController$1";
    public final /* synthetic */ C2dr A00;

    public C2ds(C2dr c2dr) {
        this.A00 = c2dr;
    }

    @Override // java.lang.Runnable
    public void run() {
        C2dr.A00(this.A00, "on_resume");
    }
}
