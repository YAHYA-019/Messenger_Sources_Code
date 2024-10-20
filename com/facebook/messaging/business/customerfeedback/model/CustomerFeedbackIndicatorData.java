package com.facebook.messaging.business.customerfeedback.model;

import X.11T;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CustomerFeedbackIndicatorData.class */
public final class CustomerFeedbackIndicatorData implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSW.A00(30);
    public final String A00;
    public final String A01;
    public final String A02;

    public CustomerFeedbackIndicatorData(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public CustomerFeedbackIndicatorData(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
