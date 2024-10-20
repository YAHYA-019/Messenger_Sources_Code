package X;

import X.C06054fq;
import android.app.Activity;
import android.app.ActivityThread;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.contentcapture.ContentCaptureManager;

/* renamed from: X.4fq, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4fq.class */
public final class C06054fq extends AnonymousClass013 {
    public static final boolean A01;
    public final boolean A00;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29) {
            z = true;
        }
        A01 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0044, code lost:
    
        if (((X.2yD) r0.A02.get()).AZk(36317642164940375L) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C06054fq(X.AnonymousClass010 r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            r0.<init>(r1)
            java.lang.Class<X.1Dn> r0 = X.1Dn.class
            r303 = r0
            r0 = r301
            r1 = r303
            X.010 r0 = r0.A05(r1)
            X.1Dn r0 = (X.1Dn) r0
            r304 = r0
            boolean r0 = X.C06054fq.A01
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L47
            r0 = r304
            if (r0 == 0) goto L47
            r0 = r304
            X.00i r0 = r0.A02
            r303 = r0
            r0 = r303
            java.lang.Object r0 = r0.get()
            X.2yD r0 = (X.2yD) r0
            r306 = r0
            r0 = 36317642164940375(0x8106b400522e57, double:3.0307613722907444E-306)
            r307 = r0
            r0 = r306
            r1 = r307
            boolean r0 = r0.AZk(r1)
            r309 = r0
            r0 = 1
            r305 = r0
            r0 = r309
            if (r0 != 0) goto L4c
        L47:
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
        L4c:
            r0 = r301
            r1 = r305
            r0.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06054fq.<init>(X.010):void");
    }

    public static void A00(Context context) {
        ContentCaptureManager contentCaptureManager = (ContentCaptureManager) context.getSystemService(ContentCaptureManager.class);
        if (contentCaptureManager != null) {
            contentCaptureManager.setContentCaptureEnabled(false);
        }
    }

    @Override // X.AnonymousClass014
    public String getName() {
        return "ContentCaptureManagerFixer";
    }

    @Override // X.AnonymousClass014
    public void init() {
        if (!this.A00 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        ActivityThread.currentActivityThread().getApplication().registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.facebook.fixie.fixes.common.ContentCaptureManagerFixer$1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                C06054fq.A00(activity);
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
        Activity A00 = 07R.A00();
        if (A00 != null) {
            A00(A00);
        }
    }
}
