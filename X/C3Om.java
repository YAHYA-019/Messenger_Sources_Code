package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;

/* renamed from: X.3Om, reason: invalid class name */
/* loaded from: 3Om.class */
public abstract class C3Om {
    public static String A00(Context context, C0et c0et, 1yM r303) {
        Resources resources;
        int i;
        int ordinal = c0et.ordinal();
        if (ordinal == 1) {
            resources = context.getResources();
            i = 2131956666;
        } else {
            if (ordinal != 0) {
                return A01(context, r303);
            }
            resources = context.getResources();
            i = 2131959933;
        }
        return resources.getString(i);
    }

    public static String A01(Context context, 1yM r302) {
        String packageName = context.getPackageName();
        boolean startsWith = packageName.startsWith(AnonymousClass000.A00(30));
        ApplicationInfo A00 = C0B5.A00(r302, packageName);
        if (startsWith) {
            if (A00 == null) {
                return "(unknown)";
            }
            int i = r302.A00.uid;
            int i2 = A00.uid;
            if (i != i2 && r302.A01.checkSignatures(i, i2) != 0) {
                return "(unknown)";
            }
        } else if (A00 == null) {
            return "(unknown)";
        }
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        return packageManager.getApplicationLabel(A00).toString();
    }
}
