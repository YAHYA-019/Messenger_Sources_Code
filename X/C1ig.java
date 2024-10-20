package X;

import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;

/* renamed from: X.1ig, reason: invalid class name */
/* loaded from: 1ig.class */
public final class C1ig extends C1if {
    public UserFlowLogger A00;

    @Override // X.C1if
    public void A01() {
        if (super.A00 == 0) {
            UserFlowLogger userFlowLogger = this.A00;
            long generateNewFlowId = userFlowLogger.generateNewFlowId(132191320);
            super.A00 = generateNewFlowId;
            userFlowLogger.flowStartIfNotOngoing(generateNewFlowId, new UserFlowConfig("msys_bootstrap_pre_logger", false));
        }
    }
}
