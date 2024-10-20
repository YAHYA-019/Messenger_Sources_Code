package X;

import android.content.Context;
import android.util.SparseIntArray;

/* loaded from: I6v.class */
public abstract class I6v {
    public static final HXK A02 = new HXK();
    public static final SparseIntArray A00 = new SparseIntArray();
    public static final 1Br A01 = 1Bq.A00(33053);

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A00(Context context, int i) {
        Hhn hhn = new Hhn(context);
        HwX hwX = HwX.A00;
        11T.A0F(hwX, 2);
        J7J j7j = hhn.A02;
        Object obj = (HgW) j7j.A00.A3p();
        if (obj == null) {
            obj = new Object();
        }
        obj.A02 = hhn;
        obj.A00 = i;
        obj.A03 = hwX;
        try {
            j7j.A01.put(obj);
        } catch (InterruptedException e) {
            throw new RuntimeException("Failed to enqueue async inflate request", e);
        }
    }

    public static final void A01(Context context, int i, int i2) {
        A00.put(i, 1);
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= i2) {
                return;
            }
            A00(context, i);
            i3 = i4 + 1;
        }
    }
}
