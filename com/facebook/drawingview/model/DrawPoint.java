package com.facebook.drawingview.model;

import X.DKC;
import X.DKD;
import X.DKF;
import X.FKX;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.io.Serializable;

/* loaded from: DrawPoint.class */
public class DrawPoint implements Parcelable, Serializable {
    public static Path A00 = DKC.A0B();
    public static final Parcelable.Creator CREATOR = FKX.A00(62);
    public static final long serialVersionUID = 0;
    public int mColour;
    public float mStrokeWidth;
    public float mX;
    public PorterDuff.Mode mXfermode;
    public float mY;

    public DrawPoint(Parcel parcel) {
        this.mX = parcel.readFloat();
        this.mY = parcel.readFloat();
        this.mStrokeWidth = parcel.readFloat();
        this.mColour = parcel.readInt();
        this.mXfermode = PorterDuff.Mode.valueOf(parcel.readString());
    }

    public void A00(Canvas canvas, Paint paint, View view) {
        DrawLine drawLine;
        if (!(this instanceof DrawLine)) {
            Path path = A00;
            path.reset();
            path.moveTo(this.mX, this.mY);
            path.lineTo(this.mX + 0.5f, this.mY);
            paint.setColor(this.mColour);
            paint.setStrokeWidth(this.mStrokeWidth);
            canvas.drawPath(path, paint);
            DKD.A19(paint, this.mXfermode);
            float f = this.mX;
            float f2 = this.mStrokeWidth;
            int i = (int) (f - f2);
            float f3 = this.mY;
            view.invalidate(i, (int) (f3 - f2), (int) (f + 0.5f + f2), (int) (f3 + f2));
            return;
        }
        DrawLine drawLine2 = (DrawLine) this;
        if (drawLine2 instanceof DrawQuad) {
            DrawQuad drawQuad = (DrawQuad) drawLine2;
            Path path2 = A00;
            path2.reset();
            path2.moveTo(drawQuad.mPreviousX, drawQuad.mPreviousY);
            path2.quadTo(drawQuad.mControlX, drawQuad.mControlY, drawQuad.mX, drawQuad.mY);
            paint.setColor(drawQuad.mColour);
            paint.setStrokeWidth(drawQuad.mStrokeWidth);
            DKD.A19(paint, drawQuad.mXfermode);
            canvas.drawPath(path2, paint);
            drawLine = drawQuad;
        } else {
            Path path3 = A00;
            path3.reset();
            path3.moveTo(drawLine2.mPreviousX, drawLine2.mPreviousY);
            path3.lineTo(drawLine2.mX, drawLine2.mY);
            paint.setColor(drawLine2.mColour);
            paint.setStrokeWidth(drawLine2.mStrokeWidth);
            DKD.A19(paint, drawLine2.mXfermode);
            canvas.drawPath(path3, paint);
            drawLine = drawLine2;
        }
        drawLine.A01(view);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.mX);
        parcel.writeFloat(this.mY);
        parcel.writeFloat(this.mStrokeWidth);
        parcel.writeInt(this.mColour);
        DKF.A1E(parcel, this.mXfermode);
    }
}
