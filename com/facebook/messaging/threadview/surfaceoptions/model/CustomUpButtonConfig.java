package com.facebook.messaging.threadview.surfaceoptions.model;

import X.C4Ny;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CustomUpButtonConfig.class */
public final class CustomUpButtonConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C4Ny(34);
    public final int A00;
    public final int A01;

    public CustomUpButtonConfig() {
        this.A00 = 2131962511;
        this.A01 = 2132345166;
    }

    public CustomUpButtonConfig(Parcel parcel) {
        getClass().getClassLoader();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CustomUpButtonConfig)) {
                return false;
            }
            CustomUpButtonConfig customUpButtonConfig = (CustomUpButtonConfig) obj;
            if (this.A00 != customUpButtonConfig.A00 || this.A01 != customUpButtonConfig.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((this.A00 + 31) * 31) + this.A01;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
