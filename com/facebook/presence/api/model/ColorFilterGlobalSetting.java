package com.facebook.presence.api.model;

import X.11T;
import X.C04v;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ColorFilterGlobalSetting.class */
public final class ColorFilterGlobalSetting extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKW(48);
    public final int A00;

    public ColorFilterGlobalSetting(int i) {
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A00);
    }
}
