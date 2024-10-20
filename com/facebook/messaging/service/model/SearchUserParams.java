package com.facebook.messaging.service.model;

import X.4YV;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;

/* loaded from: SearchUserParams.class */
public final class SearchUserParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(12);
    public final int A00;
    public final ImmutableSet A01;
    public final String A02;
    public final String A03;

    public SearchUserParams(Parcel parcel) {
        ArrayList A0y = 4YV.A0y(parcel, SearchUserParams.class);
        A0y.getClass();
        this.A01 = ImmutableSet.A07(A0y);
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A00 = parcel.readInt();
    }

    public SearchUserParams(ImmutableSet immutableSet, String str, String str2) {
        this.A01 = immutableSet;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = 20;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A01.asList());
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00);
    }
}
