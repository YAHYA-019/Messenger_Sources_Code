package com.google.android.gms.common;

import X.AnonymousClass001;
import X.C26H;
import X.C26J;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.Constants;
import com.google.android.gms.common.util.DeviceProperties;

/* loaded from: GoogleApiAvailabilityLight.class */
public class GoogleApiAvailabilityLight {
    public static final GoogleApiAvailabilityLight A00 = new Object();

    public int A03(Context context) {
        return A04(context, 12451000);
    }

    public int A04(Context context, int i) {
        int A002 = GooglePlayServicesUtil.A00(context, i);
        if (GooglePlayServicesUtil.A02(context, A002)) {
            A002 = 18;
        }
        return A002;
    }

    public Intent A05(Context context, String str, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && DeviceProperties.A00(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("gcore_");
        A0k.append(12451000);
        A0k.append("-");
        if (!TextUtils.isEmpty(str)) {
            A0k.append(str);
        }
        A0k.append("-");
        if (context != null) {
            A0k.append(context.getPackageName());
        }
        A0k.append("-");
        if (context != null) {
            try {
                C26J A002 = C26H.A00(context);
                A0k.append(A002.A00.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String obj = A0k.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "com.google.android.gms");
        if (!TextUtils.isEmpty(obj)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", obj);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(Constants.LOAD_RESULT_WITH_VDEX_ODEX);
        return intent3;
    }
}
