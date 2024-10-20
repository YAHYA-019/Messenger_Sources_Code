package com.facebook.browser.lite.extensions.autofill.model;

import X.82M;
import X.AnonymousClass001;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: AutofillData.class */
public final class AutofillData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(0);
    public final Map A00;

    public AutofillData(Parcel parcel) {
        this.A00 = parcel.readHashMap(String.class.getClassLoader());
        A00();
    }

    public AutofillData(Map map) {
        this.A00 = new HashMap(map);
        A00();
    }

    public AutofillData(JSONObject jSONObject) {
        this.A00 = AnonymousClass001.A0u();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String A0i = AnonymousClass001.A0i(keys);
            this.A00.put(A0i, jSONObject.optString(A0i));
        }
        A00();
    }

    private void A00() {
        Map map = this.A00;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getValue() == null) {
                it.remove();
            } else {
                entry.setValue(((String) entry.getValue()).trim());
            }
        }
        Object obj = map.get("given-name");
        Object obj2 = map.get("family-name");
        if (obj != null || obj2 != null) {
            ArrayList arrayList = new ArrayList();
            if (map.containsKey("given-name")) {
                arrayList.add(map.get("given-name"));
            }
            if (map.containsKey("family-name")) {
                arrayList.add(map.get("family-name"));
            }
            map.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, TextUtils.join(" ", arrayList));
            return;
        }
        String str = (String) map.get(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        if (str != null) {
            int lastIndexOf = str.lastIndexOf(32);
            if (lastIndexOf <= 0) {
                map.put("given-name", str);
            } else {
                map.put("given-name", str.substring(0, lastIndexOf));
                map.put("family-name", AnonymousClass001.A0W(lastIndexOf, str));
            }
        }
    }

    public JSONObject A01() {
        JSONObject jSONObject = new JSONObject();
        Map unmodifiableMap = Collections.unmodifiableMap(this.A00);
        for (String str : unmodifiableMap.keySet()) {
            try {
                jSONObject.put(str, unmodifiableMap.get(str));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0072, code lost:
    
        if (android.text.TextUtils.isEmpty(X.AnonymousClass001.A0b("postal-code", r0)) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A02() {
        /*
            r301 = this;
            r0 = r301
            java.util.Map r0 = r0.A00
            r302 = r0
            java.lang.String r0 = "given-name"
            r1 = r302
            java.lang.String r0 = X.AnonymousClass001.A0b(r0, r1)
            r303 = r0
            r0 = r303
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L25
            java.lang.String r0 = "family-name"
            r1 = r302
            java.lang.String r0 = X.AnonymousClass001.A0b(r0, r1)
            r303 = r0
            r0 = r303
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L75
        L25:
            r0 = 215(0xd7, float:3.01E-43)
            java.lang.String r0 = X.JQw.A00(r0)
            r1 = r302
            java.lang.String r0 = X.AnonymousClass001.A0b(r0, r1)
            r303 = r0
            r0 = r303
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L75
            r0 = 213(0xd5, float:2.98E-43)
            java.lang.String r0 = X.JQw.A00(r0)
            r1 = r302
            java.lang.String r0 = X.AnonymousClass001.A0b(r0, r1)
            r303 = r0
            r0 = r303
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L75
            r0 = 214(0xd6, float:3.0E-43)
            java.lang.String r0 = X.JQw.A00(r0)
            r1 = r302
            java.lang.String r0 = X.AnonymousClass001.A0b(r0, r1)
            r303 = r0
            r0 = r303
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L75
            java.lang.String r0 = "postal-code"
            r1 = r302
            java.lang.String r0 = X.AnonymousClass001.A0b(r0, r1)
            r303 = r0
            r0 = r303
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r305 = r0
            r0 = 1
            r304 = r0
            r0 = r305
            if (r0 == 0) goto L79
        L75:
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
        L79:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.extensions.autofill.model.AutofillData.A02():boolean");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        Map map = this.A00;
        if (map == null) {
            return "";
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("AutofillData{mAutofillValues=");
        A0k.append(map.keySet());
        A0k.append(":");
        A0k.append(map.values());
        return AnonymousClass001.A0f(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.A00);
    }
}
