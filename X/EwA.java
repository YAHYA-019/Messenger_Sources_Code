package X;

import com.facebook.quicklog.reliability.UserFlowLogger;

/* loaded from: EwA.class */
public final class EwA {
    public long A00;
    public final 1Br A01 = 7zM.A0T();

    public final void A00() {
        C00i c00i = this.A01.A00;
        this.A00 = ((UserFlowLogger) c00i.get()).generateNewFlowId(896613375);
        AbI.A1U((UserFlowLogger) c00i.get(), "credential_manager_flow", this.A00, true);
    }

    public final void A01(String str) {
        4YV.A0Z(this.A01).flowMarkPoint(this.A00, str);
    }
}
