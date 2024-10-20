package com.facebook.videocodec.effects.model;

import X.AbM;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: TransformStatusNode.class */
public final class TransformStatusNode implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKb(21);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;

    public TransformStatusNode(float f, float f2, float f3, float f4) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
    }

    public TransformStatusNode(Parcel parcel) {
        getClass().getClassLoader();
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
            if (!(obj instanceof TransformStatusNode)) {
                return false;
            }
            TransformStatusNode transformStatusNode = (TransformStatusNode) obj;
            if (this.A00 != transformStatusNode.A00 || this.A01 != transformStatusNode.A01 || this.A02 != transformStatusNode.A02 || this.A03 != transformStatusNode.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AbM.A00(AbM.A00(AbM.A00(Float.floatToIntBits(this.A00) + 31, this.A01), this.A02), this.A03);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A03);
    }
}
