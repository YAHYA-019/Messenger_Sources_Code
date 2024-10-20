package com.facebook.android.instantexperiences.autofill.model;

import X.11T;
import X.1BL;
import X.4YU;
import X.AbL;
import X.AnonymousClass001;
import X.C0B7;
import X.DKC;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: BrowserExtensionsAutofillData.class */
public abstract class BrowserExtensionsAutofillData implements Parcelable {
    public Map A00;

    public BrowserExtensionsAutofillData() {
        this.A00 = AnonymousClass001.A0u();
    }

    public BrowserExtensionsAutofillData(Parcel parcel) {
        HashMap readHashMap = parcel.readHashMap(String.class.getClassLoader());
        11T.A0I(readHashMap, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.String>");
        this.A00 = C0B7.A02(readHashMap);
    }

    public BrowserExtensionsAutofillData(JSONObject jSONObject) {
        this();
        JSONObject optJSONObject = jSONObject.optJSONObject("autocomplete_data");
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String A0i = AnonymousClass001.A0i(keys);
                Map map = this.A00;
                11T.A0D(A0i);
                String optString = optJSONObject.optString(A0i);
                11T.A0A(optString);
                map.put(A0i, optString);
            }
        }
    }

    public static void A01(Object obj, StringBuilder sb, Map map) {
        AddressAutofillData.A00((String) map.get(obj), sb);
    }

    public HashMap A02() {
        if (!(this instanceof TelephoneAutofillData) && (this instanceof NameAutofillData)) {
            HashMap A1C = DKC.A1C(this.A00);
            for (Object obj : new LinkedList(A1C.keySet())) {
                String A16 = 4YU.A16(obj, A1C);
                if (A16 == null || A16.length() == 0) {
                    A1C.remove(obj);
                }
            }
            return A1C;
        }
        return DKC.A1C(this.A00);
    }

    public final HashMap A03(Set set) {
        HashMap A0u = AnonymousClass001.A0u();
        Iterator A0y = AnonymousClass001.A0y(this.A00);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            Object key = A0z.getKey();
            Object value = A0z.getValue();
            if (set.contains(key)) {
                A0u.put(key, value);
            }
        }
        return A0u;
    }

    public JSONObject A04() {
        JSONObject A12 = AnonymousClass001.A12();
        Iterator A0x = AnonymousClass001.A0x(A02());
        while (A0x.hasNext()) {
            AbL.A19(A0x, A12);
        }
        JSONObject A122 = AnonymousClass001.A12();
        A122.put("autocomplete_data", A12);
        return A122;
    }

    public boolean A05(BrowserExtensionsAutofillData browserExtensionsAutofillData) {
        11T.A0F(browserExtensionsAutofillData, 0);
        if (!1BL.A1V(this, browserExtensionsAutofillData) || this.A00.size() > browserExtensionsAutofillData.A00.size()) {
            return false;
        }
        Iterator A0y = AnonymousClass001.A0y(this.A00);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            Object key = A0z.getKey();
            Object value = A0z.getValue();
            Object obj = browserExtensionsAutofillData.A00.get(key);
            if (value != null && (obj == null || !value.equals(obj))) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || !1BL.A1V(this, obj)) {
            return false;
        }
        BrowserExtensionsAutofillData browserExtensionsAutofillData = (BrowserExtensionsAutofillData) obj;
        if (this.A00.size() != browserExtensionsAutofillData.A00.size()) {
            return false;
        }
        Iterator A0y = AnonymousClass001.A0y(this.A00);
        while (true) {
            boolean z = true;
            if (!A0y.hasNext()) {
                return true;
            }
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            Object key = A0z.getKey();
            Object value = A0z.getValue();
            Object obj2 = browserExtensionsAutofillData.A00.get(key);
            boolean A1T = AnonymousClass001.A1T(value);
            if (obj2 == null) {
                z = false;
            }
            if (z ^ A1T) {
                return false;
            }
            if (value != null && obj2 != null && !value.equals(obj2)) {
                return false;
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeMap(this.A00);
    }
}
