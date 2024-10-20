package com.android.billingclient.api;

import X.AnonymousClass001;
import X.DKC;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* loaded from: SkuDetails.class */
public final class SkuDetails {
    public final JSONObject A00;
    public final String A01;

    public SkuDetails(String str) {
        this.A01 = str;
        JSONObject A1F = DKC.A1F(str);
        this.A00 = A1F;
        if (TextUtils.isEmpty(A1F.optString("productId"))) {
            throw AnonymousClass001.A0L("SKU cannot be empty.");
        }
        if (TextUtils.isEmpty(A1F.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE))) {
            throw AnonymousClass001.A0L("SkuType cannot be empty.");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuDetails) {
            return TextUtils.equals(this.A01, ((SkuDetails) obj).A01);
        }
        return false;
    }

    public int hashCode() {
        return this.A01.hashCode();
    }

    public String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.A01));
    }
}
