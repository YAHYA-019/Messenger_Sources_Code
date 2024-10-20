package com.facebook.messaging.montage.model;

import X.11T;
import X.C1pq;
import X.C4Ny;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.user.model.UserKey;

/* loaded from: MontageUser.class */
public final class MontageUser implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C4Ny(25);
    public final long A00;
    public final UserKey A01;
    public final String A02;

    public MontageUser(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        this.A00 = parcel.readLong();
        this.A01 = (UserKey) parcel.readParcelable(classLoader);
        this.A02 = parcel.readString();
    }

    public MontageUser(UserKey userKey, String str, long j) {
        this.A00 = j;
        C1pq.A08("userKey", userKey);
        this.A01 = userKey;
        C1pq.A08("userName", str);
        this.A02 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MontageUser)) {
                return false;
            }
            MontageUser montageUser = (MontageUser) obj;
            if (this.A00 != montageUser.A00 || !11T.A0O(this.A01, montageUser.A01) || !11T.A0O(this.A02, montageUser.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        long j = this.A00;
        return C1pq.A04(this.A02, C1pq.A04(this.A01, ((int) (j ^ (j >>> 32))) + 31));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A02);
    }
}
