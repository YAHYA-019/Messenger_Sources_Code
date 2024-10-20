package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.4YW;
import X.AbI;
import X.C1pq;
import X.DKH;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: ComposerActionItemsData.class */
public final class ComposerActionItemsData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKc.A00(96);
    public final ImmutableList A00;
    public final String A01;

    public ComposerActionItemsData(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int readInt = parcel.readInt();
        ComposerActionItemData[] composerActionItemDataArr = new ComposerActionItemData[readInt];
        int i = 0;
        while (i < readInt) {
            i = AbI.A01(parcel, A0e, composerActionItemDataArr, i);
        }
        this.A00 = ImmutableList.copyOf(composerActionItemDataArr);
        this.A01 = DKH.A0l(parcel);
    }

    public ComposerActionItemsData(ImmutableList immutableList, String str) {
        C1pq.A08("items", immutableList);
        this.A00 = immutableList;
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerActionItemsData)) {
                return false;
            }
            ComposerActionItemsData composerActionItemsData = (ComposerActionItemsData) obj;
            if (!11T.A0O(this.A00, composerActionItemsData.A00) || !11T.A0O(this.A01, composerActionItemsData.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A03(this.A00));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            parcel.writeParcelable((ComposerActionItemData) A0b.next(), i);
        }
        4YW.A0E(parcel, this.A01);
    }
}
