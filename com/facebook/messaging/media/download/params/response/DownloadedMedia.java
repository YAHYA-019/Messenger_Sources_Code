package com.facebook.messaging.media.download.params.response;

import X.11T;
import X.CSV;
import X.R0r;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: DownloadedMedia.class */
public final class DownloadedMedia implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(17);
    public final Uri A00;
    public final Integer A01;

    public DownloadedMedia(Uri uri, Integer num) {
        11T.A0F(num, 1);
        this.A01 = num;
        this.A00 = uri;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(R0r.A00(this.A01));
        parcel.writeParcelable(this.A00, i);
    }
}
