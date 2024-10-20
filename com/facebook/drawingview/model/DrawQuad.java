package com.facebook.drawingview.model;

import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: DrawQuad.class */
public final class DrawQuad extends DrawLine implements Serializable {
    public static final Parcelable.Creator CREATOR = FKX.A00(63);
    public static final long serialVersionUID = 0;
    public float mControlX;
    public float mControlY;

    @Override // com.facebook.drawingview.model.DrawLine, com.facebook.drawingview.model.DrawPoint, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.mControlX);
        parcel.writeFloat(this.mControlY);
    }
}
