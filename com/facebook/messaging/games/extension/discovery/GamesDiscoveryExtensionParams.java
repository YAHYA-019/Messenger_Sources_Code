package com.facebook.messaging.games.extension.discovery;

import X.11T;
import X.7zL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: GamesDiscoveryExtensionParams.class */
public final class GamesDiscoveryExtensionParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(63);
    public final ThreadKey A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public GamesDiscoveryExtensionParams(ThreadKey threadKey, boolean z, boolean z2, boolean z3) {
        this.A00 = threadKey;
        this.A01 = z;
        this.A03 = z2;
        this.A02 = z3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
    }
}
