package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadRtcCallInfoData;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.base.Function;

/* renamed from: X.2gC, reason: invalid class name */
/* loaded from: 2gC.class */
public final class C2gC {
    public static final Function A03 = 2gD.A00;
    public static final Function A02 = 2gE.A00;
    public final 1Br A01 = 1Bq.A00(16385);
    public final 1Br A00 = 1Bq.A00(99390);

    public static final boolean A00(FbUserSession fbUserSession, ThreadSummary threadSummary) {
        11T.A0F(fbUserSession, 0);
        ThreadKey threadKey = threadSummary.A0n;
        if (threadKey == null || !threadKey.A15()) {
            return false;
        }
        return 5OA.A05(threadSummary, ((1G1) fbUserSession).A02);
    }

    public final boolean A01(ThreadSummary threadSummary) {
        ThreadKey threadKey;
        ThreadRtcCallInfoData BFG;
        if (threadSummary == null || (threadKey = threadSummary.A0n) == null || (BFG = threadSummary.BFG()) == null) {
            return false;
        }
        String str = BFG.A01;
        if (str != "AUDIO_GROUP_CALL" && str != "VIDEO_GROUP_CALL") {
            return false;
        }
        Long l = BFG.A00;
        if (l != null) {
            long Auy = 1Br.A07(this.A01).Auy(36599065596662224L);
            if (Auy > 0 && Auy + l.longValue() < 1Br.A00(this.A00)) {
                return false;
            }
        }
        return threadKey.A1F() || threadKey.A0w();
    }
}
