package com.facebook.businessextension.jscalls;

import X.7zS;
import X.AnonymousClass001;
import X.LCd;
import X.LGr;
import X.MMa;
import android.os.Bundle;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: SaveAutofillDataJSBridgeCall.class */
public final class SaveAutofillDataJSBridgeCall extends BusinessExtensionJSBridgeCall {
    public static final MMa CREATOR = new LGr(18);

    public static Bundle A00(JSONObject jSONObject) {
        Bundle A02 = BusinessExtensionJSBridgeCall.A02(jSONObject);
        JSONObject jSONObject2 = jSONObject.getJSONObject("raw_autofill_data");
        ImmutableMap immutableMap = null;
        if (jSONObject2 != null) {
            HashMap A0u = AnonymousClass001.A0u();
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                try {
                    String A0i = AnonymousClass001.A0i(keys);
                    JSONArray jSONArray = jSONObject2.getJSONArray(A0i);
                    ArrayList A0s = AnonymousClass001.A0s();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        Object obj = jSONArray.get(i);
                        if (!(obj instanceof String)) {
                            throw new JSONException(7zS.A13(obj, "Value was not a String, was ", AnonymousClass001.A0k()));
                        }
                        A0s.add(obj);
                    }
                    A0u.put(A0i, A0s);
                } catch (JSONException e) {
                    LCd.A02("SaveAutofillDataJSBridgeCall", "Failed to parse raw autofill data", e, new Object[]{e});
                }
            }
            immutableMap = ImmutableMap.copyOf((Map) A0u);
        }
        A02.putParcelable("saveAutofillDataData", new SaveAutofillDataJSBridgeCallData(immutableMap));
        return A02;
    }
}
