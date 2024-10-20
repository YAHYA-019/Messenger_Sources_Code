package X;

/* renamed from: X.5ie, reason: invalid class name */
/* loaded from: 5ie.class */
public final class C5ie implements Runnable {
    public static final String __redex_internal_original_name = "ResumeUndispatchedRunnable";
    public final C2s8 A00;
    public final 2Zs A01;

    public C5ie(C2s8 c2s8, 2Zs r303) {
        this.A01 = r303;
        this.A00 = c2s8;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A00.CiQ(04S.A00, this.A01);
    }
}
