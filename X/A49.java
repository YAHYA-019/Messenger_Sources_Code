package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.aibot.feedback.model.AiBotFeedbackParams;
import com.facebook.xapp.messaging.threadview.model.botresponse.BotResponseMetadata;

/* loaded from: A49.class */
public final class A49 implements AYf {
    public final FbUserSession A00;
    public final ThreadKey A01;

    public A49(FbUserSession fbUserSession, ThreadKey threadKey) {
        this.A00 = fbUserSession;
        this.A01 = threadKey;
    }

    @Override // X.AYf
    public void C6e(1Iw r302, C5j5 c5j5, C9c2 c9c2, 5vW r305) {
        String str;
        4YV.A1N(r302, r305);
        5vV r0 = (5vV) r305;
        C5fv c5fv = r0.A00;
        BotResponseMetadata botResponseMetadata = (BotResponseMetadata) c5fv.AxW(5mF.A00);
        7Iq r02 = (7Iq) r0.A01.A01.A00(7Iq.A01);
        String A00 = 9E8.A00(c5fv);
        String A01 = 3vV.A01(c5fv);
        C9f3 c9f3 = (C9f3) 1Bn.A0A(68261);
        ThreadKey threadKey = this.A01;
        C5fv c5fv2 = null;
        C9f3.A00(threadKey, c9f3, "ai_feedback_negative", ((C5fu) c5fv).A05.A06, botResponseMetadata != null ? botResponseMetadata.A0A : null, "long_tap", A00, A01, 2);
        C6xg c6xg = new C6xg(7zL.A0A(r302), this.A00);
        if (botResponseMetadata == null || (str = botResponseMetadata.A0A) == null) {
            return;
        }
        AiBotFeedbackParams aiBotFeedbackParams = new AiBotFeedbackParams(str, null);
        if (r02 != null) {
            c5fv2 = r02.A00;
        }
        c6xg.A00(threadKey, aiBotFeedbackParams, 11T.A0O(c5fv2, c5fv));
    }
}
