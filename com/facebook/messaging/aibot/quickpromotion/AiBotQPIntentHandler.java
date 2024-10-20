package com.facebook.messaging.aibot.quickpromotion;

import X.0S2;
import X.1BJ;
import X.1BK;
import X.AbstractC00603o4;
import X.AnonymousClass001;
import X.BOj;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* loaded from: AiBotQPIntentHandler.class */
public final class AiBotQPIntentHandler {
    public static final Bundle A00(Intent intent) {
        int i;
        Uri data = intent.getData();
        if (data == null) {
            return null;
        }
        String queryParameter = data.getQueryParameter("action");
        for (Integer num : 0S2.A00(2)) {
            if ((1 - num.intValue() != 0 ? "try_it" : AbstractC00603o4.A00(616)).equals(queryParameter)) {
                boolean A1T = AnonymousClass001.A1T(data.getQueryParameter("from_notification"));
                String queryParameter2 = data.getQueryParameter("entry_point");
                Bundle A05 = 1BK.A05();
                A05.putSerializable(1BJ.A00(257), A1T ? BOj.A0G : (queryParameter2 == null || !queryParameter2.equals("retention_qp")) ? BOj.A0I : BOj.A0J);
                int intValue = num.intValue();
                if (intValue != 0) {
                    i = intValue == 1 ? 697 : 258;
                    return A05;
                }
                A05.putBoolean(1BJ.A00(i), true);
                return A05;
            }
        }
        return null;
    }
}
