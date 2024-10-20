package X;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

/* loaded from: Equ.class */
public final class Equ {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public boolean A04;
    public final View A0B;
    public final Paint A06 = DKC.A0A(1);
    public final Paint A05 = DKC.A0A(1);
    public final Path A08 = DKC.A0B();
    public final RectF A0A = DKC.A0D();
    public final RectF A09 = DKC.A0D();
    public final Path A07 = DKC.A0B();
    public final float[] A0C = new float[8];

    public Equ(View view) {
        this.A0B = view;
    }
}
