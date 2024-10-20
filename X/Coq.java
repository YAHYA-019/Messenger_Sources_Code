package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.util.JSONUtil;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.MessengerMessageReminderNotification;
import com.facebook.push.constants.PushProperty;
import com.google.common.base.Objects;

/* loaded from: Coq.class */
public final class Coq implements 7yC {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1De A04;

    public Coq(1De r302) {
        this.A04 = r302;
        1BY r0 = r302.A00;
        this.A01 = 1Bu.A03(r0, 83865);
        this.A03 = AbG.A0Y();
        this.A00 = 1Bu.A03(r0, 49805);
        this.A02 = AbG.A0R();
    }

    public void CZO(FbUserSession fbUserSession, PushProperty pushProperty, 24X r304) {
        BMx bMx;
        11T.A0F(r304, 0);
        1BL.A1F(pushProperty, fbUserSession);
        0fH.A0j("MessengerMessageReminderNotificationDataProcessor", "processNotificationData");
        if (1Br.A0B(this.A03) == C0et.A0P) {
            ThreadKey threadKey = null;
            String A0H = JSONUtil.A0H(r304.A0D("title"), null);
            C00i c00i = this.A01.A00;
            String A19 = AbH.A19(c00i, r304);
            24X A0q = AbJ.A0q(c00i, r304);
            Long l = null;
            boolean A0J = JSONUtil.A0J(A0q != null ? A0q.A0D("survey_enabled") : null, false);
            String A0H2 = JSONUtil.A0H(A0q != null ? A0q.A0D("notification_type") : null, null);
            if (A0q != null) {
                threadKey = AbK.A0Y(fbUserSession, c00i, A0q);
                if (threadKey != null) {
                    l = Long.valueOf(threadKey.A02);
                }
            }
            String valueOf = String.valueOf(l);
            if (A0H2 != null && A0H2.length() != 0) {
                BMx[] values = BMx.values();
                int length = values.length;
                for (int i = 0; i < length; i++) {
                    bMx = values[i];
                    if (Objects.equal(bMx.stringValue, A0H2)) {
                        break;
                    }
                }
            }
            bMx = BMx.A02;
            11T.A0D(bMx);
            C5dz.A02(threadKey, (C5dz) 1Br.A0B(this.A00), "notification_received", valueOf);
            if (A0q == null || threadKey == null || A19 == null || A19.length() == 0 || A0H == null || A0H.length() == 0) {
                return;
            }
            21W r0 = (21W) 1Br.A0B(this.A02);
            1CO A00 = 21W.A00(r0);
            1GD A0J2 = 1BK.A0J();
            A0J2.A04 = true;
            boolean AZr = A00.AZr(A0J2.A02(), 36325682338354053L);
            boolean AZk = 21W.A00(r0).AZk(36325682338485127L);
            if (!AZr || AZk) {
                AbK.A1K(this.A04, new MessengerMessageReminderNotification(threadKey, bMx, pushProperty, A0H, A19, valueOf, A0J));
            }
        }
    }
}
