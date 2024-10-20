package com.facebook.browser.lite.extensions.promoautofill.base;

import X.07C;
import X.07E;
import X.0AK;
import X.0BY;
import X.0Pz;
import X.0QD;
import X.0fH;
import X.11T;
import X.1BK;
import X.1Br;
import X.4YV;
import X.7zL;
import X.7zR;
import X.AbstractC3252Jnp;
import X.AnonymousClass001;
import X.C07w;
import X.C0Bx;
import X.C3246Jni;
import X.DKC;
import X.L2P;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.browser.lite.bridge.BrowserLiteJSBridgeProxy;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;
import com.facebook.businessextension.jscalls.BusinessExtensionJSBridgeCall;
import com.facebook.businessextension.jscalls.promoautofill.GetPromoExtensionNonceJSBridgeCall;
import com.facebook.businessextension.jscalls.promoautofill.RequestPromoExtensionPromoCodeAutofillJSBridgeCall;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: PromoAutofillJSBridgeProxy.class */
public final class PromoAutofillJSBridgeProxy extends BrowserLiteJSBridgeProxy {
    public static final String A05;
    public String A00;
    public String A01;
    public final Intent A02;
    public final C3246Jni A03;
    public final AbstractC3252Jnp A04;

    static {
        Map map = 0BY.A03;
        String A01 = C0Bx.A01(PromoAutofillJSBridgeProxy.class);
        if (A01 == null) {
            A01 = "PromoAutofillJSBridgeProxy";
        }
        A05 = A01;
    }

    public PromoAutofillJSBridgeProxy(Intent intent, C3246Jni c3246Jni, AbstractC3252Jnp abstractC3252Jnp) {
        super.A01 = "_PromoExtensions";
        this.A04 = abstractC3252Jnp;
        this.A03 = c3246Jni;
        this.A02 = intent;
        this.A01 = "";
        this.A00 = "";
        A0D(abstractC3252Jnp);
    }

    public static final LinkedHashMap A00(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        11T.A0A(keys);
        C07w A09 = 0AK.A09(keys);
        LinkedHashMap A1C = 1BK.A1C();
        Iterator it = A09.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object obj = jSONObject.get((String) next);
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                07E A07 = 07C.A07(0, jSONArray.length());
                LinkedHashMap linkedHashMap = new LinkedHashMap(4YV.A01(A07));
                Iterator it2 = A07.iterator();
                while (it2.hasNext()) {
                    int A06 = 7zL.A06(it2);
                    linkedHashMap.put(String.valueOf(A06), jSONArray.get(A06));
                }
                obj = 0QD.A0V(A00(new JSONObject(linkedHashMap)).values());
            } else if (obj instanceof JSONObject) {
                obj = A00((JSONObject) obj);
            } else if (11T.A0O(obj, JSONObject.NULL)) {
                obj = null;
            }
            A1C.put(next, obj);
        }
        return A1C;
    }

    private final void A01(Bundle bundle, BrowserLiteJSBridgeCall browserLiteJSBridgeCall) {
        L2P A03;
        String str = browserLiteJSBridgeCall.A05;
        if (11T.A0O(str, "getPromoExtensionNonce") || 11T.A0O(str, "requestPromoExtensionPromoCodeAutofill")) {
            A03 = BusinessExtensionJSBridgeCall.A03(bundle, this.A01);
        } else {
            0fH.A0k(A05, 0Pz.A0X("PromoAutofillJSBridgeProxy - No valid callback found for call: ", str, ' '));
            A03 = null;
        }
        A0C(A03, browserLiteJSBridgeCall, this.A01);
    }

    public final void getPromoExtensionNonce(String str) {
        String A0B;
        11T.A0F(str, 0);
        Context A07 = A07();
        if (A07 == null || (A0B = A0B()) == null) {
            return;
        }
        String str2 = GetPromoExtensionNonceJSBridgeCall.A00;
        BusinessExtensionJSBridgeCall businessExtensionJSBridgeCall = new BusinessExtensionJSBridgeCall(A07, A08(), BusinessExtensionJSBridgeCall.A02(DKC.A1F(str)), A0A(), "getPromoExtensionNonce", A0B);
        this.A00 = 7zR.A0s();
        String Aaz = businessExtensionJSBridgeCall.Aaz();
        String str3 = this.A00;
        boolean AZk = 1Br.A07(this.A03.A02).AZk(36310619900477893L);
        11T.A0F(str3, 1);
        JSONObject A12 = AnonymousClass001.A12();
        try {
            A12.put("nonce", str3);
            A12.put("isDebug", AZk);
            A12.put("performAutofillAction", false);
            A12.put("configsInJSON", "");
        } catch (JSONException e) {
            0fH.A0z(GetPromoExtensionNonceJSBridgeCall.A00, "Failed to set RETURN_PARM result", e, new Object[]{e});
        }
        A01(BusinessExtensionJSBridgeCall.A01(Aaz, A12), businessExtensionJSBridgeCall);
    }

    public final void initializePromoExtensionCallbackHandler(String str) {
        11T.A0F(str, 0);
        try {
            this.A01 = DKC.A1A(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, DKC.A1F(str));
        } catch (JSONException e) {
            0fH.A0r(A05, "PromoAutofillJSBridgeProxy - Exception parsing initializePromoExtensionCallbackHandler call", e);
        }
    }

    public final void requestPromoExtensionPromoCodeAutofill(String str) {
        Context A07;
        String A0B;
        11T.A0F(str, 0);
        try {
            if (!11T.A0O(DKC.A1F(str).optString("nonce"), this.A00) || (A07 = A07()) == null || (A0B = A0B()) == null) {
                return;
            }
            String str2 = RequestPromoExtensionPromoCodeAutofillJSBridgeCall.A00;
            BusinessExtensionJSBridgeCall businessExtensionJSBridgeCall = new BusinessExtensionJSBridgeCall(A07, A08(), BusinessExtensionJSBridgeCall.A02(DKC.A1F(str)), A0A(), "requestPromoExtensionPromoCodeAutofill", A0B);
            String Aaz = businessExtensionJSBridgeCall.Aaz();
            JSONObject A12 = AnonymousClass001.A12();
            try {
                A12.put("promoCode", "");
            } catch (JSONException e) {
                0fH.A0r(RequestPromoExtensionPromoCodeAutofillJSBridgeCall.A00, "Failed to set RETURN_PARM result", e);
            }
            A01(BusinessExtensionJSBridgeCall.A01(Aaz, A12), businessExtensionJSBridgeCall);
        } catch (JSONException e2) {
            0fH.A0r(A05, "PromoAutofillJSBridgeProxy - Request Param is NOT valid - ", e2);
        }
    }

    public final void sendPromoExtensionPromoCodeAutofillResult(String str) {
        11T.A0F(str, 0);
        A00(DKC.A1F(str));
    }
}
