package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;

/* renamed from: X.92n, reason: invalid class name */
/* loaded from: 92n.class */
public final class C92n extends DN9 {
    public float A00;
    public float A01;
    public ValueAnimator A02;
    public final GradientDrawable A03;

    public C92n(Context context, float f) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.A03 = gradientDrawable;
        this.A02 = ValueAnimator.ofFloat(0.0f, 1.0f);
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setColor(context.getColor(2132214484));
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    public void draw(Canvas canvas) {
        11T.A0F(canvas, 0);
        GradientDrawable gradientDrawable = this.A03;
        gradientDrawable.setBounds(getBounds().left, getBounds().bottom - 100, getBounds().right, getBounds().bottom);
        float A02 = 7zN.A02(this);
        int save = canvas.save();
        canvas.rotate(this.A01, A02 + 0.0f, getBounds().bottom - (100.0f * 0.5f));
        try {
            float f = this.A00;
            int save2 = canvas.save();
            canvas.translate(0.0f, f);
            try {
                gradientDrawable.draw(canvas);
                canvas.restoreToCount(save2);
                canvas.restoreToCount(save);
                invalidateSelf();
            } catch (Throwable th) {
                canvas.restoreToCount(save2);
                throw th;
            }
        } catch (Throwable th2) {
            canvas.restoreToCount(save);
            throw th2;
        }
    }

    public int getOpacity() {
        return -3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onBoundsChange(Rect rect) {
        11T.A0F(rect, 0);
        super/*android.graphics.drawable.Drawable*/.onBoundsChange(rect);
        ValueAnimator valueAnimator = this.A02;
        valueAnimator.cancel();
        this.A01 = 0.0f;
        this.A00 = 0.0f;
        valueAnimator.setDuration(300L);
        C9ne.A00(valueAnimator, this, 12);
        0K6.A00(valueAnimator);
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
