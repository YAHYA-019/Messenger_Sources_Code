package X;

import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;

/* renamed from: X.6i1, reason: invalid class name */
/* loaded from: 6i1.class */
public final class C6i1 {
    public long A00;
    public String A01;
    public final 1Br A02 = 1Bq.A00(16705);

    public final void A00(String str) {
        if (this.A00 != 0) {
            if (str == null || str.equals(this.A01)) {
                4YV.A0Z(this.A02).flowEndSuccess(this.A00);
                this.A00 = 0L;
            }
        }
    }

    public final void A01(String str, String str2) {
        11T.A0F(str2, 1);
        if (this.A00 != 0) {
            4YV.A0Z(this.A02).flowAnnotate(this.A00, str, str2);
        }
    }

    public final void A02(String str, String str2) {
        if (this.A00 != 0) {
            if (str2 == null || str2.equals(this.A01)) {
                4YV.A0Z(this.A02).flowMarkPoint(this.A00, str);
            }
        }
    }

    public final void A03(String str, String str2) {
        if (this.A00 != 0) {
            if (str2 == null || str2.equals(this.A01)) {
                4YV.A0Z(this.A02).flowEndCancel(this.A00, str);
                this.A00 = 0L;
            }
        }
    }

    public final void A04(String str, String str2) {
        if (this.A00 != 0) {
            4YV.A0Z(this.A02).flowEndFail(this.A00, str, str2);
            this.A00 = 0L;
        }
    }

    public final void A05(String str, String str2) {
        if (this.A00 != 0) {
            A03(CancelReason.SYSTEM_CANCELLED, null);
        }
        this.A01 = str2;
        C00i c00i = this.A02.A00;
        this.A00 = ((UserFlowLogger) c00i.get()).generateNewFlowId(431694022);
        ((UserFlowLogger) c00i.get()).flowStartIfNotOngoing(this.A00, new UserFlowConfig(str, true));
    }
}
