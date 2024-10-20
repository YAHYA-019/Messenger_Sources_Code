package X;

import com.facebook.dialtone.common.DialtoneExtraStatusData;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import com.google.common.collect.ImmutableMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: FbM.class */
public final class FbM implements C4EE {
    public final C00i A00 = DKD.A0R();

    @Override // X.C4EE
    public ImmutableMap AlO() {
        return null;
    }

    @Override // X.C4EE
    public ImmutableMap AlP() {
        ImmutableMap.Builder A0c = 1BK.A0c();
        String obj = 1Bn.A0A(33096).toString();
        0fH.A0g(obj, "ZeroRatingProvider", "is_zero_rating = %b");
        A0c.put("is_zero_rating", obj);
        DialtoneExtraStatusData dialtoneExtraStatusData = (DialtoneExtraStatusData) 1Bn.A0A(33099);
        String str = "";
        if (dialtoneExtraStatusData != null) {
            try {
                JSONObject A12 = AnonymousClass001.A12();
                A12.put("isFlexPlusFeatureEnabled", dialtoneExtraStatusData.A03);
                A12.put("isVideoScreenCapFeatureEnabled", dialtoneExtraStatusData.A04);
                A12.put("isDialtonePhotoInterstitialEnabled", dialtoneExtraStatusData.A00);
                A12.put("isDialtoneVideoInterstitialEnabled", dialtoneExtraStatusData.A02);
                A12.put("isDialtoneToggleInterstitialEnabled", dialtoneExtraStatusData.A01);
                str = A12.toString();
            } catch (JSONException unused) {
            }
        }
        0fH.A0g(str, "ZeroRatingProvider", "dialtone_extra_status = %s");
        A0c.put("dialtone_extra_status", str);
        String A0D = 4YU.A0K(this.A00).A0D();
        if (A0D == null) {
            A0D = OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
        }
        return AbG.A10(A0c, "zero_balance_state", A0D);
    }

    @Override // X.C4EE
    public String getName() {
        return "ZeroRatingProvider";
    }
}
