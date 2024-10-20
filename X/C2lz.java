package X;

import android.view.View;

/* renamed from: X.2lz, reason: invalid class name */
/* loaded from: 2lz.class */
public abstract class C2lz {
    public static final int A00(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int i3 = (-1) << (-1);
        if (mode != i3) {
            if (mode == 0) {
                return C1tN.A00;
            }
            i3 = 1073741824;
            if (mode != 1073741824) {
                throw AnonymousClass001.A0N(0Pz.A0T("Invalid spec mode: ", mode));
            }
        }
        int max = Math.max(0, size - i2);
        int i4 = C1tN.A00;
        return View.MeasureSpec.makeMeasureSpec(max, i3);
    }
}
