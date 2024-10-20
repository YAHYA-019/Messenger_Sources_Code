package com.facebook.blescan.providers;

import X.1Br;
import X.L0E;
import X.LkH;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: BleScannerFailsafeImpl$LifecycleCallback.class */
public final class BleScannerFailsafeImpl$LifecycleCallback implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ L0E A00;

    public BleScannerFailsafeImpl$LifecycleCallback(L0E l0e) {
        this.A00 = l0e;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        L0E l0e = this.A00;
        ((Handler) 1Br.A0B(l0e.A02)).postDelayed(new LkH(l0e), 250L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
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
