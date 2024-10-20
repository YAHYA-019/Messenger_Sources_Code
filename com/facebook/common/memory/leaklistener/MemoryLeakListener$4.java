package com.facebook.common.memory.leaklistener;

import X.0KB;
import X.C1pt;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

/* loaded from: MemoryLeakListener$4.class */
public final class MemoryLeakListener$4 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ 0KB A00;
    public final /* synthetic */ C1pt A01;

    public MemoryLeakListener$4() {
    }

    public MemoryLeakListener$4(0KB r302, C1pt c1pt) {
        this.A01 = c1pt;
        this.A00 = r302;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity instanceof FragmentActivity) {
            ((FragmentActivity) activity).BDe().A1K(this.A00, true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        C1pt.A02(activity, this.A01);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        C1pt.A03(activity, this.A01);
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
