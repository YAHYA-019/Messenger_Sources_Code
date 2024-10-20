package com.facebook.browsertonativesso;

import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: BrowserToNativeSSOTokens.class */
public class BrowserToNativeSSOTokens implements Parcelable {
    public static final Parcelable.Creator CREATOR = new DKf(62);
    public final String encryptedToken;
    public final String plainTextToken;

    public BrowserToNativeSSOTokens() {
        this.plainTextToken = null;
        this.encryptedToken = null;
    }

    public BrowserToNativeSSOTokens(Parcel parcel) {
        this.plainTextToken = parcel.readString();
        this.encryptedToken = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.plainTextToken);
        parcel.writeString(this.encryptedToken);
    }
}
