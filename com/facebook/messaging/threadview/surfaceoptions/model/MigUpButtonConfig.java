package com.facebook.messaging.threadview.surfaceoptions.model;

import X.2MG;
import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MigUpButtonConfig.class */
public final class MigUpButtonConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C2xc(44);
    public final 2MG A00;

    public MigUpButtonConfig(2MG r302) {
        this.A00 = r302;
    }

    public MigUpButtonConfig(Parcel parcel) {
        getClass().getClassLoader();
        this.A00 = 2MG.values()[parcel.readInt()];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof MigUpButtonConfig) && this.A00 == ((MigUpButtonConfig) obj).A00);
    }

    public int hashCode() {
        2MG r0 = this.A00;
        return (r0 == null ? -1 : r0.ordinal()) + 31;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00.ordinal());
    }
}
