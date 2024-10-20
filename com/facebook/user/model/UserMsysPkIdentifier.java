package com.facebook.user.model;

import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: UserMsysPkIdentifier.class */
public final class UserMsysPkIdentifier implements Parcelable, UserIdentifier {
    public static final Parcelable.Creator CREATOR = new C2xc(58);
    public final Long A00;

    public UserMsysPkIdentifier(long j) {
        this.A00 = Long.valueOf(j);
    }

    public UserMsysPkIdentifier(Parcel parcel) {
        this.A00 = Long.valueOf(parcel.readLong());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof UserMsysPkIdentifier)) {
                return false;
            }
            Long l = this.A00;
            Long l2 = ((UserMsysPkIdentifier) obj).A00;
            if (l != null) {
                if (!l.equals(l2)) {
                    return false;
                }
            } else if (l2 != null) {
                return false;
            }
        }
        return true;
    }

    @Override // com.facebook.user.model.UserIdentifier
    public String getId() {
        return String.valueOf(this.A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00.longValue());
    }
}
