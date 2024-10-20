package com.instagram.common.bloks;

import X.7zL;
import X.ExB;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: BloksContextBindManager$1.class */
public final class BloksContextBindManager$1 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ ExB A00;

    public BloksContextBindManager$1(ExB exB) {
        this.A00 = exB;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        ExB exB = this.A00;
        if (activity == exB.A01.get()) {
            exB.A00();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.A00.A00 = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.A00.A00 = 7zL.A14(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
