package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.integrity.frx.model.FRXParams;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.user.model.User;

/* loaded from: Ck3.class */
public final class Ck3 implements 7Yx {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ 06Z A01;
    public final /* synthetic */ FbUserSession A02;
    public final /* synthetic */ C8i A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public Ck3(Context context, 06Z r303, FbUserSession fbUserSession, C8i c8i, String str, String str2) {
        this.A03 = c8i;
        this.A04 = str;
        this.A05 = str2;
        this.A00 = context;
        this.A02 = fbUserSession;
        this.A01 = r303;
    }

    public void CHY(User user) {
        if (user != null) {
            C8i c8i = this.A03;
            5PI r0 = new 5PI();
            r0.A0E(this.A04);
            r0.A1m = this.A05;
            r0.A0K = new ParticipantInfo(user);
            c8i.A03 = 4YU.A0U(r0);
            new 6Iq(this.A00).A00(this.A01, this.A02, new FRXParams(c8i));
        }
    }
}
