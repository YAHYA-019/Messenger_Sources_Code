package X;

/* loaded from: AGn.class */
public final class AGn implements Runnable {
    public static final String __redex_internal_original_name = "MemoryViewModelFetcher$startMemoryViewDetailTimeoutCounter$1";
    public final /* synthetic */ long A00;
    public final /* synthetic */ C9kn A01;
    public final /* synthetic */ 9OG A02;
    public final /* synthetic */ String A03;

    public AGn(C9kn c9kn, 9OG r303, String str, long j) {
        this.A01 = c9kn;
        this.A03 = str;
        this.A00 = j;
        this.A02 = r303;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9kn c9kn = this.A01;
        C8yo c8yo = c9kn.A00;
        if (c8yo != null) {
            c8yo.D5r();
        }
        c9kn.A00 = null;
        C9kn.A01(c9kn, C96d.A06, this.A02, null, null, this.A03, null, null, this.A00);
    }
}
