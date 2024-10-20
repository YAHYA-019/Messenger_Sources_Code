package X;

import android.content.Context;
import android.view.View;

/* loaded from: E0z.class */
public final class E0z extends C2X6 {
    public final float A00;
    public final int A01;
    public final int A02;

    public E0z(Context context, float f, int i, int i2, int i3, boolean z) {
        super(context, i, z);
        this.A02 = i2;
        this.A00 = Math.min(f, 0.5f);
        this.A01 = i3;
    }

    @Override // X.C2X6, X.C2X7
    public int AcU(C2hn c2hn, int i) {
        int mode = View.MeasureSpec.getMode(i);
        int i2 = (-1) << (-1);
        if (mode != 1073741824 && mode != i2) {
            return super.AcU(c2hn, i);
        }
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.A02;
        if (i3 > 0) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(i3, size), 1073741824);
        }
        float f = this.A00;
        if (f <= 0.0f) {
            return View.MeasureSpec.makeMeasureSpec(size, i2);
        }
        float f2 = size;
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (f2 - (((f * f2) + this.A01) * 2.0f))), i2);
    }
}
