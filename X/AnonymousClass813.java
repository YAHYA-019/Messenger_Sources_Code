package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.813, reason: invalid class name */
/* loaded from: 813.class */
public final class AnonymousClass813 extends Drawable {
    public 7XD A00;
    public boolean A01;
    public final Paint A02;
    public final RectF A03;
    public final RectF A04;

    public AnonymousClass813() {
        Paint paint = new Paint(1);
        this.A02 = paint;
        this.A04 = new RectF();
        this.A03 = new RectF();
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        11T.A0F(canvas, 0);
        if (this.A00 != null) {
            if (this.A01) {
                this.A01 = false;
                RectF rectF = this.A03;
                rectF.set(getBounds());
                if (this.A00 != null) {
                    float strokeWidth = this.A02.getStrokeWidth() / 2.0f;
                    11T.A0D(this.A00);
                    rectF.left += strokeWidth;
                    7XD r0 = this.A00;
                    11T.A0D(r0);
                    if (r0.A02) {
                        rectF.top += strokeWidth;
                    }
                    11T.A0D(this.A00);
                    rectF.right -= strokeWidth;
                    7XD r02 = this.A00;
                    11T.A0D(r02);
                    if (r02.A01) {
                        rectF.bottom -= strokeWidth;
                    }
                }
            }
            Paint paint = this.A02;
            float strokeWidth2 = paint.getStrokeWidth() / 2.0f;
            7XD r03 = this.A00;
            11T.A0D(r03);
            11T.A0D(r03.A00);
            float max = Math.max(r0.A02 - strokeWidth2, 0.0f);
            7XD r04 = this.A00;
            11T.A0D(r04);
            11T.A0D(r04.A00);
            float max2 = Math.max(r0.A03 - strokeWidth2, 0.0f);
            7XD r05 = this.A00;
            11T.A0D(r05);
            11T.A0D(r05.A00);
            float max3 = Math.max(r0.A00 - strokeWidth2, 0.0f);
            7XD r06 = this.A00;
            11T.A0D(r06);
            11T.A0D(r06.A00);
            float max4 = Math.max(r0.A01 - strokeWidth2, 0.0f);
            7XD r07 = this.A00;
            11T.A0D(r07);
            if (r07.A02) {
                RectF rectF2 = this.A03;
                float f = rectF2.left + max;
                float f2 = rectF2.top;
                canvas.drawLine(f, f2, rectF2.right - max2, f2, paint);
            }
            7XD r08 = this.A00;
            11T.A0D(r08);
            if (r08.A01) {
                RectF rectF3 = this.A03;
                float f3 = rectF3.left + max3;
                float f4 = rectF3.bottom;
                canvas.drawLine(f3, f4, rectF3.right - max4, f4, paint);
            }
            11T.A0D(this.A00);
            RectF rectF4 = this.A03;
            float f5 = rectF4.left;
            canvas.drawLine(f5, rectF4.top + max, f5, rectF4.bottom - max3, paint);
            11T.A0D(this.A00);
            float f6 = rectF4.right;
            canvas.drawLine(f6, rectF4.top + max2, f6, rectF4.bottom - max4, paint);
            if (max > 0.0f) {
                float f7 = max * 2.0f;
                RectF rectF5 = this.A04;
                float f8 = rectF4.left;
                float f9 = rectF4.top;
                rectF5.set(f8, f9, f8 + f7, f9 + f7);
                canvas.drawArc(rectF5, 180.0f, 90.0f, false, paint);
            }
            if (max2 > 0.0f) {
                float f10 = max2 * 2.0f;
                RectF rectF6 = this.A04;
                float f11 = rectF4.right;
                float f12 = f11 - f10;
                float f13 = rectF4.top;
                rectF6.set(f12, f13, f11, f13 + f10);
                canvas.drawArc(rectF6, 270.0f, 90.0f, false, paint);
            }
            if (max3 > 0.0f) {
                float f14 = max3 * 2.0f;
                RectF rectF7 = this.A04;
                float f15 = rectF4.left;
                float f16 = rectF4.bottom;
                rectF7.set(f15, f16 - f14, f15 + f14, f16);
                canvas.drawArc(rectF7, 90.0f, 90.0f, false, paint);
            }
            if (max4 > 0.0f) {
                float f17 = max4 * 2.0f;
                RectF rectF8 = this.A04;
                float f18 = rectF4.right;
                float f19 = f18 - f17;
                float f20 = rectF4.bottom;
                rectF8.set(f19, f20 - f17, f18, f20);
                canvas.drawArc(rectF8, 0.0f, 90.0f, false, paint);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        11T.A0F(rect, 0);
        super.onBoundsChange(rect);
        this.A01 = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Paint paint = this.A02;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Paint paint = this.A02;
        if (11T.A0O(colorFilter, paint.getColorFilter())) {
            return;
        }
        paint.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
