package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* renamed from: X.69j, reason: invalid class name */
/* loaded from: 69j.class */
public final class C69j extends 5CC implements 5CY {
    public int A00;
    public Integer A01;
    public float A02;
    public float A03;
    public int A04;
    public Matrix A05;
    public RectF A06;
    public boolean A07;
    public boolean A08;
    public final Paint A09;
    public final float[] A0A;
    public final Path A0B;
    public final Path A0C;
    public final RectF A0D;
    public final RectF A0E;
    public final float[] A0F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69j(Drawable drawable) {
        super(drawable);
        drawable.getClass();
        this.A01 = 0S2.A00;
        this.A0D = new RectF();
        this.A0F = new float[8];
        this.A0A = new float[8];
        this.A09 = new Paint(1);
        this.A07 = false;
        this.A02 = 0.0f;
        this.A04 = 0;
        this.A00 = 0;
        this.A03 = 0.0f;
        this.A08 = false;
        this.A0C = new Path();
        this.A0B = new Path();
        this.A0E = new RectF();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A00() {
        float[] fArr;
        Path path = this.A0C;
        path.reset();
        Path path2 = this.A0B;
        path2.reset();
        RectF rectF = this.A0E;
        rectF.set(getBounds());
        float f = this.A03;
        rectF.inset(f, f);
        if (this.A01 == 0S2.A00) {
            path.addRect(rectF, Path.Direction.CW);
        }
        if (this.A07) {
            path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else {
            path.addRoundRect(rectF, this.A0F, Path.Direction.CW);
        }
        float f2 = -this.A03;
        rectF.inset(f2, f2);
        float f3 = this.A02 / 2.0f;
        rectF.inset(f3, f3);
        if (this.A07) {
            path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i = 0;
            while (true) {
                fArr = this.A0A;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = (this.A0F[i] + this.A03) - (this.A02 / 2.0f);
                i++;
            }
            path2.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
        float f4 = (-this.A02) / 2.0f;
        rectF.inset(f4, f4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A04(Integer num) {
        this.A01 = num;
        A00();
        invalidateSelf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void CmI(int i, float f) {
        this.A04 = i;
        this.A02 = f;
        A00();
        invalidateSelf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void Cmv(boolean z) {
        this.A07 = z;
        A00();
        invalidateSelf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void CsE(float f) {
        this.A03 = f;
        A00();
        invalidateSelf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void Ctd(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.A0F, 0.0f);
        } else {
            C0By.A05(AnonymousClass001.A1Q(fArr.length, 8), "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.A0F, 0, 8);
        }
        A00();
        invalidateSelf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void Cte(float f) {
        Arrays.fill(this.A0F, f);
        A00();
        invalidateSelf();
    }

    public void Ctx(boolean z) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void CuE(boolean z) {
        this.A08 = z;
        A00();
        invalidateSelf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void draw(Canvas canvas) {
        RectF rectF = this.A0D;
        rectF.set(getBounds());
        int intValue = this.A01.intValue();
        if (intValue == 1) {
            int save = canvas.save();
            canvas.clipPath(this.A0C);
            super.draw(canvas);
            canvas.restoreToCount(save);
        } else if (intValue == 0) {
            if (this.A08) {
                RectF rectF2 = this.A06;
                if (rectF2 == null) {
                    this.A06 = new RectF(rectF);
                    this.A05 = new Matrix();
                } else {
                    rectF2.set(rectF);
                }
                RectF rectF3 = this.A06;
                float f = this.A02;
                rectF3.inset(f, f);
                Matrix matrix = this.A05;
                if (matrix != null) {
                    matrix.setRectToRect(rectF, this.A06, Matrix.ScaleToFit.FILL);
                }
                int save2 = canvas.save();
                canvas.clipRect(rectF);
                canvas.concat(this.A05);
                super.draw(canvas);
                canvas.restoreToCount(save2);
            } else {
                super.draw(canvas);
            }
            Paint paint = this.A09;
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.A00);
            paint.setStrokeWidth(0.0f);
            paint.setFilterBitmap(false);
            Path path = this.A0C;
            path.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(path, paint);
            if (this.A07) {
                float width = ((rectF.width() - rectF.height()) + this.A02) / 2.0f;
                float height = ((rectF.height() - rectF.width()) + this.A02) / 2.0f;
                if (width > 0.0f) {
                    float f2 = rectF.left;
                    canvas.drawRect(f2, rectF.top, f2 + width, rectF.bottom, paint);
                    float f3 = rectF.right;
                    canvas.drawRect(f3 - width, rectF.top, f3, rectF.bottom, paint);
                }
                if (height > 0.0f) {
                    float f4 = rectF.left;
                    float f5 = rectF.top;
                    canvas.drawRect(f4, f5, rectF.right, f5 + height, paint);
                    float f6 = rectF.left;
                    float f7 = rectF.bottom;
                    canvas.drawRect(f6, f7 - height, rectF.right, f7, paint);
                }
            }
        }
        if (this.A04 != 0) {
            Paint paint2 = this.A09;
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(this.A04);
            paint2.setStrokeWidth(this.A02);
            this.A0C.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.A0B, paint2);
        }
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        A00();
    }
}
