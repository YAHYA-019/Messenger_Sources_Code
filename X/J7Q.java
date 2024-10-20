package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.HashMap;

/* loaded from: J7Q.class */
public final class J7Q extends HashMap {
    public final /* synthetic */ String val$name;
    public final /* synthetic */ String val$rawEffectId;

    public J7Q(String str, String str2) {
        this.val$name = str;
        this.val$rawEffectId = str2;
        put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
        put("raw_effect_id", str2);
    }
}
