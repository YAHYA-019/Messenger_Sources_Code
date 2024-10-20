package com.facebook.browserextensions.ipc.messengerplatform.permission;

import X.0fH;
import X.1BK;
import X.AnonymousClass001;
import X.LGq;
import X.MMa;
import android.os.Bundle;
import com.facebook.businessextension.jscalls.BusinessExtensionJSBridgeCall;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: AskPermissionJSBridgeCall.class */
public final class AskPermissionJSBridgeCall extends BusinessExtensionJSBridgeCall {
    public static final MMa CREATOR = new LGq(2);

    public Bundle A07(String[] strArr) {
        Bundle A05 = 1BK.A05();
        A05.putString("callbackID", Aaz());
        try {
            JSONArray jSONArray = new JSONArray(strArr);
            JSONObject A12 = AnonymousClass001.A12();
            A12.put("permissions", jSONArray);
            A05.putString("callback_result", A12.toString());
            return A05;
        } catch (JSONException e) {
            0fH.A0s("askPermission", "Exception serializing return params!", e);
            return A05;
        }
    }
}
