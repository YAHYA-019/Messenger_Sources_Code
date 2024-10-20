package com.facebook.drawingview.model;

import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.io.Serializable;

/* loaded from: DrawLine.class */
public class DrawLine extends DrawPoint implements Serializable {
    public static final Parcelable.Creator CREATOR = FKX.A00(61);
    public static final long serialVersionUID = 0;
    public float mPreviousX;
    public float mPreviousY;

    public void A01(View view) {
        float f = this.mPreviousX;
        float f2 = this.mX;
        float min = Math.min(f, f2);
        float f3 = this.mStrokeWidth;
        int i = (int) (min - f3);
        float f4 = this.mPreviousY;
        float f5 = this.mY;
        view.invalidate(i, (int) (Math.min(f4, f5) - f3), (int) (Math.max(f, f2) + f3), (int) (Math.max(f4, f5) + f3));
    }

    @Override // com.facebook.drawingview.model.DrawPoint, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.mPreviousX);
        parcel.writeFloat(this.mPreviousY);
    }
}
