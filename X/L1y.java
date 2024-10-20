package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.fbpay.w3c.CardDetails;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: L1y.class */
public final class L1y {
    public final AutofillData A00;
    public final CardDetails A01;

    public L1y(AutofillData autofillData, CardDetails cardDetails) {
        this.A00 = autofillData;
        this.A01 = cardDetails;
    }

    public static void A00(Object obj, AbstractMap abstractMap, java.util.Map map) {
        if (map.get(obj) != null) {
            abstractMap.put(obj, map.get(obj));
        }
    }

    public final HashMap A01() {
        HashMap A0u = AnonymousClass001.A0u();
        AutofillData autofillData = this.A00;
        if (autofillData != null) {
            java.util.Map map = autofillData.A00;
            Object obj = Collections.unmodifiableMap(map).get(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            if (obj != null) {
                A0u.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, obj);
                A0u.put("cc-name", obj);
            }
            if (AnonymousClass001.A0b("given-name", map) != null) {
                A0u.put("given-name", AnonymousClass001.A0b("given-name", map));
                A0u.put("cc-given-name", AnonymousClass001.A0b("given-name", map));
            }
            if (AnonymousClass001.A0b("family-name", map) != null) {
                A0u.put("family-name", AnonymousClass001.A0b("family-name", map));
                A0u.put("cc-family-name", AnonymousClass001.A0b("family-name", map));
            }
            if (AnonymousClass001.A0b("email", map) != null) {
                A0u.put("email", AnonymousClass001.A0b("email", map));
            }
            if (AnonymousClass001.A0b("tel", map) != null) {
                A0u.put("tel", AnonymousClass001.A0b("tel", map));
            }
            if (AnonymousClass001.A0b("address-line1", map) != null) {
                A0u.put("address-line1", AnonymousClass001.A0b("address-line1", map));
            }
            A00("address-line2", A0u, map);
            A00("address-level1", A0u, map);
            A00("address-level2", A0u, map);
            A00("postal-code", A0u, map);
        }
        return A0u;
    }
}
