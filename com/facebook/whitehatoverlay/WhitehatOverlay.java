package com.facebook.whitehatoverlay;

import X.11T;
import X.1BP;
import X.1Bn;
import X.1Pe;
import X.3hN;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import com.facebook.inject.FbInjector;

/* loaded from: WhitehatOverlay.class */
public final class WhitehatOverlay implements Application.ActivityLifecycleCallbacks {
    public final 1Pe A00 = (1Pe) 1Bn.A0A(66392);
    public final 1BP A01 = FbInjector.A00;

    public final void A00(Activity activity) {
        Window window;
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.getDecorView().post(new 3hN(window, this));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        11T.A0F(activity, 0);
        A00(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        11T.A0F(activity, 0);
        A00(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
