package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: X.7uy, reason: invalid class name */
/* loaded from: 7uy.class */
public final class C7uy implements MJW {
    public Bundle AJA(String str, String str2, boolean z) {
        0fH.A0g(str, "TwilightAppUriHandler", "create Bundle %s");
        Bundle A05 = 1BK.A05();
        if (str != null) {
            A05.putString("url_param", str);
        }
        return A05;
    }

    public boolean D5I(Context context, Bundle bundle) {
        return false;
    }

    public boolean D5J(Context context, Bundle bundle) {
        String string = bundle.getString("url_param");
        0fH.A0g(string, "TwilightAppUriHandler", "tryLaunchStoreForUrl %s");
        if (string == null) {
            return false;
        }
        try {
            Uri A03 = C0A2.A03(string);
            if (A03 == null) {
                return false;
            }
            Intent A09 = 4YU.A09(A03);
            for (ResolveInfo resolveInfo : 0EB.A02(context, A09, 0)) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo != null && ((PackageItemInfo) activityInfo).packageName.contentEquals("com.oculus.twilight")) {
                    ActivityInfo activityInfo2 = resolveInfo.activityInfo;
                    A09.setComponent(new ComponentName(((PackageItemInfo) activityInfo2).packageName, ((PackageItemInfo) activityInfo2).name));
                    boolean A092 = 0LS.A09(context, A09);
                    0fH.A14("TwilightAppUriHandler", "Launch status of Twilight App : %s", new Object[]{A092 ? AnonymousClass000.A00(81) : "Failed"});
                    return A092;
                }
            }
            return false;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
