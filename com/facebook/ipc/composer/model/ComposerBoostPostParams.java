package com.facebook.ipc.composer.model;

import X.1BM;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ComposerBoostPostParams.class */
public final class ComposerBoostPostParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(3);
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;

    public ComposerBoostPostParams(Parcel parcel) {
        this.A00 = AnonymousClass001.A1Q(C3o5.A01(parcel, this), 1);
        this.A01 = 1BM.A07(parcel);
        this.A02 = AbJ.A1W(parcel);
    }

    public ComposerBoostPostParams(boolean z, boolean z2, boolean z3) {
        this.A00 = z;
        this.A01 = z2;
        this.A02 = z3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerBoostPostParams)) {
                return false;
            }
            ComposerBoostPostParams composerBoostPostParams = (ComposerBoostPostParams) obj;
            if (this.A00 != composerBoostPostParams.A00 || this.A01 != composerBoostPostParams.A01 || this.A02 != composerBoostPostParams.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A02(C1pq.A05(this.A00), this.A01), this.A02);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
    }
}
