package com.facebook.messaging.memories.model;

import X.11T;
import X.C04v;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MemoryMessageModel.class */
public final class MemoryMessageModel extends C04v implements Parcelable {
    public static final Parcelable.Creator A03 = new CSV(38);
    public final int A00;
    public final String A01;
    public final boolean A02;

    public MemoryMessageModel(String str, boolean z, int i) {
        this.A01 = str;
        this.A02 = z;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A00);
    }
}
