package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.zzl;

/* renamed from: X.276, reason: invalid class name */
/* loaded from: 276.class */
public final class AnonymousClass276 {
    public static AnonymousClass276 A01;
    public final Context A00;

    public AnonymousClass276(Context context) {
        this.A00 = context.getApplicationContext();
    }

    public static AnonymousClass276 A00(Context context) {
        AbstractC00481b7.A02(context);
        synchronized (AnonymousClass276.class) {
            if (A01 == null) {
                zzl zzlVar = AnonymousClass279.A01;
                synchronized (AnonymousClass279.class) {
                    if (AnonymousClass279.A00 != null) {
                        android.util.Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    } else if (context != null) {
                        AnonymousClass279.A00 = context.getApplicationContext();
                    }
                }
                A01 = new AnonymousClass276(context);
            }
        }
        return A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x004b, code lost:
    
        if ((r0.flags & com.facebook.acra.constants.ActionId.MESSENGER_QUEUE_CREATION) == 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A01(android.content.pm.PackageInfo r301, boolean r302) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass276.A01(android.content.pm.PackageInfo, boolean):boolean");
    }

    public boolean A02(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (!A01(packageInfo, false)) {
            if (!A01(packageInfo, true)) {
                return false;
            }
            if (!GooglePlayServicesUtil.A01(this.A00)) {
                android.util.Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                return false;
            }
        }
        return true;
    }
}
