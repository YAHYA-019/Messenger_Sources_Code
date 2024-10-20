package com.facebook.ipc.media.data.metaverse;

import X.11T;
import X.1BL;
import X.4YV;
import X.C1pq;
import X.C3o5;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MetaGalleryMetadata.class */
public final class MetaGalleryMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSR(52);
    public final long A00;
    public final HorizonMetadata A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public MetaGalleryMetadata(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A00 = parcel.readLong();
        String str = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (HorizonMetadata) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        this.A03 = parcel.readString();
        this.A04 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A05 = C3o5.A0O(parcel);
    }

    public MetaGalleryMetadata(HorizonMetadata horizonMetadata, String str, String str2, String str3, String str4, long j) {
        this.A00 = j;
        this.A01 = horizonMetadata;
        this.A02 = str;
        C1pq.A08("mediaSource", str2);
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MetaGalleryMetadata)) {
                return false;
            }
            MetaGalleryMetadata metaGalleryMetadata = (MetaGalleryMetadata) obj;
            if (this.A00 != metaGalleryMetadata.A00 || !11T.A0O(this.A01, metaGalleryMetadata.A01) || !11T.A0O(this.A02, metaGalleryMetadata.A02) || !11T.A0O(this.A03, metaGalleryMetadata.A03) || !11T.A0O(this.A04, metaGalleryMetadata.A04) || !11T.A0O(this.A05, metaGalleryMetadata.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        long j = this.A00;
        return C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, ((int) (j ^ (j >>> 32))) + 31)))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
        C3o5.A0d(parcel, this.A01, i);
        1BL.A13(parcel, this.A02);
        parcel.writeString(this.A03);
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
    }
}
