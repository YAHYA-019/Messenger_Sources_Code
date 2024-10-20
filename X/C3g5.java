package X;

/* renamed from: X.3g5, reason: invalid class name */
/* loaded from: 3g5.class */
public final class C3g5 implements Runnable {
    public static final String __redex_internal_original_name = "AutomatedLoggingStateLogger$4";
    public final /* synthetic */ C2w2 A00;
    public final /* synthetic */ C3Og A01;

    public C3g5(C2w2 c2w2, C3Og c3Og) {
        this.A00 = c2w2;
        this.A01 = c3Og;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (2wK r0 : this.A00.A0E) {
            C3Og c3Og = this.A01;
            C3RH c3rh = r0.A00;
            if (c3rh != null) {
                11T.A0F(c3Og, 0);
                ((1vU) 1Br.A0B(c3rh.A09.A05)).A01(new SA9(c3rh, new 3LS(c3Og)));
            }
        }
    }
}
