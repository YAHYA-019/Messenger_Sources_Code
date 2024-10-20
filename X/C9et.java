package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadParticipant;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.9et, reason: invalid class name */
/* loaded from: 9et.class */
public final class C9et {
    public final 1Br A00 = 1BK.A0D();

    public static final void A00(C9et c9et, ThreadSummary threadSummary, String str) {
        if (threadSummary != null) {
            1UG A08 = 1BK.A08(1Br.A02(c9et.A00), 1BJ.A00(1550));
            if (A08.isSampled()) {
                A08.A7R("action", str);
                ThreadKey threadKey = threadSummary.A0n;
                7zS.A1E(A08, threadKey);
                7zP.A0z(A08, threadKey);
                A08.A6H("responsible_user_id", Long.valueOf(threadKey.A02));
                ImmutableList immutableList = threadSummary.A1L;
                11T.A0A(immutableList);
                int i = 0;
                if (!(immutableList instanceof Collection) || !immutableList.isEmpty()) {
                    Iterator it = immutableList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ThreadParticipant A0W = 4YU.A0W(it);
                        11T.A0D(A0W);
                        if (C28p.A04(A0W)) {
                            i = 1;
                            break;
                        }
                    }
                }
                int i2 = i ^ 1;
                if (i2 != ((-1) << (-1))) {
                    4YU.A1I(A08, "responsible_user_type", i2);
                } else {
                    A08.A7R("responsible_user_type", (String) null);
                }
                A08.BZL();
            }
        }
    }
}
