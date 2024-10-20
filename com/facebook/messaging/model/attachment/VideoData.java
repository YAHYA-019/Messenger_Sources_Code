package com.facebook.messaging.model.attachment;

import X.C48g;
import X.C4Ny;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;
import java.util.Arrays;

/* loaded from: VideoData.class */
public final class VideoData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C4Ny(15);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public Uri A09;
    public Uri A0A;
    public Uri A0B;
    public Uri A0C;
    public C48g A0D;
    public String A0E;
    public String A0F;
    public String A0G;

    public VideoData(Uri uri, Uri uri2, C48g c48g, String str, int i, int i2, int i3, int i4, int i5) {
        this.A08 = i;
        this.A05 = i2;
        this.A07 = i3;
        this.A03 = i4;
        this.A06 = i5;
        this.A0D = c48g;
        this.A0B = uri;
        this.A0C = uri2;
        this.A0F = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            VideoData videoData = (VideoData) obj;
            if (this.A08 != videoData.A08 || this.A05 != videoData.A05 || this.A07 != videoData.A07 || this.A03 != videoData.A03 || this.A02 != videoData.A02 || this.A06 != videoData.A06 || !Objects.equal(this.A0D, videoData.A0D) || !Objects.equal(this.A0B, videoData.A0B) || !Objects.equal(this.A0G, videoData.A0G) || !Objects.equal(this.A0C, videoData.A0C) || !Objects.equal(this.A0A, videoData.A0A) || !Objects.equal(this.A0F, videoData.A0F) || this.A01 != videoData.A01 || this.A04 != videoData.A04 || this.A00 != videoData.A00 || !Objects.equal(this.A09, videoData.A09) || !Objects.equal(this.A0E, videoData.A0E)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A08), Integer.valueOf(this.A05), Integer.valueOf(this.A07), Integer.valueOf(this.A03), Integer.valueOf(this.A02), Integer.valueOf(this.A06), this.A0D, this.A0B, this.A0G, this.A0C, this.A0A, this.A0F, Integer.valueOf(this.A01), Integer.valueOf(this.A04), Integer.valueOf(this.A00), this.A09, this.A0E});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A08);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A06);
        parcel.writeString(this.A0D.name());
        parcel.writeParcelable(this.A0B, i);
        parcel.writeString(this.A0G);
        parcel.writeParcelable(this.A0C, i);
        parcel.writeParcelable(this.A0A, i);
        parcel.writeString(this.A0F);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A09, i);
        parcel.writeString(this.A0E);
    }
}
