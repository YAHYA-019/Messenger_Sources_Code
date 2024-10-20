package com.facebook.photos.creativeediting.model.rect;

import X.1BL;
import X.AbG;
import X.AbM;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.FKW;
import X.RN9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PersistableRect.class */
public final class PersistableRect implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKW.A00(29);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;

    public PersistableRect(float f, float f2, float f3, float f4) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
    }

    public PersistableRect(RN9 rn9) {
        this.A00 = rn9.A00;
        this.A01 = rn9.A01;
        this.A02 = rn9.A02;
        this.A03 = rn9.A03;
    }

    public PersistableRect(Parcel parcel) {
        AbG.A1X(this);
        this.A00 = parcel.readFloat();
        this.A01 = parcel.readFloat();
        this.A02 = parcel.readFloat();
        this.A03 = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PersistableRect)) {
                return false;
            }
            PersistableRect persistableRect = (PersistableRect) obj;
            if (this.A00 != persistableRect.A00 || this.A01 != persistableRect.A01 || this.A02 != persistableRect.A02 || this.A03 != persistableRect.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AbM.A00(AbM.A00(AbM.A00(Float.floatToIntBits(this.A00) + 31, this.A01), this.A02), this.A03);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("PersistableRect{bottom=");
        A0k.append(this.A00);
        A0k.append(", left=");
        A0k.append(this.A01);
        A0k.append(AnonymousClass000.A00(66));
        A0k.append(this.A02);
        A0k.append(", top=");
        A0k.append(this.A03);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A03);
    }
}
