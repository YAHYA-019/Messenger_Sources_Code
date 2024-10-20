package com.facebook.user.model;

import X.1BL;
import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: UserFbidIdentifier.class */
public final class UserFbidIdentifier implements Parcelable, UserIdentifier {
    public static final Parcelable.Creator CREATOR = new C2xc(56);
    public final String A00;

    public UserFbidIdentifier(Parcel parcel) {
        this.A00 = parcel.readString();
    }

    public UserFbidIdentifier(String str) {
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof UserFbidIdentifier)) {
                return false;
            }
            String str = this.A00;
            String str2 = ((UserFbidIdentifier) obj).A00;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
        }
        return true;
    }

    @Override // com.facebook.user.model.UserIdentifier
    public String getId() {
        return this.A00;
    }

    public int hashCode() {
        return 1BL.A06(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }
}
