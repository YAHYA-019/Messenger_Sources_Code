package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.notify.SimpleMessageNotification;
import com.facebook.push.constants.PushProperty;

/* loaded from: Cop.class */
public final class Cop implements 7yC {
    public final 1De A04;
    public final 1Br A02 = AbG.A0Y();
    public final 1Br A01 = 1Bq.A00(65997);
    public final 1Br A00 = 1Bq.A00(16616);
    public final 1Br A03 = 7zM.A0M();

    public Cop(1De r302) {
        this.A04 = r302;
    }

    public void CZO(FbUserSession fbUserSession, PushProperty pushProperty, 24X r304) {
        11T.A0H(r304, pushProperty);
        0fH.A0j("EbOneTimeCodeNotificationProcessor", "processNotificationData");
        C00i c00i = this.A01.A00;
        C1ud c1ud = (C1ud) c00i.get();
        if (C1ud.A00(c1ud).AZr(c1ud.A02, 2342159435902756840L)) {
            String A18 = AbK.A18(r304, "message");
            if (1Br.A0B(this.A02) != C0et.A0P || A18 == null) {
                return;
            }
            C1ud c1ud2 = (C1ud) c00i.get();
            if (C1ud.A00(c1ud2).AZr(c1ud2.A02, 2342159435902298085L) && ((1Od) 1Br.A0B(this.A00)).A0F()) {
                AbK.A0r(this.A03).A0A(FbInjector.A00(), AbG.A05().setData(4YU.A0F(4YT.A00(1102))).addFlags(65536));
            } else {
                AbK.A1K(this.A04, new SimpleMessageNotification(C5ap.A1k, pushProperty, A18));
            }
        }
    }
}
