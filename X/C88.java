package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: C88.class */
public final class C88 {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02 = 1BK.A0C();
    public final 1Br A03;
    public final 1De A04;

    public C88(1De r302) {
        this.A04 = r302;
        1BY r0 = r302.A00;
        this.A01 = 1Bu.A03(r0, 82615);
        this.A00 = 1Bu.A03(r0, 83981);
        this.A03 = 1Bq.A00(68252);
    }

    public final boolean A00(FbUserSession fbUserSession) {
        boolean z = false;
        ThreadSummary threadSummary = ((2QO) 4YU.A0o(fbUserSession, this.A04, 99977)).A06;
        if (threadSummary != null) {
            1Br.A0C(this.A03);
            z = 5OA.A04(threadSummary);
        }
        return z;
    }

    public final boolean A01(FbUserSession fbUserSession) {
        2QN r0 = (2QO) 4YU.A0o(fbUserSession, this.A04, 99977);
        C00i c00i = this.A02.A00;
        if (1BK.A0M(c00i).AZk(36313450271545941L)) {
            return r0.A0V ? !((Hne) 1Br.A0B(this.A00)).A00(fbUserSession) : A00(fbUserSession) ? C5yp.A00((C5yp) 1Br.A0B(this.A01), 36313450271677014L) : !((Hne) 1Br.A0B(this.A00)).A00(fbUserSession) && 1BK.A0M(c00i).AZk(36313450271742551L);
        }
        return false;
    }
}
