package com.google.android.exoplayer2.metadata.id3;

import X.0Pz;
import X.1BL;
import X.AbstractC2326GOr;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* loaded from: GeobFrame.class */
public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = LGn.A00(40);
    public final String A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;

    public GeobFrame(Parcel parcel) {
        super("GEOB");
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A03 = parcel.createByteArray();
    }

    public GeobFrame(String str, byte[] bArr, String str2, String str3) {
        super("GEOB");
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
        this.A03 = bArr;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            GeobFrame geobFrame = (GeobFrame) obj;
            if (!Util.A0P(this.A02, geobFrame.A02) || !Util.A0P(this.A01, geobFrame.A01) || !Util.A0P(this.A00, geobFrame.A00) || !Arrays.equals(this.A03, geobFrame.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A03 = (AbstractC2326GOr.A03(1BL.A06(this.A02)) + 1BL.A06(this.A01)) * 31;
        String str = this.A00;
        if (str != null) {
            i = str.hashCode();
        }
        return ((A03 + i) * 31) + Arrays.hashCode(this.A03);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return 0Pz.A12(super.A00, ": mimeType=", this.A02, ", filename=", this.A01, ", description=", this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeByteArray(this.A03);
    }
}
