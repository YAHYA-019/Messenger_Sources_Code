package com.facebook.fixie.fixes.memory.leak;

import X.07R;
import X.0KB;
import X.AnonymousClass013;
import X.C05914fa;
import X.LqC;
import android.app.Activity;
import android.app.ActivityThread;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.FragmentActivity;

/* loaded from: MemoryLeakFixer.class */
public final class MemoryLeakFixer extends AnonymousClass013 implements Application.ActivityLifecycleCallbacks {
    public final long A00;
    public final Handler A01;
    public final 0KB A02;
    public final C05914fa A03;
    public final boolean A04;
    public final boolean A05;
    public final Context A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00df, code lost:
    
        if (((X.2yD) r0.A02.get()).AZk(36317642165726815L) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x006f, code lost:
    
        if (((X.2yD) r0.A02.get()).AZk(36317642165268059L) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00a8, code lost:
    
        if (((X.2yD) r0.A02.get()).AZk(36317642165333596L) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MemoryLeakFixer(X.C05914fa r302, X.AnonymousClass010 r303) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fixie.fixes.memory.leak.MemoryLeakFixer.<init>(X.4fa, X.010):void");
    }

    @Override // X.AnonymousClass014
    public String getName() {
        return "MemoryLeakFixer";
    }

    @Override // X.AnonymousClass014
    public void init() {
        Activity A00;
        if (this.A08) {
            ActivityThread.currentActivityThread().getApplication().registerActivityLifecycleCallbacks(this);
            if (this.A05 && (A00 = 07R.A00()) != null && (A00 instanceof FragmentActivity)) {
                ((FragmentActivity) A00).BDe().A1K(this.A02, true);
            }
            A07();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (this.A05 && activity != null && (activity instanceof FragmentActivity)) {
            ((FragmentActivity) activity).BDe().A1K(this.A02, true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (this.A07) {
            this.A01.postDelayed(new LqC(this.A03, activity, this.A04), this.A00);
        }
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
}
