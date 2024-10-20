package X;

import android.util.SparseIntArray;

/* renamed from: X.3wj, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3wj.class */
public abstract class AbstractC02903wj {
    public final SparseIntArray A01 = new SparseIntArray();
    public final SparseIntArray A00 = new SparseIntArray();

    public int A00(int i) {
        C02913wk c02913wk;
        C2X1 c2x1;
        C2hn A02;
        if ((this instanceof C02893wi) || (c2x1 = (c02913wk = ((C02923wl) this).A00).A00) == null) {
            return 1;
        }
        synchronized (c2x1) {
            1sP.A00();
            A02 = ((2iK) c2x1.A0k.get(i)).A02();
        }
        return A02.BT1() ? c02913wk.A01.A00 : A02.BBq();
    }

    public int A01(int i, int i2) {
        if (this instanceof C02893wi) {
            return i % i2;
        }
        int A00 = A00(i);
        if (A00 == i2) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int A002 = A00(i4);
            i3 += A002;
            if (i3 == i2) {
                i3 = 0;
            } else if (i3 > i2) {
                i3 = A002;
            }
        }
        if (A00 + i3 <= i2) {
            return i3;
        }
        return 0;
    }
}
