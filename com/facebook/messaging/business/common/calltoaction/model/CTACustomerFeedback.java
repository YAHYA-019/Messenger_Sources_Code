package com.facebook.messaging.business.common.calltoaction.model;

import X.11T;
import X.1BL;
import X.BL7;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.business.customerfeedback.model.CustomerFeedbackPageData;
import com.facebook.messaging.business.customerfeedback.model.CustomerFeedbackPrivacy;

/* loaded from: CTACustomerFeedback.class */
public final class CTACustomerFeedback implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSW(25);
    public final int A00;
    public final CustomerFeedbackPageData A01;
    public final CustomerFeedbackPrivacy A02;
    public final String A03;
    public final String A04;
    public final int A05;
    public final BL7 A06;

    public CTACustomerFeedback(BL7 bl7, CustomerFeedbackPageData customerFeedbackPageData, CustomerFeedbackPrivacy customerFeedbackPrivacy, String str, String str2, int i, int i2) {
        this.A00 = i;
        this.A05 = i2;
        this.A04 = str2;
        this.A03 = str;
        this.A06 = bl7;
        this.A01 = customerFeedbackPageData;
        this.A02 = customerFeedbackPrivacy;
    }

    public CTACustomerFeedback(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A05 = parcel.readInt();
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        this.A06 = parcel.readSerializable();
        this.A01 = (CustomerFeedbackPageData) 1BL.A0C(parcel, CustomerFeedbackPageData.class);
        this.A02 = (CustomerFeedbackPrivacy) 1BL.A0C(parcel, CustomerFeedbackPrivacy.class);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeSerializable(this.A06);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
    }
}
