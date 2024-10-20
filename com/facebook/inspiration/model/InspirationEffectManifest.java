package com.facebook.inspiration.model;

import X.11T;
import X.4YV;
import X.C1pq;
import X.C3o5;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InspirationEffectManifest.class */
public final class InspirationEffectManifest implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(49);
    public final InspirationEffectCapabilityConfig A00;
    public final InspirationEffectCapabilityConfig A01;
    public final InspirationEffectCapabilityConfig A02;

    public InspirationEffectManifest(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        InspirationEffectCapabilityConfig inspirationEffectCapabilityConfig = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (InspirationEffectCapabilityConfig) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (InspirationEffectCapabilityConfig) parcel.readParcelable(A0e);
        }
        this.A02 = parcel.readInt() != 0 ? (InspirationEffectCapabilityConfig) parcel.readParcelable(A0e) : inspirationEffectCapabilityConfig;
    }

    public InspirationEffectManifest(InspirationEffectCapabilityConfig inspirationEffectCapabilityConfig, InspirationEffectCapabilityConfig inspirationEffectCapabilityConfig2, InspirationEffectCapabilityConfig inspirationEffectCapabilityConfig3) {
        this.A00 = inspirationEffectCapabilityConfig;
        this.A01 = inspirationEffectCapabilityConfig2;
        this.A02 = inspirationEffectCapabilityConfig3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationEffectManifest)) {
                return false;
            }
            InspirationEffectManifest inspirationEffectManifest = (InspirationEffectManifest) obj;
            if (!11T.A0O(this.A00, inspirationEffectManifest.A00) || !11T.A0O(this.A01, inspirationEffectManifest.A01) || !11T.A0O(this.A02, inspirationEffectManifest.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0d(parcel, this.A00, i);
        C3o5.A0d(parcel, this.A01, i);
        C3o5.A0d(parcel, this.A02, i);
    }
}
