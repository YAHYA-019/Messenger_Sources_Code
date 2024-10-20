package X;

import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.fonts.Font;

/* loaded from: L5k.class */
public abstract class L5k {
    public static final void A00(Canvas canvas, NinePatch ninePatch, Paint paint, Rect rect) {
        canvas.drawPatch(ninePatch, rect, paint);
    }

    public static final void A01(Canvas canvas, NinePatch ninePatch, Paint paint, RectF rectF) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }

    public static final void A02(Canvas canvas, Paint paint, Font font, float[] fArr, int[] iArr, int i, int i2, int i3) {
        canvas.drawGlyphs(iArr, i, fArr, i2, i3, font, paint);
    }
}
