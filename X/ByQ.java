package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.orcaslim.mca.MailboxOrcaSlim$ThreadListObserverCallback;
import java.util.Set;

/* loaded from: ByQ.class */
public final class ByQ {
    public C87v A00;
    public 1XJ A01;
    public boolean A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final MailboxOrcaSlim$ThreadListObserverCallback A06;
    public final Set A07;
    public final FbUserSession A08;
    public final 1Fv A09;
    public final 1De A0A;

    public ByQ(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A0A = r303;
        1BY r0 = r303.A00;
        this.A04 = 1Lm.A03(fbUserSession, r0, 33071);
        this.A03 = 7zM.A0Q();
        1Fv A0N = 7zQ.A0N();
        this.A09 = A0N;
        ViewerContext Aue = fbUserSession.Aue();
        11T.A0D(Aue);
        FbUserSession A08 = A0N.A08(Aue);
        this.A08 = A08;
        this.A05 = 1Lm.A03(A08, r0, 16886);
        this.A07 = 7zL.A15();
        this.A06 = new BFO(this);
    }
}
