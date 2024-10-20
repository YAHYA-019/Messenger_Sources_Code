package com.facebook.messaging.aibot.feedback.activity;

import X.1Bn;
import X.ErB;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.aibot.feedback.model.AiBotFeedbackParams;

/* loaded from: AIBotFeedbackActivity.class */
public final class AIBotFeedbackActivity extends FbFragmentActivity {
    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        Bundle extras = getIntent().getExtras();
        Boolean bool = null;
        AiBotFeedbackParams aiBotFeedbackParams = extras != null ? (AiBotFeedbackParams) extras.getParcelable("arg_bot_feedback_params") : null;
        Bundle extras2 = getIntent().getExtras();
        ThreadKey threadKey = extras2 != null ? (ThreadKey) extras2.getParcelable("thread_key") : null;
        Bundle extras3 = getIntent().getExtras();
        if (extras3 != null) {
            bool = Boolean.valueOf(extras3.getBoolean("is_last_bot_response"));
        }
        if (aiBotFeedbackParams == null || bool == null) {
            return;
        }
        ((ErB) 1Bn.A0A(68350)).A00(this, threadKey, aiBotFeedbackParams, true, bool.booleanValue());
    }
}
