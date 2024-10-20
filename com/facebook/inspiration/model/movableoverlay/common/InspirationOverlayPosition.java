package com.facebook.inspiration.model.movableoverlay.common;

import X.AbG;
import X.AbM;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InspirationOverlayPosition.class */
public final class InspirationOverlayPosition implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKc.A00(63);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;

    public InspirationOverlayPosition(float f, float f2, float f3, float f4, float f5) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
        this.A04 = f5;
    }

    public InspirationOverlayPosition(Parcel parcel) {
        AbG.A1X(this);
        this.A00 = parcel.readFloat();
        this.A01 = parcel.readFloat();
        this.A02 = parcel.readFloat();
        this.A03 = parcel.readFloat();
        this.A04 = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationOverlayPosition)) {
                return false;
            }
            InspirationOverlayPosition inspirationOverlayPosition = (InspirationOverlayPosition) obj;
            if (this.A00 != inspirationOverlayPosition.A00 || this.A01 != inspirationOverlayPosition.A01 || this.A02 != inspirationOverlayPosition.A02 || this.A03 != inspirationOverlayPosition.A03 || this.A04 != inspirationOverlayPosition.A04) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AbM.A00(AbM.A00(AbM.A00(AbM.A00(Float.floatToIntBits(this.A00) + 31, this.A01), this.A02), this.A03), this.A04);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A03);
        parcel.writeFloat(this.A04);
    }
}
