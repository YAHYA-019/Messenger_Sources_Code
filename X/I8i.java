package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.inject.FbInjector;
import com.facebook.msys.mca.Mailbox;
import com.facebook.rsys.reactions.gen.ReactionsApi;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.ExecutionException;

/* loaded from: I8i.class */
public final class I8i {
    public final 1Br A01 = 1BK.A0C();
    public final 1BP A04 = FbInjector.A00;
    public final 1Br A00 = AbG.A0J();
    public final C01i A02 = C01g.A01(J9K.A00);
    public final C01i A03 = C01g.A01(C3kf.A00);

    public static final Mailbox A00(FbUserSession fbUserSession) {
        1Uj r0 = (1Uj) 1Lo.A08(fbUserSession, 16686);
        SettableFuture A0j = 4YU.A0j();
        r0.A06(new Iby(A0j, 33));
        try {
            return (Mailbox) A0j.get();
        } catch (InterruptedException | ExecutionException unused) {
            GOn.A1W(4zI.A03, "OrcaRsysUtils", "Failed to initialize Mailbox");
            return null;
        }
    }

    public static final 03Y A01(FbUserSession fbUserSession, String str) {
        C11904xw c11904xw = (C11904xw) 1Lo.A08(fbUserSession, 115296);
        String A00 = c11904xw.A00();
        if (A00 != null && A00.length() != 0) {
            ViewerContext viewerContext = (ViewerContext) 1Bn.A0A(33059);
            if (viewerContext == null) {
                str = c11904xw.A00.A05;
            } else {
                str = viewerContext.mUserId;
                11T.A0A(str);
            }
        }
        return 1BK.A1G(str, A00);
    }

    public final GxL A02() {
        return new GxL(7zL.A09(), (04J) 1Bi.A03(16634), (C11684xK) this.A02.getValue(), GOp.A1G(this.A00));
    }

    public final void A03(JOr jOr) {
        11T.A0F(jOr, 0);
        String A02 = 2yD.A02(1Br.A07(this.A01), 36885093238703658L);
        ReactionsApi B63 = jOr.B63();
        if (B63 != null) {
            B63.setAllowedGifDomains(1BK.A17(0CU.A0L(A02, new char[]{';'}, 0)));
        }
    }
}
