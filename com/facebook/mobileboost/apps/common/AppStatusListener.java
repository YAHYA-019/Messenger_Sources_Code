package com.facebook.mobileboost.apps.common;

import X.07R;
import X.1iY;
import X.C1dt;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.facebook.mobileboost.apps.common.AppStatusListener;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: AppStatusListener.class */
public final class AppStatusListener implements Application.ActivityLifecycleCallbacks {
    public static AppStatusListener A06;
    public WeakReference A00;
    public final Handler A01;
    public final AtomicBoolean A04;
    public final C1dt[] A05;
    public final Runnable A03 = new 1iY(this);
    public final Runnable A02 = new Runnable() { // from class: X.1id
        public static final String __redex_internal_original_name = "AppStatusListener$2";

        @Override // java.lang.Runnable
        public void run() {
            AppStatusListener appStatusListener = AppStatusListener.this;
            appStatusListener.A04.set(true);
            for (C1dt c1dt : appStatusListener.A05) {
                c1dt.A8U();
            }
        }
    };

    public AppStatusListener(Context context, Handler handler, List list) {
        this.A00 = new WeakReference(null);
        boolean z = false;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.A04 = atomicBoolean;
        Context applicationContext = context.getApplicationContext();
        this.A05 = (C1dt[]) list.toArray(new C1dt[list.size()]);
        this.A01 = handler;
        if (!(applicationContext instanceof Application)) {
            applicationContext = applicationContext.getApplicationContext();
            if (applicationContext == null || !(applicationContext instanceof Application)) {
                return;
            }
        }
        Application application = (Application) applicationContext;
        if (application != null) {
            Activity A00 = 07R.A00();
            atomicBoolean.set(A00 == null ? true : z);
            this.A00 = new WeakReference(A00);
            application.registerActivityLifecycleCallbacks(this);
        }
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
        Object obj = this.A00.get();
        this.A00 = new WeakReference(activity);
        if (obj == null) {
            Handler handler = this.A01;
            handler.removeCallbacks(this.A02);
            if (this.A04.getAndSet(false)) {
                handler.post(this.A03);
            }
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
        Object obj = this.A00.get();
        if (obj == null || obj == activity) {
            this.A01.postDelayed(this.A02, 3000L);
            this.A00 = new WeakReference(null);
        }
    }
}
