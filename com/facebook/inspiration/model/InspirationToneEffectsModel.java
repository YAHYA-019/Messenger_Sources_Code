package com.facebook.inspiration.model;

import X.11T;
import X.4YW;
import X.C1pq;
import X.DKH;
import X.DKI;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InspirationToneEffectsModel.class */
public final class InspirationToneEffectsModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(70);
    public final String A00;
    public final boolean A01;

    public InspirationToneEffectsModel(Parcel parcel) {
        this.A01 = DKI.A0k(parcel, this);
        this.A00 = DKH.A0l(parcel);
    }

    public InspirationToneEffectsModel(boolean z, String str) {
        this.A01 = z;
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationToneEffectsModel)) {
                return false;
            }
            InspirationToneEffectsModel inspirationToneEffectsModel = (InspirationToneEffectsModel) obj;
            if (this.A01 != inspirationToneEffectsModel.A01 || !11T.A0O(this.A00, inspirationToneEffectsModel.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A05(this.A01));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01 ? 1 : 0);
        4YW.A0E(parcel, this.A00);
    }
}
