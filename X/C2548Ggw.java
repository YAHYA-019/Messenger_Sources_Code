package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: X.Ggw, reason: case insensitive filesystem */
/* loaded from: Ggw.class */
public final class C2548Ggw extends 9AT {
    public final float A00;
    public final float A01;
    public final RectF A02;

    public C2548Ggw(RectF rectF, float f, float f2) {
        this.A02 = rectF;
        this.A00 = f;
        this.A01 = f2;
    }

    public void A00(Canvas canvas, Paint paint) {
        11T.A0F(paint, 1);
        canvas.drawRoundRect(this.A02, this.A00, this.A01, paint);
    }
}
