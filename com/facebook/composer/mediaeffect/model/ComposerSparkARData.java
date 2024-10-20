package com.facebook.composer.mediaeffect.model;

import X.11T;
import X.1BL;
import X.AbG;
import X.C1pq;
import X.C2232Dho;
import X.C3o5;
import X.DKH;
import X.FJ8;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: ComposerSparkARData.class */
public final class ComposerSparkARData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(5);
    public final C2232Dho A00;
    public final ImmutableList A01;
    public final String A02;

    public ComposerSparkARData(C2232Dho c2232Dho, ImmutableList immutableList, String str) {
        C1pq.A08("arEffectParamsList", immutableList);
        this.A01 = immutableList;
        this.A00 = c2232Dho;
        this.A02 = str;
    }

    public ComposerSparkARData(Parcel parcel) {
        AbG.A1X(this);
        this.A01 = FJ8.A02(parcel);
        this.A00 = parcel.readInt() != 0 ? (C2232Dho) FJ8.A01(parcel) : null;
        this.A02 = C3o5.A0O(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerSparkARData)) {
                return false;
            }
            ComposerSparkARData composerSparkARData = (ComposerSparkARData) obj;
            if (!11T.A0O(this.A01, composerSparkARData.A01) || !11T.A0O(this.A00, composerSparkARData.A00) || !11T.A0O(this.A02, composerSparkARData.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A00, C1pq.A03(this.A01)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        FJ8.A0B(parcel, this.A01);
        DKH.A0y(parcel, this.A00);
        1BL.A13(parcel, this.A02);
    }
}
