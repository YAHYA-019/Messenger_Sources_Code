package X;

import android.content.pm.PackageInfo;
import java.util.HashSet;

/* renamed from: X.2tl, reason: invalid class name */
/* loaded from: 2tl.class */
public abstract class C2tl {
    public static Integer A00(PackageInfo packageInfo) {
        int i = packageInfo.applicationInfo.flags;
        boolean z = false;
        boolean z2 = false;
        if ((i & 1) != 0) {
            z2 = true;
        }
        if ((i & 128) != 0) {
            z = true;
        }
        return (z2 || z) ? 0S2.A00 : 0S2.A01;
    }

    public static HashSet A01(PackageInfo packageInfo) {
        HashSet A0v;
        int[] iArr;
        String[] strArr = packageInfo.requestedPermissions;
        if (strArr != null && (iArr = packageInfo.requestedPermissionsFlags) != null && strArr.length == iArr.length) {
            A0v = new HashSet();
            int i = 0;
            while (true) {
                int i2 = i;
                String[] strArr2 = packageInfo.requestedPermissions;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if ((packageInfo.requestedPermissionsFlags[i2] & 2) != 0) {
                    A0v.add(str);
                }
                i = i2 + 1;
            }
        } else {
            A0v = AnonymousClass001.A0v();
        }
        return A0v;
    }
}
