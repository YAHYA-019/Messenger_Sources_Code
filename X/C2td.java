package X;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.2td, reason: invalid class name */
/* loaded from: 2td.class */
public final class C2td {
    public final ContentResolver A00;
    public final Context A01;
    public final 2uB A02;
    public final 2uA A03;

    public C2td(ContentResolver contentResolver, Context context, Handler handler, 2uA r305) {
        this.A03 = r305;
        this.A00 = contentResolver;
        this.A01 = context;
        this.A02 = new 2uB(contentResolver, context, handler);
    }

    public static Bundle A00(Bundle bundle, C2td c2td, String str) {
        Signature[] signatureArr;
        Signature signature;
        PackageManager packageManager = c2td.A01.getPackageManager();
        if (packageManager == null) {
            throw new SecurityException("PackageManager not available for client verification");
        }
        String str2 = C2tu.A01;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str2, 0);
        if (resolveContentProvider == null) {
            throw new SecurityException(String.format(null, "Failed resolving provider info (%s)", str2));
        }
        String str3 = ((PackageItemInfo) resolveContentProvider).packageName;
        if (!"com.facebook.appmanager".equals(str3)) {
            throw new SecurityException(String.format(null, "Invalid provider package name %s", str3));
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str3, 64);
            if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length == 1 && (signature = signatureArr[0]) != null) {
                if (!signature.equals(C2tm.A01) && !signature.equals(C2tm.A00) && !signature.equals(C2tm.A02)) {
                    throw new SecurityException("Provider package signature does not match");
                }
                ContentProviderClient A00 = 0L0.A00(c2td.A00, C2tu.A00, 1135733613);
                if (A00 == null) {
                    throw AnonymousClass001.A0N("Failed to acquire modules provider.");
                }
                try {
                    return A00.call(str, null, bundle);
                } finally {
                    A00.release();
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        throw new SecurityException("Missing provider package signature");
    }

    public static void A01(Bundle bundle, C2td c2td) {
        bundle.getClass();
        Bundle bundle2 = bundle.getBundle("exception");
        if (bundle2 != null) {
            throw L7g.A00(c2td.A03.A00(bundle2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (((android.content.pm.ComponentInfo) r0).exported == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A02(android.content.Context r301, android.content.pm.PackageManager r302) {
        /*
            X.2te r0 = new X.2te
            r303 = r0
            r0 = r303
            r1 = r301
            r2 = r302
            r0.<init>(r1, r2)
            r0 = r303
            X.2tt r0 = r0.A00()
            r304 = r0
            java.lang.Integer r0 = X.0S2.A01
            r305 = r0
            r0 = r304
            java.lang.Integer r0 = r0.A02
            r303 = r0
            r0 = r305
            r1 = r303
            boolean r0 = r0.equals(r1)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L8c
            r0 = r304
            boolean r0 = r0.A06
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L8c
            r0 = r304
            boolean r0 = r0.A05
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L8c
            java.lang.String r0 = "com.facebook.appmanager"
            r305 = r0
            r0 = 8
            r306 = r0
            r0 = r302
            r1 = r305
            r2 = r306
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La5
            r303 = r0
            r0 = r303
            android.content.pm.ProviderInfo[] r0 = r0.providers
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L8c
            r0 = r302
            int r0 = r0.length
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L8c
            r0 = 0
            r308 = r0
        L62:
            r0 = r302
            r1 = r308
            r0 = r0[r1]
            r304 = r0
            java.lang.String r0 = X.C2tu.A01
            r305 = r0
            r0 = r304
            java.lang.String r0 = r0.authority
            r303 = r0
            r0 = r305
            r1 = r303
            boolean r0 = r0.equals(r1)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L95
            r0 = r304
            boolean r0 = r0.exported
            r306 = r0
            r0 = 1
            r309 = r0
            r0 = r306
            if (r0 != 0) goto L92
        L8c:
            r0 = 0
            r309 = r0
            r0 = 0
            r305 = r0
        L92:
            r0 = r309
            return r0
        L95:
            r0 = r308
            r1 = 1
            int r0 = r0 + r1
            r308 = r0
            r0 = r308
            r1 = r307
            if (r0 >= r1) goto L8c
            goto L62
        La5:
            goto L8c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2td.A02(android.content.Context, android.content.pm.PackageManager):boolean");
    }

    public long A03(List list, boolean z) {
        HashSet hashSet = new HashSet(list);
        Bundle A05 = 1BK.A05();
        A05.putStringArrayList("module_names", 1BK.A17(hashSet));
        A05.putBoolean("deferred", z);
        A05.putInt("pending_user_action_handling_type", 1);
        Bundle A00 = A00(A05, this, "install");
        A01(A00, this);
        return A00.getLong("session_id", -1);
    }

    public void A04(C3ld c3ld) {
        Uri build;
        ContentObserver contentObserver = this.A02;
        List list = ((2uB) contentObserver).A02;
        synchronized (list) {
            if (list.isEmpty()) {
                ContentResolver contentResolver = ((2uB) contentObserver).A00;
                Context context = ((2uB) contentObserver).A01;
                if ("com.facebook.appmanager".equals(context.getPackageName())) {
                    build = C2tu.A00;
                } else {
                    build = C2tu.A00.buildUpon().appendPath(context.getPackageName()).appendPath("sessions").build();
                }
                contentResolver.registerContentObserver(build, true, contentObserver);
            }
            list.add(c3ld);
        }
    }
}
