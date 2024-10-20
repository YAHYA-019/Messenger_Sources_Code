package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.aibot.feedback.activity.AIBotFeedbackActivity;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.aibot.feedback.model.AiBotFeedbackParams;
import java.util.LinkedHashMap;

/* renamed from: X.6xg, reason: invalid class name */
/* loaded from: 6xg.class */
public final class C6xg {
    public final Context A00;
    public final 1Br A01;
    public final FbUserSession A02;

    public C6xg(Context context, FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 2);
        this.A00 = context;
        this.A02 = fbUserSession;
        this.A01 = 1Bu.A00(68350);
    }

    public final void A00(ThreadKey threadKey, AiBotFeedbackParams aiBotFeedbackParams, boolean z) {
        11T.A0F(aiBotFeedbackParams, 0);
        C00i c00i = this.A01.A00;
        c00i.get();
        Context context = this.A00;
        EU9.A00(context);
        if (!1XU.A00(context)) {
            ((ErB) c00i.get()).A00(context, threadKey, aiBotFeedbackParams, false, z);
            return;
        }
        08O r0 = (08O) 1Bi.A03(6);
        Intent A0D = C3o5.A0D(context, AIBotFeedbackActivity.class);
        A0D.putExtra("arg_bot_feedback_params", aiBotFeedbackParams);
        A0D.putExtra("thread_key", threadKey);
        A0D.putExtra("is_last_bot_response", z);
        r0.A06().A0A(context, A0D);
    }

    public final void A01(ThreadKey threadKey, AiBotFeedbackParams aiBotFeedbackParams, boolean z) {
        1Br.A0C(this.A01);
        Context context = this.A00;
        LinkedHashMap A1C = 1BK.A1C();
        A1C.put("bot_response_id", aiBotFeedbackParams.A01);
        Integer num = aiBotFeedbackParams.A00;
        if (num != null) {
            A1C.put("entry_point", String.valueOf(EY4.A00(num)));
        }
        ((F8z) 1Bi.A03(98521)).A02(context, new DaG(context, threadKey, aiBotFeedbackParams, z), new DqI("com.bloks.www.messenger.aibot.good_feedback_submit_controller", 4, A1C), 04R.A0G());
    }
}
