package com.facebook.payments.picker.option;

import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Platform;
import com.google.common.base.Preconditions;

/* loaded from: PaymentsPickerOption.class */
public final class PaymentsPickerOption implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(79);
    public final String A00;
    public final String A01;

    public PaymentsPickerOption(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public PaymentsPickerOption(String str, String str2) {
        Preconditions.checkArgument(!Platform.stringIsNullOrEmpty(str), "Null or empty id provided.");
        Preconditions.checkArgument(!Platform.stringIsNullOrEmpty(str2), "Null or empty title provided.");
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
