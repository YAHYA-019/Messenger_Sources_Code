package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* renamed from: X.5bb, reason: invalid class name */
/* loaded from: 5bb.class */
public final class C5bb extends Drawable implements 5CY {
    public float[] A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public boolean A06;
    public boolean A07;
    public final Paint A08;
    public final Path A09;
    public final Path A0A;
    public final float[] A0B;
    public final RectF A0C;
    public final float[] A0D;

    public C5bb(float f, int i) {
        this(i);
        Cte(f);
    }

    public C5bb(int i) {
        this.A0D = new float[8];
        this.A0B = new float[8];
        this.A08 = new Paint(1);
        this.A06 = false;
        this.A01 = 0.0f;
        this.A02 = 0.0f;
        this.A04 = 0;
        this.A07 = false;
        this.A0A = new Path();
        this.A09 = new Path();
        this.A05 = 0;
        this.A0C = new RectF();
        this.A03 = 255;
        A01(i);
    }

    public C5bb(float[] fArr, int i) {
        this(i);
        Ctd(fArr);
    }

    private void A00() {
        float[] fArr;
        float[] fArr2;
        Path path = this.A0A;
        path.reset();
        Path path2 = this.A09;
        path2.reset();
        RectF rectF = this.A0C;
        rectF.set(getBounds());
        float f = this.A01 / 2.0f;
        rectF.inset(f, f);
        if (this.A06) {
            path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i = 0;
            while (true) {
                fArr = this.A0B;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = (this.A0D[i] + this.A02) - (this.A01 / 2.0f);
                i++;
            }
            path2.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
        float f2 = (-this.A01) / 2.0f;
        rectF.inset(f2, f2);
        float f3 = this.A02 + (this.A07 ? this.A01 : 0.0f);
        rectF.inset(f3, f3);
        if (this.A06) {
            path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else {
            if (this.A07) {
                fArr2 = this.A00;
                if (fArr2 == null) {
                    fArr2 = new float[8];
                    this.A00 = fArr2;
                }
                for (int i2 = 0; i2 < fArr2.length; i2++) {
                    fArr2[i2] = this.A0D[i2] - this.A01;
                }
            } else {
                fArr2 = this.A0D;
            }
            path.addRoundRect(rectF, fArr2, Path.Direction.CW);
        }
        float f4 = -f3;
        rectF.inset(f4, f4);
    }

    public void A01(int i) {
        if (this.A05 != i) {
            this.A05 = i;
            invalidateSelf();
        }
    }

    public void CmI(int i, float f) {
        if (this.A04 != i) {
            this.A04 = i;
            invalidateSelf();
        }
        if (this.A01 != f) {
            this.A01 = f;
            A00();
            invalidateSelf();
        }
    }

    public void Cmv(boolean z) {
        this.A06 = z;
        A00();
        invalidateSelf();
    }

    public void CsE(float f) {
        if (this.A02 != f) {
            this.A02 = f;
            A00();
            invalidateSelf();
        }
    }

    public void Ctd(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.A0D, 0.0f);
        } else {
            boolean z = false;
            if (fArr.length == 8) {
                z = true;
            }
            C0By.A05(z, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.A0D, 0, 8);
        }
        A00();
        invalidateSelf();
    }

    public void Cte(float f) {
        boolean z = false;
        if (f >= 0.0f) {
            z = true;
        }
        C0By.A05(z, "radius should be non negative");
        Arrays.fill(this.A0D, f);
        A00();
        invalidateSelf();
    }

    public void Ctx(boolean z) {
    }

    public void CuE(boolean z) {
        if (this.A07 != z) {
            this.A07 = z;
            A00();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.A08;
        paint.setColor(5C9.A00(this.A05, this.A03));
        paint.setStyle(Paint.Style.FILL);
        paint.setFilterBitmap(false);
        canvas.drawPath(this.A0A, paint);
        if (this.A01 != 0.0f) {
            paint.setColor(5C9.A00(this.A04, this.A03));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.A01);
            canvas.drawPath(this.A09, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.A03;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        int A00 = 5C9.A00(this.A05, this.A03) >>> 24;
        if (A00 == 0) {
            return -2;
        }
        int i = -1;
        if (A00 != 255) {
            i = -3;
        }
        return i;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        A00();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.A03) {
            this.A03 = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
