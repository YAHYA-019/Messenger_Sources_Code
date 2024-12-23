package com.google.android.exoplayer2.metadata.id3;

import X.AbstractC2326GOr;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: MlltFrame.class */
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = LGn.A00(42);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int[] A03;
    public final int[] A04;

    public MlltFrame(Parcel parcel) {
        super("MLLT");
        this.A02 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A03 = parcel.createIntArray();
        this.A04 = parcel.createIntArray();
    }

    public MlltFrame(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        super("MLLT");
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A03 = iArr;
        this.A04 = iArr2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MlltFrame mlltFrame = (MlltFrame) obj;
            if (this.A02 != mlltFrame.A02 || this.A00 != mlltFrame.A00 || this.A01 != mlltFrame.A01 || !Arrays.equals(this.A03, mlltFrame.A03) || !Arrays.equals(this.A04, mlltFrame.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((AbstractC2326GOr.A03(this.A02) + this.A00) * 31) + this.A01) * 31) + Arrays.hashCode(this.A03)) * 31) + Arrays.hashCode(this.A04);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeIntArray(this.A03);
        parcel.writeIntArray(this.A04);
    }
}
