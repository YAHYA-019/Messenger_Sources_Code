package X;

/* renamed from: X.4Ok, reason: invalid class name */
/* loaded from: 4Ok.class */
public final class C4Ok implements Runnable {
    public static final String __redex_internal_original_name = "zzm";
    public final /* synthetic */ 4FB A00;
    public final /* synthetic */ C4Ez A01;

    public C4Ok(4FB r302, C4Ez c4Ez) {
        this.A00 = r302;
        this.A01 = c4Ez;
    }

    @Override // java.lang.Runnable
    public final void run() {
        4FB r0 = this.A00;
        synchronized (r0.A01) {
            r0.A00.onSuccess(this.A01.A05());
        }
    }
}
