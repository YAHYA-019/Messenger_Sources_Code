package X;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: X.Ggx, reason: case insensitive filesystem */
/* loaded from: Ggx.class */
public final class C2549Ggx extends 9AT {
    public final float A00;
    public final float A01;
    public final float A02;
    public final Boolean A03;

    public C2549Ggx(Boolean bool, float f, float f2, float f3) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = bool;
    }

    public void A00(Canvas canvas, Paint paint) {
        11T.A0F(paint, 1);
        Boolean bool = this.A03;
        if (bool == null) {
            canvas.drawCircle(this.A00, this.A01, this.A02, paint);
            return;
        }
        boolean isAntiAlias = paint.isAntiAlias();
        paint.setAntiAlias(bool.booleanValue());
        canvas.drawCircle(this.A00, this.A01, this.A02, paint);
        paint.setAntiAlias(isAntiAlias);
    }
}
