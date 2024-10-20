package com.facebook.messaging.attachments;

import X.1JF;
import X.82M;
import X.C53v;
import X.C61u;
import X.C66a;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.base.Objects;
import java.util.Arrays;

/* loaded from: ImageAttachmentData.class */
public final class ImageAttachmentData implements Parcelable, C61u {
    public static final Parcelable.Creator CREATOR = new 82M(12);
    public Integer A00;
    public String A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final ImageAttachmentUris A05;
    public final ImageAttachmentUris A06;
    public final C66a A07;
    public final C66a A08;
    public final MediaResource A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;

    public ImageAttachmentData(Parcel parcel) {
        this.A06 = (ImageAttachmentUris) parcel.readParcelable(ImageAttachmentUris.class.getClassLoader());
        this.A05 = (ImageAttachmentUris) parcel.readParcelable(ImageAttachmentUris.class.getClassLoader());
        this.A03 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A09 = (MediaResource) parcel.readParcelable(MediaResource.class.getClassLoader());
        this.A0C = parcel.readString();
        boolean z = false;
        this.A0J = parcel.readInt() == 1;
        this.A0E = parcel.readString();
        this.A0A = parcel.readString();
        this.A0D = parcel.readString();
        this.A0G = parcel.readInt() == 1;
        this.A0I = parcel.readInt() == 1 ? true : z;
        this.A04 = parcel.readLong();
        this.A08 = C66a.A00(parcel.readString());
        this.A07 = C66a.A00(parcel.readString());
        this.A0B = parcel.readString();
        this.A0H = C53v.A0S(parcel);
        this.A0F = C53v.A0S(parcel);
        this.A00 = C53v.A08(parcel);
        this.A01 = parcel.readString();
    }

    public ImageAttachmentData(ImageAttachmentUris imageAttachmentUris, ImageAttachmentUris imageAttachmentUris2, C66a c66a, C66a c66a2, MediaResource mediaResource, Integer num, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        imageAttachmentUris2.getClass();
        this.A06 = imageAttachmentUris2;
        this.A05 = imageAttachmentUris;
        this.A03 = i2;
        this.A02 = i;
        this.A09 = mediaResource;
        this.A0C = str3;
        this.A0J = z5;
        this.A0E = str6;
        this.A0A = str;
        this.A0D = str5;
        this.A0G = z2;
        this.A0I = z4;
        this.A04 = j;
        this.A08 = c66a2;
        this.A07 = c66a;
        this.A0B = str2;
        this.A0H = z3;
        this.A0F = z;
        this.A01 = str4;
        this.A00 = num;
    }

    @Override // X.C61u
    public boolean BRl() {
        return !1JF.A0B(this.A0C);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null && (obj instanceof ImageAttachmentData)) {
            ImageAttachmentData imageAttachmentData = (ImageAttachmentData) obj;
            if (Objects.equal(this.A06, imageAttachmentData.A06) && Objects.equal(this.A05, imageAttachmentData.A05) && this.A03 == imageAttachmentData.A03 && this.A02 == imageAttachmentData.A02 && Objects.equal(this.A0C, imageAttachmentData.A0C) && Objects.equal(this.A09, imageAttachmentData.A09) && this.A0J == imageAttachmentData.A0J && Objects.equal(this.A0E, imageAttachmentData.A0E) && Objects.equal(this.A0A, imageAttachmentData.A0A) && Objects.equal(this.A0D, imageAttachmentData.A0D) && this.A0G == imageAttachmentData.A0G && this.A0I == imageAttachmentData.A0I && Objects.equal(this.A0B, imageAttachmentData.A0B) && this.A0H == imageAttachmentData.A0H && this.A0F == imageAttachmentData.A0F && Objects.equal(this.A00, imageAttachmentData.A00) && Objects.equal(this.A01, imageAttachmentData.A01)) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A06, this.A05, Integer.valueOf(this.A03), Integer.valueOf(this.A02), this.A0C, this.A09, Boolean.valueOf(this.A0J), this.A0E, this.A0A, this.A0D, Boolean.valueOf(this.A0G), Boolean.valueOf(this.A0I), this.A0B, Boolean.valueOf(this.A0H), Boolean.valueOf(this.A0F), this.A01, this.A00});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A06, i);
        parcel.writeParcelable(this.A05, i);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeParcelable(this.A09, i);
        parcel.writeString(this.A0C);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0D);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeLong(this.A04);
        C66a c66a = this.A08;
        String str = null;
        parcel.writeString(c66a != null ? c66a.stringValue : null);
        C66a c66a2 = this.A07;
        if (c66a2 != null) {
            str = c66a2.stringValue;
        }
        parcel.writeString(str);
        parcel.writeString(this.A0B);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A0F ? 1 : 0);
        C53v.A0K(parcel, this.A00);
        parcel.writeString(this.A01);
    }
}
