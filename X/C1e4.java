package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;

/* renamed from: X.1e4, reason: invalid class name */
/* loaded from: 1e4.class */
public final class C1e4 {
    public String A00;
    public int A01;
    public int A02 = 0;
    public String A03;
    public final Context A04;

    public C1e4(Context context) {
        this.A04 = context;
    }

    private final PackageInfo A00(String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = this.A04.getPackageManager().getPackageInfo(str, 0);
            return packageInfo;
        } catch (PackageManager.NameNotFoundException unused) {
            String valueOf = String.valueOf(packageInfo);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Failed to find package ");
            sb.append(valueOf);
            android.util.Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    public static String A01(C1bL c1bL) {
        C1bL.A01(c1bL);
        1bA r0 = c1bL.A01;
        String str = r0.A01;
        if (str == null) {
            C1bL.A01(c1bL);
            str = r0.A00;
            if (str.startsWith("1:")) {
                String[] split = str.split(":");
                if (split.length < 2) {
                    return null;
                }
                str = split[1];
                if (str.isEmpty()) {
                    return null;
                }
            }
        }
        return str;
    }

    public static final void A02(C1e4 c1e4) {
        synchronized (c1e4) {
            PackageInfo A00 = c1e4.A00(c1e4.A04.getPackageName());
            if (A00 != null) {
                c1e4.A03 = Integer.toString(A00.versionCode);
                c1e4.A00 = A00.versionName;
            }
        }
    }

    public final int A03() {
        int i;
        synchronized (this) {
            i = this.A02;
            if (i == 0) {
                PackageManager packageManager = this.A04.getPackageManager();
                i = 0;
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    android.util.Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
                } else {
                    Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    i = 2;
                    if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                        android.util.Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
                    }
                    this.A02 = 2;
                }
            }
        }
        return i;
    }

    public final int A04() {
        int i;
        synchronized (this) {
            if (this.A01 == 0) {
                PackageInfo A00 = A00("com.google.android.gms");
                if (A00 != null) {
                    this.A01 = A00.versionCode;
                }
            }
            i = this.A01;
        }
        return i;
    }

    public final String A05() {
        String str;
        synchronized (this) {
            if (this.A03 == null) {
                A02(this);
            }
            str = this.A03;
        }
        return str;
    }
}
