package com.facebook.messaging.service.model;

import X.AbN;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableList;

/* loaded from: IgnoreMessageRequestsParams.class */
public final class IgnoreMessageRequestsParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(2);
    public final ImmutableList A00;
    public final String A01;

    public IgnoreMessageRequestsParams(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = AbN.A0e(parcel, ThreadKey.class);
    }

    public IgnoreMessageRequestsParams(ImmutableList immutableList, String str) {
        this.A00 = immutableList;
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeList(this.A00);
    }
}
