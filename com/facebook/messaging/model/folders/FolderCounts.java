package com.facebook.messaging.model.folders;

import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;

/* loaded from: FolderCounts.class */
public final class FolderCounts implements Parcelable {
    public static final FolderCounts A03 = new FolderCounts(0, 0, 0);
    public static final Parcelable.Creator CREATOR = new C2xc(23);
    public final int A00;
    public final int A01;
    public final long A02;

    public FolderCounts(int i, int i2, long j) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
    }

    public FolderCounts(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A02 = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("unseen", this.A01);
        stringHelper.add("unread", this.A00);
        stringHelper.add("lastSeenTime", this.A02);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeLong(this.A02);
    }
}
