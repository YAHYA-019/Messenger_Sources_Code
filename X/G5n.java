package X;

import com.facebook.auth.usersession.FbUserSession;

/* loaded from: G5n.class */
public final class G5n implements Runnable {
    public static final String __redex_internal_original_name = "SendFriendRequestIntentHandler$sendFriendRequest$1$1";
    public final /* synthetic */ long A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ 1Iw A02;
    public final /* synthetic */ Bpb A03;
    public final /* synthetic */ boolean A04;

    public G5n(FbUserSession fbUserSession, 1Iw r303, Bpb bpb, long j, boolean z) {
        this.A03 = bpb;
        this.A01 = fbUserSession;
        this.A02 = r303;
        this.A00 = j;
        this.A04 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bpb bpb = this.A03;
        FbUserSession fbUserSession = this.A01;
        1Iw r0 = this.A02;
        long j = this.A00;
        boolean z = this.A04;
        int i = 2131957032;
        if (z) {
            i = 2131957033;
        }
        String A0D = r0.A0D(i);
        11T.A0D(A0D);
        C2148Dfc c2148Dfc = new C2148Dfc(r0);
        c2148Dfc.A0g(A0D);
        if (z) {
            AbstractC2158Dfm abstractC2158Dfm = new AbstractC2158Dfm(r0);
            abstractC2158Dfm.A0g(r0.A0D(2131953816));
            abstractC2158Dfm.A0f(r0.A0D(2131953816));
            abstractC2158Dfm.A04 = 7zO.A0U(new ARA(0, j, fbUserSession, bpb));
            c2148Dfc.A03 = RXy.A00(abstractC2158Dfm);
        }
        FFJ ffj = new FFJ(r0);
        ffj.A00 = c2148Dfc;
        FFJ.A01(ffj, AbstractC00603o4.A00(391));
    }
}
