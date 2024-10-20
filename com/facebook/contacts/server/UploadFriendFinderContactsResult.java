package com.facebook.contacts.server;

import X.1BL;
import X.FKX;
import X.Qpy;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: UploadFriendFinderContactsResult.class */
public final class UploadFriendFinderContactsResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(56);
    public final String A00;
    public final Qpy A01;

    public UploadFriendFinderContactsResult(Qpy qpy, String str) {
        this.A00 = str;
        this.A01 = qpy;
    }

    public UploadFriendFinderContactsResult(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = Enum.valueOf(Qpy.class, parcel.readString());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        1BL.A12(parcel, this.A01);
    }
}
