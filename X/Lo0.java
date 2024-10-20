package X;

/* loaded from: Lo0.class */
public final class Lo0 implements Runnable {
    public static final String __redex_internal_original_name = "GooglePlayDownloaderV2$1$1";
    public final /* synthetic */ Leq A00;
    public final /* synthetic */ 3NT A01;

    public Lo0(Leq leq, 3NT r303) {
        this.A00 = leq;
        this.A01 = r303;
    }

    @Override // java.lang.Runnable
    public void run() {
        C51j c51j = this.A00.A00;
        synchronized (c51j) {
            C51j.A05(c51j, this.A01, true);
            C51j.A04(c51j);
        }
    }
}
