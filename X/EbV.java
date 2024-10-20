package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* loaded from: EbV.class */
public final class EbV {
    public final EpD A00;

    public EbV(JSONObject jSONObject) {
        jSONObject.getString("productId");
        jSONObject.optString("title");
        jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        jSONObject.optString("description");
        jSONObject.optString("basePlanId");
        JSONObject optJSONObject = jSONObject.optJSONObject("pricingPhase");
        this.A00 = optJSONObject == null ? null : new EpD(optJSONObject);
    }
}
