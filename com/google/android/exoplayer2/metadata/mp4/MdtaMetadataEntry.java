package com.google.android.exoplayer2.metadata.mp4;

import X.0Pz;
import X.6Y2;
import X.6Yl;
import X.AbstractC2326GOr;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;

/* loaded from: MdtaMetadataEntry.class */
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = LGn.A00(46);
    public final int A00;
    public final int A01;
    public final String A02;
    public final byte[] A03;

    public MdtaMetadataEntry(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A03 = parcel.createByteArray();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    public MdtaMetadataEntry(String str, byte[] bArr, int i, int i2) {
        this.A02 = str;
        this.A03 = bArr;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ byte[] BL1() {
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ 6Yl BL2() {
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ void CXq(6Y2 r302) {
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
            MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
            if (!this.A02.equals(mdtaMetadataEntry.A02) || !Arrays.equals(this.A03, mdtaMetadataEntry.A03) || this.A00 != mdtaMetadataEntry.A00 || this.A01 != mdtaMetadataEntry.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((AbstractC2326GOr.A07(this.A02) + Arrays.hashCode(this.A03)) * 31) + this.A00) * 31) + this.A01;
    }

    public String toString() {
        return 0Pz.A0W("mdta: key=", this.A02);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeByteArray(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
