package X;

import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowLogger;

/* renamed from: X.9ag, reason: invalid class name */
/* loaded from: 9ag.class */
public final class C9ag {
    public long A00;
    public final 1Br A01 = 7zM.A0T();

    public final void A00(long j, boolean z) {
        long j2 = this.A00;
        C00i c00i = this.A01.A00;
        if (j == j2) {
            7zN.A0c(c00i).flowAnnotate(j, "FOUND_APPLINK", z);
            7zN.A0c(c00i).flowEndSuccess(j);
        } else {
            7zN.A0c(c00i).flowMarkPoint(j, "STALE_RESPONSE");
            7zN.A0c(c00i).flowEndCancel(j, CancelReason.USER_CANCELLED);
        }
    }

    public final void A01(Integer num, long j, boolean z) {
        String str;
        UserFlowLogger A0Z = 4YV.A0Z(this.A01);
        switch (num.intValue()) {
            case 0:
                str = "NO_ATTEMPT";
                break;
            case 1:
                str = "GRAPHQL_FAIL";
                break;
            case 2:
                str = "STALE_RESPONSE";
                break;
            case 3:
                str = "FOUND_APPLINK";
                break;
            case 4:
                str = "NO_FB_APP";
                break;
            case 5:
                str = "USER_MATCH";
                break;
            case 6:
                str = "INVALID_APPLINK";
                break;
            case 7:
                str = "INVALID_RESPONSE";
                break;
            default:
                str = "NO_APPLINK_FOUND";
                break;
        }
        A0Z.flowAnnotate(j, str, z);
    }
}
