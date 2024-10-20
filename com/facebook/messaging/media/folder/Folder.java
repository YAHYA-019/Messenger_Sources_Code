package com.facebook.messaging.media.folder;

import X.11T;
import X.CSV;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: Folder.class */
public final class Folder implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSV.A00(18);
    public int A00;
    public final long A01;
    public final Uri A02;
    public final String A03;
    public final String A04;

    public Folder(Uri uri, String str, String str2, int i, long j) {
        this.A03 = str;
        this.A04 = str2;
        this.A02 = uri;
        this.A00 = i;
        this.A01 = j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A02, 0);
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A01);
    }
}
