package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/* renamed from: X.Ggu, reason: case insensitive filesystem */
/* loaded from: Ggu.class */
public final class C2546Ggu extends 9AT {
    public final Path A00;

    public C2546Ggu(Path path) {
        this.A00 = path;
    }

    public void A00(Canvas canvas, Paint paint) {
        11T.A0F(paint, 1);
        canvas.drawPath(this.A00, paint);
    }
}
