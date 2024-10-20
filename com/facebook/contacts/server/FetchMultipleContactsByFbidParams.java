package com.facebook.contacts.server;

import X.1He;
import X.1JW;
import X.4YV;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableSet;

/* loaded from: FetchMultipleContactsByFbidParams.class */
public final class FetchMultipleContactsByFbidParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKX(50);
    public final 1He A00;
    public final ImmutableSet A01;

    public FetchMultipleContactsByFbidParams(1He r302, ImmutableSet immutableSet) {
        this.A01 = immutableSet;
        this.A00 = r302;
    }

    public FetchMultipleContactsByFbidParams(Parcel parcel) {
        this.A01 = ImmutableSet.A07(4YV.A0y(parcel, UserKey.class));
        this.A00 = 1He.valueOf(parcel.readString());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(1JW.A02(this.A01));
        parcel.writeString(this.A00.toString());
    }
}
