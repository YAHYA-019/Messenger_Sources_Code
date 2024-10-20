package com.facebook.messaging.fxcal.plugins.bloks.interappidentityswitch;

import X.02H;
import X.09X;
import X.0LS;
import X.0QD;
import X.11T;
import X.4bQ;
import X.7zM;
import X.7zO;
import X.AnonymousClass001;
import X.C0A2;
import X.DKE;
import X.DKc;
import X.Fwk;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: DeeplinkToOtherAppOrDirectToAppStoreImplementation.class */
public final class DeeplinkToOtherAppOrDirectToAppStoreImplementation {
    public static final Object A00(Fwk fwk, DKc dKc) {
        String str;
        Uri A03;
        ActivityInfo activityInfo;
        ApplicationInfo applicationInfo;
        11T.A0F(fwk, 0);
        List list = dKc.A00;
        String A13 = DKE.A13(list, 0);
        String A132 = DKE.A13(list, 1);
        Uri uri = null;
        try {
            uri = C0A2.A03(A13);
        } catch (SecurityException unused) {
        }
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        int length = A132.length();
        if (!AnonymousClass001.A1O(length)) {
            try {
                A03 = C0A2.A03(A132);
            } catch (SecurityException unused2) {
            }
            if (A03 != null) {
                str = A03.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                intent.setPackage(str);
            }
            str = null;
            intent.setPackage(str);
        }
        Context context = fwk.A00;
        Activity A00 = 4bQ.A00(context);
        System.currentTimeMillis();
        if (A00 == null) {
            return null;
        }
        HashSet A002 = 02H.A00(new String[]{"com.facebook.katana", "com.facebook.wakizashi", "com.facebook.orca", "com.instagram.android", "com.oculus.twilight", "com.facebook.lite", "com.whatsapp", "com.instagram.lite"});
        List<ResolveInfo> queryIntentActivities = A00.getPackageManager().queryIntentActivities(intent, 65536);
        ArrayList A0y = 7zO.A0y(queryIntentActivities);
        Iterator<ResolveInfo> it = queryIntentActivities.iterator();
        while (it.hasNext()) {
            ResolveInfo next = it.next();
            if (0QD.A0k(A002, (next == null || (activityInfo = next.activityInfo) == null || (applicationInfo = ((ComponentInfo) activityInfo).applicationInfo) == null) ? null : ((PackageItemInfo) applicationInfo).packageName)) {
                A0y.add(next);
            }
        }
        if (7zM.A1b(A0y)) {
            09X.A00().A07().A0A(context, intent);
            return null;
        }
        if (length == 0) {
            return null;
        }
        0LS.A0C(context, new Intent("android.intent.action.VIEW", C0A2.A03(A132)));
        return null;
    }
}
