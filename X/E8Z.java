package X;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: E8Z.class */
public final class E8Z extends E8c {
    public Equ A00;

    @Override // X.E8c, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Equ equ = this.A00;
        if (equ.A04) {
            Path path = equ.A08;
            if (path.isEmpty()) {
                RectF rectF = equ.A09;
                float f = equ.A00;
                RectF rectF2 = equ.A0A;
                rectF.set(f, f, rectF2.right - f, rectF2.bottom - f);
                Path.Direction direction = Path.Direction.CW;
                path.addRect(rectF2, direction);
                int i = equ.A03;
                boolean A02 = FB0.A02(i);
                float f2 = equ.A02;
                if (A02) {
                    path.addRoundRect(rectF2, f2, f2, Path.Direction.CCW);
                } else {
                    float[] fArr = equ.A0C;
                    FB0.A01(fArr, f2, i);
                    path.addRoundRect(rectF2, fArr, direction);
                    Path path2 = equ.A07;
                    path2.reset();
                    FB0.A01(fArr, equ.A01, equ.A03);
                    path2.addRoundRect(rectF, fArr, direction);
                }
            }
            canvas.drawPath(path, equ.A06);
            if (!FB0.A02(equ.A03)) {
                canvas.drawPath(equ.A07, equ.A05);
                return;
            }
            RectF rectF3 = equ.A09;
            float f3 = equ.A01;
            canvas.drawRoundRect(rectF3, f3, f3, equ.A05);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Equ equ = this.A00;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        RectF rectF = equ.A0A;
        float f = rectF.right;
        float f2 = measuredWidth;
        if (f == f2 && rectF.bottom == measuredHeight) {
            return;
        }
        rectF.set(0.0f, 0.0f, f2, measuredHeight);
        equ.A08.reset();
    }
}
