package com.android.billingclient.api;

import X.AnonymousClass001;
import X.DKC;
import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: Purchase.class */
public final class Purchase {
    public final String A00;
    public final String A01;
    public final JSONObject A02;

    public Purchase(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = DKC.A1F(str);
    }

    public static final ArrayList A00(Purchase purchase) {
        ArrayList A0s = AnonymousClass001.A0s();
        JSONObject jSONObject = purchase.A02;
        if (jSONObject.has("productIds")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    A0s.add(optJSONArray.optString(i));
                }
            }
        } else if (jSONObject.has("productId")) {
            A0s.add(jSONObject.optString("productId"));
        }
        return A0s;
    }

    public String A01() {
        String optString = this.A02.optString("orderId");
        if (TextUtils.isEmpty(optString)) {
            optString = null;
        }
        return optString;
    }

    public String A02() {
        JSONObject jSONObject = this.A02;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Purchase)) {
                return false;
            }
            Purchase purchase = (Purchase) obj;
            if (!TextUtils.equals(this.A00, purchase.A00) || !TextUtils.equals(this.A01, purchase.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.A00));
    }
}
