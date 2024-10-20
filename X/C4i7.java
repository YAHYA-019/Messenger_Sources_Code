package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;

/* renamed from: X.4i7, reason: invalid class name */
/* loaded from: 4i7.class */
public final class C4i7 extends ShapeDrawable.ShaderFactory {
    public 5YT A00;
    public final int A01;
    public final int A02;
    public final BitmapShader A03;
    public final Matrix A04 = new Matrix();
    public final RectF A05 = new RectF();

    public C4i7(Bitmap bitmap, 5YT r303) {
        this.A00 = r303;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.A03 = new BitmapShader(bitmap, tileMode, tileMode);
        this.A02 = bitmap.getWidth();
        this.A01 = bitmap.getHeight();
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public Shader resize(int i, int i2) {
        float f;
        float f2;
        5YT r0 = this.A00;
        if (r0 != null) {
            RectF rectF = this.A05;
            r0.B1k(rectF);
            f = rectF.width();
            f2 = rectF.height();
        } else {
            f = i;
            f2 = i2;
        }
        float f3 = this.A02;
        float f4 = this.A01;
        float f5 = f3 / f4 >= f / f2 ? f2 / f4 : f / f4;
        Matrix matrix = this.A04;
        matrix.reset();
        matrix.postTranslate((-r0) / 2, (-r0) / 2);
        matrix.postScale(f5, f5);
        RectF rectF2 = this.A05;
        matrix.postTranslate(rectF2.left + (f / 2.0f), rectF2.top + (f2 / 2.0f));
        BitmapShader bitmapShader = this.A03;
        bitmapShader.setLocalMatrix(matrix);
        return bitmapShader;
    }
}
