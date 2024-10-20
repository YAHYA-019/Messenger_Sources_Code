package X;

/* loaded from: G5y.class */
public final class G5y implements Runnable {
    public static final String __redex_internal_original_name = "GameInfoFetcher$loadGame$taskCallback$1$onNonCancellationFailure$1";
    public final /* synthetic */ GIV A00;
    public final /* synthetic */ GGE A01;
    public final /* synthetic */ F8P A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public G5y(GIV giv, GGE gge, F8P f8p, String str, String str2, boolean z) {
        this.A02 = f8p;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = z;
        this.A01 = gge;
        this.A00 = giv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        F8P f8p = this.A02;
        String str = this.A03;
        String str2 = this.A04;
        boolean z = this.A05;
        F8P.A00(this.A00, this.A01, f8p, str, str2, z);
    }
}
