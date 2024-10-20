package com.facebook.inspiration.model;

import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FbShortsAudioAggregationConfig.class */
public final class FbShortsAudioAggregationConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(41);
    public final int A00;
    public final boolean A01;
    public final boolean A02;

    public FbShortsAudioAggregationConfig(int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = z;
        this.A02 = z2;
    }

    public FbShortsAudioAggregationConfig(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this);
        this.A01 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A02 = AbJ.A1W(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FbShortsAudioAggregationConfig)) {
                return false;
            }
            FbShortsAudioAggregationConfig fbShortsAudioAggregationConfig = (FbShortsAudioAggregationConfig) obj;
            if (this.A00 != fbShortsAudioAggregationConfig.A00 || this.A01 != fbShortsAudioAggregationConfig.A01 || this.A02 != fbShortsAudioAggregationConfig.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A02(this.A00 + 31, this.A01), this.A02);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
    }
}
