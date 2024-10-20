package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.LinkedHashMap;

/* loaded from: Kmn.class */
public final class Kmn {
    public final LinkedHashMap A00(String str, String str2, boolean z) {
        LinkedHashMap A06 = 04R.A06(7zS.A14("with_ads_disclosure", String.valueOf(z), 1BK.A1G("user_action", str), 1BK.A1G(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2)));
        A06.get("action");
        A06.put("IS_BLOKS_ACTION", "true");
        return A06;
    }
}
