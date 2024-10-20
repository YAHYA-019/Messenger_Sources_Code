package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.rtc.links.api.VideoChatLink;

/* loaded from: C58.class */
public final class C58 {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final FbUserSession A03;
    public final 1De A04;

    public C58(1De r302) {
        this.A04 = r302;
        1BY r0 = r302.A00;
        1Br A03 = 1Bu.A03(r0, 16428);
        this.A02 = A03;
        FbUserSession A032 = 1Br.A03(A03);
        this.A03 = A032;
        this.A01 = 1Lm.A03(A032, r0, 17016);
        this.A00 = 1BK.A0C();
    }

    public final BLG A00() {
        VideoChatLink videoChatLink;
        1Br r0 = this.A01;
        VideoChatLink videoChatLink2 = AbJ.A0X(r0).A06;
        if (videoChatLink2 != null && videoChatLink2.A0g) {
            1Br r02 = this.A00;
            if (7zR.A1W(1Br.A07(r02), 2342156317751318617L) && (videoChatLink = AbJ.A0X(r0).A06) != null && videoChatLink.A0h && 7zR.A1W(1Br.A07(r02), 2342156317751318617L)) {
                return BLG.A02;
            }
        }
        VideoChatLink videoChatLink3 = AbJ.A0X(r0).A06;
        if (videoChatLink3 != null && videoChatLink3.A0g && 7zR.A1W(1Br.A07(this.A00), 2342156317751318617L)) {
            return BLG.A04;
        }
        VideoChatLink videoChatLink4 = AbJ.A0X(r0).A06;
        if (videoChatLink4 != null && videoChatLink4.A0h && 7zR.A1W(1Br.A07(this.A00), 2342156317751318617L)) {
            return BLG.A03;
        }
        return null;
    }
}
