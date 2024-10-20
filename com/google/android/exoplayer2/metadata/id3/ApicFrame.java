package com.google.android.exoplayer2.metadata.id3;

import X.0Pz;
import X.1BL;
import X.AbstractC2326GOr;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* loaded from: ApicFrame.class */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = LGn.A00(35);
    public final int A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;

    public ApicFrame(int i, byte[] bArr, String str, String str2) {
        super("APIC");
        this.A02 = str;
        this.A01 = str2;
        this.A00 = i;
        this.A03 = bArr;
    }

    public ApicFrame(Parcel parcel) {
        super("APIC");
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A03 = parcel.createByteArray();
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ApicFrame apicFrame = (ApicFrame) obj;
            if (this.A00 != apicFrame.A00 || !Util.A0P(this.A02, apicFrame.A02) || !Util.A0P(this.A01, apicFrame.A01) || !Arrays.equals(this.A03, apicFrame.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A03 = (AbstractC2326GOr.A03(this.A00) + 1BL.A06(this.A02)) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return ((A03 + i) * 31) + Arrays.hashCode(this.A03);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return 0Pz.A0z(super.A00, ": mimeType=", this.A02, ", description=", this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeByteArray(this.A03);
    }
}
