package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: X.6nd, reason: invalid class name */
/* loaded from: 6nd.class */
public class C6nd extends Drawable {
    public int A00;
    public int A01;
    public int A02;
    public 6kH A03;
    public 7uW A04;
    public 66S A05;
    public boolean A06;
    public boolean A07;
    public final Path A08;
    public final Path A09;
    public final Rect A0A;
    public final Paint A0B;
    public final Paint A0C;
    public final RectF A0D;

    public C6nd() {
        Paint paint = new Paint(1);
        this.A0C = paint;
        Paint paint2 = new Paint(1);
        this.A0B = paint2;
        this.A0D = new RectF();
        this.A09 = new Path();
        this.A08 = new Path();
        this.A0A = new Rect();
        this.A01 = 255;
        this.A00 = -1;
        this.A03 = (6kH) 1Bn.A0A(50134);
        paint.setColor(-1);
        paint2.setColor(-1);
        paint2.setAlpha(0);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.OVERLAY));
    }

    private void A00() {
        Rect bounds = getBounds();
        if (bounds == null || this.A05 == null) {
            return;
        }
        if (!this.A06 || bounds.height() <= this.A02) {
            66S r0 = this.A05;
            Path path = this.A09;
            path.reset();
            this.A08.reset();
            this.A0A.setEmpty();
            path.moveTo(bounds.left, bounds.top + r0.A02);
            A03(path, bounds, r0);
            path.lineTo(bounds.right, bounds.bottom - r0.A01);
            A02(path, bounds, r0);
            path.close();
            return;
        }
        66S r02 = this.A05;
        Path path2 = this.A09;
        path2.reset();
        Path path3 = this.A08;
        path3.reset();
        int i = r02.A02;
        int i2 = r02.A03;
        int max = Math.max(i, i2);
        if (max > 0) {
            path2.moveTo(bounds.left, bounds.top + max);
            if (i < max) {
                path2.lineTo(bounds.left, bounds.top + i);
            }
            A03(path2, bounds, r02);
            if (i2 < max) {
                path2.lineTo(bounds.right, bounds.top + max);
            }
            path2.close();
        }
        int i3 = r02.A00;
        int i4 = r02.A01;
        int max2 = Math.max(i3, i4);
        if (max2 > 0) {
            path3.moveTo(bounds.right, bounds.bottom - max2);
            if (i4 < max2) {
                path3.lineTo(bounds.right, bounds.bottom - i4);
            }
            A02(path3, bounds, r02);
            if (i3 < max2) {
                path3.lineTo(bounds.left, bounds.bottom - max2);
            }
            path3.close();
        }
        if (max + max2 < bounds.height()) {
            this.A0A.set(bounds.left, bounds.top + max, bounds.right, bounds.bottom - max2);
        } else {
            this.A0A.setEmpty();
        }
    }

    private void A01(Canvas canvas, Paint paint) {
        Path path = this.A09;
        if (!path.isEmpty()) {
            canvas.drawPath(path, paint);
        }
        Path path2 = this.A08;
        if (!path2.isEmpty()) {
            canvas.drawPath(path2, paint);
        }
        Rect rect = this.A0A;
        if (rect.isEmpty()) {
            return;
        }
        canvas.drawRect(rect, paint);
    }

    private void A02(Path path, Rect rect, 66S r304) {
        int i = r304.A01;
        if (i > 0) {
            RectF rectF = this.A0D;
            int i2 = rect.right;
            rectF.set(i2 - (i * 2), r0 - r0, i2, rect.bottom);
            path.arcTo(rectF, 0.0f, 90.0f);
        }
        path.lineTo(rect.left + i, rect.bottom);
        int i3 = r304.A00;
        if (i3 > 0) {
            RectF rectF2 = this.A0D;
            int i4 = i3 * 2;
            rectF2.set(rect.left, r0 - i4, r0 + i4, rect.bottom);
            path.arcTo(rectF2, 90.0f, 90.0f);
        }
    }

    private void A03(Path path, Rect rect, 66S r304) {
        int i = r304.A02;
        if (i > 0) {
            RectF rectF = this.A0D;
            float f = rect.left;
            float f2 = rect.top;
            int i2 = i * 2;
            rectF.set(f, f2, r0 + i2, r0 + i2);
            path.arcTo(rectF, 180.0f, 90.0f);
        }
        int i3 = rect.right;
        int i4 = r304.A03;
        path.lineTo(i3 - i4, rect.top);
        if (i4 > 0) {
            RectF rectF2 = this.A0D;
            int i5 = rect.right;
            rectF2.set(i5 - (i4 * 2), rect.top, i5, r0 + r0);
            path.arcTo(rectF2, 270.0f, 90.0f);
        }
    }

    public static void A04(C6nd c6nd) {
        Paint paint = c6nd.A0B;
        paint.setColor(c6nd.A00);
        paint.setAlpha(255 - c6nd.A01);
        c6nd.A0C.setAlpha(c6nd.A01);
    }

    public void A05(int i, boolean z) {
        Paint paint = this.A0C;
        if (i == paint.getColor() && z == this.A07) {
            return;
        }
        paint.setColor(i);
        paint.setXfermode(z ? this.A03.A00 : null);
        this.A07 = z;
        A04(this);
        invalidateSelf();
    }

    public void A06(7uW r302) {
        if (this.A04 != r302) {
            this.A04 = r302;
            invalidateSelf();
        }
    }

    public void A07(66S r302) {
        if (r302.equals(this.A05)) {
            return;
        }
        this.A05 = r302;
        A00();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        LinearGradient linearGradient;
        if (this.A05 != null) {
            if (!this.A06) {
                this.A02 = canvas.getMaximumBitmapHeight();
                this.A06 = true;
                if (getBounds().height() > this.A02) {
                    A00();
                }
            }
            7uW r0 = this.A04;
            Paint paint = this.A0C;
            if (r0 != null) {
                Rect bounds = getBounds();
                if (r0.A01 == 0S2.A00) {
                    float f = bounds.top;
                    float f2 = r0.A00;
                    linearGradient = new LinearGradient(0.0f, f + f2, 0.0f, bounds.bottom - f2, r0.A02, (float[]) null, Shader.TileMode.CLAMP);
                } else {
                    float f3 = bounds.left;
                    float f4 = r0.A00;
                    linearGradient = new LinearGradient(f3 - f4, 0.0f, bounds.right + f4, 0.0f, r0.A02, (float[]) null, Shader.TileMode.CLAMP);
                }
            } else {
                linearGradient = null;
            }
            paint.setShader(linearGradient);
            A01(canvas, paint);
            if (!this.A07 || this.A01 == 255) {
                return;
            }
            A01(canvas, this.A0B);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        A00();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.A01) {
            this.A01 = i;
            A04(this);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Paint paint = this.A0C;
        if (colorFilter.equals(paint.getColorFilter())) {
            return;
        }
        paint.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
