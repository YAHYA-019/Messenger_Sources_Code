package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.inject.FbInjector;

/* renamed from: X.2r1, reason: invalid class name */
/* loaded from: 2r1.class */
public final class C2r1 extends Drawable implements Drawable.Callback {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public ColorFilter A06;
    public Drawable A07;
    public 2zP A08;
    public Integer A09;
    public final Paint A0A;

    public C2r1(Resources resources) {
        Paint paint = new Paint();
        this.A0A = paint;
        this.A09 = 0S2.A01;
        this.A08 = 2zP.A01;
        this.A04 = 0;
        this.A05 = 0;
        this.A00 = 255;
        paint.setAntiAlias(true);
        paint.setColor(0);
        int A03 = C0A8.A03(resources, 2.0f);
        this.A03 = A03;
        this.A01 = A03;
    }

    public static void A00(Drawable drawable, C2r1 c2r1) {
        int i;
        int i2;
        if (drawable != null) {
            int intValue = c2r1.A09.intValue();
            if (intValue == 1) {
                Rect bounds = c2r1.getBounds();
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                int i3 = bounds.right;
                int i4 = i3 - intrinsicWidth;
                int i5 = bounds.bottom;
                drawable.setBounds(i4, i5 - intrinsicHeight, i3, i5);
                return;
            }
            if (intValue == 0) {
                Rect bounds2 = c2r1.getBounds();
                if (bounds2.isEmpty()) {
                    return;
                }
                1Bi.A03(67518);
                Context context = FbInjector.A03;
                11T.A0A(context);
                boolean A00 = C2rY.A00(context);
                float f = c2r1.A02 * 2;
                int width = (int) ((bounds2.width() * 0.73f) - c2r1.A02);
                int height = (int) ((bounds2.height() * 0.73f) - c2r1.A02);
                int width2 = (int) ((bounds2.width() * 0.25f) + f);
                int height2 = (int) ((bounds2.height() * 0.25f) + f);
                int i6 = A00 ? bounds2.right - width : bounds2.left + width;
                int i7 = bounds2.top;
                int i8 = height + i7;
                int i9 = width2 + i6;
                if (c2r1.A08 == 2zP.A02) {
                    drawable.setBounds(i6, i7, i9, i7 + height2);
                    return;
                } else {
                    drawable.setBounds(i6, i8, i9, height2 + i8);
                    return;
                }
            }
            if (intValue == 2) {
                Rect bounds3 = c2r1.getBounds();
                1Bi.A03(67518);
                Context context2 = FbInjector.A03;
                11T.A0A(context2);
                boolean A002 = C2rY.A00(context2);
                int i10 = c2r1.A05;
                int i11 = c2r1.A02 * 2;
                int i12 = i10 + i11;
                int i13 = c2r1.A04 + i11;
                int width3 = (A002 ? bounds3.left + ((int) (bounds3.width() * 0.1464f)) : bounds3.right - ((int) (bounds3.width() * 0.1464f))) + (i12 / 2);
                int i14 = width3 - i12;
                if (c2r1.A08 == 2zP.A02) {
                    i = (bounds3.top + ((int) (bounds3.height() * 0.1464f))) - (i13 / 2);
                    i2 = i13 + i;
                } else {
                    int height3 = (i13 / 2) + (bounds3.bottom - ((int) (bounds3.height() * 0.1464f)));
                    i = height3 - i13;
                    i2 = height3;
                }
                drawable.setBounds(i14, i, width3, i2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.A07 != null) {
            Paint paint = this.A0A;
            if (Color.alpha(paint.getColor()) != 0) {
                Drawable drawable = this.A07;
                if (drawable instanceof 5TD) {
                    if (drawable != null) {
                        int i = drawable.getBounds().left;
                        int i2 = this.A01;
                        RectF rectF = new RectF(i - i2, r0.top - i2, r0.right + i2, r0.bottom + i2);
                        float height = rectF.height() / 2.0f;
                        canvas.drawRoundRect(rectF, height, height, paint);
                    }
                } else if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    canvas.drawCircle(bounds.centerX(), bounds.centerY(), (Math.max(bounds.width(), bounds.height()) / 2) + this.A01, paint);
                }
            }
            this.A07.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.A07;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (drawable == this.A07) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.A07) {
            scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.A00 = i;
        Drawable drawable = this.A07;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        A00(this.A07, this);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.A06 = colorFilter;
        Drawable drawable = this.A07;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.A07) {
            unscheduleSelf(runnable);
        }
    }
}
