package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: Ezn.class */
public final class Ezn {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;
    public final JSONObject A05;
    public final String A06;
    public final String A07;
    public final List A08;

    public Ezn(String str) {
        this.A06 = str;
        JSONObject A1F = DKC.A1F(str);
        this.A05 = A1F;
        String optString = A1F.optString("productId");
        this.A00 = optString;
        String optString2 = A1F.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        this.A01 = optString2;
        if (TextUtils.isEmpty(optString)) {
            throw AnonymousClass001.A0L("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(optString2)) {
            throw AnonymousClass001.A0L("Product type cannot be empty.");
        }
        this.A07 = A1F.optString("title");
        A1F.optString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        A1F.optString("description");
        A1F.optString("packageDisplayName");
        A1F.optString("iconUrl");
        this.A02 = A1F.optString("skuDetailsToken");
        this.A03 = A1F.optString("serializedDocid");
        JSONArray optJSONArray = A1F.optJSONArray("subscriptionOfferDetails");
        ArrayList arrayList = null;
        if (optJSONArray != null) {
            arrayList = AnonymousClass001.A0s();
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(new EoR(optJSONArray.getJSONObject(i)));
            }
        } else if (optString2.equals("subs") || optString2.equals("play_pass_subs")) {
            arrayList = AnonymousClass001.A0s();
        }
        this.A04 = arrayList;
        JSONObject optJSONObject = this.A05.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray optJSONArray2 = this.A05.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList A0s = AnonymousClass001.A0s();
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                A0s.add(new EpC(optJSONArray2.getJSONObject(i2)));
            }
        } else if (optJSONObject == null) {
            return;
        } else {
            A0s.add(new EpC(optJSONObject));
        }
        this.A08 = A0s;
    }

    public EpC A00() {
        List list = this.A08;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (EpC) 1BK.A0r(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Ezn) {
            return TextUtils.equals(this.A06, ((Ezn) obj).A06);
        }
        return false;
    }

    public int hashCode() {
        return this.A06.hashCode();
    }

    public String toString() {
        List list = this.A04;
        String obj = this.A05.toString();
        String valueOf = String.valueOf(list);
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ProductDetails{jsonString='");
        A0k.append(this.A06);
        A0k.append("', parsedJson=");
        A0k.append(obj);
        A0k.append(", productId='");
        A0k.append(this.A00);
        A0k.append("', productType='");
        A0k.append(this.A01);
        A0k.append("', title='");
        A0k.append(this.A07);
        A0k.append("', productDetailsToken='");
        A0k.append(this.A02);
        A0k.append("', subscriptionOfferDetails=");
        A0k.append(valueOf);
        return 1BL.A0v(A0k);
    }
}
