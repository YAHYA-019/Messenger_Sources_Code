package com.facebook.ipc.composer.model;

import X.11T;
import X.1BM;
import X.4YW;
import X.AbJ;
import X.AbK;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: StoryCrossPostingToInstagramModel.class */
public final class StoryCrossPostingToInstagramModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSR.A00(15);
    public final String A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public StoryCrossPostingToInstagramModel(Parcel parcel) {
        this.A01 = AnonymousClass001.A1Q(C3o5.A01(parcel, this), 1);
        this.A02 = 1BM.A07(parcel);
        this.A03 = 1BM.A07(parcel);
        this.A04 = 1BM.A07(parcel);
        this.A05 = AbJ.A1W(parcel);
        this.A00 = AbK.A15(parcel, parcel.readInt());
    }

    public StoryCrossPostingToInstagramModel(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A01 = z;
        this.A02 = z2;
        this.A03 = z3;
        this.A04 = z4;
        this.A05 = z5;
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof StoryCrossPostingToInstagramModel)) {
                return false;
            }
            StoryCrossPostingToInstagramModel storyCrossPostingToInstagramModel = (StoryCrossPostingToInstagramModel) obj;
            if (this.A01 != storyCrossPostingToInstagramModel.A01 || this.A02 != storyCrossPostingToInstagramModel.A02 || this.A03 != storyCrossPostingToInstagramModel.A03 || this.A04 != storyCrossPostingToInstagramModel.A04 || this.A05 != storyCrossPostingToInstagramModel.A05 || !11T.A0O(this.A00, storyCrossPostingToInstagramModel.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A05(this.A01), this.A02), this.A03), this.A04), this.A05));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        4YW.A0E(parcel, this.A00);
    }
}
