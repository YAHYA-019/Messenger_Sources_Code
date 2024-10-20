package com.facebook.fixie.fixes.memory.activitystackresetter;

import X.0fH;
import X.11T;
import X.1BK;
import X.1BL;
import X.1Dn;
import X.1G2;
import X.1Ql;
import X.AbstractC05764eu;
import X.C00i;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.facebook.common.activitycleaner.ActivityStackManager;
import com.facebook.common.activitycleaner.ActivityStackResetter;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.lang.ref.WeakReference;

/* loaded from: ActivityStackResetterFixer$init$1.class */
public final class ActivityStackResetterFixer$init$1 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ ActivityStackResetter A00;
    public final /* synthetic */ 1Dn A01;

    public ActivityStackResetterFixer$init$1(ActivityStackResetter activityStackResetter, 1Dn r303) {
        this.A00 = activityStackResetter;
        this.A01 = r303;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        ActivityStackResetter.A00(this.A00);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        11T.A0F(activity, 0);
        1Dn r0 = this.A01;
        11T.A0D(r0);
        if (1BK.A0N(r0.A02).AZk(36317642162449983L)) {
            ActivityStackResetter activityStackResetter = this.A00;
            WeakReference weakReference = new WeakReference(activity);
            if (AbstractC05764eu.A00.contains(ActivityStackResetter.class.getName())) {
                return;
            }
            activityStackResetter.A00 = weakReference;
            AbstractC05764eu.A00(ActivityStackResetter.class);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        if (bundle != null) {
            ActivityStackResetter activityStackResetter = this.A00;
            C00i c00i = activityStackResetter.A01;
            c00i.get();
            1G2 r0 = ActivityStackManager.A08;
            AbstractC05764eu.A00(ActivityStackManager.class);
            if (bundle.getBoolean("instance_has_been_viewed", false)) {
                ActivityStackManager activityStackManager = (ActivityStackManager) c00i.get();
                if (activityStackManager.A01 == 0) {
                    C00i c00i2 = activityStackManager.A04;
                    FbSharedPreferences A0R = 1BK.A0R(c00i2);
                    1G2 r02 = ActivityStackManager.A08;
                    activityStackManager.A01 = A0R.Av1(r02, 0L);
                    1Ql A0V = 1BL.A0V(c00i2);
                    A0V.CaH(r02, 0L);
                    A0V.commit();
                }
                long j = activityStackManager.A01;
                activityStackManager.A01 = j;
                if (j != 0) {
                    long A09 = (1BL.A09(activityStackResetter.A03) - j) / 60000;
                    if (A09 >= 15) {
                        0fH.A0g(Long.valueOf(A09), "ActivityStackResetter", "Resetting to home because this is an old instance, and it's been %d");
                        bundle.remove("android:support:fragments");
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        11T.A0F(bundle, 1);
        bundle.putBoolean("instance_has_been_viewed", true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
