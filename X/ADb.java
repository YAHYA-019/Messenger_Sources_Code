package X;

import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: ADb.class */
public final class ADb implements Runnable {
    public static final String __redex_internal_original_name = "AIBotEmbodimentGraphDataSource$requestFetch$1";
    public final /* synthetic */ C93c A00;

    public ADb(C93c c93c) {
        this.A00 = c93c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C93c c93c = this.A00;
        C8xl c8xl = (C8xl) 1Lm.A05(c93c.A02, c93c.A03, 68444);
        long j = c93c.A01;
        1Um AQV = c8xl.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        1Um.A02(AQV, new A1U(1, j, c8xl, A0P), A0P, false);
        1Um A0O = 1BK.A0O(c8xl, 0);
        MailboxFutureImpl A0P2 = 1BK.A0P(A0O);
        1Um.A02(A0O, new A0O(0, j, new C8yi(c8xl, A0O), c8xl, A0P2), A0P2, false);
        A1d.A01(A0P2, c93c, 92);
    }
}
