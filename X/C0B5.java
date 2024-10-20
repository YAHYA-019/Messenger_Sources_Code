package X;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: X.0B5, reason: invalid class name */
/* loaded from: 0B5.class */
public abstract class C0B5 {
    public final ApplicationInfo A00;
    public final PackageManager A01;

    public C0B5(ApplicationInfo applicationInfo, PackageManager packageManager) {
        this.A01 = packageManager;
        this.A00 = applicationInfo;
    }

    public static ApplicationInfo A00(C0B5 c0b5, String str) {
        try {
            return c0b5.A01.getApplicationInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        } catch (RuntimeException e) {
            if (AnonymousClass001.A1Y(e)) {
                return null;
            }
            throw e;
        }
    }

    public PackageInfo A01(String str, int i) {
        PackageInfo A02 = A02(str, i);
        if (A02 == null) {
            return null;
        }
        ApplicationInfo applicationInfo = A02.applicationInfo;
        int i2 = this.A00.uid;
        int i3 = applicationInfo.uid;
        if (i2 == i3 || this.A01.checkSignatures(i2, i3) == 0) {
            return A02;
        }
        return null;
    }

    public PackageInfo A02(String str, int i) {
        try {
            return this.A01.getPackageInfo(str, i);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        } catch (RuntimeException e) {
            if (AnonymousClass001.A1Y(e)) {
                return null;
            }
            throw e;
        }
    }
}
