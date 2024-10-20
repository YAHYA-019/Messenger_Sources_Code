package X;

import android.view.View;

/* renamed from: X.2ra, reason: invalid class name */
/* loaded from: 2ra.class */
public abstract class C2ra {
    public static final int A00(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int i2 = (-1) << (-1);
        if (mode != i2) {
            if (mode == 0) {
                return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0);
            }
            i2 = 1073741824;
            if (mode != 1073741824) {
                throw AnonymousClass001.A0N("Unexpected size spec mode");
            }
        }
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), i2);
    }

    public static final int A01(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == ((-1) << (-1))) {
            return Math.min(View.MeasureSpec.getSize(i), i2);
        }
        if (mode != 0) {
            if (mode != 1073741824) {
                throw AnonymousClass001.A0N("Unexpected size spec mode");
            }
            i2 = View.MeasureSpec.getSize(i);
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x023e, code lost:
    
        if (r0 > r0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x026c, code lost:
    
        if (r0 > r0) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v128, types: [java.util.AbstractCollection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A02(X.C23P r301, float r302, int r303, int r304) {
        /*
            Method dump skipped, instructions count: 695
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2ra.A02(X.23P, float, int, int):void");
    }

    public static final void A03(C23P c23p, float f, int i, int i2, int i3, int i4) {
        11T.A0F(c23p, 5);
        int i5 = (-1) << (-1);
        if (View.MeasureSpec.getMode(i) == i5 && View.MeasureSpec.getSize(i) > i3) {
            i = View.MeasureSpec.makeMeasureSpec(i3, i5);
        }
        if (View.MeasureSpec.getMode(i2) == i5 && View.MeasureSpec.getSize(i2) > i4) {
            i2 = View.MeasureSpec.makeMeasureSpec(i4, i5);
        }
        A02(c23p, f, i, i2);
    }

    public static final void A04(C23P c23p, int i, int i2) {
        11T.A0F(c23p, 2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 0) {
            int i3 = (-1) << (-1);
            if (mode == i3) {
                if (mode2 == i3) {
                    size = Math.min(size, size2);
                } else if (mode2 != 0) {
                    if (mode2 == 1073741824) {
                        c23p.A00 = size2;
                        c23p.A01 = Math.min(size, size2);
                        return;
                    }
                }
                c23p.A01 = size;
                c23p.A00 = size;
                return;
            }
            if (mode == 1073741824) {
                c23p.A01 = size;
                if (mode2 == i3) {
                    size = Math.min(size, size2);
                } else if (mode2 != 0) {
                    if (mode2 == 1073741824) {
                        c23p.A00 = size2;
                        return;
                    }
                }
                c23p.A00 = size;
                return;
            }
        } else if (mode2 == 0) {
            c23p.A01 = 0;
            c23p.A00 = 0;
            return;
        }
        c23p.A00 = size2;
        c23p.A01 = size2;
    }

    public static final void A05(C23P c23p, int i, int i2, int i3, int i4) {
        11T.A0F(c23p, 4);
        c23p.A01 = A01(i, i3);
        c23p.A00 = A01(i2, i4);
    }
}
