package X;

/* renamed from: X.3hc, reason: invalid class name */
/* loaded from: 3hc.class */
public final class C3hc implements Runnable {
    public static final String __redex_internal_original_name = "DebugOverlayController$2";
    public final /* synthetic */ 20A A00;
    public final /* synthetic */ C1cm A01;
    public final /* synthetic */ String A02;

    public C3hc(20A r302, C1cm c1cm, String str) {
        this.A00 = r302;
        this.A01 = c1cm;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        20A r0 = this.A00;
        r0.A02();
        r0.A03(this.A01, this.A02);
    }
}
