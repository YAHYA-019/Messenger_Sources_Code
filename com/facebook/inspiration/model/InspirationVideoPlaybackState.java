package com.facebook.inspiration.model;

import X.1BM;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKf;
import X.RYr;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InspirationVideoPlaybackState.class */
public final class InspirationVideoPlaybackState implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(73);
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public InspirationVideoPlaybackState(int i, boolean z, boolean z2, boolean z3) {
        this.A01 = z;
        this.A00 = i;
        this.A02 = z2;
        this.A03 = z3;
    }

    public InspirationVideoPlaybackState(RYr rYr) {
        this.A01 = rYr.A01;
        this.A00 = rYr.A00;
        this.A02 = rYr.A02;
        this.A03 = rYr.A03;
    }

    public InspirationVideoPlaybackState(Parcel parcel) {
        this.A01 = AnonymousClass001.A1Q(C3o5.A01(parcel, this), 1);
        this.A00 = parcel.readInt();
        this.A02 = 1BM.A07(parcel);
        this.A03 = AbJ.A1W(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationVideoPlaybackState)) {
                return false;
            }
            InspirationVideoPlaybackState inspirationVideoPlaybackState = (InspirationVideoPlaybackState) obj;
            if (this.A01 != inspirationVideoPlaybackState.A01 || this.A00 != inspirationVideoPlaybackState.A00 || this.A02 != inspirationVideoPlaybackState.A02 || this.A03 != inspirationVideoPlaybackState.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A02((C1pq.A05(this.A01) * 31) + this.A00, this.A02), this.A03);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
    }
}
