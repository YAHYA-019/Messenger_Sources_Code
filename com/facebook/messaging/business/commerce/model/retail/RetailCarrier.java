package com.facebook.messaging.business.commerce.model.retail;

import X.11T;
import X.1BK;
import X.1BL;
import X.CSW;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.business.attachments.generic.model.LogoImage;

/* loaded from: RetailCarrier.class */
public final class RetailCarrier implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSW(21);
    public final Uri A00;
    public final LogoImage A01;
    public final String A02;
    public final String A03;

    public RetailCarrier(Uri uri, LogoImage logoImage, String str, String str2) {
        if (str2 == null) {
            throw 1BK.A0h();
        }
        this.A03 = str2;
        this.A01 = logoImage;
        this.A00 = uri;
        this.A02 = str;
    }

    public RetailCarrier(Parcel parcel) {
        String readString = parcel.readString();
        if (readString == null) {
            throw 1BK.A0h();
        }
        this.A03 = readString;
        this.A01 = (LogoImage) 1BL.A0C(parcel, LogoImage.class);
        this.A00 = (Uri) 1BL.A0C(parcel, Uri.class);
        this.A02 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
    }
}
