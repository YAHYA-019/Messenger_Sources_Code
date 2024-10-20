package com.facebook.payments.paymentmethods.picker.protocol;

import X.1BL;
import X.1JF;
import X.4YV;
import X.C53v;
import X.DKC;
import X.DKG;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.locale.Country;
import com.facebook.payments.model.PaymentItemType;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: GetPaymentMethodsInfoParams.class */
public final class GetPaymentMethodsInfoParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(74);
    public final Country A00;
    public final PaymentItemType A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final JSONObject A05;

    public GetPaymentMethodsInfoParams(Parcel parcel) {
        this.A01 = DKG.A0k(parcel);
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        JSONObject jSONObject = null;
        try {
            String readString = parcel.readString();
            if (!1JF.A0B(readString)) {
                jSONObject = DKC.A1F(readString);
            }
        } catch (JSONException unused) {
        }
        this.A05 = jSONObject;
        this.A00 = (Country) 1BL.A0C(parcel, Country.class);
        this.A04 = parcel.readString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r302 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public GetPaymentMethodsInfoParams(com.facebook.common.locale.Country r302, com.facebook.payments.model.PaymentItemType r303, java.lang.String r304, java.lang.String r305, java.lang.String r306, org.json.JSONObject r307) {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            com.facebook.payments.model.PaymentItemType r0 = com.facebook.payments.model.PaymentItemType.A02
            r308 = r0
            r0 = r303
            r1 = r308
            if (r0 != r1) goto L19
            r0 = 0
            r309 = r0
            r0 = 0
            r308 = r0
            r0 = r302
            if (r0 == 0) goto L1c
        L19:
            r0 = 1
            r309 = r0
        L1c:
            r0 = r309
            com.google.common.base.Preconditions.checkArgument(r0)
            r0 = r301
            r1 = r303
            r0.A01 = r1
            r0 = r303
            r1 = r304
            X.RVV.A00(r0, r1)
            r0 = r301
            r1 = r304
            r0.A02 = r1
            r0 = r301
            r1 = r305
            r0.A03 = r1
            r0 = r301
            r1 = r307
            r0.A05 = r1
            r0 = r301
            r1 = r302
            r0.A00 = r1
            r0 = r301
            r1 = r306
            r0.A04 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.paymentmethods.picker.protocol.GetPaymentMethodsInfoParams.<init>(com.facebook.common.locale.Country, com.facebook.payments.model.PaymentItemType, java.lang.String, java.lang.String, java.lang.String, org.json.JSONObject):void");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null && (obj instanceof GetPaymentMethodsInfoParams)) {
            GetPaymentMethodsInfoParams getPaymentMethodsInfoParams = (GetPaymentMethodsInfoParams) obj;
            if (this.A01 == getPaymentMethodsInfoParams.A01 && this.A02.compareTo(getPaymentMethodsInfoParams.A02) == 0) {
                Country country = this.A00;
                Country country2 = getPaymentMethodsInfoParams.A00;
                if (country != null ? !(country2 == null || country.toString().compareTo(country2.toString()) != 0) : country2 == null) {
                    JSONObject jSONObject = this.A05;
                    JSONObject jSONObject2 = getPaymentMethodsInfoParams.A05;
                    if (jSONObject != null ? !(jSONObject2 == null || jSONObject.toString().compareTo(jSONObject2.toString()) != 0) : jSONObject2 == null) {
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    public int hashCode() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C53v.A0J(parcel, this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(4YV.A0u(this.A05));
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A04);
    }
}
