package com.facebook.messaging.model.attachment;

import X.48R;
import X.C4Ny;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;
import java.util.Arrays;

/* loaded from: ImageData.class */
public final class ImageData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C4Ny(13);
    public final int A00;
    public final int A01;
    public final AttachmentImageMap A02;
    public final AttachmentImageMap A03;
    public final 48R A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public ImageData(Parcel parcel) {
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A03 = (AttachmentImageMap) parcel.readParcelable(AttachmentImageMap.class.getClassLoader());
        this.A02 = (AttachmentImageMap) parcel.readParcelable(AttachmentImageMap.class.getClassLoader());
        this.A04 = 48R.valueOf(parcel.readString());
        this.A07 = parcel.readInt() != 1 ? false : true;
        this.A06 = parcel.readString();
        this.A05 = parcel.readString();
    }

    public ImageData(AttachmentImageMap attachmentImageMap, AttachmentImageMap attachmentImageMap2, 48R r304, String str, String str2, int i, int i2, boolean z) {
        this.A01 = i;
        this.A00 = i2;
        this.A03 = attachmentImageMap;
        this.A02 = attachmentImageMap2;
        this.A04 = r304;
        this.A07 = z;
        this.A06 = str;
        this.A05 = str2;
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
            ImageData imageData = (ImageData) obj;
            if (this.A01 != imageData.A01 || this.A00 != imageData.A00 || !Objects.equal(this.A03, imageData.A03) || !Objects.equal(this.A02, imageData.A02) || !Objects.equal(this.A04, imageData.A04) || this.A07 != imageData.A07 || !Objects.equal(this.A06, imageData.A06) || !Objects.equal(this.A05, imageData.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A01), Integer.valueOf(this.A00), this.A03, this.A02, this.A04, Boolean.valueOf(this.A07), this.A06, this.A05});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A04.name());
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
    }
}
