package com.facebook.iabadscontext;

import X.11T;
import X.1BL;
import X.C04v;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: IABAdsMetaCheckoutPaymentsSDKDataExtension.class */
public final class IABAdsMetaCheckoutPaymentsSDKDataExtension extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(1);
    public final CheckoutSetupPayload A00;
    public final String A01;

    public IABAdsMetaCheckoutPaymentsSDKDataExtension(CheckoutSetupPayload checkoutSetupPayload, String str) {
        11T.A0F(checkoutSetupPayload, 1);
        this.A00 = checkoutSetupPayload;
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof IABAdsMetaCheckoutPaymentsSDKDataExtension)) {
                return false;
            }
            IABAdsMetaCheckoutPaymentsSDKDataExtension iABAdsMetaCheckoutPaymentsSDKDataExtension = (IABAdsMetaCheckoutPaymentsSDKDataExtension) obj;
            if (!11T.A0O(this.A00, iABAdsMetaCheckoutPaymentsSDKDataExtension.A00) || !11T.A0O(this.A01, iABAdsMetaCheckoutPaymentsSDKDataExtension.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BL.A03(this.A00) + 1BL.A05(this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        this.A00.writeToParcel(parcel, i);
        parcel.writeString(this.A01);
    }
}
