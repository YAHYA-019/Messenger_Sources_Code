package com.facebookpay.common.recyclerview.adapteritems;

import X.11T;
import X.1BL;
import X.AbN;
import X.C3o5;
import X.KP0;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: SelectionHeaderItem.class */
public final class SelectionHeaderItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = LGp.A00(22);
    public Integer A00;
    public String A01;
    public String A02;
    public final Integer A03;
    public final KP0 A04;

    public SelectionHeaderItem(KP0 kp0, Integer num, Integer num2, String str, String str2) {
        C3o5.A0k(kp0, 1, num2);
        this.A04 = kp0;
        this.A01 = str;
        this.A00 = num;
        this.A02 = str2;
        this.A03 = num2;
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public KP0 AsX() {
        return this.A04;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        String str;
        11T.A0F(parcel, 0);
        1BL.A12(parcel, this.A04);
        parcel.writeString(this.A01);
        parcel.writeInt(AbN.A01(parcel, this.A00));
        parcel.writeString(this.A02);
        switch (this.A03.intValue()) {
            case 0:
                str = "CREDENTIAL_TYPE_HEADER";
                break;
            case 1:
                str = "SECTION_HEADER";
                break;
            case 2:
                str = "ACCORDION_HEADER";
                break;
            case 3:
                str = "ACCORDION_HEADER_NO_RIGHT_ADDON";
                break;
            case 4:
                str = "PICKUP_CONTACT_HEADER";
                break;
            default:
                str = "ORDER_SUMMARY_HEADER_WITH_PICKUP";
                break;
        }
        parcel.writeString(str);
    }
}
