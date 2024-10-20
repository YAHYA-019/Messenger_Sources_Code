package androidx.lifecycle;

import X.11T;
import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.ReportFragment;

/* loaded from: ProcessLifecycleOwner.class */
public final class ProcessLifecycleOwner implements LifecycleOwner {
    public static final Companion Companion = new Object();
    public static final ProcessLifecycleOwner newInstance = new ProcessLifecycleOwner();
    public Handler handler;
    public int resumedCounter;
    public int startedCounter;
    public boolean pauseSent = true;
    public boolean stopSent = true;
    public final LifecycleRegistry registry = new LifecycleRegistry(this);
    public final Runnable delayedPauseRunnable = new Runnable() { // from class: androidx.lifecycle.ProcessLifecycleOwner$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.this;
            ProcessLifecycleOwner.Companion companion = ProcessLifecycleOwner.Companion;
            11T.A0F(processLifecycleOwner, 0);
            if (processLifecycleOwner.resumedCounter == 0) {
                processLifecycleOwner.pauseSent = true;
                processLifecycleOwner.registry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
            }
            if (processLifecycleOwner.startedCounter == 0 && processLifecycleOwner.pauseSent) {
                processLifecycleOwner.registry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
                processLifecycleOwner.stopSent = true;
            }
        }
    };
    public final ReportFragment.ActivityInitializationListener initializationListener = new ReportFragment.ActivityInitializationListener() { // from class: androidx.lifecycle.ProcessLifecycleOwner$initializationListener$1
        @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
        public void onCreate() {
        }

        @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
        public void onResume() {
            ProcessLifecycleOwner.this.activityResumed$lifecycle_process_release();
        }

        @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
        public void onStart() {
            ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.this;
            int i = processLifecycleOwner.startedCounter + 1;
            processLifecycleOwner.startedCounter = i;
            if (i == 1 && processLifecycleOwner.stopSent) {
                processLifecycleOwner.registry.handleLifecycleEvent(Lifecycle.Event.ON_START);
                processLifecycleOwner.stopSent = false;
            }
        }
    };

    /* loaded from: ProcessLifecycleOwner$Api29Impl.class */
    public final class Api29Impl {
        public static final Api29Impl INSTANCE = new Object();

        public static final void registerActivityLifecycleCallbacks(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    /* loaded from: ProcessLifecycleOwner$Companion.class */
    public final class Companion {
    }

    public final void activityResumed$lifecycle_process_release() {
        int i = this.resumedCounter + 1;
        this.resumedCounter = i;
        if (i == 1) {
            if (this.pauseSent) {
                this.registry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
                this.pauseSent = false;
            } else {
                Handler handler = this.handler;
                11T.A0D(handler);
                handler.removeCallbacks(this.delayedPauseRunnable);
            }
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.registry;
    }
}
