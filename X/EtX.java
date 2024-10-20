package X;

import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowLogger;

/* loaded from: EtX.class */
public final class EtX {
    public long A00;
    public final 1Br A01 = 7zM.A0T();

    public final void A00(String str) {
        if (this.A00 != 0) {
            C00i c00i = this.A01.A00;
            ((UserFlowLogger) c00i.get()).flowMarkPoint(this.A00, "cancelled_new_flow_started");
            ((UserFlowLogger) c00i.get()).flowEndCancel(this.A00, CancelReason.SYSTEM_CANCELLED);
        }
        C00i c00i2 = this.A01.A00;
        this.A00 = ((UserFlowLogger) c00i2.get()).generateNewFlowId(238956515);
        AbI.A1U((UserFlowLogger) c00i2.get(), "flex_autoflex_transition", this.A00, true);
        ((UserFlowLogger) c00i2.get()).flowAnnotate(this.A00, "carrier_id", str);
    }
}
