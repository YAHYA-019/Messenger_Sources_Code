package com.facebook.messaging.magicwords.model;

import X.11T;
import X.4YV;
import X.4YW;
import X.C1pq;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MagicWordRange.class */
public final class MagicWordRange implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(9);
    public final int A00;
    public final int A01;
    public final MagicWord A02;
    public final boolean A03;

    public MagicWordRange(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A03 = 4YV.A1U(parcel.readInt());
        this.A00 = parcel.readInt();
        this.A02 = parcel.readInt() == 0 ? null : (MagicWord) parcel.readParcelable(A0e);
        this.A01 = parcel.readInt();
    }

    public MagicWordRange(MagicWord magicWord, int i, int i2, boolean z) {
        this.A03 = z;
        this.A00 = i;
        this.A02 = magicWord;
        this.A01 = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MagicWordRange)) {
                return false;
            }
            MagicWordRange magicWordRange = (MagicWordRange) obj;
            if (this.A03 != magicWordRange.A03 || this.A00 != magicWordRange.A00 || !11T.A0O(this.A02, magicWordRange.A02) || this.A01 != magicWordRange.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1237;
        if (this.A03) {
            i = 1231;
        }
        return (C1pq.A04(this.A02, ((i + 31) * 31) + this.A00) * 31) + this.A01;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A00);
        4YW.A0D(parcel, this.A02, i);
        parcel.writeInt(this.A01);
    }
}
