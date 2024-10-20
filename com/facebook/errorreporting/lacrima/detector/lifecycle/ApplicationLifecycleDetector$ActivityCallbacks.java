package com.facebook.errorreporting.lacrima.detector.lifecycle;

import X.0Dq;
import X.0S2;
import X.11T;
import X.AnonymousClass001;
import X.C0hr;
import X.C0pf;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import com.facebook.katana.app.mainactivity.FbMainActivity;
import com.facebook.perf.background.BackgroundStartupDetector;

/* loaded from: ApplicationLifecycleDetector$ActivityCallbacks.class */
public class ApplicationLifecycleDetector$ActivityCallbacks implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ C0hr A00;

    public ApplicationLifecycleDetector$ActivityCallbacks(C0hr c0hr) {
        this.A00 = c0hr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r303.equals(X.0S2.A01) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A00(android.app.Activity r302, java.lang.Integer r303) {
        /*
            r301 = this;
            r0 = r301
            X.0hr r0 = r0.A00
            r304 = r0
            r0 = r304
            java.lang.Object r0 = r0.A0M
            r305 = r0
            r0 = r305
            monitor-enter(r0)
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L97
            r306 = r0
            r0 = 29
            r307 = r0
            r0 = r306
            r1 = r307
            if (r0 < r1) goto L33
            java.lang.Integer r0 = X.0S2.A01     // Catch: java.lang.Throwable -> L97
            r308 = r0
            r0 = r303
            r1 = r308
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L97
            r307 = r0
            r0 = 0
            r309 = r0
            r0 = r307
            if (r0 == 0) goto L4e
        L33:
            r0 = 1
            r309 = r0
            r0 = r302
            r1 = r304
            X.C0hr.A01(r0, r1)     // Catch: java.lang.Throwable -> L97
            r0 = r304
            X.0W9 r0 = r0.A07     // Catch: java.lang.Throwable -> L97
            r310 = r0
            java.lang.Integer r0 = X.0S2.A0N     // Catch: java.lang.Throwable -> L97
            r308 = r0
            r0 = r310
            r1 = r308
            r2 = r302
            r0.A03(r1, r2)     // Catch: java.lang.Throwable -> L97
        L4e:
            r0 = r302
            android.content.Intent r0 = r0.getIntent()     // Catch: java.lang.Throwable -> L97
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L69
            java.lang.String r0 = "Null intent"
            r308 = r0
        L5d:
            r0 = r304
            r1 = r302
            r2 = r303
            r3 = r308
            r4 = 0
            r0.A06(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L97
            goto L73
        L69:
            r0 = r308
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L97
            r308 = r0
            goto L5d
        L73:
            r0 = r309
            if (r0 == 0) goto L90
            r0 = r304
            X.0pf r0 = r0.A0C     // Catch: java.lang.Throwable -> L97
            r310 = r0
            r0 = r310
            if (r0 == 0) goto L90
            java.lang.Integer r0 = X.0S2.A0N     // Catch: java.lang.Throwable -> L97
            r308 = r0
            r0 = r310
            r1 = r308
            r2 = r302
            r0.A04(r1, r2)     // Catch: java.lang.Throwable -> L97
        L90:
            r0 = r305
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L97
            X.C0hr.A00()     // Catch: java.lang.Throwable -> L97
            return
        L97:
            r308 = move-exception
            r0 = r305
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L97
            r0 = r308
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.errorreporting.lacrima.detector.lifecycle.ApplicationLifecycleDetector$ActivityCallbacks.A00(android.app.Activity, java.lang.Integer):void");
    }

    public void A01(Activity activity, Integer num) {
        C0hr c0hr = this.A00;
        synchronized (c0hr.A0M) {
            boolean z = false;
            if (Build.VERSION.SDK_INT < 29 || num.equals(0S2.A01)) {
                C0hr.A01(null, c0hr);
                c0hr.A07.A03(0S2.A0u, activity);
                z = true;
            }
            c0hr.A06(activity, num, null, true);
            if (z) {
                C0pf c0pf = c0hr.A0C;
                if (c0pf != null) {
                    c0pf.A04(0S2.A0u, activity);
                }
            }
        }
        if (c0hr.A08 != null) {
            11T.A0F(activity, 0);
            if (0Dq.A00 == null || !(activity instanceof FbMainActivity) || BackgroundStartupDetector.A0D.A04()) {
                C0hr.A00();
            }
        }
    }

    public void A02(Activity activity, Integer num) {
        C0hr c0hr = this.A00;
        synchronized (c0hr.A0M) {
            boolean z = false;
            if (Build.VERSION.SDK_INT < 29 || num.equals(0S2.A01)) {
                C0hr.A01(null, c0hr);
                c0hr.A07.A03(0S2.A0Y, activity);
                z = true;
            }
            c0hr.A06(activity, num, null, activity.isFinishing());
            if (z) {
                C0pf c0pf = c0hr.A0C;
                if (c0pf != null) {
                    c0pf.A04(0S2.A0Y, activity);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r303.equals(X.0S2.A01) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A03(android.app.Activity r302, java.lang.Integer r303) {
        /*
            r301 = this;
            r0 = r301
            X.0hr r0 = r0.A00
            r304 = r0
            r0 = r304
            java.lang.Object r0 = r0.A0M
            r305 = r0
            r0 = r305
            monitor-enter(r0)
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L89
            r306 = r0
            r0 = 29
            r307 = r0
            r0 = r306
            r1 = r307
            if (r0 < r1) goto L33
            java.lang.Integer r0 = X.0S2.A01     // Catch: java.lang.Throwable -> L89
            r308 = r0
            r0 = r303
            r1 = r308
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L89
            r307 = r0
            r0 = 0
            r309 = r0
            r0 = r307
            if (r0 == 0) goto L54
        L33:
            r0 = 1
            r309 = r0
            r0 = 0
            r307 = r0
            r0 = 0
            r308 = r0
            r0 = 0
            r1 = r304
            X.C0hr.A01(r0, r1)     // Catch: java.lang.Throwable -> L89
            r0 = r304
            X.0W9 r0 = r0.A07     // Catch: java.lang.Throwable -> L89
            r310 = r0
            java.lang.Integer r0 = X.0S2.A00     // Catch: java.lang.Throwable -> L89
            r308 = r0
            r0 = r310
            r1 = r308
            r2 = r302
            r0.A03(r1, r2)     // Catch: java.lang.Throwable -> L89
        L54:
            r0 = 0
            r306 = r0
            r0 = 0
            r310 = r0
            r0 = 0
            r307 = r0
            r0 = 0
            r308 = r0
            r0 = r304
            r1 = r302
            r2 = r303
            r3 = 0
            r4 = 0
            r0.A06(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L89
            r0 = r309
            if (r0 == 0) goto L85
            r0 = r304
            X.0pf r0 = r0.A0C     // Catch: java.lang.Throwable -> L89
            r310 = r0
            r0 = r310
            if (r0 == 0) goto L85
            java.lang.Integer r0 = X.0S2.A00     // Catch: java.lang.Throwable -> L89
            r308 = r0
            r0 = r310
            r1 = r308
            r2 = r302
            r0.A04(r1, r2)     // Catch: java.lang.Throwable -> L89
        L85:
            r0 = r305
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L89
            return
        L89:
            r308 = move-exception
            r0 = r305
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L89
            r0 = r308
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.errorreporting.lacrima.detector.lifecycle.ApplicationLifecycleDetector$ActivityCallbacks.A03(android.app.Activity, java.lang.Integer):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r303.equals(X.0S2.A01) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A04(android.app.Activity r302, java.lang.Integer r303) {
        /*
            r301 = this;
            r0 = r301
            X.0hr r0 = r0.A00
            r304 = r0
            r0 = r304
            java.lang.Object r0 = r0.A0M
            r305 = r0
            r0 = r305
            monitor-enter(r0)
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L89
            r306 = r0
            r0 = 29
            r307 = r0
            r0 = r306
            r1 = r307
            if (r0 < r1) goto L33
            java.lang.Integer r0 = X.0S2.A01     // Catch: java.lang.Throwable -> L89
            r308 = r0
            r0 = r303
            r1 = r308
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L89
            r307 = r0
            r0 = 0
            r309 = r0
            r0 = r307
            if (r0 == 0) goto L54
        L33:
            r0 = 1
            r309 = r0
            r0 = 0
            r307 = r0
            r0 = 0
            r308 = r0
            r0 = 0
            r1 = r304
            X.C0hr.A01(r0, r1)     // Catch: java.lang.Throwable -> L89
            r0 = r304
            X.0W9 r0 = r0.A07     // Catch: java.lang.Throwable -> L89
            r310 = r0
            java.lang.Integer r0 = X.0S2.A0C     // Catch: java.lang.Throwable -> L89
            r308 = r0
            r0 = r310
            r1 = r308
            r2 = r302
            r0.A03(r1, r2)     // Catch: java.lang.Throwable -> L89
        L54:
            r0 = 0
            r306 = r0
            r0 = 0
            r310 = r0
            r0 = 0
            r307 = r0
            r0 = 0
            r308 = r0
            r0 = r304
            r1 = r302
            r2 = r303
            r3 = 0
            r4 = 0
            r0.A06(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L89
            r0 = r309
            if (r0 == 0) goto L85
            r0 = r304
            X.0pf r0 = r0.A0C     // Catch: java.lang.Throwable -> L89
            r310 = r0
            r0 = r310
            if (r0 == 0) goto L85
            java.lang.Integer r0 = X.0S2.A0C     // Catch: java.lang.Throwable -> L89
            r308 = r0
            r0 = r310
            r1 = r308
            r2 = r302
            r0.A04(r1, r2)     // Catch: java.lang.Throwable -> L89
        L85:
            r0 = r305
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L89
            return
        L89:
            r308 = move-exception
            r0 = r305
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L89
            r0 = r308
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.errorreporting.lacrima.detector.lifecycle.ApplicationLifecycleDetector$ActivityCallbacks.A04(android.app.Activity, java.lang.Integer):void");
    }

    public void A05(Activity activity, Integer num) {
        C0hr c0hr = this.A00;
        synchronized (c0hr.A0M) {
            boolean z = false;
            if (Build.VERSION.SDK_INT < 29 || num.equals(0S2.A01)) {
                z = true;
                C0hr.A01(null, c0hr);
                c0hr.A07.A03(0S2.A0j, activity);
            }
            c0hr.A06(activity, num, null, activity.isFinishing());
            if (z) {
                C0pf c0pf = c0hr.A0C;
                if (c0pf != null) {
                    c0pf.A04(0S2.A0j, activity);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (AnonymousClass001.A0Y(activity).equals(null)) {
            return;
        }
        A00(activity, 0S2.A0C);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (AnonymousClass001.A0Y(activity).equals(null)) {
            return;
        }
        A01(activity, 0S2.A0C);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (AnonymousClass001.A0Y(activity).equals(null)) {
            return;
        }
        A02(activity, 0S2.A0C);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (AnonymousClass001.A0Y(activity).equals(null)) {
            return;
        }
        A03(activity, 0S2.A0C);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        if (AnonymousClass001.A0Y(activity).equals(null)) {
            return;
        }
        A04(activity, 0S2.A0C);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (AnonymousClass001.A0Y(activity).equals(null)) {
            return;
        }
        A05(activity, 0S2.A0C);
    }
}
