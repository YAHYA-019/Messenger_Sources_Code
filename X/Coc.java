package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.push.constants.PushProperty;

/* loaded from: Coc.class */
public final class Coc implements 7yC {
    public final 1Br A00 = 1Bq.A00(83168);
    public final 1Br A01 = 1Bu.A00(83835);

    public void CZO(FbUserSession fbUserSession, PushProperty pushProperty, 24X r304) {
        11T.A0F(pushProperty, 1);
        C5aA A01 = ((C5a9) 1Br.A0B(this.A01)).A01(pushProperty);
        C45d.A08((C45d) 1Br.A0B(this.A00), pushProperty, "d1_unknown_notification", null);
        A01.A02("d1_unknown_notification", null);
    }
}
