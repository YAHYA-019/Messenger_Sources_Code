package com.google.android.exoplayer2.metadata.icy;

import X.1BK;
import X.6Y2;
import X.6Yl;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;

/* loaded from: IcyInfo.class */
public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = LGn.A00(34);
    public final String A00;
    public final String A01;
    public final byte[] A02;

    public IcyInfo(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        this.A02 = createByteArray;
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public IcyInfo(String str, String str2, byte[] bArr) {
        this.A02 = bArr;
        this.A00 = str;
        this.A01 = str2;
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
    public void CXq(6Y2 r302) {
        String str = this.A00;
        if (str != null) {
            r302.A0F = str;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.A02, ((IcyInfo) obj).A02);
    }

    public int hashCode() {
        return Arrays.hashCode(this.A02);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", 1BK.A1a(this.A00, this.A01, this.A02.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
