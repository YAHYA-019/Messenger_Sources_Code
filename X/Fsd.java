package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* loaded from: Fsd.class */
public final class Fsd implements GJf {
    public final float A00;
    public final float A01;
    public final int A02;
    public final Bitmap A03;
    public final Rect A04;

    public Fsd(Resources resources, Bitmap bitmap, int i) {
        this.A03 = bitmap;
        this.A02 = i;
        this.A01 = bitmap.getScaledWidth(resources.getDisplayMetrics()) / i;
        this.A00 = bitmap.getScaledHeight(resources.getDisplayMetrics()) / 1.0f;
        this.A04 = new Rect(0, 0, bitmap.getWidth() / i, bitmap.getHeight() / 1);
    }

    @Override // X.GJf
    public void AOM(Canvas canvas, Paint paint, Rect rect, int i) {
        11T.A0F(paint, 3);
        int i2 = this.A02;
        int i3 = i % i2;
        int i4 = i / i2;
        Rect rect2 = this.A04;
        Bitmap bitmap = this.A03;
        rect2.offsetTo((bitmap.getWidth() * i3) / i2, (bitmap.getHeight() * i4) / 1);
        canvas.drawBitmap(bitmap, rect2, rect, paint);
    }

    @Override // X.GJf
    public float Arq() {
        return this.A00;
    }

    @Override // X.GJf
    public float Arr() {
        return this.A01;
    }
}
