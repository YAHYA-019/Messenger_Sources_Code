package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbI;
import X.C1pq;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: ComposerPostToInstagramData.class */
public final class ComposerPostToInstagramData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(57);
    public final ImmutableList A00;
    public final String A01;
    public final boolean A02;

    public ComposerPostToInstagramData(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int i = 0;
        this.A02 = 4YV.A1U(parcel.readInt());
        int readInt = parcel.readInt();
        CrossUniverseSingleInstagramData[] crossUniverseSingleInstagramDataArr = new CrossUniverseSingleInstagramData[readInt];
        while (i < readInt) {
            i = AbI.A01(parcel, A0e, crossUniverseSingleInstagramDataArr, i);
        }
        this.A00 = ImmutableList.copyOf(crossUniverseSingleInstagramDataArr);
        this.A01 = parcel.readString();
    }

    public ComposerPostToInstagramData(ImmutableList immutableList, String str, boolean z) {
        this.A02 = z;
        C1pq.A08("listOfCrossUniverseInstagramData", immutableList);
        this.A00 = immutableList;
        C1pq.A08("selectedInstagramAccountForCrossposting", str);
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerPostToInstagramData)) {
                return false;
            }
            ComposerPostToInstagramData composerPostToInstagramData = (ComposerPostToInstagramData) obj;
            if (this.A02 != composerPostToInstagramData.A02 || !11T.A0O(this.A00, composerPostToInstagramData.A00) || !11T.A0O(this.A01, composerPostToInstagramData.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A04(this.A00, C1pq.A05(this.A02)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02 ? 1 : 0);
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            parcel.writeParcelable((CrossUniverseSingleInstagramData) A0b.next(), i);
        }
        parcel.writeString(this.A01);
    }
}
