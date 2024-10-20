package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.AbI;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ComposerProductExclusiveModel.class */
public final class ComposerProductExclusiveModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(58);
    public final Boolean A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;

    public ComposerProductExclusiveModel(Parcel parcel) {
        Boolean bool = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A01 = null;
        } else {
            this.A01 = AbI.A0z(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = AbI.A0z(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        this.A00 = parcel.readInt() != 0 ? Boolean.valueOf(AbN.A1U(parcel)) : bool;
        this.A04 = C3o5.A0O(parcel);
    }

    public ComposerProductExclusiveModel(Boolean bool, Integer num, Integer num2, String str, String str2) {
        this.A01 = num;
        this.A02 = num2;
        this.A03 = str;
        this.A00 = bool;
        this.A04 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerProductExclusiveModel)) {
                return false;
            }
            ComposerProductExclusiveModel composerProductExclusiveModel = (ComposerProductExclusiveModel) obj;
            if (!11T.A0O(this.A01, composerProductExclusiveModel.A01) || !11T.A0O(this.A02, composerProductExclusiveModel.A02) || !11T.A0O(this.A03, composerProductExclusiveModel.A03) || !11T.A0O(this.A00, composerProductExclusiveModel.A00) || !11T.A0O(this.A04, composerProductExclusiveModel.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A04, C1pq.A04(this.A00, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A03(this.A01)))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0f(parcel, this.A01);
        C3o5.A0f(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        AbN.A0s(parcel, this.A00);
        1BL.A13(parcel, this.A04);
    }
}
