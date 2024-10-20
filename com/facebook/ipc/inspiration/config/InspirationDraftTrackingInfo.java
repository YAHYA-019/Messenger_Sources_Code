package com.facebook.ipc.inspiration.config;

import X.11T;
import X.4YW;
import X.AbJ;
import X.AbK;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InspirationDraftTrackingInfo.class */
public final class InspirationDraftTrackingInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSR.A00(30);
    public final String A00;
    public final boolean A01;
    public final boolean A02;

    public InspirationDraftTrackingInfo(Parcel parcel) {
        this.A00 = AbK.A15(parcel, C3o5.A01(parcel, this));
        this.A01 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A02 = AbJ.A1W(parcel);
    }

    public InspirationDraftTrackingInfo(String str, boolean z, boolean z2) {
        this.A00 = str;
        this.A01 = z;
        this.A02 = z2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationDraftTrackingInfo)) {
                return false;
            }
            InspirationDraftTrackingInfo inspirationDraftTrackingInfo = (InspirationDraftTrackingInfo) obj;
            if (!11T.A0O(this.A00, inspirationDraftTrackingInfo.A00) || this.A01 != inspirationDraftTrackingInfo.A01 || this.A02 != inspirationDraftTrackingInfo.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A02(C1pq.A03(this.A00), this.A01), this.A02);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        4YW.A0E(parcel, this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
    }
}
