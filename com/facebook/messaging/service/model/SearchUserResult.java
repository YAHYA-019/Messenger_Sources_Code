package com.facebook.messaging.service.model;

import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: SearchUserResult.class */
public final class SearchUserResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(13);
    public ImmutableList A00;
    public ImmutableList A01;
    public ImmutableList A02;
    public ImmutableList A03;
    public String A04;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A01);
        parcel.writeList(this.A02);
        parcel.writeList(this.A00);
        parcel.writeList(this.A03);
        parcel.writeString(this.A04);
    }
}
