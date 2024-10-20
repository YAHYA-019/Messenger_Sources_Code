package X;

/* renamed from: X.4X8, reason: invalid class name */
/* loaded from: 4X8.class */
public final class C4X8 implements Runnable {
    public static final String __redex_internal_original_name = "zzk";
    public final /* synthetic */ 4FC A00;
    public final /* synthetic */ C4Ez A01;

    public C4X8(4FC r302, C4Ez c4Ez) {
        this.A00 = r302;
        this.A01 = c4Ez;
    }

    @Override // java.lang.Runnable
    public final void run() {
        4FC r0 = this.A00;
        synchronized (r0.A01) {
            C4F2 c4f2 = r0.A00;
            Exception A04 = this.A01.A04();
            AbstractC00481b7.A02(A04);
            c4f2.onFailure(A04);
        }
    }
}
