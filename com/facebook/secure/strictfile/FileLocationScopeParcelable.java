package com.facebook.secure.strictfile;

import X.C00X;
import X.C0ph;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FileLocationScopeParcelable.class */
public final class FileLocationScopeParcelable extends C00X implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0ph(4);

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }
}
