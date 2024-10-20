package com.facebook.messaging.service.model;

import X.4YV;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.user.model.UserFbidIdentifier;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: AddMembersResult.class */
public final class AddMembersResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(74);
    public final long A00;
    public final ImmutableList A01;

    public AddMembersResult(Parcel parcel) {
        this.A00 = parcel.readLong();
        ArrayList A0y = 4YV.A0y(parcel, UserFbidIdentifier.class);
        this.A01 = A0y != null ? ImmutableList.copyOf((Collection) A0y) : ImmutableList.of();
    }

    public AddMembersResult(ImmutableList immutableList, long j) {
        this.A00 = j;
        this.A01 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
        parcel.writeList(this.A01);
    }
}
