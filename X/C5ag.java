package X;

import com.facebook.auth.usersession.FbUserSession;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.Executor;

/* renamed from: X.5ag, reason: invalid class name */
/* loaded from: 5ag.class */
public final class C5ag {
    public 1BY A00;
    public final C00i A01 = new 1BQ(16467);

    public C5ag(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    public static void A00(FbUserSession fbUserSession, final C5ah c5ah, C5ag c5ag, ImmutableList immutableList) {
        if (C5ah.NONE == c5ah || immutableList.isEmpty()) {
            return;
        }
        1BY r0 = c5ag.A00;
        Integer num = 1Lo.A05;
        1MV r02 = new 1MV(fbUserSession, r0, 17145);
        final 1MV r03 = new 1MV(fbUserSession, r0, 67630);
        if (c5ah == C5ah.PREFETCH_STORIES_AND_WARMUP_VIDEO_PLAYER || c5ah == C5ah.PREFETCH_STORIES_ONLY) {
            ((C2wp) r02.get()).A02(new C2wr() { // from class: X.5ai
                @Override // X.C2wr
                public final void C3k(Object obj) {
                    ((C5b2) C00i.this.get()).A00(c5ah, (ImmutableList) obj);
                }
            }, immutableList, (Executor) c5ag.A01.get());
        }
    }

    public void A01(FbUserSession fbUserSession, C5ah c5ah, long j) {
        A00(fbUserSession, c5ah, this, ImmutableList.of((Object) Long.valueOf(j)));
    }
}
