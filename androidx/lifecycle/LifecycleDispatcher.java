package androidx.lifecycle;

import X.11T;
import android.app.Activity;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: LifecycleDispatcher.class */
public final class LifecycleDispatcher {
    public static final LifecycleDispatcher INSTANCE = new Object();
    public static final AtomicBoolean initialized = new AtomicBoolean(false);

    /* loaded from: LifecycleDispatcher$DispatcherActivityCallback.class */
    public final class DispatcherActivityCallback extends EmptyActivityLifecycleCallbacks {
        @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            11T.A0F(activity, 0);
            ReportFragment.Companion.injectIfNeededIn(activity);
        }
    }
}
