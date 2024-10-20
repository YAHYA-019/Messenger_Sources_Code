package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.util.JSONUtil;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.publicchats.notify.MessengerChannelsDefaultNotification;
import com.facebook.push.constants.PushProperty;

/* loaded from: Cor.class */
public final class Cor implements 7yC {
    public final C03793z2 A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1De A05;

    public Cor(1De r302) {
        this.A05 = r302;
        1BY r0 = r302.A00;
        this.A02 = 1Bu.A03(r0, 83865);
        this.A04 = AbG.A0Y();
        this.A03 = 1Bu.A03(r0, 17010);
        this.A01 = 1Bu.A03(r0, 17006);
        this.A00 = C03793z2.A00(C5ap.A22, C5ap.A23, C5ap.A21);
    }

    public void CZO(FbUserSession fbUserSession, PushProperty pushProperty, 24X r304) {
        7zT.A1S(r304, pushProperty, fbUserSession);
        if (AbI.A0a(this.A03).A00().A02()) {
            C00i A0R = AbF.A0R(this.A02);
            String A0H = JSONUtil.A0H(r304.A0D("title"), null);
            String A19 = AbH.A19(A0R, r304);
            24X A0q = AbJ.A0q(A0R, r304);
            if (A0q != null) {
                ThreadKey A0Y = AbK.A0Y(fbUserSession, A0R, A0q);
                A0R.get();
                String A0P = C3o5.A0P(A0q, "rc_url", null);
                String str = pushProperty.A0B;
                Integer num = null;
                C5ap A00 = C5ap.A00(str != null ? AbJ.A1A(str) : "");
                A0R.get();
                String A0P2 = C3o5.A0P(A0q, K94.__redex_internal_original_name, null);
                A0R.get();
                String A0P3 = C3o5.A0P(A0q, "adm_id", null);
                A0R.get();
                switch (4YV.A00(A0q, "tt")) {
                    case ActionId.APPLY_OPTIMISTICS /* 152 */:
                        num = 0S2.A0C;
                        break;
                    case ActionId.APPLY_FINISHED_LIST /* 153 */:
                        num = 0S2.A0N;
                        break;
                    case ActionId.APPLY_FINISHED_LIST_AGAIN /* 154 */:
                        num = 0S2.A00;
                        break;
                    case ActionId.FUTURE_LISTENERS_COMPLETE /* 155 */:
                        num = 0S2.A01;
                        break;
                }
                if (!this.A00.contains(A00) || 1Br.A0B(this.A04) != C0et.A0P || A0H == null || A0H.length() == 0 || A19 == null || A19.length() == 0 || A0Y == null) {
                    return;
                }
                String A0w = 1BK.A0w(A0Y);
                11T.A0D(A0w);
                ((AnonymousClass208) 1Br.A0B(this.A01)).Bg4(new MessengerChannelsDefaultNotification(A00, pushProperty, num, A0H, A19, A0w, A0P, A0P2, A0P3));
            }
        }
    }
}
