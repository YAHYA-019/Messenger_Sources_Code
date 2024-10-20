package com.facebook.messaging.business.attachments.generic.model;

import X.1BL;
import X.CSW;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: LogoImage.class */
public final class LogoImage implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSW(7);
    public final int A00;
    public final int A01;
    public final Uri A02;

    public LogoImage(Uri uri, int i, int i2) {
        this.A02 = uri;
        this.A01 = i2;
        this.A00 = i;
    }

    public LogoImage(Parcel parcel) {
        this.A02 = (Uri) 1BL.A0C(parcel, Uri.class);
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A02, i);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }
}
