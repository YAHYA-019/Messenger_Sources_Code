package com.facebook.messaging.threads.intents;

import X.11T;
import X.1Bn;
import X.7zK;
import X.7zO;
import X.AbI;
import X.AnonymousClass001;
import X.C3R9;
import X.C3o5;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.threadsettings2.activity.ThreadSettingsActivity;
import com.facebook.messaging.threadsettings2.params.ThreadSettingsParams;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* loaded from: ThreadNotificationSettingIntentHandler.class */
public final class ThreadNotificationSettingIntentHandler {
    public static Intent A00(Context context, Intent intent, FbUserSession fbUserSession) {
        ThreadKey A0H;
        Uri data = intent.getData();
        if (data == null) {
            return null;
        }
        String queryParameter = data.getQueryParameter("target_user_id");
        String queryParameter2 = data.getQueryParameter("thread_id");
        String queryParameter3 = data.getQueryParameter("thread_type");
        if (queryParameter3 == null) {
            return null;
        }
        try {
            if ("GROUP".equals(queryParameter3)) {
                if (queryParameter2 == null) {
                    return null;
                }
                A0H = AbI.A0Y(queryParameter2);
            } else {
                if (!"ONE_TO_ONE".equals(queryParameter3) || queryParameter == null) {
                    return null;
                }
                A0H = ThreadKey.A0H(Long.parseLong(queryParameter), 7zO.A0C(fbUserSession));
            }
            1Bn.A0A(82389);
            ParcelableSecondaryData A00 = new C3R9().A00();
            11T.A0H(context, A0H);
            11T.A0F(A00, 4);
            Intent putExtra = C3o5.A0D(context, ThreadSettingsActivity.class).putExtra("params", new ThreadSettingsParams(A0H, A00, "NOTIFICATION", 1009, true));
            11T.A0A(putExtra);
            return putExtra;
        } catch (NumberFormatException unused) {
            throw AnonymousClass001.A0T(7zK.A00(ActionId.ON_ATTACH_FRAGMENT));
        }
    }
}
