package com.facebook.errorreporting.lacrima.detector.lifecycle;

import X.0S2;
import X.AnonymousClass001;
import X.C0hr;
import android.app.Activity;
import android.os.Bundle;

/* loaded from: ApplicationLifecycleDetector$ActivityCallbacksApi29.class */
public final class ApplicationLifecycleDetector$ActivityCallbacksApi29 extends ApplicationLifecycleDetector$ActivityCallbacks {
    public final /* synthetic */ C0hr A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplicationLifecycleDetector$ActivityCallbacksApi29(C0hr c0hr) {
        super(c0hr);
        this.A00 = c0hr;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        if (AnonymousClass001.A0Y(activity).equals(null)) {
            return;
        }
        A00(activity, 0S2.A0N);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostDestroyed(Activity activity) {
        if (AnonymousClass001.A0Y(activity).equals(null)) {
            return;
        }
        A01(activity, 0S2.A0N);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostPaused(Activity activity) {
        if (AnonymousClass001.A0Y(activity).equals(null)) {
            return;
        }
        A02(activity, 0S2.A0N);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        if (AnonymousClass001.A0Y(activity).equals(null)) {
            return;
        }
        A03(activity, 0S2.A0N);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        if (AnonymousClass001.A0Y(activity).equals(null)) {
            return;
        }
        A04(activity, 0S2.A0N);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStopped(Activity activity) {
        if (AnonymousClass001.A0Y(activity).equals(null)) {
            return;
        }
        A05(activity, 0S2.A0N);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        if (AnonymousClass001.A0Y(activity).equals(null)) {
            return;
        }
        A00(activity, 0S2.A01);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(Activity activity) {
        if (AnonymousClass001.A0Y(activity).equals(null)) {
            return;
        }
        A01(activity, 0S2.A01);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        if (AnonymousClass001.A0Y(activity).equals(null)) {
            return;
        }
        A02(activity, 0S2.A01);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreResumed(Activity activity) {
        if (AnonymousClass001.A0Y(activity).equals(null)) {
            return;
        }
        A03(activity, 0S2.A01);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStarted(Activity activity) {
        if (AnonymousClass001.A0Y(activity).equals(null)) {
            return;
        }
        A04(activity, 0S2.A01);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(Activity activity) {
        if (AnonymousClass001.A0Y(activity).equals(null)) {
            return;
        }
        A05(activity, 0S2.A01);
    }
}
