package com.facebook.authapplock.baseactivity;

import X.1Bq;
import X.1Br;
import X.1Bu;
import X.HQc;
import X.JHi;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.messaging.authapplock.AuthAppLockActivity;
import com.facebook.quicklog.QuickPerformanceLogger;

/* loaded from: AuthAppLockBaseActivity.class */
public abstract class AuthAppLockBaseActivity extends FbFragmentActivity implements JHi {
    public final 1Br A01 = 1Bu.A01(this, 83149);
    public final 1Br A00 = 1Bu.A01(this, 116339);
    public final 1Br A02 = 1Bq.A00(147790);

    public static QuickPerformanceLogger A12(AuthAppLockActivity authAppLockActivity) {
        return (QuickPerformanceLogger) ((HQc) authAppLockActivity.A07.A00.get()).A00.A00.get();
    }
}
