package com.facebook.ui.media.attachments.model;

import X.FKe;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ProgressiveJpegResult.class */
public final class ProgressiveJpegResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(87);
    public int A00;
    public int A01;
    public Uri A02;
    public Uri A03;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }
}
