package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.push.constants.PushProperty;

/* loaded from: Cob.class */
public final class Cob implements 7yC {
    public final 1Br A00 = 1Bq.A00(83168);
    public final 1Br A01 = 1Bu.A00(83835);

    public void CZO(FbUserSession fbUserSession, PushProperty pushProperty, 24X r304) {
        11T.A0F(pushProperty, 1);
        C5aA A01 = ((C5a9) 1Br.A0B(this.A01)).A01(pushProperty);
        2DM A0f = 4YU.A0f();
        Integer num = pushProperty.A05;
        if (num != null) {
            A0f.A0i(AbstractC00603o4.A00(280), num.intValue());
        }
        C45d.A08((C45d) 1Br.A0B(this.A00), pushProperty, "d1_silent_badge_push", A0f.toString());
        A01.A02("d1_silent_badge_push", null);
    }
}
