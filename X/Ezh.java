package X;

import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;

/* loaded from: Ezh.class */
public final class Ezh {
    public long A00;
    public final 1Br A01 = 7zM.A0T();

    public final long A00(String str, String str2, String str3) {
        1Br r0 = this.A01;
        long generateNewFlowId = 4YV.A0Z(r0).generateNewFlowId(238957173);
        this.A00 = generateNewFlowId;
        AbI.A1U(4YV.A0Z(r0), "zbd_result_flow", this.A00, true);
        4YV.A0Z(r0).flowAnnotate(this.A00, "carrier_id", str);
        4YV.A0Z(r0).flowAnnotate(this.A00, "eligibility_hash", str2);
        4YV.A0Z(r0).flowAnnotate(this.A00, "optin_type_flow", str3);
        4YV.A0Z(r0).flowAnnotate(this.A00, 4YT.A00(HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH), "FB4A");
        return generateNewFlowId;
    }

    public final void A01(String str, Long l) {
        UserFlowLogger A0Z;
        long j;
        1Br r0 = this.A01;
        if (l != null) {
            UserFlowLogger A0Z2 = 4YV.A0Z(r0);
            j = l.longValue();
            A0Z2.flowMarkPoint(j, str);
            A0Z = 4YV.A0Z(r0);
        } else {
            4YV.A0Z(r0).flowMarkPoint(this.A00, str);
            A0Z = 4YV.A0Z(r0);
            j = this.A00;
        }
        A0Z.flowEndSuccess(j);
        this.A00 = 0L;
    }

    public final void A02(String str, Long l) {
        4YV.A0Z(this.A01).flowEndFail(l != null ? l.longValue() : this.A00, str, null);
        this.A00 = 0L;
    }

    public final void A03(String str, Long l) {
        4YV.A0Z(this.A01).flowMarkPoint(l != null ? l.longValue() : this.A00, str);
    }
}
