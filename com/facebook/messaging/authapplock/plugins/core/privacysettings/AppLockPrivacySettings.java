package com.facebook.messaging.authapplock.plugins.core.privacysettings;

import X.11T;
import X.1BK;
import X.1Bi;
import X.1Bn;
import X.1SD;
import X.C3o5;
import X.C5ww;
import X.C7j;
import X.CG8;
import android.content.Context;
import android.content.res.Resources;
import com.facebook.messaging.authapplock.setting.AuthAppLockPreferenceActivity;

/* loaded from: AppLockPrivacySettings.class */
public final class AppLockPrivacySettings {
    public final Context A00;

    public AppLockPrivacySettings(Context context) {
        11T.A0F(context, 1);
        this.A00 = context;
    }

    public final C7j A00() {
        CG8 cg8 = (CG8) 1Bn.A0A(83042);
        1SD r0 = (1SD) 1Bi.A03(66354);
        Context context = this.A00;
        String A0u = 1BK.A0u(context, 2131959938);
        Resources resources = context.getResources();
        int i = 2131963702;
        if (r0.A02()) {
            i = 2131963703;
        }
        return cg8.A01(C3o5.A0D(context, AuthAppLockPreferenceActivity.class), (C5ww) null, A0u, resources.getString(i), "app_lock");
    }
}
