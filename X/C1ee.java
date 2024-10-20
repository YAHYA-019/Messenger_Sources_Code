package X;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: X.1ee, reason: invalid class name */
/* loaded from: 1ee.class */
public final class C1ee {
    public 1fT A00;
    public Boolean A01;
    public final C1c9 A02;
    public final boolean A03;
    public final /* synthetic */ FirebaseInstanceId A04;

    public C1ee(C1c9 c1c9, FirebaseInstanceId firebaseInstanceId) {
        boolean z;
        Boolean bool;
        this.A04 = firebaseInstanceId;
        this.A02 = c1c9;
        try {
            Class.forName("com.google.firebase.messaging.FirebaseMessaging");
        } catch (ClassNotFoundException unused) {
            C1bL c1bL = firebaseInstanceId.A02;
            C1bL.A01(c1bL);
            Context context = c1bL.A00;
            Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
            intent.setPackage(context.getPackageName());
            ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
            z = (resolveService == null || resolveService.serviceInfo == null) ? false : z;
        }
        z = true;
        this.A03 = z;
        C1bL c1bL2 = this.A04.A02;
        C1bL.A01(c1bL2);
        Context context2 = c1bL2.A00;
        SharedPreferences sharedPreferences = context2.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            bool = Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        } else {
            try {
                PackageManager packageManager = context2.getPackageManager();
                if (packageManager != null) {
                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context2.getPackageName(), 128);
                    if (applicationInfo != null) {
                        Bundle bundle = ((PackageItemInfo) applicationInfo).metaData;
                        if (bundle != null && bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                            bool = Boolean.valueOf(((PackageItemInfo) applicationInfo).metaData.getBoolean("firebase_messaging_auto_init_enabled"));
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
            bool = null;
        }
        this.A01 = bool;
        if (bool == null && z) {
            1fT r0 = new 1fT(this);
            this.A00 = r0;
            Executor executor = c1c9.A02;
            synchronized (c1c9) {
                executor.getClass();
                java.util.Map map = c1c9.A01;
                if (!map.containsKey(1fX.class)) {
                    map.put(1fX.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) map.get(1fX.class)).put(r0, executor);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0054, code lost:
    
        if (r0 == false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A00() {
        /*
            r301 = this;
            r0 = r301
            monitor-enter(r0)
            r0 = r301
            java.lang.Boolean r0 = r0.A01     // Catch: java.lang.Throwable -> L60
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L13
            r0 = r302
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L60
            r303 = r0
            goto L5c
        L13:
            r0 = r301
            boolean r0 = r0.A03     // Catch: java.lang.Throwable -> L60
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L57
            r0 = r301
            com.google.firebase.iid.FirebaseInstanceId r0 = r0.A04     // Catch: java.lang.Throwable -> L60
            r302 = r0
            r0 = r302
            X.1bL r0 = r0.A02     // Catch: java.lang.Throwable -> L60
            r302 = r0
            r0 = r302
            X.C1bL.A01(r0)     // Catch: java.lang.Throwable -> L60
            r0 = r302
            X.1dD r0 = r0.A03     // Catch: java.lang.Throwable -> L60
            r302 = r0
            r0 = r302
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L60
            r305 = r0
            r0 = r305
            X.1fl r0 = (X.C1fl) r0     // Catch: java.lang.Throwable -> L60
            r305 = r0
            r0 = r305
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L60
            r0 = r305
            boolean r0 = r0.A00     // Catch: java.lang.Throwable -> L4b
            r304 = r0
            r0 = r305
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L60
            goto L51
        L4b:
            r302 = move-exception
            r0 = r305
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L60
            r0 = r302
            throw r0     // Catch: java.lang.Throwable -> L60
        L51:
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 != 0) goto L5c
        L57:
            r0 = 0
            r303 = r0
            r0 = 0
            r305 = r0
        L5c:
            r0 = r301
            monitor-exit(r0)
            r0 = r303
            return r0
        L60:
            r302 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r302
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1ee.A00():boolean");
    }
}
