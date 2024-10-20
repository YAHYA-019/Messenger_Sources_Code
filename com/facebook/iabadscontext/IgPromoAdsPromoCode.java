package com.facebook.iabadscontext;

import X.0Pz;
import X.11T;
import X.1BL;
import X.4YV;
import X.C04v;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: IgPromoAdsPromoCode.class */
public final class IgPromoAdsPromoCode extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(7);
    public final String A00;
    public final String A01;

    public IgPromoAdsPromoCode(String str, String str2) {
        11T.A0F(str, 1);
        this.A01 = str;
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof IgPromoAdsPromoCode)) {
                return false;
            }
            IgPromoAdsPromoCode igPromoAdsPromoCode = (IgPromoAdsPromoCode) obj;
            if (!11T.A0O(this.A01, igPromoAdsPromoCode.A01) || !11T.A0O(this.A00, igPromoAdsPromoCode.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 4YV.A02(this.A01) + 1BL.A05(this.A00);
    }

    public String toString() {
        return 0Pz.A0w("IgPromoAdsPromoCode(promoCodeAutofillText=", this.A01, ", offerId=", this.A00, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }
}
