package com.facebook.fbshorts.analytics;

import X.11T;
import X.1BL;
import X.EMI;
import X.EVS;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FbShortsEntryPointQPL$EntryPointQplId.class */
public final class FbShortsEntryPointQPL$EntryPointQplId implements Parcelable {
    public static final String INTENT_KEY = "EntryPointQplId";
    public final int instanceKey;
    public final EMI markerId;
    public static final EVS Companion = new Object();
    public static final Parcelable.Creator CREATOR = FKX.A00(75);

    public FbShortsEntryPointQPL$EntryPointQplId(EMI emi, int i) {
        11T.A0F(emi, 1);
        this.markerId = emi;
        this.instanceKey = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getInstanceKey() {
        return this.instanceKey;
    }

    public final EMI getMarkerId() {
        return this.markerId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        1BL.A12(parcel, this.markerId);
        parcel.writeInt(this.instanceKey);
    }
}
