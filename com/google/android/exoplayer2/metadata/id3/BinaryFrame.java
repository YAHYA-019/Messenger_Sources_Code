package com.google.android.exoplayer2.metadata.id3;

import X.AbstractC2326GOr;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: BinaryFrame.class */
public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = LGn.A00(36);
    public final byte[] A00;

    public BinaryFrame(Parcel parcel) {
        super(parcel.readString());
        this.A00 = parcel.createByteArray();
    }

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.A00 = bArr;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            BinaryFrame binaryFrame = (BinaryFrame) obj;
            if (!super.A00.equals(((Id3Frame) binaryFrame).A00) || !Arrays.equals(this.A00, binaryFrame.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AbstractC2326GOr.A07(super.A00) + Arrays.hashCode(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(super.A00);
        parcel.writeByteArray(this.A00);
    }
}
