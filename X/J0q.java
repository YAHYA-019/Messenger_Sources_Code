package X;

/* loaded from: J0q.class */
public final class J0q implements Runnable {
    public static final String __redex_internal_original_name = "OrcaRsysConnectFunnelProxy$start$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ Gwb A01;
    public final /* synthetic */ String A02;

    public J0q(Gwb gwb, String str, int i) {
        this.A01 = gwb;
        this.A02 = str;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C00i c00i = this.A01.A00.A00;
        I9T i9t = (I9T) c00i.get();
        String str = this.A02;
        i9t.A06(str, "rsys_feature", this.A00, false);
        ((I9T) c00i.get()).A05(str, 16, false);
    }
}
