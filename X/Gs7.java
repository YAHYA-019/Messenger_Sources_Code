package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import java.util.Set;

/* loaded from: Gs7.class */
public final class Gs7 extends C21h {
    public final /* synthetic */ long A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ JFR A02;
    public final /* synthetic */ C10264sx A03;
    public final /* synthetic */ PrivacyContext A04;
    public final /* synthetic */ String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gs7(FbUserSession fbUserSession, JFR jfr, C10264sx c10264sx, PrivacyContext privacyContext, String str, long j) {
        super("FTSACTMessageSearchLoadClientMessagePk");
        this.A03 = c10264sx;
        this.A00 = j;
        this.A05 = str;
        this.A04 = privacyContext;
        this.A02 = jfr;
        this.A01 = fbUserSession;
    }

    @Override // X.C21h
    public void A00(Set set) {
        11T.A0F(set, 0);
        if (set.contains("FTSACTMessageSearchLoadClientMessagePk")) {
            C10264sx c10264sx = this.A03;
            long j = this.A00;
            String str = this.A05;
            PrivacyContext privacyContext = this.A04;
            JFR jfr = this.A02;
            FbUserSession fbUserSession = this.A01;
            1BY r0 = c10264sx.A02.A00;
            Ib2 ib2 = new Ib2(1, j, jfr, 1Lm.A03(fbUserSession, r0, 16686), c10264sx);
            C00683ob c00683ob = (C00683ob) 1Lm.A07(fbUserSession, r0, 67629);
            1Um A0O = 1BK.A0O(c00683ob, 0);
            MailboxFutureImpl A0P = 1BK.A0P(A0O);
            1Um.A02(A0O, new C03323xp(A0P, privacyContext, c00683ob, str, j), A0P, false);
            A0P.addResultCallback(ib2);
        }
    }
}
