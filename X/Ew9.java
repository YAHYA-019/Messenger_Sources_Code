package X;

import android.util.LongSparseArray;

/* loaded from: Ew9.class */
public final class Ew9 {
    public final LongSparseArray A00;
    public final C23a A01;

    public Ew9(C23d c23d, DLQ dlq) {
        this.A00 = new LongSparseArray(dlq.A0G().size());
        this.A01 = (C23a) c23d.A06.getValue();
    }

    public final F63 A00(DLQ dlq, boolean z) {
        11T.A0F(dlq, 0);
        long A05 = AbM.A05(Integer.valueOf(dlq.A04), Boolean.valueOf(z));
        F63 f63 = (F63) this.A00.get(A05);
        if (f63 == null) {
            f63 = (F63) this.A01.A00(Long.valueOf(A05));
            if (f63 == null) {
                f63 = null;
            }
        }
        return f63;
    }

    public final void A01(F63 f63, DLQ dlq, boolean z) {
        11T.A0H(dlq, f63);
        long A05 = AbM.A05(Integer.valueOf(dlq.A04), Boolean.valueOf(z));
        this.A00.put(A05, f63);
        C23a c23a = this.A01;
        Long valueOf = Long.valueOf(A05);
        11T.A0F(valueOf, 0);
        c23a.A00.put(valueOf, f63);
    }
}
