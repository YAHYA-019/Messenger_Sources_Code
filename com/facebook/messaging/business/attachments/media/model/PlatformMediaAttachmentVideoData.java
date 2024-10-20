package com.facebook.messaging.business.attachments.media.model;

import X.11T;
import X.1BL;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: PlatformMediaAttachmentVideoData.class */
public final class PlatformMediaAttachmentVideoData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSW(11);
    public final double A00;
    public final double A01;
    public final double A02;
    public final int A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public PlatformMediaAttachmentVideoData(Parcel parcel) {
        this.A07 = parcel.readString();
        this.A04 = parcel.readString();
        this.A03 = parcel.readInt();
        this.A02 = parcel.readDouble();
        this.A00 = parcel.readDouble();
        this.A06 = parcel.readString();
        this.A01 = parcel.readDouble();
        this.A05 = parcel.readString();
    }

    public PlatformMediaAttachmentVideoData(String str, String str2, String str3, double d, double d2, double d3, int i) {
        this.A07 = str3;
        this.A04 = str;
        this.A03 = i;
        this.A02 = d3;
        this.A00 = d;
        this.A06 = str2;
        this.A01 = d2;
        this.A05 = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !1BL.A1V(this, obj)) {
                return false;
            }
            PlatformMediaAttachmentVideoData platformMediaAttachmentVideoData = (PlatformMediaAttachmentVideoData) obj;
            if (!11T.A0O(this.A07, platformMediaAttachmentVideoData.A07) || !11T.A0O(this.A04, platformMediaAttachmentVideoData.A04) || this.A03 != platformMediaAttachmentVideoData.A03 || this.A02 != platformMediaAttachmentVideoData.A02 || this.A00 != platformMediaAttachmentVideoData.A00 || !11T.A0O(this.A06, platformMediaAttachmentVideoData.A06) || this.A01 != platformMediaAttachmentVideoData.A01 || !11T.A0O(this.A05, platformMediaAttachmentVideoData.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.A07, this.A04, Integer.valueOf(this.A03), Double.valueOf(this.A02), Double.valueOf(this.A00), this.A06, Double.valueOf(this.A01), this.A05});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A07);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A03);
        parcel.writeDouble(this.A02);
        parcel.writeDouble(this.A00);
        parcel.writeString(this.A06);
        parcel.writeDouble(this.A01);
        parcel.writeString(this.A05);
    }
}
