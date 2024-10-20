package com.google.android.exoplayer2.metadata;

import X.0Pz;
import X.1BL;
import X.6Y2;
import X.6Yl;
import X.82N;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: Metadata.class */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82N(40);
    public final long A00;
    public final Entry[] A01;

    /* loaded from: Metadata$Entry.class */
    public interface Entry extends Parcelable {
        byte[] BL1();

        6Yl BL2();

        void CXq(6Y2 r1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Metadata(Parcel parcel) {
        this.A01 = new Entry[parcel.readInt()];
        int i = 0;
        while (true) {
            int i2 = i;
            Entry[] entryArr = this.A01;
            if (i2 >= entryArr.length) {
                this.A00 = parcel.readLong();
                return;
            } else {
                entryArr[i2] = 1BL.A0C(parcel, Entry.class);
                i = i2 + 1;
            }
        }
    }

    public Metadata(List list) {
        this((Entry[]) list.toArray(new Entry[0]));
    }

    public Metadata(Entry... entryArr) {
        this(entryArr, -9223372036854775807L);
    }

    public Metadata(Entry[] entryArr, long j) {
        this.A00 = j;
        this.A01 = entryArr;
    }

    public Metadata A00(Metadata metadata) {
        Entry[] entryArr;
        int length;
        if (metadata != null && (length = (entryArr = metadata.A01).length) != 0) {
            long j = this.A00;
            Entry[] entryArr2 = this.A01;
            int length2 = entryArr2.length;
            Object[] copyOf = Arrays.copyOf(entryArr2, length2 + length);
            System.arraycopy(entryArr, 0, copyOf, length2, length);
            return new Metadata((Entry[]) copyOf, j);
        }
        return this;
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
            Metadata metadata = (Metadata) obj;
            if (!Arrays.equals(this.A01, metadata.A01) || this.A00 != metadata.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.A01) * 31) + 1BL.A01(this.A00);
    }

    public String toString() {
        String arrays = Arrays.toString(this.A01);
        long j = this.A00;
        return 0Pz.A0j("entries=", arrays, j == -9223372036854775807L ? "" : 0Pz.A0U(", presentationTimeUs=", j));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Entry[] entryArr = this.A01;
        int length = entryArr.length;
        parcel.writeInt(length);
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= length) {
                parcel.writeLong(this.A00);
                return;
            } else {
                parcel.writeParcelable(entryArr[i3], 0);
                i2 = i3 + 1;
            }
        }
    }
}
