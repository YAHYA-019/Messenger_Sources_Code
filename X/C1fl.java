package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* renamed from: X.1fl, reason: invalid class name */
/* loaded from: 1fl.class */
public final class C1fl {
    public boolean A00;
    public final Context A01;
    public final SharedPreferences A02;
    public final 1cA A03;

    public C1fl(Context context, 1cA r303, String str) {
        boolean z;
        Context createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        this.A01 = createDeviceProtectedStorageContext;
        SharedPreferences sharedPreferences = createDeviceProtectedStorageContext.getSharedPreferences(0Pz.A0W("com.google.firebase.common.prefs:", str), 0);
        this.A02 = sharedPreferences;
        this.A03 = r303;
        if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            try {
                Context context2 = this.A01;
                PackageManager packageManager = context2.getPackageManager();
                if (packageManager != null) {
                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context2.getPackageName(), 128);
                    if (applicationInfo != null) {
                        Bundle bundle = ((PackageItemInfo) applicationInfo).metaData;
                        if (bundle != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z = ((PackageItemInfo) applicationInfo).metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            z = true;
        }
        this.A00 = z;
    }
}
