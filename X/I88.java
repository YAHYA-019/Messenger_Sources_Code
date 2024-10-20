package X;

import android.util.LongSparseArray;
import com.facebook.quicklog.QuickPerformanceLogger;

/* loaded from: I88.class */
public final class I88 {
    public final 1Br A01 = 7zM.A0S();
    public final LongSparseArray A00 = new LongSparseArray();

    public static final void A00(I88 i88, int i, int i2, long j) {
        1Br r0 = i88.A01;
        7zP.A0e(r0).markerStart(i, i2);
        7zP.A0e(r0).markerAnnotate(i, i2, "effect_id", Long.toString(j));
    }

    public static final void A01(I88 i88, long j, short s) {
        Number number = (Number) i88.A00.get(j);
        if (number != null) {
            int intValue = number.intValue();
            1Br r0 = i88.A01;
            7zP.A0e(r0).markerEnd(51970054, intValue, s);
            7zP.A0e(r0).markerEnd(51970055, intValue, s);
        }
    }

    public void A02(long j, boolean z) {
        Number number;
        if (AbstractC2326GOr.A1V() || (number = (Number) this.A00.get(j)) == null) {
            return;
        }
        int intValue = number.intValue();
        QuickPerformanceLogger A0e = 7zP.A0e(this.A01);
        int i = 51970052;
        if (z) {
            i = 51970050;
        }
        A0e.markerEnd(i, intValue, (short) 2);
    }
}
