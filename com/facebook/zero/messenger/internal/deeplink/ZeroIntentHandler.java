package com.facebook.zero.messenger.internal.deeplink;

import X.C3o5;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.zero.internal.ZeroE2ETestActivity;
import com.facebook.zero.internal.ZeroInternSettingsActivity;

/* loaded from: ZeroIntentHandler.class */
public final class ZeroIntentHandler {
    public static Intent A00(Context context, Intent intent) {
        Class cls;
        Uri data = intent.getData();
        Intent intent2 = null;
        String obj = data != null ? data.toString() : null;
        if (obj == null || !obj.equals("fb-messenger-secure://zero/settings")) {
            String obj2 = data != null ? data.toString() : null;
            cls = (obj2 != null && obj2.equals("fb-messenger-secure://zero/e2e")) ? ZeroE2ETestActivity.class : ZeroInternSettingsActivity.class;
            return intent2;
        }
        intent2 = C3o5.A0D(context, cls);
        return intent2;
    }
}
