package X;

import android.view.View;
import java.util.List;

/* renamed from: X.3Yl, reason: invalid class name */
/* loaded from: 3Yl.class */
public final class C3Yl implements C2k0 {
    public final /* synthetic */ 2iK A00;
    public final /* synthetic */ C2X1 A01;

    public C3Yl(2iK r302, C2X1 c2x1) {
        this.A01 = c2x1;
        this.A00 = r302;
    }

    @Override // X.C2k0
    public void CKx(int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        int i6;
        2iK r0 = this.A00;
        synchronized (r0) {
            i4 = r0.A00;
        }
        if (i4 != i3) {
            synchronized (r0) {
                r0.A00 = i3;
            }
            C2X1 c2x1 = this.A01;
            if (c2x1.A1B != null) {
                int B9E = c2x1.A0U.B9E();
                C23P c23p = c2x1.A1B;
                int i7 = B9E == 0 ? c23p.A00 : c23p.A01;
                if (i7 != -1) {
                    synchronized (r0) {
                        i6 = r0.A00;
                    }
                    if (i6 <= i7) {
                        return;
                    }
                }
            }
            synchronized (c2x1) {
                if (c2x1.A1B != null && !c2x1.A0q) {
                    List list = c2x1.A0k;
                    int size = list.size();
                    int i8 = 0;
                    for (int i9 = 0; i9 < size; i9++) {
                        2iK r02 = (2iK) list.get(i9);
                        synchronized (r02) {
                            i5 = r02.A00;
                        }
                        if (i5 > i8) {
                            i8 = i5;
                        }
                    }
                    if (i8 != c2x1.A1B.A00) {
                        int max = Math.max(c2x1.A0U.A9A(View.MeasureSpec.getSize(c2x1.A06), View.MeasureSpec.getSize(c2x1.A05), i2, i8), 1);
                        c2x1.A1B.A00 = i8;
                        c2x1.A04 = max;
                    }
                }
                C2X1.A0O(c2x1);
            }
        }
    }
}
