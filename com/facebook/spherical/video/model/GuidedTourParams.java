package com.facebook.spherical.video.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbI;
import X.C1pq;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: GuidedTourParams.class */
public final class GuidedTourParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(32);
    public final ImmutableList A00;

    public GuidedTourParams(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int readInt = parcel.readInt();
        KeyframeParams[] keyframeParamsArr = new KeyframeParams[readInt];
        int i = 0;
        while (i < readInt) {
            i = AbI.A01(parcel, A0e, keyframeParamsArr, i);
        }
        this.A00 = ImmutableList.copyOf(keyframeParamsArr);
    }

    public GuidedTourParams(ImmutableList immutableList) {
        C1pq.A08("keyframes", immutableList);
        this.A00 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof GuidedTourParams) && 11T.A0O(this.A00, ((GuidedTourParams) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            parcel.writeParcelable((KeyframeParams) A0b.next(), i);
        }
    }
}
