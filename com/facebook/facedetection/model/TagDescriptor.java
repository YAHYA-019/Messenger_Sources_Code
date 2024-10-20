package com.facebook.facedetection.model;

import X.11T;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: TagDescriptor.class */
public final class TagDescriptor implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(70);
    public final float _bottom;
    public final float _confidence;
    public final byte[] _crop;
    public final int _cropHeight;
    public final int _cropWidth;
    public final float _left;
    public final int _model;
    public final float _right;
    public final int _scale;
    public final float _targetId;
    public final float _top;
    public final float _x;
    public final float _y;

    public TagDescriptor() {
        this._targetId = 0.0f;
        this._x = 0.0f;
        this._y = 0.0f;
        this._left = 0.0f;
        this._top = 0.0f;
        this._right = 0.0f;
        this._bottom = 0.0f;
        this._scale = 0;
        this._model = 0;
        this._confidence = 0.0f;
        this._crop = null;
        this._cropWidth = 0;
        this._cropHeight = 0;
    }

    public TagDescriptor(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2, float f8, byte[] bArr, int i3, int i4) {
        this._targetId = f;
        this._x = f2;
        this._y = f3;
        this._left = f4;
        this._top = f5;
        this._right = f6;
        this._bottom = f7;
        this._scale = i;
        this._model = i2;
        this._confidence = f8;
        this._crop = bArr;
        this._cropWidth = i3;
        this._cropHeight = i4;
    }

    public TagDescriptor(Parcel parcel) {
        this._targetId = parcel.readFloat();
        this._x = parcel.readFloat();
        this._y = parcel.readFloat();
        this._left = parcel.readFloat();
        this._top = parcel.readFloat();
        this._right = parcel.readFloat();
        this._bottom = parcel.readFloat();
        this._scale = parcel.readInt();
        this._model = parcel.readInt();
        this._confidence = parcel.readFloat();
        this._crop = parcel.createByteArray();
        this._cropWidth = parcel.readInt();
        this._cropHeight = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final byte[] getCrop() {
        byte[] bArr = this._crop;
        if (bArr != null) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeFloat(this._targetId);
        parcel.writeFloat(this._x);
        parcel.writeFloat(this._y);
        parcel.writeFloat(this._left);
        parcel.writeFloat(this._top);
        parcel.writeFloat(this._right);
        parcel.writeFloat(this._bottom);
        parcel.writeInt(this._scale);
        parcel.writeInt(this._model);
        parcel.writeFloat(this._confidence);
        parcel.writeByteArray(this._crop);
        parcel.writeInt(this._cropWidth);
        parcel.writeInt(this._cropHeight);
    }
}
