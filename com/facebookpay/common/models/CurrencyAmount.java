package com.facebookpay.common.models;

import X.11T;
import X.1BL;
import X.AbM;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CurrencyAmount.class */
public final class CurrencyAmount implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKb(90);
    public final String A00;
    public final String A01;

    public CurrencyAmount(String str, String str2) {
        1BL.A1F(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003b, code lost:
    
        if (X.11T.A0O(r301.A01, r0.A01) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0 instanceof com.facebookpay.common.models.CurrencyAmount
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L3e
            r0 = r301
            java.lang.String r0 = r0.A00
            r304 = r0
            r0 = r302
            com.facebookpay.common.models.CurrencyAmount r0 = (com.facebookpay.common.models.CurrencyAmount) r0
            r302 = r0
            r0 = r302
            java.lang.String r0 = r0.A00
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = X.11T.A0O(r0, r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L3e
            r0 = r301
            java.lang.String r0 = r0.A01
            r304 = r0
            r0 = r302
            java.lang.String r0 = r0.A01
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = X.11T.A0O(r0, r1)
            r306 = r0
            r0 = 1
            r303 = r0
            r0 = r306
            if (r0 != 0) goto L43
        L3e:
            r0 = 0
            r303 = r0
            r0 = 0
            r305 = r0
        L43:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.common.models.CurrencyAmount.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return AbM.A05(this.A00, this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
