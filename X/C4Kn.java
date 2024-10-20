package X;

/* renamed from: X.4Kn, reason: invalid class name */
/* loaded from: 4Kn.class */
public final class C4Kn implements Runnable {
    public static final String __redex_internal_original_name = "StartWorkRunnable";
    public final C4Kl A00;
    public final C4Ji A01;
    public final C4Km A02;

    public C4Kn(C4Kl c4Kl, C4Ji c4Ji, C4Km c4Km) {
        this.A01 = c4Ji;
        this.A02 = c4Km;
        this.A00 = c4Kl;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A01.A04(this.A00, this.A02);
    }
}
