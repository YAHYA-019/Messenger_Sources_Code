package com.facebook.abtest.qe.protocol.sync;

import X.0Pz;
import X.1Du;
import X.4YV;
import X.AbM;
import X.AbN;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;

/* loaded from: SyncMultiQuickExperimentParams.class */
public final class SyncMultiQuickExperimentParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LGo(49);
    public final ImmutableList A00;
    public final String A01;
    public final boolean A02;

    public SyncMultiQuickExperimentParams(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A02 = AbN.A1U(parcel);
        ImmutableList.Builder builder = ImmutableList.builder();
        while (parcel.dataAvail() > 0) {
            builder.m11011add((Object) new SyncQuickExperimentParams(parcel));
        }
        this.A00 = builder.build();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof SyncMultiQuickExperimentParams) {
            SyncMultiQuickExperimentParams syncMultiQuickExperimentParams = (SyncMultiQuickExperimentParams) obj;
            if (Objects.equal(this.A01, syncMultiQuickExperimentParams.A01)) {
                z = 4YV.A1Z(this.A00, syncMultiQuickExperimentParams.A00);
            }
        }
        return z;
    }

    public int hashCode() {
        return AbM.A05(this.A01, this.A00);
    }

    public String toString() {
        return 0Pz.A0j(this.A00.toString(), " : ", this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeInt(this.A02 ? 1 : 0);
        1Du it = this.A00.iterator();
        while (it.hasNext()) {
            ((SyncQuickExperimentParams) it.next()).writeToParcel(parcel, i);
        }
    }
}
