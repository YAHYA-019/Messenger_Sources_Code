package X;

import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowLogger;

/* loaded from: C8s.class */
public final class C8s {
    public final UserFlowLogger A01 = (UserFlowLogger) 1Bi.A03(16705);
    public long A00 = 0;

    public void A00() {
        if (AbL.A1A()) {
            long j = this.A00;
            if (j != 0) {
                this.A01.flowEndCancel(j, CancelReason.USER_CANCELLED);
                this.A00 = 0L;
            }
        }
    }

    public void A01() {
        if (AbL.A1A()) {
            long j = this.A00;
            if (j != 0) {
                this.A01.flowEndSuccess(j);
                this.A00 = 0L;
            }
        }
    }

    public void A02(String str) {
        if (AbL.A1A()) {
            long j = this.A00;
            if (j != 0) {
                this.A01.flowEndFail(j, str, null);
                this.A00 = 0L;
            }
        }
    }
}
