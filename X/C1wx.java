package X;

/* renamed from: X.1wx, reason: invalid class name */
/* loaded from: 1wx.class */
public final class C1wx implements Runnable {
    public static final String __redex_internal_original_name = "OrchestrationFuture$1";
    public final /* synthetic */ 1wV A00;

    public C1wx(1wV r302) {
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public void run() {
        1wV r0 = this.A00;
        C1vl c1vl = r0.A01;
        if (c1vl != null) {
            1wN r02 = r0.A00;
            r0.isCancelled();
            C1vj c1vj = c1vl.A00;
            ((C1vt) ((C1vr) c1vj.A06.get()).A01.get()).A00(r02.A00);
            C1vj.A00(c1vj);
        }
        synchronized (r0) {
            r0.A04.countDown();
            r0.A03.A01();
        }
    }
}
