package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.aibot.feedback.model.AiBotFeedbackParams;
import kotlin.jvm.functions.Function2;

/* loaded from: AVj.class */
public final class AVj extends C00q implements Function2 {
    public final /* synthetic */ String $botResponseId;
    public final /* synthetic */ C1qb $c;
    public final /* synthetic */ FbUserSession $fbUserSession;
    public final /* synthetic */ boolean $isAiBotThread;
    public final /* synthetic */ String $mediaSource;
    public final /* synthetic */ String $messageType;
    public final /* synthetic */ 5vW $renderableMessage;
    public final /* synthetic */ ThreadKey $threadKey;
    public final /* synthetic */ 74M this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AVj(FbUserSession fbUserSession, C1qb c1qb, 74M r304, ThreadKey threadKey, 5vW r306, String str, String str2, String str3, boolean z) {
        super(2);
        this.$fbUserSession = fbUserSession;
        this.$c = c1qb;
        this.$threadKey = threadKey;
        this.$renderableMessage = r306;
        this.$botResponseId = str;
        this.$isAiBotThread = z;
        this.$messageType = str2;
        this.$mediaSource = str3;
        this.this$0 = r304;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str;
        long j;
        String str2;
        long j2;
        1Iw r0 = (1Iw) obj;
        boolean A1Y = 7zR.A1Y(obj2, r0);
        C6xg c6xg = new C6xg(7zL.A0A(r0), this.$fbUserSession);
        ThreadKey threadKey = this.$threadKey;
        5vW r02 = this.$renderableMessage;
        String str3 = this.$botResponseId;
        boolean z = this.$isAiBotThread;
        String str4 = this.$messageType;
        String str5 = this.$mediaSource;
        C9f3 c9f3 = (C9f3) 1Bn.A0A(68261);
        String str6 = 7zM.A16(r02).A05.A06;
        if (A1Y) {
            if (z) {
                1BK.A1K(threadKey, 1, str4);
                str2 = "ai_feedback_positive";
                j2 = 2;
            } else {
                C3o5.A0k(threadKey, 1, str4);
                str2 = "ai_feedback_positive";
                j2 = 0;
            }
            C9f3.A00(threadKey, c9f3, str2, str6, str3, "message_action_shortcuts", str4, str5, j2);
            c6xg.A01(this.$threadKey, new AiBotFeedbackParams(this.$botResponseId, null), true);
        } else {
            if (z) {
                1BK.A1K(threadKey, 1, str4);
                str = "ai_feedback_negative";
                j = 2;
            } else {
                C3o5.A0k(threadKey, 1, str4);
                str = "ai_feedback_negative";
                j = 0;
            }
            C9f3.A00(threadKey, c9f3, str, str6, str3, "message_action_shortcuts", str4, str5, j);
            this.this$0.A01.AQN(7Aw.A02);
            this.this$0.A01.AQN(new 7Cf(new C87w(this.$threadKey, new AiBotFeedbackParams(this.$botResponseId, null))));
        }
        return 04S.A00;
    }
}
