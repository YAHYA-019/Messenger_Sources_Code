package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.6nl, reason: invalid class name */
/* loaded from: 6nl.class */
public final class C6nl extends Drawable implements 2hW {
    public boolean A00;
    public final C6nk A04;
    public static final RectF A07 = new RectF();
    public static final RectF A05 = new RectF();
    public static final RectF A06 = new RectF();
    public final Paint A01 = new Paint();
    public final Path A03 = new Path();
    public final Path A02 = new Path();

    public C6nl(C6nk c6nk) {
        boolean z;
        this.A04 = c6nk;
        float[] fArr = c6nk.A09;
        boolean z2 = false;
        if (fArr != null) {
            int length = fArr.length;
            int i = 0;
            float f = 0.0f;
            z = false;
            while (true) {
                if (i >= length) {
                    break;
                }
                float f2 = fArr[i];
                z = f2 > 0.0f ? true : z;
                if (i == 0) {
                    f = f2;
                } else if (f != f2) {
                    this.A00 = true;
                    break;
                }
                i++;
            }
            if (this.A00 && length != 8) {
                float[] fArr2 = new float[8];
                int i2 = 0;
                do {
                    int i3 = i2 * 2;
                    fArr2[i3] = fArr[i2];
                    fArr2[i3 + 1] = fArr[i2];
                    i2++;
                } while (i2 < 4);
                this.A04.A09 = fArr2;
            }
        } else {
            z = false;
        }
        this.A01.setPathEffect(this.A04.A08);
        this.A01.setAntiAlias((this.A04.A08 != null || z) ? true : z2);
        this.A01.setStyle(Paint.Style.STROKE);
    }

    public static Path A00(Canvas canvas, Path path, C6nl c6nl, float f, float f2) {
        path.lineTo(f, f2);
        path.close();
        canvas.clipPath(path);
        if (c6nl.A00) {
            return c6nl.A03;
        }
        return null;
    }

    private final void A01(Canvas canvas, float f, float f2, float f3, float f4, float f5, int i, boolean z) {
        Paint paint = this.A01;
        paint.setStrokeWidth(f);
        paint.setColor(i);
        RectF rectF = A07;
        rectF.set(f2, f3, f4, f5);
        RectF rectF2 = A05;
        rectF2.set(getBounds());
        if (z) {
            rectF2.inset(rectF.centerX() - rectF.left, 0.0f);
        } else {
            rectF2.inset(0.0f, rectF.centerY() - rectF.top);
        }
        int save = canvas.save();
        canvas.clipRect(rectF);
        A02(canvas, paint, this.A00 ? this.A03 : null, rectF2, this.A04.A09);
        canvas.restoreToCount(save);
    }

    public static final void A02(Canvas canvas, Paint paint, Path path, RectF rectF, float[] fArr) {
        if (fArr != null) {
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            if (path == null) {
                float min2 = Math.min(min, fArr[0]);
                canvas.drawRoundRect(rectF, min2, min2, paint);
            } else {
                if (path.isEmpty()) {
                    path.addRoundRect(rectF, fArr, Path.Direction.CW);
                }
                canvas.drawPath(path, paint);
            }
        }
    }

    public boolean BSD(2hW r302) {
        11T.A0F(r302, 0);
        return equals(r302);
    }

    public /* bridge */ /* synthetic */ boolean BSF(Object obj) {
        11T.A0F(obj, 0);
        return equals(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x004d, code lost:
    
        if (r0 != r0.A04) goto L8;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r302) {
        /*
            Method dump skipped, instructions count: 1552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6nl.draw(android.graphics.Canvas):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6nl) {
            return 11T.A0O(this.A04, ((C6nl) obj).A04);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.A01.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    public int hashCode() {
        return this.A04.hashCode();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.A01.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
    }
}
