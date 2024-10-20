package X;

import com.facebook.common.callercontext.CallerContext;
import java.util.concurrent.ExecutionException;

/* loaded from: Ceq.class */
public final class Ceq implements C4Av {
    public 1BY A00;
    public final C00i A03 = 1BV.A01((1BY) null, 33031);
    public final C00i A02 = AbH.A0H();
    public final C00i A01 = 1BV.A01((1BY) null, 83653);
    public final C00i A04 = 1BQ.A02(49326);

    public Ceq(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    @Override // X.C4Av
    public boolean Ciy(4Yg r302) {
        boolean z = false;
        if (r302.A01()) {
            int A00 = ((4sV) this.A04.get()).A00();
            1IB A0M = 4YU.A0M(1BK.A05(), CallerContext.A09(4sS.class, "ProfileBadgeSwitchAccountSummaryLoggerConditionalWorker"), 4YU.A0L(this.A03), 1BJ.A00(236), true);
            1Kd.A0D(this.A02, new Fvv(A00, 2, this), A0M);
            try {
                1Yz.A00(A0M);
                z = true;
            } catch (ExecutionException e) {
                0fH.A0r("ProfileBadgeSwitchAccountSummaryLoggerConditionalWorker", "Error with switch account summary logger: %s", e);
                return false;
            }
        }
        return z;
    }
}
