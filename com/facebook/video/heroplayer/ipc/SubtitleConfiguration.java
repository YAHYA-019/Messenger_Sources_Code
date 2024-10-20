package com.facebook.video.heroplayer.ipc;

import X.1BL;
import X.4YV;
import X.FKb;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: SubtitleConfiguration.class */
public final class SubtitleConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKb.A00(13);
    public final Uri A00;
    public final String A01;
    public final boolean A02;

    public SubtitleConfiguration(Parcel parcel) {
        this.A00 = (Uri) 1BL.A0C(parcel, Uri.class);
        this.A01 = parcel.readString();
        this.A02 = 4YV.A1U(parcel.readByte());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
        parcel.writeByte(this.A02 ? (byte) 1 : (byte) 0);
    }
}
