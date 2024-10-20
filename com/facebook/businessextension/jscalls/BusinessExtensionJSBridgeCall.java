package com.facebook.businessextension.jscalls;

import X.1BK;
import X.JQz;
import X.L2P;
import android.content.Context;
import android.os.Bundle;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;
import org.json.JSONObject;

/* loaded from: BusinessExtensionJSBridgeCall.class */
public abstract class BusinessExtensionJSBridgeCall extends BrowserLiteJSBridgeCall {
    public BusinessExtensionJSBridgeCall(Context context, Bundle bundle, Bundle bundle2, String str, String str2, String str3) {
        super(context, bundle == null ? 1BK.A05() : bundle, bundle2, str, str2, str3);
    }

    public static Bundle A01(String str, JSONObject jSONObject) {
        Bundle A05 = 1BK.A05();
        A05.putString("callbackID", str);
        A05.putString("callback_result", jSONObject.toString());
        return A05;
    }

    public static Bundle A02(JSONObject jSONObject) {
        Bundle A05 = 1BK.A05();
        if (jSONObject.has("callbackID")) {
            JQz.A15(A05, "callbackID", jSONObject);
        }
        return A05;
    }

    public static L2P A03(Bundle bundle, String str) {
        String string = bundle.getString("callbackID");
        if (string == null) {
            return null;
        }
        return new L2P(str, string, bundle.getString("callback_result"), true);
    }
}
