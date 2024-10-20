package com.facebook.iorg.common.upsell.model;

import X.0S2;
import X.AnonymousClass001;
import X.EW8;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* loaded from: ZeroPromoParams.class */
public final class ZeroPromoParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKc.A00(77);
    public Integer A00;
    public String A01;
    public final String A02;

    public ZeroPromoParams() {
        this.A02 = "";
        this.A01 = "";
        this.A00 = 0S2.A00;
    }

    public ZeroPromoParams(Parcel parcel) {
        Integer num;
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        String readString = parcel.readString();
        if (readString != null) {
            Integer[] A00 = 0S2.A00(2);
            int length = A00.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    break;
                }
                num = A00[i2];
                if (readString.equalsIgnoreCase(EW8.A00(num))) {
                    break;
                } else {
                    i = i2 + 1;
                }
            }
        }
        num = 0S2.A00;
        this.A00 = num;
    }

    public ZeroPromoParams(Integer num, String str) {
        this.A02 = null;
        this.A01 = str;
        this.A00 = num;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ZeroPromoParams{mEncodedPhone='");
        A0k.append(this.A02);
        A0k.append('\'');
        A0k.append(", mPromoId='");
        A0k.append(this.A01);
        A0k.append('\'');
        A0k.append(", mLocation=");
        Integer num = this.A00;
        A0k.append(num != null ? 1 - num.intValue() != 0 ? OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID : "INTERSTITIAL" : "null");
        return AnonymousClass001.A0f(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(EW8.A00(this.A00));
    }
}
