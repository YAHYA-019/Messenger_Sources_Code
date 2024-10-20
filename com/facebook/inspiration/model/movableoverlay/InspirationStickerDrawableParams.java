package com.facebook.inspiration.model.movableoverlay;

import X.AbG;
import X.AbM;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InspirationStickerDrawableParams.class */
public final class InspirationStickerDrawableParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKc.A00(47);
    public final float A00;
    public final float A01;

    public InspirationStickerDrawableParams(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }

    public InspirationStickerDrawableParams(Parcel parcel) {
        AbG.A1X(this);
        this.A00 = parcel.readFloat();
        this.A01 = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationStickerDrawableParams)) {
                return false;
            }
            InspirationStickerDrawableParams inspirationStickerDrawableParams = (InspirationStickerDrawableParams) obj;
            if (this.A00 != inspirationStickerDrawableParams.A00 || this.A01 != inspirationStickerDrawableParams.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AbM.A00(Float.floatToIntBits(this.A00) + 31, this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A01);
    }
}
