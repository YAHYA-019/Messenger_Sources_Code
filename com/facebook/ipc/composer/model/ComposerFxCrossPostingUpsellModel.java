package com.facebook.ipc.composer.model;

import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ComposerFxCrossPostingUpsellModel.class */
public final class ComposerFxCrossPostingUpsellModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(19);
    public final boolean A00;
    public final boolean A01;

    public ComposerFxCrossPostingUpsellModel(Parcel parcel) {
        this.A00 = AnonymousClass001.A1Q(C3o5.A01(parcel, this), 1);
        this.A01 = AbJ.A1W(parcel);
    }

    public ComposerFxCrossPostingUpsellModel(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerFxCrossPostingUpsellModel)) {
                return false;
            }
            ComposerFxCrossPostingUpsellModel composerFxCrossPostingUpsellModel = (ComposerFxCrossPostingUpsellModel) obj;
            if (this.A00 != composerFxCrossPostingUpsellModel.A00 || this.A01 != composerFxCrossPostingUpsellModel.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A05(this.A00), this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
    }
}
