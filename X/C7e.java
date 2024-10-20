package X;

import androidx.lifecycle.MutableLiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import java.util.List;

/* loaded from: C7e.class */
public final class C7e {
    public final 1De A01;
    public final 1Br A02 = AbG.A0U();
    public final C1x1 A00 = (C1x1) 1Bi.A03(66360);
    public final 1Br A03 = 1Bq.A00(68133);

    public C7e(1De r302) {
        this.A01 = r302;
    }

    public final MutableLiveData A00(FbUserSession fbUserSession, int i, long j) {
        11T.A0F(fbUserSession, 0);
        MutableLiveData A0H = 7zL.A0H();
        ((22I) 4YU.A0o(fbUserSession, this.A01, 33183)).A0J(Czj.A00(A0H, this, 33), false, i, j);
        return A0H;
    }

    public final void A01(FbUserSession fbUserSession, BME bme, Integer num, List list, long j) {
        MailboxFeature mailboxFeature = (MailboxFeature) 4YU.A0o(fbUserSession, this.A01, 33183);
        int ordinal = bme.ordinal();
        String str = ordinal != 10 ? ordinal != 2 ? "" : "messenger_community_messaging:channel_header_invite_button" : "messenger_community_messaging:admin_onboarding_sheet";
        PrivacyContext A00 = AbJ.A0p(this.A02).A00("353464328990974");
        1Um A0O = 1BK.A0O(mailboxFeature, 0);
        MailboxFutureImpl A0P = 1BK.A0P(A0O);
        1Um.A02(A0O, new Ibb(A0P, list, mailboxFeature, num, A00, str, 0, j), A0P, false);
    }
}
