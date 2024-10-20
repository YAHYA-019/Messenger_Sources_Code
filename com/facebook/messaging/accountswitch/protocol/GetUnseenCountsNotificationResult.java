package com.facebook.messaging.accountswitch.protocol;

import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: GetUnseenCountsNotificationResult.class */
public final class GetUnseenCountsNotificationResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSR.A00(86);
    public final int A00;
    public final String A01;
    public final String A02;

    public GetUnseenCountsNotificationResult(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readInt();
    }

    public GetUnseenCountsNotificationResult(String str, String str2, int i) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
    }
}
