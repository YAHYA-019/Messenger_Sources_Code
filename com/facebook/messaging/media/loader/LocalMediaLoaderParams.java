package com.facebook.messaging.media.loader;

import X.1BL;
import X.C53v;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ui.media.attachments.source.MediaResourceSendSource;

/* loaded from: LocalMediaLoaderParams.class */
public final class LocalMediaLoaderParams implements Parcelable {
    public static final LocalMediaLoaderParams A07;
    public static final MediaResourceSendSource A08;
    public static final Parcelable.Creator CREATOR;
    public final int A00;
    public final long A01;
    public final MediaResourceSendSource A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    static {
        MediaResourceSendSource mediaResourceSendSource = MediaResourceSendSource.A03;
        A08 = mediaResourceSendSource;
        A07 = new LocalMediaLoaderParams(mediaResourceSendSource, null, (-1) >>> 1, -1, true, true);
        CREATOR = new CSV(21);
    }

    public LocalMediaLoaderParams(Parcel parcel) {
        this.A05 = C53v.A0S(parcel);
        this.A04 = C53v.A0S(parcel);
        this.A06 = C53v.A0S(parcel);
        this.A00 = parcel.readInt();
        this.A03 = parcel.readString();
        this.A02 = (MediaResourceSendSource) 1BL.A0C(parcel, MediaResourceSendSource.class);
        this.A01 = parcel.readLong();
    }

    public LocalMediaLoaderParams(MediaResourceSendSource mediaResourceSendSource, String str, int i, long j, boolean z, boolean z2) {
        this.A05 = true;
        this.A04 = z;
        this.A06 = z2;
        this.A00 = i;
        this.A03 = str;
        this.A02 = mediaResourceSendSource;
        this.A01 = j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A02, i);
        parcel.writeLong(this.A01);
    }
}
