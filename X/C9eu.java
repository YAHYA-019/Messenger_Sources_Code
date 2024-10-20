package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadParticipant;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.collect.ImmutableList;

/* renamed from: X.9eu, reason: invalid class name */
/* loaded from: 9eu.class */
public final class C9eu {
    public final 1Br A00 = 1BK.A0D();

    public static final void A00(C9eu c9eu, ThreadSummary threadSummary, String str) {
        int i;
        1UG A08 = 1BK.A08(1Br.A02(c9eu.A00), 1BJ.A00(1548));
        if (A08.isSampled()) {
            A08.A7R("action", str);
            ThreadKey threadKey = threadSummary.A0n;
            7zS.A1E(A08, threadKey);
            7zP.A0z(A08, threadKey);
            A08.A6H("responsible_user_id", Long.valueOf(threadKey.A02));
            ImmutableList immutableList = threadSummary.A1L;
            if (immutableList != null) {
                1Du it = immutableList.iterator();
                while (it.hasNext()) {
                    ThreadParticipant A0W = 4YU.A0W(it);
                    11T.A0D(A0W);
                    if (C28p.A04(A0W)) {
                        i = 0;
                        break;
                    }
                }
            }
            i = 1;
            4YU.A1I(A08, "responsible_user_type", i);
            A08.BZL();
        }
    }
}
