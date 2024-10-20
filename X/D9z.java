package X;

import com.facebook.auth.usersession.FbUserSession;

/* loaded from: D9z.class */
public final class D9z implements Runnable {
    public static final String __redex_internal_original_name = "PageRtcActorIdFetcher$fetchPageRtcActorId$1";
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ BkN A01;
    public final /* synthetic */ Brd A02;
    public final /* synthetic */ Cfr A03;
    public final /* synthetic */ String A04;

    public D9z(FbUserSession fbUserSession, BkN bkN, Brd brd, Cfr cfr, String str) {
        this.A02 = brd;
        this.A00 = fbUserSession;
        this.A03 = cfr;
        this.A04 = str;
        this.A01 = bkN;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Brd brd = this.A02;
        AbI.A0o(brd.A02).A04(new C1609Amq(this.A01, brd, this.A04, 0), AeR.A00(7zT.A09(brd.A00), C3sa.A00(((C3sb) this.A03.ACe()).A0K)), "page_rtc_actor_id_query");
    }
}
