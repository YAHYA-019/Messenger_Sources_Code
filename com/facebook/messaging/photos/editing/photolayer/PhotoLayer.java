package com.facebook.messaging.photos.editing.photolayer;

import X.11T;
import X.CSS;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.photos.editing.layer.Layer;

/* loaded from: PhotoLayer.class */
public final class PhotoLayer extends Layer implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSS(10);
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public Uri A05;

    public PhotoLayer() {
        this(0.0f, 0.0f, 0.0f, 0, 0);
    }

    public PhotoLayer(float f, float f2, float f3, int i, int i2) {
        super.A02 = f;
        this.A02 = f;
        this.A04 = i;
        this.A03 = i2;
        this.A01 = f2;
        this.A00 = f3;
        this.A0G = false;
    }

    @Override // com.facebook.messaging.photos.editing.layer.Layer
    public float A00() {
        return this.A02;
    }

    @Override // com.facebook.messaging.photos.editing.layer.Layer
    public boolean A08() {
        return true;
    }

    @Override // com.facebook.messaging.photos.editing.layer.Layer, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeFloat(this.A02);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A03);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A00);
    }
}
