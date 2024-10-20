package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.quicklog.reliability.UserFlowLogger;

/* renamed from: X.5vo, reason: invalid class name */
/* loaded from: 5vo.class */
public final class C5vo {
    public long A00;
    public boolean A01;
    public final 1Br A02 = 1Bq.A00(16705);

    public static final UserFlowLogger A00(C5vo c5vo) {
        return (UserFlowLogger) c5vo.A02.A00.get();
    }

    public final void A01(long j, String str) {
        0fH.A0m("ZBDEvent", 0Pz.A0W("logEvent() called with: event = ", str));
        UserFlowLogger A00 = A00(this);
        if (!this.A01) {
            j = this.A00;
        }
        A00.flowMarkPoint(j, str);
    }

    public final void A02(long j, String str) {
        String A00 = 1BJ.A00(ActionId.RTMP_CONNECTION_FAILED);
        0fH.A0m("ZBDEvent", 0Pz.A0v("logEventWithInfo() called with: event = ", A00, ", debugInfo = ", str));
        UserFlowLogger A002 = A00(this);
        if (!this.A01) {
            j = this.A00;
        }
        A002.flowMarkPoint(j, A00, str);
    }

    public final void A03(long j, String str, String str2) {
        0fH.A0m("ZBDEvent", 0Pz.A0v("endWithInfo() called with: endEvent = ", str, ", debugInfo = ", str2));
        UserFlowLogger A00 = A00(this);
        long j2 = j;
        if (!this.A01) {
            j2 = this.A00;
        }
        A00.flowMarkPoint(j2, str, str2);
        UserFlowLogger A002 = A00(this);
        if (!this.A01) {
            j = this.A00;
        }
        A002.flowEndSuccess(j);
        this.A00 = 0L;
    }

    public final void A04(long j, String str, String str2) {
        0fH.A0m("ZBDEvent", 0Pz.A0v("fail() called with: event = ", str, ", reason = ", str2));
        UserFlowLogger A00 = A00(this);
        if (!this.A01) {
            j = this.A00;
        }
        A00.flowEndFail(j, str, str2);
        this.A00 = 0L;
    }
}
