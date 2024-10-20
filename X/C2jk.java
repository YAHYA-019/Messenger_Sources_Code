package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.2jk, reason: invalid class name */
/* loaded from: 2jk.class */
public final class C2jk {
    /* JADX WARN: Type inference failed for: r0v21, types: [X.2jj, android.graphics.Matrix] */
    public final C2jj A00(Drawable drawable, ImageView.ScaleType scaleType, int i, int i2) {
        Matrix.ScaleToFit scaleToFit;
        float f;
        float f2;
        if (drawable == null) {
            return null;
        }
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0 || ImageView.ScaleType.FIT_XY == scaleType || ImageView.ScaleType.MATRIX == scaleType) {
            return null;
        }
        if (i == intrinsicWidth && i2 == intrinsicHeight) {
            return null;
        }
        ?? matrix = new Matrix();
        boolean z = true;
        if (ImageView.ScaleType.CENTER == scaleType) {
            matrix.setTranslate(AnonymousClass272.A00((i - intrinsicWidth) * 0.5f), AnonymousClass272.A00((i2 - intrinsicHeight) * 0.5f));
            if (intrinsicWidth <= i && intrinsicHeight <= i2) {
                z = false;
            }
        } else {
            float f3 = 0.0f;
            if (ImageView.ScaleType.CENTER_CROP != scaleType) {
                if (ImageView.ScaleType.CENTER_INSIDE == scaleType) {
                    float min = (intrinsicWidth > i || intrinsicHeight > i2) ? Math.min(i / intrinsicWidth, i2 / intrinsicHeight) : 1.0f;
                    float A00 = AnonymousClass272.A00((i - (intrinsicWidth * min)) * 0.5f);
                    float A002 = AnonymousClass272.A00((i2 - (intrinsicHeight * min)) * 0.5f);
                    matrix.setScale(min, min);
                    matrix.postTranslate(A00, A002);
                    return matrix;
                }
                RectF rectF = new RectF();
                RectF rectF2 = new RectF();
                rectF.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
                rectF2.set(0.0f, 0.0f, i, i2);
                int i3 = 2kC.A00[scaleType.ordinal()];
                if (i3 == 1) {
                    scaleToFit = Matrix.ScaleToFit.FILL;
                } else if (i3 == 2) {
                    scaleToFit = Matrix.ScaleToFit.START;
                } else if (i3 == 3) {
                    scaleToFit = Matrix.ScaleToFit.CENTER;
                } else {
                    if (i3 != 4) {
                        throw AnonymousClass001.A0L("Only FIT_... values allowed");
                    }
                    scaleToFit = Matrix.ScaleToFit.END;
                }
                matrix.setRectToRect(rectF, rectF2, scaleToFit);
                return matrix;
            }
            if (intrinsicWidth * i2 > i * intrinsicHeight) {
                f = i2 / intrinsicHeight;
                f3 = (i - (intrinsicWidth * f)) * 0.5f;
                f2 = 0.0f;
            } else {
                f = i / intrinsicWidth;
                f2 = (i2 - (intrinsicHeight * f)) * 0.5f;
            }
            matrix.setScale(f, f);
            matrix.postTranslate(AnonymousClass272.A00(f3), AnonymousClass272.A00(f2));
        }
        matrix.A00 = z;
        return matrix;
    }
}
