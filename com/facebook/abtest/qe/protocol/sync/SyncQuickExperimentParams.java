package com.facebook.abtest.qe.protocol.sync;

import X.4YV;
import X.AbM;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;

/* loaded from: SyncQuickExperimentParams.class */
public final class SyncQuickExperimentParams implements Parcelable {
    public final String A00;
    public final String A01;

    public SyncQuickExperimentParams(Parcel parcel) {
        String A0t = AbM.A0t(parcel);
        String readString = parcel.readString();
        this.A00 = A0t;
        this.A01 = readString;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof SyncQuickExperimentParams) {
            SyncQuickExperimentParams syncQuickExperimentParams = (SyncQuickExperimentParams) obj;
            if (Objects.equal(this.A00, syncQuickExperimentParams.A00)) {
                z = 4YV.A1Z(this.A01, syncQuickExperimentParams.A01);
            }
        }
        return z;
    }

    public int hashCode() {
        return AbM.A05(this.A00, this.A01);
    }

    public String toString() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
