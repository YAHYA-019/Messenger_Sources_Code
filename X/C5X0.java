package X;

import android.view.animation.Interpolator;

/* renamed from: X.5X0, reason: invalid class name */
/* loaded from: 5X0.class */
public final class C5X0 implements 5Rm {
    public final int A00;
    public final Interpolator A01;

    public C5X0(int i) {
        this(C3s9.A00, i);
    }

    public C5X0(Interpolator interpolator, int i) {
        this.A00 = i;
        this.A01 = interpolator;
    }

    public C5hx AJ4(C5hv c5hv) {
        return new C5hw(this.A01, c5hv, this.A00);
    }
}
