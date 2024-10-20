package com.facebook.push.negativefeedback;

import X.0Fc;
import X.51V;
import X.C01q;
import android.content.Context;
import android.content.Intent;

/* loaded from: PushNegativeFeedbackReceiver.class */
public class PushNegativeFeedbackReceiver extends 51V {
    public PushNegativeFeedbackReceiver() {
        super(new String[]{"PUSH_NEGATIVE_FEEDBACK_SERVICE"});
    }

    public void A09(Context context, Intent intent, C01q c01q, String str) {
        0Fc.A00(context, intent, PushNegativeFeedbackFbJobIntentService.class);
    }
}
