package com.facebook.messaging.model.threads;

import X.11T;
import X.Bpy;
import X.C1pq;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: SyncedGroupData.class */
public final class SyncedGroupData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(72);
    public final long A00;
    public final String A01;
    public final boolean A02;

    public SyncedGroupData(Bpy bpy) {
        this.A00 = bpy.A00;
        this.A01 = bpy.A01;
        this.A02 = bpy.A02;
    }

    public SyncedGroupData(Parcel parcel) {
        getClass().getClassLoader();
        this.A00 = parcel.readLong();
        this.A01 = parcel.readInt() == 0 ? null : parcel.readString();
        this.A02 = parcel.readInt() != 1 ? false : true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SyncedGroupData)) {
                return false;
            }
            SyncedGroupData syncedGroupData = (SyncedGroupData) obj;
            if (this.A00 != syncedGroupData.A00 || !11T.A0O(this.A01, syncedGroupData.A01) || this.A02 != syncedGroupData.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        long j = this.A00;
        return C1pq.A02(C1pq.A04(this.A01, ((int) (j ^ (j >>> 32))) + 31), this.A02);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
        String str = this.A01;
        if (str == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str);
        }
        parcel.writeInt(this.A02 ? 1 : 0);
    }
}
