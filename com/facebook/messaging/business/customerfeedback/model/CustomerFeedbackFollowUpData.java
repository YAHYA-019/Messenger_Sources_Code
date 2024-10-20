package com.facebook.messaging.business.customerfeedback.model;

import X.11T;
import X.C2b;
import X.CSW;
import X.Qnv;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CustomerFeedbackFollowUpData.class */
public final class CustomerFeedbackFollowUpData implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSW.A00(29);
    public final Qnv A00;
    public final String A01;

    public CustomerFeedbackFollowUpData(C2b c2b) {
        this.A00 = c2b.A00;
        this.A01 = c2b.A01;
    }

    public CustomerFeedbackFollowUpData(Parcel parcel) {
        this.A00 = parcel.readSerializable();
        this.A01 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeSerializable(this.A00);
        parcel.writeString(this.A01);
    }
}
