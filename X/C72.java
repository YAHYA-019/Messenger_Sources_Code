package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: C72.class */
public final class C72 {
    public final 1Br A00;
    public final 1De A01;

    public C72(1De r302) {
        this.A01 = r302;
        this.A00 = 7zM.A0h(r302, 16428);
    }

    public final void A00(06Z r302, FbUserSession fbUserSession, ThreadKey threadKey, ThreadSummary threadSummary, C5yl c5yl) {
        Capabilities capabilities;
        7zT.A1S(fbUserSession, r302, threadKey);
        1BY r0 = this.A01.A00;
        6In r02 = (6In) 1Bn.A0E((Context) null, r0, 68120);
        1Bn.A0E((Context) null, r0, 82501);
        boolean A1Y = (threadSummary == null || (capabilities = threadSummary.A1C) == null) ? false : 4YU.A1Y(capabilities, 30);
        if (threadKey.A19()) {
            if (threadSummary != null) {
                r02.Czv(r302, threadSummary, c5yl);
                return;
            }
            return;
        }
        if (threadKey.A0z() || C5yn.A00(threadSummary)) {
            if (threadSummary != null) {
                r02.Czm(r302, threadSummary, c5yl);
            }
        } else {
            if ((threadSummary == null || A1Y) && !threadKey.A1F() && !threadKey.A1I() && !threadKey.A11()) {
                r02.Czn(r302, threadKey, threadSummary, c5yl);
                return;
            }
            C5yq A00 = ((C5ym) 1Bn.A0E((Context) null, r0, 68427)).A00(fbUserSession, threadSummary, 0S2.A00);
            if (A00 != null) {
                r02.Czt(r302, A00, threadSummary, c5yl);
            }
        }
    }

    public final void A01(06Z r302, ThreadKey threadKey, ThreadSummary threadSummary) {
        11T.A0F(r302, 0);
        A00(r302, 1Br.A03(this.A00), threadKey, threadSummary, C5yl.A0L);
    }
}
