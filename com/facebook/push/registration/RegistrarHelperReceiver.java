package com.facebook.push.registration;

import X.0Fc;
import X.0fH;
import X.1BJ;
import X.AbstractC00603o4;
import X.C01q;
import X.C0hs;
import android.content.Context;
import android.content.Intent;

/* loaded from: RegistrarHelperReceiver.class */
public class RegistrarHelperReceiver extends C0hs {
    public void A02(Context context, Intent intent, C01q c01q) {
        if (intent != null) {
            String action = intent.getAction();
            if ((1BJ.A00(1177).equals(action) || "com.facebook.push.registration.ACTION_TOKEN_REQUEST_RETRY_GCM".equals(action) || "com.facebook.push.registration.ACTION_TOKEN_REQUEST_RETRY_FBNS".equals(action)) && intent.hasExtra(1BJ.A00(228))) {
                Intent intent2 = new Intent(intent);
                intent2.setClass(context, RegistrarHelperService.class);
                0Fc.A00(context, intent2, RegistrarHelperService.class);
                return;
            }
        }
        0fH.A0T(RegistrarHelperReceiver.class, AbstractC00603o4.A00(362), new Object[]{intent});
    }
}
