package com.facebook.browser.lite.ipc;

import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PrefetchCacheEntry.class */
public final class PrefetchCacheEntry implements Parcelable {
    public static final Parcelable.Creator CREATOR = new DKf(55);
    public String A00;
    public String A01;
    public String A02;
    public String A03;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
    }
}
