package com.bloks.components.bkcomponentsfoaavatareditorautogencameraview;

import X.0Q8;
import X.11T;
import X.2Zs;
import X.2aG;
import X.2aN;
import X.4ZJ;
import X.7zO;
import X.H8X;
import X.I2e;
import X.Ida;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: BloksComponentFoaAvatarAutogenCameraViewRenderUnit$lifeCycleListener$1.class */
public final class BloksComponentFoaAvatarAutogenCameraViewRenderUnit$lifeCycleListener$1 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ H8X A00;

    public BloksComponentFoaAvatarAutogenCameraViewRenderUnit$lifeCycleListener$1(H8X h8x) {
        this.A00 = h8x;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        I2e i2e = this.A00.A00;
        if (i2e == null) {
            11T.A0L("selfieViewProvider");
            throw 0Q8.createAndThrow();
        }
        i2e.A01();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        I2e i2e = this.A00.A00;
        if (i2e == null) {
            11T.A0L("selfieViewProvider");
            throw 0Q8.createAndThrow();
        }
        Ida ida = i2e.A03;
        if (ida != null) {
            ida.resume();
        }
        Activity A00 = I2e.A00(i2e.A05, i2e);
        2Zs r0 = 2aN.A00;
        7zO.A1W(A00, 2aG.A02(4ZJ.A00), 34);
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
