package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.zero.common.ZeroUrlRewriteRule;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.41u, reason: invalid class name */
/* loaded from: 41u.class */
public abstract class C41u {
    /* JADX WARN: Type inference failed for: r0v17, types: [X.41x, java.lang.Object] */
    public static C41x A00(String str, String str2) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            String str3 = null;
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject.has("matcher") && jSONObject.has("replacer")) {
                    String optString = jSONObject.optString("matcher");
                    if (optString.equals(str2)) {
                        str3 = jSONObject.optString("replacer");
                    }
                    ZeroUrlRewriteRule zeroUrlRewriteRule = new ZeroUrlRewriteRule(optString, jSONObject.optString("replacer"));
                    if (jSONObject.has(PublicKeyCredentialControllerUtility.JSON_KEY_NAME)) {
                        zeroUrlRewriteRule.A00 = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                    }
                    builder.m11011add((Object) zeroUrlRewriteRule);
                }
            }
            ImmutableList build = builder.build();
            ?? obj = new Object();
            obj.A00 = build;
            obj.A01 = str3;
            return obj;
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }
}
