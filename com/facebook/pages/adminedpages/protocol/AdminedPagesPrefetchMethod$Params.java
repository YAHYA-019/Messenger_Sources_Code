package com.facebook.pages.adminedpages.protocol;

import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AdminedPagesPrefetchMethod$Params.class */
public final class AdminedPagesPrefetchMethod$Params implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKY(17);
    public final int A00;
    public final String A01;

    public AdminedPagesPrefetchMethod$Params() {
        this.A00 = 128;
        this.A01 = null;
    }

    public AdminedPagesPrefetchMethod$Params(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeString(this.A01);
    }
}
