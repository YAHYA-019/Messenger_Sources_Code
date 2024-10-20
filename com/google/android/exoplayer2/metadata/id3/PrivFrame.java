package com.google.android.exoplayer2.metadata.id3;

import X.0Pz;
import X.1BL;
import X.AbstractC2326GOr;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* loaded from: PrivFrame.class */
public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = LGn.A00(43);
    public final String A00;
    public final byte[] A01;

    public PrivFrame(Parcel parcel) {
        super("PRIV");
        this.A00 = parcel.readString();
        this.A01 = parcel.createByteArray();
    }

    public PrivFrame(String str, byte[] bArr) {
        super("PRIV");
        this.A00 = str;
        this.A01 = bArr;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            PrivFrame privFrame = (PrivFrame) obj;
            if (!Util.A0P(this.A00, privFrame.A00) || !Arrays.equals(this.A01, privFrame.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AbstractC2326GOr.A03(1BL.A06(this.A00)) + Arrays.hashCode(this.A01);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return 0Pz.A0j(super.A00, ": owner=", this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeByteArray(this.A01);
    }
}
