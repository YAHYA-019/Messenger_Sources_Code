package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: X.4Jp, reason: invalid class name */
/* loaded from: 4Jp.class */
public abstract class C4Jp {
    public static final String A00 = 4IS.A01("PackageManagerHelper");

    public static void A00(Context context, Class cls, boolean z) {
        String str;
        str = "enabled";
        try {
            String name = cls.getName();
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, name));
            boolean z2 = false;
            if (componentEnabledSetting != 0) {
                z2 = true;
                if (componentEnabledSetting != 1) {
                    z2 = false;
                }
            }
            if (z == z2) {
                4IS.A00().A02(A00, 0Pz.A0W("Skipping component enablement for ", name));
                return;
            }
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, name);
            int i = 2;
            if (z) {
                i = 1;
            }
            packageManager.setComponentEnabledSetting(componentName, i, 1);
            4IS.A00().A02(A00, 0Pz.A0j(name, " ", z ? str : "disabled"));
        } catch (Exception e) {
            4IS A002 = 4IS.A00();
            String str2 = A00;
            String A0j = 0Pz.A0j(cls.getName(), "could not be ", z ? "enabled" : "disabled");
            if (A002.A00 <= 3) {
                android.util.Log.d(str2, A0j, e);
            }
        }
    }
}
