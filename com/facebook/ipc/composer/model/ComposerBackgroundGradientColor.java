package com.facebook.ipc.composer.model;

import X.C3o5;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ComposerBackgroundGradientColor.class */
public final class ComposerBackgroundGradientColor implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKc.A00(99);
    public final int A00;
    public final int A01;
    public final int A02;

    public ComposerBackgroundGradientColor(int i, int i2, int i3) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    public ComposerBackgroundGradientColor(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this);
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerBackgroundGradientColor)) {
                return false;
            }
            ComposerBackgroundGradientColor composerBackgroundGradientColor = (ComposerBackgroundGradientColor) obj;
            if (this.A00 != composerBackgroundGradientColor.A00 || this.A01 != composerBackgroundGradientColor.A01 || this.A02 != composerBackgroundGradientColor.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((this.A00 + 31) * 31) + this.A01) * 31) + this.A02;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
    }
}
