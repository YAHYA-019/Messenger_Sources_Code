package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.model.CommunityNewBadgeStatus;

/* renamed from: X.4Lg, reason: invalid class name */
/* loaded from: 4Lg.class */
public final class C4Lg {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final FbUserSession A06;
    public final 1De A07;

    public C4Lg(1De r302) {
        this.A07 = r302;
        1BY r0 = r302.A00;
        1Br A03 = 1Bu.A03(r0, 16428);
        this.A05 = A03;
        this.A01 = 1Bq.A00(66481);
        FbUserSession A04 = 1Fw.A04((1EZ) A03.A00.get());
        this.A06 = A04;
        this.A00 = 1Lm.A03(A04, r0, 33174);
        this.A02 = 1Bq.A00(67555);
        this.A04 = 1Lm.A03(A04, r0, 33183);
        this.A03 = 1Bq.A00(68669);
    }

    public static final boolean A00(C4Lg c4Lg, CommunityNewBadgeStatus communityNewBadgeStatus, String str, String str2) {
        11T.A0F(str, 0);
        boolean z = false;
        if (((1Wl) c4Lg.A03.A00.get()).A03()) {
            return false;
        }
        CommunityNewBadgeStatus communityNewBadgeStatus2 = CommunityNewBadgeStatus.A04;
        22F r0 = (22F) c4Lg.A00.A00.get();
        if (communityNewBadgeStatus == communityNewBadgeStatus2) {
            z = r0.A00(59, Long.parseLong(str));
        } else if (r0.A00(44, Long.parseLong(str)) && !((4UK) c4Lg.A02.A00.get()).A01(str, str2)) {
            return true;
        }
        return z;
    }
}
