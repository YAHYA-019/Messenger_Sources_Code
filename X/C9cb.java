package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.integrity.frx.proactivewarning.model.ProactiveWarningInfo;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* renamed from: X.9cb, reason: invalid class name */
/* loaded from: 9cb.class */
public final class C9cb {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1De A04;

    public C9cb(1De r302) {
        this.A04 = r302;
        1BY r0 = r302.A00;
        this.A01 = 1Bu.A03(r0, 67894);
        this.A02 = 1Bu.A03(r0, 85013);
        this.A00 = 1Bu.A03(r0, 68120);
        this.A03 = 7zM.A0Q();
    }

    public final void A00(06Z r302, FbUserSession fbUserSession, C5yq c5yq, ProactiveWarningInfo proactiveWarningInfo, ThreadSummary threadSummary, 6mL r307, C00m c00m) {
        11T.A0F(fbUserSession, 0);
        A02(fbUserSession, threadSummary);
        if (c00m != null) {
            c00m.invoke();
        }
        9mA r0 = (9mA) 1Br.A0B(this.A01);
        String str = proactiveWarningInfo.A02;
        r0.A04(fbUserSession, threadSummary, C5yl.A0G, str);
        if (r307 != null) {
            r307.A05(0S2.A01);
        }
        if (r302 == null || c5yq == null || str == null) {
            return;
        }
        7zP.A0N(this.A03).Ciz(new AGz(r302, c5yq, this, proactiveWarningInfo, threadSummary));
    }

    public final void A01(FbUserSession fbUserSession, ProactiveWarningInfo proactiveWarningInfo, ThreadSummary threadSummary, 6mL r305, C00m c00m) {
        11T.A0F(threadSummary, 1);
        9mA r0 = (9mA) 1Br.A0B(this.A01);
        String str = proactiveWarningInfo.A02;
        C5yl c5yl = C5yl.A0G;
        if (((7Fq) 1Br.A0B(r0.A02)).A00() && str != null) {
            ThreadKey threadKey = threadSummary.A0n;
            11T.A0A(threadKey);
            C1yg c1yg = threadKey.A06;
            C1yg c1yg2 = C1yg.ONE_TO_ONE;
            String A0w = c1yg == c1yg2 ? 1BK.A0w(threadKey) : null;
            1UG A08 = 1BK.A08(1Br.A02(r0.A01), 1BJ.A00(1351));
            if (A08.isSampled()) {
                A08.A7h("feedback_tags", 11T.A03(str));
                Long A01 = 9mA.A01(A08, fbUserSession, r0, threadKey, threadSummary);
                A08.A5H("is_other_user_mo", 7zV.A0X(fbUserSession, r0, A0w));
                Long l = null;
                if (c1yg == c1yg2) {
                    l = A01;
                }
                7zV.A0w(A08, c5yl, l);
            }
        }
        if (r305 != null) {
            r305.A05(0S2.A0C);
        }
        A02(fbUserSession, threadSummary);
        if (c00m != null) {
            c00m.invoke();
        }
    }

    public final void A02(FbUserSession fbUserSession, ThreadSummary threadSummary) {
        11T.A0F(fbUserSession, 0);
        6QI r0 = (6QI) 1Br.A0B(this.A02);
        String A0u = threadSummary.A0n.A0u();
        11T.A0A(A0u);
        r0.A01(fbUserSession, A0u, 0, true);
    }
}
