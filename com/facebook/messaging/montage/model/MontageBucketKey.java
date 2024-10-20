package com.facebook.messaging.montage.model;

import X.0Pz;
import X.C4Ny;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: MontageBucketKey.class */
public final class MontageBucketKey implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C4Ny(22);
    public final long A00;

    public MontageBucketKey(long j) {
        this.A00 = j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            if (this.A00 != ((MontageBucketKey) obj).A00) {
                z = false;
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A00)});
    }

    public String toString() {
        return 0Pz.A0U("MONTAGE:", this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
    }
}
