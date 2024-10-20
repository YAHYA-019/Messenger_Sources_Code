package com.facebook.platform.server.protocol;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.FKW;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: UploadStagingResourcePhotoMethod$Params.class */
public final class UploadStagingResourcePhotoMethod$Params implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKW.A00(46);
    public final Bitmap A00;
    public final String A01;

    public UploadStagingResourcePhotoMethod$Params(Parcel parcel) {
        String readString = parcel.readString();
        if (readString == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A01 = readString;
        Parcelable readParcelable = parcel.readParcelable(null);
        if (readParcelable == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A00 = (Bitmap) readParcelable;
    }

    public UploadStagingResourcePhotoMethod$Params(String str, Bitmap bitmap) {
        1BL.A1F(str, bitmap);
        this.A01 = str;
        this.A00 = bitmap;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }
}
