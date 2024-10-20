package X;

import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.mapbox.mapboxsdk.style.layers.Property;

/* loaded from: Ezd.class */
public final class Ezd {
    public final 1Br A00 = 7zM.A0T();

    public final void A00(long j, String str) {
        UserFlowLogger A0Z = 4YV.A0Z(this.A00);
        A0Z.flowMarkPoint(DKH.A06(A0Z, j), str);
    }

    public final void A01(long j, String str) {
        11T.A0F(str, 1);
        UserFlowLogger A0Z = 4YV.A0Z(this.A00);
        A0Z.flowMarkPoint(DKH.A06(A0Z, j), 0Pz.A0W("navigate_to_", str));
    }

    public final void A02(long j, String str, String str2) {
        UserFlowLogger A0Z = 4YV.A0Z(this.A00);
        A0Z.flowAnnotate(DKH.A06(A0Z, j), str, str2);
    }

    public final void A03(EPO epo, String str, long j) {
        UserFlowLogger A0Z = 4YV.A0Z(this.A00);
        long A06 = DKH.A06(A0Z, j);
        A0Z.flowStartIfNotOngoing(A06, new UserFlowConfig("bug_report_flow", false));
        A0Z.flowAnnotate(A06, Property.SYMBOL_Z_ORDER_SOURCE, epo.name);
        A0Z.flowAnnotate(A06, ErrorReportingConstants.ENDPOINT, str);
    }
}
