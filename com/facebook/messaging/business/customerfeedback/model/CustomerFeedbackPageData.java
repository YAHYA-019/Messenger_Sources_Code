package com.facebook.messaging.business.customerfeedback.model;

import X.11T;
import X.1BL;
import X.BML;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CustomerFeedbackPageData.class */
public final class CustomerFeedbackPageData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSW(31);
    public final CustomerFeedbackFollowUpData A00;
    public final CustomerFeedbackIndicatorData A01;
    public final BML A02;
    public final String A03;
    public final String A04;

    public CustomerFeedbackPageData(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A02 = parcel.readSerializable();
        this.A04 = parcel.readString();
        this.A01 = (CustomerFeedbackIndicatorData) 1BL.A0C(parcel, CustomerFeedbackIndicatorData.class);
        this.A00 = (CustomerFeedbackFollowUpData) 1BL.A0C(parcel, CustomerFeedbackFollowUpData.class);
    }

    public CustomerFeedbackPageData(CustomerFeedbackFollowUpData customerFeedbackFollowUpData, CustomerFeedbackIndicatorData customerFeedbackIndicatorData, BML bml, String str, String str2) {
        this.A03 = str;
        this.A02 = bml;
        this.A04 = str2;
        this.A01 = customerFeedbackIndicatorData;
        this.A00 = customerFeedbackFollowUpData;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeSerializable(this.A02);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
    }
}
