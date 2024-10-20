package X;

import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowLogger;

/* renamed from: X.9cq, reason: invalid class name */
/* loaded from: 9cq.class */
public final class C9cq {
    public Long A00;
    public final 1Br A01;
    public final long A02;
    public final long A03;

    public C9cq() {
        1Br A0T = 7zM.A0T();
        this.A01 = A0T;
        this.A03 = 4YV.A0Z(A0T).generateNewFlowId(231357905);
        this.A02 = 4YV.A0Z(this.A01).generateNewFlowId(231349475);
    }

    public final void A00() {
        Long l = this.A00;
        if (l != null) {
            4YV.A0Z(this.A01).flowEndSuccess(l.longValue());
        }
    }

    public final void A01(C96q c96q, boolean z) {
        long j = z ? this.A02 : this.A03;
        this.A00 = Long.valueOf(j);
        1Br r0 = this.A01;
        UserFlowLogger A0Z = 4YV.A0Z(r0);
        String obj = c96q.toString();
        7zN.A1Z(A0Z, obj, j, false);
        4YV.A0Z(r0).flowAnnotateWithCrucialData(j, "ENTRY_POINT", obj);
    }

    public final void A02(String str) {
        Long l = this.A00;
        if (l != null) {
            long longValue = l.longValue();
            1Br r0 = this.A01;
            4YV.A0Z(r0).flowMarkPoint(longValue, str);
            4YV.A0Z(r0).flowEndCancel(longValue, CancelReason.USER_CANCELLED);
        }
    }

    public final void A03(String str) {
        Long l = this.A00;
        if (l != null) {
            4YV.A0Z(this.A01).flowMarkPoint(l.longValue(), str);
        }
    }

    public final void A04(String str, long j) {
        Long l = this.A00;
        if (l != null) {
            4YV.A0Z(this.A01).flowAnnotate(l.longValue(), str, j);
        }
    }
}
