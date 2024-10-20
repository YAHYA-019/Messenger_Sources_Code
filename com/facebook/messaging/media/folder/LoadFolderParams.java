package com.facebook.messaging.media.folder;

import X.11T;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: LoadFolderParams.class */
public final class LoadFolderParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSV.A00(19);
    public final boolean A00;
    public final boolean A01;

    public LoadFolderParams(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
    }
}
