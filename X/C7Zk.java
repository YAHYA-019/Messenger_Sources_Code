package X;

import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;

/* renamed from: X.7Zk, reason: invalid class name */
/* loaded from: 7Zk.class */
public final class C7Zk {
    public final long A00;
    public final UserFlowConfig A01;
    public final UserFlowLogger A02;

    public C7Zk() {
        UserFlowLogger userFlowLogger = (UserFlowLogger) 1Bi.A03(16705);
        this.A02 = userFlowLogger;
        this.A00 = userFlowLogger.generateFlowId(28522275, 0);
        this.A01 = new UserFlowConfig("launchPurchaseFlow", false);
    }

    public void A00(String str) {
        11T.A0F(str, 0);
        this.A02.flowEndFail(this.A00, str, null);
    }

    public void A01(String str) {
        this.A02.flowMarkPoint(this.A00, str);
    }
}
