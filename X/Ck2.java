package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.integrity.frx.model.FRXParams;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.user.model.User;

/* loaded from: Ck2.class */
public final class Ck2 implements 7Yx {
    public final /* synthetic */ 06Z A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ C8i A02;
    public final /* synthetic */ 6Im A03;
    public final /* synthetic */ String A04;

    public Ck2(06Z r302, FbUserSession fbUserSession, C8i c8i, 6Im r305, String str) {
        this.A02 = c8i;
        this.A04 = str;
        this.A03 = r305;
        this.A01 = fbUserSession;
        this.A00 = r302;
    }

    public final void CHY(User user) {
        if (user != null) {
            C8i c8i = this.A02;
            5PI r0 = new 5PI();
            r0.A0E(this.A04);
            r0.A0K = new ParticipantInfo(user);
            c8i.A03 = 4YU.A0U(r0);
            this.A03.A05.A00(this.A00, this.A01, new FRXParams(c8i));
        }
    }
}
