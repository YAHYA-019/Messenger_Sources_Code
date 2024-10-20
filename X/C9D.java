package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: C9D.class */
public final class C9D {
    public 1BY A00;
    public final C00i A07 = 1BV.A01((1BY) null, 82566);
    public final C00i A01 = AbH.A0S();
    public final C00i A06 = 1BV.A01((1BY) null, 17005);
    public final C00i A03 = 1BQ.A00();
    public final C00i A02 = 1BV.A01((1BY) null, 82380);
    public final C00i A04 = 1BV.A01((1BY) null, 83222);
    public final C00i A05 = 1BQ.A02(82351);

    public C9D(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public void A00(FbUserSession fbUserSession, ThreadKey threadKey, ThreadSummary threadSummary) {
        String str;
        String str2;
        1F9 r305 = null;
        if (threadSummary != null) {
            ThreadKey threadKey2 = threadSummary.A0l;
            str = threadKey2 != null ? 1BK.A0w(threadKey2) : null;
            long j = threadSummary.A06;
            str2 = j > 0 ? String.valueOf(j) : null;
            r305 = threadSummary.A0g;
        } else {
            str = null;
            str2 = null;
        }
        ((2Pe) this.A06.get()).D5p(fbUserSession, r305, threadKey, BLc.A07, str, str2);
        A02(fbUserSession, threadKey, false);
        A01(fbUserSession, threadKey, false);
        ((C5R) this.A04.get()).A00(threadKey, -1);
    }

    public void A01(FbUserSession fbUserSession, ThreadKey threadKey, boolean z) {
        C7C c7c = (C7C) this.A05.get();
        1G2 r0 = 1NK.A06;
        1Ql.A03(AbstractC03303xn.A03(threadKey), 1Br.A0B(c7c.A00), z);
        BmL bmL = (BmL) this.A07.get();
        11T.A0F(fbUserSession, 0);
        C1685Apr c1685Apr = new C1685Apr();
        String str = z ? "MENTIONS_MUTED" : "MENTIONS_NOT_MUTED";
        String str2 = ((1G1) fbUserSession).A02;
        07S A0J = 4YU.A0J(GraphQlCallInput.A02, str, "mute_settings");
        07S.A00(A0J, 1BK.A0w(threadKey), "thread_fbid");
        07S.A00(A0J, str2, "actor_id");
        4YV.A1A(A0J, ((2Jf) c1685Apr).A00, "input");
        5Dh r02 = new 5Dh(c1685Apr);
        1Vd A0K = 7zM.A0K(bmL.A00);
        4YU.A1J(r02, 301578351120862L);
        A0K.A08(r02, 5Dj.A01);
    }

    public void A02(FbUserSession fbUserSession, ThreadKey threadKey, boolean z) {
        ((C7C) this.A05.get()).A00(threadKey, z);
        if (ThreadKey.A0S(threadKey)) {
            return;
        }
        BmL bmL = (BmL) this.A07.get();
        11T.A0F(fbUserSession, 0);
        C1686Aps c1686Aps = new C1686Aps();
        String str = z ? "REACTIONS_MUTED" : "REACTIONS_NOT_MUTED";
        String str2 = ((1G1) fbUserSession).A02;
        07S A0J = 4YU.A0J(GraphQlCallInput.A02, str, "mute_settings");
        07S.A00(A0J, 1BK.A0w(threadKey), "thread_fbid");
        07S.A00(A0J, str2, "actor_id");
        4YV.A1A(A0J, ((2Jf) c1686Aps).A00, "input");
        5Dh r0 = new 5Dh(c1686Aps);
        1Vd A0K = 7zM.A0K(bmL.A00);
        4YU.A1J(r0, 301578351120862L);
        A0K.A08(r0, 5Dj.A01);
    }
}
