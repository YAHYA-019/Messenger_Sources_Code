package X;

/* renamed from: X.4Ww, reason: invalid class name */
/* loaded from: 4Ww.class */
public final class C4Ww implements Runnable {
    public static final String __redex_internal_original_name = "zzg";
    public final /* synthetic */ 4FD A00;

    public C4Ww(4FD r302) {
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public final void run() {
        4FD r0 = this.A00;
        synchronized (r0.A01) {
            r0.A00.Bmz();
        }
    }
}
