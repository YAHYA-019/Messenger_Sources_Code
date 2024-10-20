package com.facebook.android.instantexperiences.autofill.model;

import X.11T;
import X.AbE;
import X.AnonymousClass001;
import X.LGo;
import X.Lyd;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: TelephoneAutofillData.class */
public final class TelephoneAutofillData extends BrowserExtensionsAutofillData {
    public static final Set A01 = new Lyd(3);
    public static final Parcelable.Creator CREATOR = LGo.A00(93);
    public final String A00;

    public TelephoneAutofillData(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readString();
    }

    public TelephoneAutofillData(String str, Map map) {
        super.A00 = map;
        this.A00 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TelephoneAutofillData(JSONObject jSONObject) {
        super(jSONObject);
        String A0b;
        11T.A0F(jSONObject, 1);
        try {
            A0b = jSONObject.getString(AbE.A00(62));
        } catch (JSONException unused) {
            A0b = AnonymousClass001.A0b("tel", super.A00);
        }
        this.A00 = A0b;
    }

    @Override // com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData
    public JSONObject A04() {
        JSONObject A04 = super.A04();
        A04.put(AbE.A00(62), this.A00);
        return A04;
    }

    @Override // com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
    }
}
