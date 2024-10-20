package com.facebook.inspiration.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.7zU;
import X.AbI;
import X.C1pq;
import X.DKE;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: SoundSyncState.class */
public final class SoundSyncState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKf(91);
    public final int A00;
    public final ImmutableList A01;
    public final String A02;

    public SoundSyncState(Parcel parcel) {
        this.A02 = 7zU.A0l(parcel, this);
        this.A00 = parcel.readInt();
        int readInt = parcel.readInt();
        Integer[] numArr = new Integer[readInt];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= readInt) {
                this.A01 = ImmutableList.copyOf(numArr);
                return;
            } else {
                numArr[i2] = AbI.A0z(parcel);
                i = i2 + 1;
            }
        }
    }

    public SoundSyncState(ImmutableList immutableList, String str, int i) {
        C1pq.A08("musicAssetId", str);
        this.A02 = str;
        this.A00 = i;
        C1pq.A08("soundSyncedClipsDurationMs", immutableList);
        this.A01 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SoundSyncState)) {
                return false;
            }
            SoundSyncState soundSyncState = (SoundSyncState) obj;
            if (!11T.A0O(this.A02, soundSyncState.A02) || this.A00 != soundSyncState.A00 || !11T.A0O(this.A01, soundSyncState.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, (C1pq.A03(this.A02) * 31) + this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
        1Du A0b = 1BL.A0b(parcel, this.A01);
        while (A0b.hasNext()) {
            parcel.writeInt(DKE.A0F(A0b));
        }
    }
}
