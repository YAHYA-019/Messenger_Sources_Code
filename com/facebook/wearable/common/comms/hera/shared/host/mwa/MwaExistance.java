package com.facebook.wearable.common.comms.hera.shared.host.mwa;

import X.0Kh;
import X.11T;
import X.AnonymousClass001;
import X.C0s8;
import android.content.Context;
import android.content.pm.PackageManager;
import java.util.Iterator;
import java.util.List;

/* loaded from: MwaExistance.class */
public final class MwaExistance {
    public static final MwaExistance INSTANCE = new Object();
    public static final List MWA_PACKAGE_NAMES = C0s8.A14("com.facebook.stella", "com.facebook.stella_debug");

    public static final boolean isMwaInstalled(Context context) {
        11T.A0F(context, 0);
        return isMwaInstalled(context, false);
    }

    public static final boolean isMwaInstalled(Context context, boolean z) {
        11T.A0F(context, 0);
        PackageManager packageManager = context.getPackageManager();
        boolean z2 = true;
        if (z) {
            if (!0Kh.A03(packageManager, "com.facebook.stella") && !0Kh.A03(packageManager, "com.facebook.stella_debug")) {
                z2 = false;
            }
            return z2;
        }
        Iterator it = MWA_PACKAGE_NAMES.iterator();
        while (it.hasNext()) {
            if (packageManager.getPackageInfo(AnonymousClass001.A0i(it), 0) != null) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean isMwaInstalled$default(Context context, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return isMwaInstalled(context, z);
    }
}
