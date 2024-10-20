package com.facebook.messaging.model.threads;

import X.C1pq;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: NewFriendBumpThreadData.class */
public final class NewFriendBumpThreadData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(67);
    public final long A00;
    public final boolean A01;

    public NewFriendBumpThreadData(long j, boolean z) {
        this.A00 = j;
        this.A01 = z;
    }

    public NewFriendBumpThreadData(Parcel parcel) {
        getClass().getClassLoader();
        this.A00 = parcel.readLong();
        this.A01 = parcel.readInt() != 1 ? false : true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof NewFriendBumpThreadData)) {
                return false;
            }
            NewFriendBumpThreadData newFriendBumpThreadData = (NewFriendBumpThreadData) obj;
            if (this.A00 != newFriendBumpThreadData.A00 || this.A01 != newFriendBumpThreadData.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        long j = this.A00;
        return C1pq.A02(((int) (j ^ (j >>> 32))) + 31, this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }
}
