package com.facebook.messaging.msys.thread.perftest.burner;

import X.1BK;
import X.C3o5;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.messaging.internalprefs.burner.MessengerInternalBurnerBulkReceiveActivity;
import com.facebook.messaging.internalprefs.burner.MessengerInternalBurnerBulkSendActivity;
import com.facebook.messaging.internalprefs.burner.MessengerInternalBurnerHistoryFlowActivity;
import java.util.List;

/* loaded from: BurnerIntentHandler.class */
public final class BurnerIntentHandler {
    public static Intent A00(Context context, Intent intent) {
        String A14;
        Class cls;
        Uri data = intent.getData();
        Intent intent2 = null;
        if (data != null) {
            List<String> pathSegments = data.getPathSegments();
            if (pathSegments.size() == 1 && (A14 = 1BK.A14(pathSegments, 0)) != null) {
                int hashCode = A14.hashCode();
                if (hashCode != -1962503687) {
                    if (hashCode != 3526536) {
                        if (hashCode == 1082290915 && A14.equals("receive")) {
                            cls = MessengerInternalBurnerBulkReceiveActivity.class;
                            intent2 = C3o5.A0D(context, cls);
                        }
                    } else if (A14.equals("send")) {
                        cls = MessengerInternalBurnerBulkSendActivity.class;
                        intent2 = C3o5.A0D(context, cls);
                    }
                } else if (A14.equals("history_flow")) {
                    cls = MessengerInternalBurnerHistoryFlowActivity.class;
                    intent2 = C3o5.A0D(context, cls);
                }
            }
        }
        return intent2;
    }
}
