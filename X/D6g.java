package X;

import com.facebook.auth.usersession.FbUserSession;

/* loaded from: D6g.class */
public final class D6g implements Runnable {
    public static final String __redex_internal_original_name = "RealTimeRankingRequestHandler$realTimeRankingTimeoutRunnable$1";
    public final /* synthetic */ CHj A00;

    public D6g(CHj cHj) {
        this.A00 = cHj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CHj cHj = this.A00;
        C1qM c1qM = cHj.A04;
        if (c1qM != null) {
            FbUserSession fbUserSession = cHj.A02;
            if (fbUserSession == null) {
                7zL.A1C();
                throw 0Q8.createAndThrow();
            }
            ((C21N) 4YU.A0o(fbUserSession, cHj.A06, 33124)).A01(c1qM);
        }
        if (cHj.A0H) {
            ((I5L) 1Br.A0B(cHj.A0A)).A04(CHj.A0I, cHj.A00);
        }
        if (!AbL.A0P(cHj.A0F).AZk(36323345876732410L)) {
            ((CIl) 1Br.A0B(cHj.A0E)).A01();
        }
        1Br.A04(cHj.A08).D0v("RealTimeRankingRequestHandler", 0Pz.A0h("Real-time ranking SP timed out after ", " ms.", cHj.A05));
        Bn1 bn1 = cHj.A03;
        if (bn1 != null) {
            COf.A01(BOF.A01, bn1.A00.A05, bn1.A01);
        }
    }
}
