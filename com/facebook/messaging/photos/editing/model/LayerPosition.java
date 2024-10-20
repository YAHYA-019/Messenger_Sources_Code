package com.facebook.messaging.photos.editing.model;

import X.11T;
import X.C04v;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: LayerPosition.class */
public final class LayerPosition extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSS(9);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;

    public LayerPosition() {
        this(0, 0, 0, 0, 0, 0);
    }

    public LayerPosition(int i, int i2, int i3, int i4, int i5, int i6) {
        this.A01 = i;
        this.A02 = i2;
        this.A05 = i3;
        this.A04 = i4;
        this.A03 = i5;
        this.A00 = i6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof LayerPosition)) {
                return false;
            }
            LayerPosition layerPosition = (LayerPosition) obj;
            if (this.A01 != layerPosition.A01 || this.A02 != layerPosition.A02 || this.A05 != layerPosition.A05 || this.A04 != layerPosition.A04 || this.A03 != layerPosition.A03 || this.A00 != layerPosition.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((((((this.A01 * 31) + this.A02) * 31) + this.A05) * 31) + this.A04) * 31) + this.A03) * 31) + this.A00;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A00);
    }
}
