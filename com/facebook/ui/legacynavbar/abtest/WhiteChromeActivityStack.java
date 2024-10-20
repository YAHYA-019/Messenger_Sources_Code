package com.facebook.ui.legacynavbar.abtest;

import X.0fH;
import X.11T;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: WhiteChromeActivityStack.class */
public final class WhiteChromeActivityStack {
    public WeakReference A00;
    public WeakReference A01;
    public boolean A02;

    /* loaded from: WhiteChromeActivityStack$WhiteChromeActivityLifecycleCallbacks.class */
    public final class WhiteChromeActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
        public WhiteChromeActivityLifecycleCallbacks() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
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
            WhiteChromeActivityStack whiteChromeActivityStack = WhiteChromeActivityStack.this;
            synchronized (whiteChromeActivityStack) {
                whiteChromeActivityStack.A01 = whiteChromeActivityStack.A00;
                whiteChromeActivityStack.A00 = new WeakReference(activity);
                WeakReference weakReference = whiteChromeActivityStack.A01;
                if (weakReference != null) {
                    weakReference.get();
                }
            }
            0fH.A0g(activity, "WhiteChromeActivityStack", "new current activity %s");
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
}
