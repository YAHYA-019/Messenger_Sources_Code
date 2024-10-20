package com.facebook.account.simplerecovery.flashcall.model;

import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FlashCallCliFilter.class */
public class FlashCallCliFilter implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LGo(80);
    public String mCliFilter = "";
    public String mEncryptedPhoneNumber = "";

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mCliFilter);
        parcel.writeString(this.mEncryptedPhoneNumber);
    }
}
