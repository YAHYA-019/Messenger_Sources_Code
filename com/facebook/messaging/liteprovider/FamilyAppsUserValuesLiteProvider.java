package com.facebook.messaging.liteprovider;

import X.0EV;
import X.0Pz;
import X.0kS;
import X.11T;
import X.AnonymousClass001;
import X.C0qt;
import X.C0w6;
import X.C1A9;
import android.content.Context;
import android.content.Intent;
import android.content.UriMatcher;
import android.database.MatrixCursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: FamilyAppsUserValuesLiteProvider.class */
public final class FamilyAppsUserValuesLiteProvider extends C0qt {
    public static final String A01 = 0Pz.A0W("com.facebook.orca", ".liteprovider.FamilyAppsUserValuesLiteProvider");
    public final UriMatcher A00;

    public FamilyAppsUserValuesLiteProvider() {
        this.A00 = new UriMatcher(-1);
    }

    public FamilyAppsUserValuesLiteProvider(int i) {
    }

    @Override // X.C0qt
    public MatrixCursor A05(Uri uri, String str, String str2, String[] strArr, String[] strArr2) {
        11T.A0F(uri, 0);
        if (this.A00.match(uri) != 1) {
            throw AnonymousClass001.A0N(AnonymousClass001.A0Z(uri, "Unsupported uri: ", AnonymousClass001.A0k()));
        }
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "value"});
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 217257341) {
                if (hashCode != 730983340) {
                    if (hashCode == 1063606563 && str.equals("name='saved_session_info'")) {
                        matrixCursor = new MatrixCursor(new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "value"});
                        String name = 0kS.class.getName();
                        11T.A0A(name);
                        Context context = getContext();
                        for (String str3 : context != null ? 0kS.A00(context, name, "account_switcher_data") : new String[0]) {
                            matrixCursor.addRow(new String[]{"name='saved_session_info'", str3});
                        }
                    }
                } else if (str.equals("name='active_session_info'")) {
                    matrixCursor = new MatrixCursor(new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "value"});
                    String name2 = 0kS.class.getName();
                    11T.A0A(name2);
                    Context context2 = getContext();
                    for (String str4 : context2 != null ? 0kS.A00(context2, name2, "sso_data") : new String[0]) {
                        matrixCursor.addRow(new String[]{"name='active_session_info'", str4});
                    }
                }
            } else if (str.equals("name='all_session_info'")) {
                matrixCursor = new MatrixCursor(new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "value"});
                String name3 = 0kS.class.getName();
                11T.A0A(name3);
                Context context3 = getContext();
                for (String str5 : context3 != null ? (String[]) C1A9.A0M(0kS.A00(context3, name3, "sso_data"), 0kS.A00(context3, name3, "account_switcher_data")) : new String[0]) {
                    matrixCursor.addRow(new String[]{"name='all_session_info'", str5});
                }
            }
        }
        return matrixCursor;
    }

    @Override // X.C0qt
    public void A06() {
        this.A00.addURI(A01, "user_values", 1);
    }

    @Override // X.C0qt
    public boolean A08() {
        Context context = getContext();
        if (context == null) {
            return false;
        }
        0EV r0 = new 0EV();
        r0.A05("com.facebook.katana.fbpermission.LITE_PROVIDER_ACCESS");
        return r0.A00().A02(context, (Intent) null, (C0w6) null);
    }

    @Override // X.C0qt
    public boolean A09() {
        if (TextUtils.isEmpty("com.facebook.katana.fbpermission.LITE_PROVIDER_ACCESS")) {
            return true;
        }
        Context context = getContext();
        if (context == null) {
            return false;
        }
        0EV r0 = new 0EV();
        r0.A05("com.facebook.katana.fbpermission.LITE_PROVIDER_ACCESS");
        return r0.A00().A02(context, (Intent) null, (C0w6) null);
    }
}
