package com.facebook.businessextension.jscalls;

import X.AnonymousClass001;
import X.LCd;
import X.LGr;
import X.MMa;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: RequestAutofillJSBridgeCall.class */
public final class RequestAutofillJSBridgeCall extends BusinessExtensionJSBridgeCall {
    public static final MMa CREATOR = new LGr(17);

    public static Bundle A00(JSONObject jSONObject) {
        String str;
        LinkedHashSet linkedHashSet;
        LinkedHashSet linkedHashSet2;
        Bundle A02 = BusinessExtensionJSBridgeCall.A02(jSONObject);
        try {
            str = jSONObject.getString("selectedAutoCompleteTag");
        } catch (JSONException e) {
            LCd.A02("RequestAutofillJSBridgeCall", "Failed to get autofill tag", e, new Object[]{e});
            str = null;
        }
        try {
            JSONArray jSONArray = new JSONArray(jSONObject.getString("autofillFields"));
            ArrayList A0s = AnonymousClass001.A0s();
            for (int i = 0; i < jSONArray.length(); i++) {
                A0s.add(jSONArray.getString(i));
            }
            Collections.sort(A0s);
            new LinkedHashSet(A0s);
        } catch (JSONException e2) {
            LCd.A02("RequestAutofillJSBridgeCall", "Failed to parseRequestedFields", e2, new Object[]{e2});
            linkedHashSet = null;
        }
        try {
            JSONArray jSONArray2 = new JSONArray(jSONObject.getString("allFields"));
            ArrayList A0s2 = AnonymousClass001.A0s();
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                A0s2.add(jSONArray2.getString(i2));
            }
            Collections.sort(A0s2);
            new LinkedHashSet(A0s2);
        } catch (JSONException e3) {
            LCd.A02("RequestAutofillJSBridgeCall", "Failed to parseAllFields", e3, new Object[]{e3});
            linkedHashSet2 = null;
        }
        A02.putParcelable("requestAutofillData", new RequestAutofillJSBridgeCallData(str, linkedHashSet, linkedHashSet2));
        return A02;
    }

    public LinkedHashSet A07() {
        RequestAutofillJSBridgeCallData requestAutofillJSBridgeCallData = (RequestAutofillJSBridgeCallData) A05("requestAutofillData");
        if (requestAutofillJSBridgeCallData == null) {
            return null;
        }
        return requestAutofillJSBridgeCallData.A02;
    }
}
