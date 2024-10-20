package X;

import android.util.SparseArray;

/* loaded from: Fx7.class */
public final class Fx7 implements GH6 {
    public final /* synthetic */ C23d A00;
    public final /* synthetic */ DLQ A01;

    public Fx7(C23d c23d, DLQ dlq) {
        this.A01 = dlq;
        this.A00 = c23d;
    }

    @Override // X.GH6
    public boolean DA1(DLQ dlq) {
        C23a c23a = (C23a) this.A00.A06.getValue();
        Integer valueOf = Integer.valueOf(dlq.A04);
        Object A00 = c23a.A00(valueOf);
        if ((A00 instanceof SparseArray) && A00 != null) {
            11T.A0F(valueOf, 0);
            c23a.A00.put(valueOf, A00);
        }
        Object A002 = c23a.A00(dlq);
        if (A002 == null) {
            return false;
        }
        c23a.A00.put(dlq, A002);
        return false;
    }
}
