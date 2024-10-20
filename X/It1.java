package X;

import X.C08194m7;
import X.C4m8;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import android.view.Window;

/* loaded from: It1.class */
public final class It1 implements Runnable {
    public static final String __redex_internal_original_name = "EnableAnrTimer$1";
    public final /* synthetic */ C08194m7 A00;

    public It1(C08194m7 c08194m7) {
        this.A00 = c08194m7;
    }

    @Override // java.lang.Runnable
    public void run() {
        Application A00 = 0Xe.A00();
        final C08194m7 c08194m7 = this.A00;
        A00.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.facebook.reliability.anr.timer.EnableAnrTimer$2
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                C08194m7 c08194m72 = C08194m7.this;
                Window window = activity.getWindow();
                if (window != null) {
                    ViewTreeObserver viewTreeObserver = window.getDecorView().getViewTreeObserver();
                    C4m8 c4m8 = c08194m72.A00;
                    viewTreeObserver.removeOnPreDrawListener(c4m8);
                    viewTreeObserver.addOnPreDrawListener(c4m8);
                }
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
        });
    }
}
