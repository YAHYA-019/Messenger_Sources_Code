package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.DKH;
import X.Dl4;
import X.FJ8;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ComposerActionItemData.class */
public final class ComposerActionItemData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKc.A00(95);
    public final Dl4 A00;
    public final String A01;
    public final boolean A02;

    public ComposerActionItemData(Dl4 dl4, String str, boolean z) {
        this.A01 = str;
        this.A02 = z;
        this.A00 = dl4;
    }

    public ComposerActionItemData(Parcel parcel) {
        Dl4 dl4 = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        this.A02 = AbN.A1U(parcel);
        this.A00 = parcel.readInt() != 0 ? (Dl4) FJ8.A01(parcel) : dl4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerActionItemData)) {
                return false;
            }
            ComposerActionItemData composerActionItemData = (ComposerActionItemData) obj;
            if (!11T.A0O(this.A01, composerActionItemData.A01) || this.A02 != composerActionItemData.A02 || !11T.A0O(this.A00, composerActionItemData.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A02(C1pq.A03(this.A01), this.A02));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A01);
        parcel.writeInt(this.A02 ? 1 : 0);
        DKH.A0y(parcel, this.A00);
    }
}
