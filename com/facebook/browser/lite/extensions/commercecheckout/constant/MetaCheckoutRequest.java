package com.facebook.browser.lite.extensions.commercecheckout.constant;

import X.11T;
import X.1BL;
import X.7zM;
import X.C04v;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MetaCheckoutRequest.class */
public final class MetaCheckoutRequest extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(51);
    public final Integer A00;
    public final String A01;

    public MetaCheckoutRequest(Integer num, String str) {
        11T.A0F(num, 1);
        this.A00 = num;
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MetaCheckoutRequest)) {
                return false;
            }
            MetaCheckoutRequest metaCheckoutRequest = (MetaCheckoutRequest) obj;
            if (this.A00 != metaCheckoutRequest.A00 || !11T.A0O(this.A01, metaCheckoutRequest.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int intValue = this.A00.intValue();
        return (7zM.A04(1 != intValue ? "LOAD_URL" : "IGNORE_META_CHECKOUT", intValue) * 31) + 1BL.A05(this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(1 - this.A00.intValue() != 0 ? "LOAD_URL" : "IGNORE_META_CHECKOUT");
        parcel.writeString(this.A01);
    }
}
