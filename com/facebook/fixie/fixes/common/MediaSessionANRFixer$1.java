package com.facebook.fixie.fixes.common;

import X.3gQ;
import X.4fS;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: MediaSessionANRFixer$1.class */
public final class MediaSessionANRFixer$1 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ 4fS A00;

    public MediaSessionANRFixer$1(4fS r302) {
        this.A00 = r302;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.A00.A02.post(new 3gQ(activity, this));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
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
