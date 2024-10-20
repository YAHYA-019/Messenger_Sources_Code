package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;

/* renamed from: X.6kb, reason: invalid class name */
/* loaded from: 6kb.class */
public final class C6kb extends Drawable.ConstantState {
    public final int A00;
    public final String A01;
    public final Typeface A02;

    public C6kb(Typeface typeface, String str, int i) {
        this.A01 = str;
        this.A02 = typeface;
        this.A00 = i;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        final String str = this.A01;
        final Typeface typeface = this.A02;
        final int i = this.A00;
        return new Drawable(typeface, str, i) { // from class: X.6ka
            public float A00;
            public int A01;
            public int A02;
            public final float A03;
            public final float A04;
            public final Paint A05;
            public final C6kb A06;

            {
                Paint paint = new Paint();
                this.A05 = paint;
                this.A00 = 0.0f;
                this.A02 = 0;
                this.A01 = 0;
                this.A06 = new C6kb(typeface, str, i);
                paint.setTypeface(typeface);
                paint.setTextAlign(Paint.Align.CENTER);
                paint.setTextSize(64.0f);
                Paint.FontMetrics fontMetrics = paint.getFontMetrics();
                float f = fontMetrics.descent;
                float f2 = fontMetrics.ascent;
                this.A03 = 64.0f / ((f - f2) * 1.0625f);
                this.A04 = (-f2) / 64.0f;
            }

            @Override // android.graphics.drawable.Drawable
            public void draw(Canvas canvas) {
                Rect bounds = getBounds();
                canvas.drawText(this.A06.A01, (bounds.left + bounds.right) / 2, bounds.top + this.A00, this.A05);
            }

            @Override // android.graphics.drawable.Drawable
            public Drawable.ConstantState getConstantState() {
                return this.A06;
            }

            @Override // android.graphics.drawable.Drawable
            public int getIntrinsicHeight() {
                return this.A06.A00;
            }

            @Override // android.graphics.drawable.Drawable
            public int getIntrinsicWidth() {
                return this.A06.A00;
            }

            @Override // android.graphics.drawable.Drawable
            public int getOpacity() {
                return -3;
            }

            @Override // android.graphics.drawable.Drawable
            public void setAlpha(int i2) {
                this.A05.setAlpha(i2);
            }

            @Override // android.graphics.drawable.Drawable
            public void setBounds(int i2, int i3, int i4, int i5) {
                super.setBounds(i2, i3, i4, i5);
                int i6 = i4 - i2;
                int i7 = i5 - i3;
                if (i6 == this.A02 && i7 == this.A01) {
                    return;
                }
                this.A02 = i6;
                this.A01 = i7;
                float min = Math.min(i6, i7) * this.A03;
                this.A05.setTextSize(min);
                this.A00 = min * this.A04;
            }

            @Override // android.graphics.drawable.Drawable
            public void setColorFilter(ColorFilter colorFilter) {
                this.A05.setColorFilter(colorFilter);
            }
        };
    }
}
