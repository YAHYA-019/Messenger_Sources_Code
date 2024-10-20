package X;

import android.content.Intent;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.analytics.perf.events.events.CallScreenOpenThread;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: C81.class */
public final class C81 {
    public final 1Br A00;
    public final 1Br A01 = AbG.A0M();
    public final 1Br A02 = 1Bq.A00(83006);
    public final 1De A03;
    public final 1Br A04;

    public C81(1De r302) {
        this.A03 = r302;
        1BY r0 = r302.A00;
        this.A04 = 1Bu.A03(r0, 82249);
        this.A00 = 1Bu.A03(r0, 114982);
    }

    public final void A00() {
        CDS cds = (CDS) 1Br.A0B(this.A02);
        1Br.A0B(cds.A00);
        Intent A08 = 4YV.A08("fb-messenger://threads");
        CDS.A00(A08, 1Br.A03(cds.A01));
        0LS.A0A(FbInjector.A03, A08);
    }

    public final void A01(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 0);
        ThreadKey threadKey = ((2QO) 4YU.A0o(fbUserSession, this.A03, 99977)).A05;
        if (threadKey == null) {
            A00();
            1Br.A04(this.A01).D0v("NavigationAction_navigateToThread", "No thread key for call");
            return;
        }
        CDS cds = (CDS) 1Br.A0B(this.A02);
        Intent A04 = ((4iH) 1Br.A0B(cds.A00)).A04(threadKey, 5SW.A1Y);
        FbUserSession A03 = 1Br.A03(cds.A01);
        CDS.A00(A04, A03);
        2dU.A00(7zL.A09(), A03);
        2dU.A01((6Bw) null, new CallScreenOpenThread(threadKey, 1BK.A01(threadKey)));
        0LS.A0A(FbInjector.A03, A04);
    }
}
