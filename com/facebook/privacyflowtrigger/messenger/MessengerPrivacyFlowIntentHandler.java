package com.facebook.privacyflowtrigger.messenger;

import X.C3o5;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: MessengerPrivacyFlowIntentHandler.class */
public final class MessengerPrivacyFlowIntentHandler {
    public static Intent A00(Context context, Intent intent) {
        Intent A0D = C3o5.A0D(context, MessengerPrivacyFlowActivity.class);
        A0D.setFlags(268435456);
        Uri data = intent.getData();
        if (data == null) {
            return null;
        }
        String queryParameter = data.getQueryParameter("weburi");
        String queryParameter2 = data.getQueryParameter("flow_name");
        A0D.putExtra("privacy_flow_mobile_web_uri", queryParameter);
        A0D.putExtra("flow_name", queryParameter2);
        return A0D;
    }
}
