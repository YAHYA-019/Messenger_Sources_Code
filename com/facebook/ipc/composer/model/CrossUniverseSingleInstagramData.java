package com.facebook.ipc.composer.model;

import X.11T;
import X.4YW;
import X.C1pq;
import X.DKH;
import X.DKI;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CrossUniverseSingleInstagramData.class */
public final class CrossUniverseSingleInstagramData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(79);
    public final String A00;
    public final boolean A01;

    public CrossUniverseSingleInstagramData(Parcel parcel) {
        this.A01 = DKI.A0k(parcel, this);
        this.A00 = DKH.A0l(parcel);
    }

    public CrossUniverseSingleInstagramData(boolean z, String str) {
        this.A01 = z;
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CrossUniverseSingleInstagramData)) {
                return false;
            }
            CrossUniverseSingleInstagramData crossUniverseSingleInstagramData = (CrossUniverseSingleInstagramData) obj;
            if (this.A01 != crossUniverseSingleInstagramData.A01 || !11T.A0O(this.A00, crossUniverseSingleInstagramData.A00)) {
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