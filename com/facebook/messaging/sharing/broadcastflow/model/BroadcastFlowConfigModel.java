package com.facebook.messaging.sharing.broadcastflow.model;

import X.C53v;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableList;

/* loaded from: BroadcastFlowConfigModel.class */
public final class BroadcastFlowConfigModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(59);
    public final ImmutableList A00;
    public final String A01;
    public final boolean A02;

    public BroadcastFlowConfigModel(Parcel parcel) {
        this.A00 = ImmutableList.copyOf(parcel.createTypedArray(ThreadKey.CREATOR));
        this.A02 = C53v.A0S(parcel);
        this.A01 = parcel.readString();
    }

    public BroadcastFlowConfigModel(ImmutableList immutableList, String str, boolean z) {
        this.A00 = immutableList;
        this.A02 = z;
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ImmutableList immutableList = this.A00;
        parcel.writeTypedArray((ThreadKey[]) immutableList.toArray(new ThreadKey[immutableList.size()]), i);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeString(this.A01);
    }
}
