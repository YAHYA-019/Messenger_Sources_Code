package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: Hk1.class */
public final class Hk1 {
    public 9JZ A00;
    public String A01;
    public final 1De A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final LithoView A08;
    public final ThreadSummary A09;
    public final String A0A;

    public Hk1(1De r302, LithoView lithoView, ThreadSummary threadSummary, String str) {
        String A00;
        7zT.A1U(threadSummary, lithoView, str);
        this.A02 = r302;
        1BY r0 = r302.A00;
        this.A07 = 1Bu.A03(r0, 16428);
        this.A05 = 1Bu.A03(r0, 85225);
        this.A06 = 1Bq.A00(83273);
        this.A04 = 7zM.A0U();
        this.A03 = 1Bu.A03(r0, 16980);
        this.A09 = threadSummary;
        this.A08 = lithoView;
        this.A0A = str;
        C00i c00i = this.A07.A00;
        FbUserSession A0S = GOq.A0S(c00i);
        1BY r02 = this.A02.A00;
        5Xu r03 = (5Xu) 1Lm.A07(A0S, r02, 49772);
        ThreadSummary threadSummary2 = this.A09;
        5Xv A02 = r03.A02(threadSummary2);
        if (A02 == null) {
            A02 = 5Xu.A01(((23F) 1Lm.A07(GOq.A0S(c00i), r02, 33102)).A00(ThreadKey.A0L(threadSummary2.A0n)));
            if (A02 == null) {
                A00 = null;
                this.A01 = A00;
            }
        }
        A00 = ((5Wq) 1Br.A0B(this.A05)).A00(A02, -1);
        11T.A0I(A00, 1BJ.A00(20));
        this.A01 = A00;
    }
}
