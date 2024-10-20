package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;

/* loaded from: Jsk.class */
public final class Jsk extends 6OU implements 6OY {
    public float A00;
    public float A01;
    public final Matrix A02;
    public final Paint A03;

    public Jsk(5IW r302, 6OQ r303) {
        super(r302, r303);
        5Ir A02 = r303.A02(r302.A0L);
        this.A00 = A02.A01.A01 / A02.A00.getWidth();
        this.A01 = A02.A01.A00 / A02.A00.getHeight();
        Matrix A0F = GOn.A0F();
        this.A02 = A0F;
        A0F.preScale(this.A00, this.A01);
        this.A03 = GOo.A0B();
    }

    public void A08() {
        super.A08();
        Matrix matrix = this.A02;
        matrix.reset();
        float f = this.A00;
        float f2 = ((6OU) this).A0B.A00;
        matrix.preScale(f * f2, this.A01 * f2);
    }

    public void A0A(float f) {
        this.A03.setAlpha(((6OU) this).A01);
    }

    public void A0B(Canvas canvas) {
        try {
            Bitmap bitmap = ((6OU) this).A0B.A02(((6OU) this).A04.A0L).A00;
            if (bitmap == null || bitmap.isRecycled()) {
                return;
            }
            canvas.drawBitmap(bitmap, this.A02, this.A03);
        } catch (54H unused) {
        }
    }

    public void A0F(RectF rectF) {
        try {
            6OQ r0 = ((6OU) this).A0B;
            Bitmap bitmap = r0.A02(((6OU) this).A04.A0L).A00;
            if (bitmap == null || bitmap.isRecycled()) {
                return;
            }
            rectF.set(0.0f, 0.0f, bitmap.getWidth() * r0.A00 * this.A00, bitmap.getHeight() * r0.A00 * this.A01);
        } catch (54H unused) {
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A03.setColorFilter(colorFilter);
    }
}
