package com.facebook.payments.p2p.messenger.common.idv;

import X.11T;
import X.C1pq;
import X.DKI;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: IdvPhaseLifecycleData.class */
public final class IdvPhaseLifecycleData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(80);
    public final String A00;
    public final boolean A01;

    public IdvPhaseLifecycleData(Parcel parcel) {
        this.A01 = DKI.A0k(parcel, this);
        this.A00 = parcel.readString();
    }

    public IdvPhaseLifecycleData(boolean z, String str) {
        this.A01 = z;
        C1pq.A08("screen", str);
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof IdvPhaseLifecycleData)) {
                return false;
            }
            IdvPhaseLifecycleData idvPhaseLifecycleData = (IdvPhaseLifecycleData) obj;
            if (this.A01 != idvPhaseLifecycleData.A01 || !11T.A0O(this.A00, idvPhaseLifecycleData.A00)) {
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
        parcel.writeString(this.A00);
    }
}
