package com.facebook.common.util.lifecycle;

import X.06Z;
import X.0KB;
import X.11T;
import X.C0eb;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* loaded from: ViewOwnerTracker.class */
public final class ViewOwnerTracker extends 0KB implements Application.ActivityLifecycleCallbacks {
    public final Activity A00;
    public final Fragment A01;
    public final C0eb A02;

    public /* synthetic */ ViewOwnerTracker(Activity activity, Fragment fragment, C0eb c0eb) {
        Application application;
        this.A01 = fragment;
        this.A00 = activity;
        this.A02 = c0eb;
        if (fragment != null) {
            fragment.getParentFragmentManager().A1K(this, false);
        }
        if (activity == null || (application = activity.getApplication()) == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
    }

    public void A07(Fragment fragment, 06Z r303) {
        if (fragment.equals(this.A01)) {
            this.A02.CUg();
        }
    }

    public void A08(Fragment fragment, 06Z r303) {
        if (fragment.equals(this.A01)) {
            this.A02.CUh();
        }
    }

    public void A0C(Fragment fragment, 06Z r303) {
        11T.A0F(fragment, 1);
        if (fragment.equals(this.A01)) {
            A0D();
        }
    }

    public final void A0D() {
        Application application;
        Fragment fragment = this.A01;
        if (fragment != null) {
            fragment.getParentFragmentManager().A1J(this);
        }
        Activity activity = this.A00;
        if (activity == null || (application = activity.getApplication()) == null) {
            return;
        }
        application.unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        11T.A0F(activity, 0);
        if (activity.equals(this.A00)) {
            A0D();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        11T.A0F(activity, 0);
        if (activity.equals(this.A00)) {
            this.A02.CUg();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        11T.A0F(activity, 0);
        if (activity.equals(this.A00)) {
            this.A02.CUh();
        }
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
