package X;

import com.facebook.quicklog.reliability.CancelReason;

/* loaded from: C9U.class */
public final class C9U {
    public Long A00;
    public final 1Br A01 = 7zM.A0T();

    public void A00() {
        Long l = this.A00;
        if (l == null) {
            0fH.A0o("FrxReliabilityLogger", "flowid is null");
            return;
        }
        4YV.A0Z(this.A01).flowEndSuccess(l.longValue());
        this.A00 = null;
    }

    public void A01() {
        Long l = this.A00;
        if (l == null) {
            0fH.A0o("FrxReliabilityLogger", "flowid is null");
            return;
        }
        4YV.A0Z(this.A01).flowEndCancel(l.longValue(), CancelReason.USER_CANCELLED);
        this.A00 = null;
    }

    public void A02(int i, String str) {
        11T.A0F(str, 1);
        C00i c00i = this.A01.A00;
        long generateNewFlowId = 7zN.A0c(c00i).generateNewFlowId(i);
        Long valueOf = Long.valueOf(generateNewFlowId);
        this.A00 = valueOf;
        if (valueOf != null) {
            AbI.A1U(7zN.A0c(c00i), str, generateNewFlowId, true);
        }
    }

    public void A03(String str) {
        Long l = this.A00;
        if (l == null) {
            0fH.A0o("FrxReliabilityLogger", "flowid is null");
        } else {
            4YV.A0Z(this.A01).flowMarkPoint(l.longValue(), str);
        }
    }

    public void A04(String str, String str2) {
        Long l = this.A00;
        if (l == null) {
            0fH.A0o("FrxReliabilityLogger", "flowid is null");
        } else {
            4YV.A0Z(this.A01).flowMarkError(l.longValue(), str, str2);
        }
    }
}
