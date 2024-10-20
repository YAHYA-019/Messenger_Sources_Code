package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: Fsc.class */
public final class Fsc implements GJf {
    public final int A00;
    public final Drawable A01;

    public Fsc(Drawable drawable, int i) {
        this.A01 = drawable;
        this.A00 = i;
        drawable.mutate();
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // X.GJf
    public void AOM(Canvas canvas, Paint paint, Rect rect, int i) {
        11T.A0F(paint, 3);
        Drawable drawable = this.A01;
        drawable.setColorFilter(paint.getColorFilter());
        drawable.setAlpha(paint.getAlpha());
        float width = rect.width() / Arr();
        float height = rect.height() / Arq();
        int i2 = this.A00;
        int i3 = i % i2;
        int i4 = i / i2;
        float Arr = rect.left + ((-i3) * Arr());
        float Arq = rect.top + ((-i4) * Arq());
        int save = canvas.save();
        try {
            canvas.clipRect(rect);
            canvas.scale(width, height, rect.left, rect.top);
            canvas.translate(Arr, Arq);
            drawable.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // X.GJf
    public float Arq() {
        return this.A01.getIntrinsicHeight() / 1.0f;
    }

    @Override // X.GJf
    public float Arr() {
        return this.A01.getIntrinsicWidth() / this.A00;
    }
}
