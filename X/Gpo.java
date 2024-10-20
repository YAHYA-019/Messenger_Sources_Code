package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.rtc.incall.plugins.notification.feature.avatar.AvatarImplementation;

/* loaded from: Gpo.class */
public final class Gpo extends HG0 {
    public final int A00;
    public final Object A01;

    public Gpo(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A00() {
        if (6 - this.A00 == 0) {
            AvatarImplementation avatarImplementation = (AvatarImplementation) this.A01;
            DKE.A0K(avatarImplementation.A04).post(new S8O(avatarImplementation));
        }
    }

    public void A02(Throwable th) {
        int i;
        I7P A0S;
        FbUserSession fbUserSession;
        String str;
        switch (this.A00) {
            case 5:
                GOp.A0W(((GrD) this.A01).A0R).A0H(HAU.A04);
                return;
            case 6:
                AvatarImplementation avatarImplementation = (AvatarImplementation) this.A01;
                if (th instanceof HDH) {
                    int i2 = ((HDH) th).errorCode;
                    if (i2 == 100) {
                        return;
                    }
                    if (i2 == 0) {
                        i = 2131957874;
                        A0S = GOp.A0S(avatarImplementation.A02);
                        fbUserSession = avatarImplementation.A01;
                        11T.A0F(fbUserSession, 0);
                        str = "avatar_not_created_notification_did_show";
                        I7P.A00(fbUserSession, A0S, str, "");
                        DKE.A0K(avatarImplementation.A04).post(new SBT(avatarImplementation, i));
                        return;
                    }
                }
                i = 2131953110;
                A0S = GOp.A0S(avatarImplementation.A02);
                fbUserSession = avatarImplementation.A01;
                11T.A0F(fbUserSession, 0);
                str = "avatar_loading_error_notification_did_show";
                I7P.A00(fbUserSession, A0S, str, "");
                DKE.A0K(avatarImplementation.A04).post(new SBT(avatarImplementation, i));
                return;
            default:
                return;
        }
    }
}
