package com.facebook.user.model;

import X.1BL;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ManagingParent.class */
public class ManagingParent implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKe(95);
    public final String mId;

    public ManagingParent() {
        this.mId = "";
    }

    public ManagingParent(Parcel parcel) {
        this.mId = parcel.readString();
    }

    public ManagingParent(String str) {
        this.mId = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            String str = this.mId;
            String str2 = ((ManagingParent) obj).mId;
            if (str != null) {
                z = str.equals(str2);
            } else if (str2 != null) {
                return false;
            }
        }
        return z;
    }

    public int hashCode() {
        return 1BL.A06(this.mId);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mId);
    }
}
