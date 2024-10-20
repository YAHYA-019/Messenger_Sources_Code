package com.facebook.messaging.attachments;

import X.1BL;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ui.media.attachments.model.MediaResource;

/* loaded from: OtherAttachmentData.class */
public final class OtherAttachmentData implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSR.A00(93);
    public final int A00;
    public final MediaResource A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public OtherAttachmentData(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A06 = parcel.readString();
        this.A01 = (MediaResource) 1BL.A0C(parcel, MediaResource.class);
        this.A05 = parcel.readString();
        this.A04 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A03 = parcel.readString();
    }

    public OtherAttachmentData(MediaResource mediaResource, Integer num, String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        this.A02 = str;
        str5.getClass();
        this.A06 = str5;
        this.A01 = mediaResource;
        str4.getClass();
        this.A05 = str4;
        this.A04 = str3;
        this.A00 = num.intValue();
        this.A03 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A03);
    }
}
