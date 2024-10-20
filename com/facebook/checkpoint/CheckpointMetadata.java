package com.facebook.checkpoint;

import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CheckpointMetadata.class */
public final class CheckpointMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new DKf(94);
    public String A00;
    public boolean A01;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }
}
