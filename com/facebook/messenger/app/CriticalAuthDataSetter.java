package com.facebook.messenger.app;

import X.C15h;
import X.G7G;
import android.content.Context;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.inject.FbInjector;

/* loaded from: CriticalAuthDataSetter.class */
public final class CriticalAuthDataSetter {
    public final Context A00 = FbInjector.A00();
    public final C15h A01 = new G7G(this, 16);

    public static void A00(CriticalAuthDataSetter criticalAuthDataSetter) {
        C15h c15h = criticalAuthDataSetter.A01;
        if (c15h.get() != null) {
            Context context = criticalAuthDataSetter.A00;
            context.getSharedPreferences("crash_loop_critical_data", 0).edit().putString("auth_token", ((ViewerContext) c15h.get()).mAuthToken).commit();
        }
    }
}
