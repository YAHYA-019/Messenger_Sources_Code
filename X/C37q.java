package X;

import java.util.List;

/* renamed from: X.37q, reason: invalid class name */
/* loaded from: 37q.class */
public final class C37q extends 1QL {
    public final int A00;
    public final Object A01;

    public C37q(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public void A01(int i, int i2) {
        switch (this.A00) {
            case 0:
                1Uy r0 = (1Uy) this.A01;
                r0.A01 = true;
                r0.A00 = null;
                return;
            case 1:
                1Vu r02 = (1Vu) this.A01;
                1QL.A00(i, i2, "WorkchatMPLColdStartThreadListTTRCTracker");
                C04O c04o = r02.A08;
                04P r03 = r02.A07;
                11T.A0F(r03, 0);
                List list = c04o.A01;
                synchronized (list) {
                    list.remove(r03);
                }
                1Vv.A00((1Vv) 1Lm.A06(1BL.A0E(), 66789), 0S2.A0C);
                return;
            default:
                1QL.A00(i, i2, "WorkchatMPLWarmStartThreadListTTRCTracker");
                1Vv.A00((1Vv) 1Lm.A06(1BL.A0E(), 66789), 0S2.A0C);
                return;
        }
    }
}
