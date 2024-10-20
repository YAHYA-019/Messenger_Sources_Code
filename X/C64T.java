package X;

import android.content.Context;
import android.graphics.Point;
import android.view.View;

/* renamed from: X.64T, reason: invalid class name */
/* loaded from: 64T.class */
public final class C64T {
    public final 1Br A00 = 1Bq.A00(49420);
    public final 1Br A01 = 1Bq.A00(65609);
    public final 1Br A02 = 1Bq.A00(68080);
    public final 1Br A03 = 1Bu.A00(83024);
    public final 1Br A04 = 1Bu.A00(67037);

    public final Point A00(Context context, int i, int i2, int i3, int i4, boolean z) {
        int i5 = i4;
        11T.A0F(context, 4);
        if (i2 == 0 || i3 == 0) {
            return new Point();
        }
        int size = View.MeasureSpec.getSize(i);
        C6e4 c6e4 = (C6e4) this.A04.A00.get();
        if (c6e4.A01() == 0 || c6e4.A00() == 0) {
            C00i c00i = this.A02.A00;
            C54a c54a = (C54a) c00i.get();
            int A01 = i2 > i3 ? c54a.A01() : c54a.A03();
            double d = A01;
            int i6 = (int) ((i2 / i3) * d);
            int min = Math.min(size, ((C54a) c00i.get()).A02());
            if (i6 > min) {
                A01 = (int) (d * (min / i6));
                i5 = min;
            } else if (i6 < i5) {
                A01 = (int) (d * (i5 / i6));
            } else {
                i5 = i6;
            }
            return new Point(i5, A01);
        }
        int dimensionPixelSize = (context.getResources().getDimensionPixelSize(2132279311) * 2) + context.getResources().getDimensionPixelOffset(2132279320);
        if (z) {
            size = (int) (size * (((C6e4) r0.get()).A01() / 100.0f));
        }
        double d2 = i3;
        double d3 = i2;
        double d4 = d2 / d3;
        int i7 = (int) (size * d4);
        if (i7 < dimensionPixelSize) {
            return new Point(Double.valueOf(dimensionPixelSize * (d3 / d2)).intValue(), dimensionPixelSize);
        }
        int dimensionPixelOffset = (int) (context.getResources().getDimensionPixelOffset(2132279319) * (((C6e4) r0.get()).A00() / 100.0f));
        if (i3 < i2 && i7 <= dimensionPixelOffset) {
            return new Point(size, i7);
        }
        int intValue = Double.valueOf(dimensionPixelOffset * (d3 / d2)).intValue();
        if (intValue < dimensionPixelSize) {
            dimensionPixelOffset = (int) (dimensionPixelSize * d4);
        } else {
            dimensionPixelSize = intValue;
        }
        return new Point(dimensionPixelSize, dimensionPixelOffset);
    }
}
