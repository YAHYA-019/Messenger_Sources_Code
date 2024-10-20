package com.facebook.contacts.server;

import X.1JW;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableSet;

/* loaded from: FetchContactsParams.class */
public final class FetchContactsParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKX(46);
    public final ImmutableSet A00;

    public FetchContactsParams(Parcel parcel) {
        this.A00 = ImmutableSet.A07(parcel.createStringArrayList());
    }

    public FetchContactsParams(ImmutableSet immutableSet) {
        this.A00 = immutableSet;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(1JW.A02(this.A00));
    }
}
