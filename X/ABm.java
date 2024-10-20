package X;

import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.google.common.collect.ImmutableList;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* loaded from: ABm.class */
public final class ABm implements 1K9 {
    public final int A00;
    public final long A01;
    public final Object A02;

    public ABm(Object obj, long j, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = j;
    }

    public void onFailure(Throwable th) {
        long j;
        UserFlowLogger A01;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                if (!(th instanceof TimeoutException)) {
                    boolean z = th instanceof CancellationException;
                    C67Q c67q = (C67Q) this.A02;
                    ImmutableList immutableList = C67Q.A0B;
                    CMu cMu = (CMu) c67q.A03.get();
                    if (z) {
                        long j2 = this.A01;
                        CMu.A01(cMu).flowMarkPoint(j2, "POINT_CANCEL_FLOW");
                        CMu.A01(cMu).flowEndCancel(j2, CancelReason.SYSTEM_CANCELLED);
                        return;
                    } else {
                        CMu.A01(cMu).flowEndFail(this.A01, "ERROR", th.getMessage());
                        return;
                    }
                }
                C67Q c67q2 = (C67Q) this.A02;
                ImmutableList immutableList2 = C67Q.A0B;
                CMu cMu2 = (CMu) c67q2.A03.get();
                j = this.A01;
                A01 = CMu.A01(cMu2);
                str = "TIMEOUT_ERROR";
                str2 = null;
                break;
            case 1:
                C68t c68t = (C68t) this.A02;
                Set set = C68t.A0Q;
                C9ag c9ag = (C9ag) c68t.A06.get();
                j = this.A01;
                11T.A0F(th, 1);
                A01 = 4YV.A0Z(c9ag.A01);
                str = "GRAPHQL_FAIL";
                str2 = th.getMessage();
                break;
            default:
                11T.A0F(th, 0);
                0fH.A0r("M4AScreenTimeApi", "GraphQl error", th);
                return;
        }
        A01.flowEndFail(j, str, str2);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        if (2 - this.A00 == 0) {
            try {
                if (obj == null) {
                    0fH.A01(5, "M4AScreenTimeApi", "Empty mutation response");
                    return;
                }
                54F r0 = (54F) this.A02;
                54C r305 = r0.A02;
                synchronized (r305) {
                    try {
                        r305.A01.clear();
                    } catch (Throwable th) {
                        54C r02 = r305;
                        throw th;
                    }
                }
                r305 = r0.A03;
                synchronized (r305) {
                    r305.A01.clear();
                }
                r0.A09.set(this.A01);
            } catch (Exception e) {
                0fH.A0r("M4AScreenTimeApi", "Error while processing response", e);
            }
        }
    }
}
