package com.facebook.payments.chromecustomtabs;

import X.C4S3;
import android.content.Context;
import android.content.Intent;

/* loaded from: CustomTabMainActivityComponentHelper.class */
public final class CustomTabMainActivityComponentHelper extends C4S3 {
    @Override // X.C4S3
    public Intent A00(Context context, Intent intent) {
        intent.addFlags(603979776);
        intent.setAction("action_custom_tab_redirect");
        return intent;
    }
}
