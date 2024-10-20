package com.facebook.messaging.presence.plugins.core.threadpresence.trigger;

import X.0fH;
import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1F9;
import X.5SR;
import X.6mC;
import X.7NQ;
import X.7NS;
import X.C00i;
import X.RunnableC1295Ad3;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: ThreadPresenceTrigger.class */
public final class ThreadPresenceTrigger {
    public ThreadSummary A00;
    public boolean A01;
    public boolean A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final Context A06;

    public ThreadPresenceTrigger(Context context) {
        11T.A0F(context, 1);
        this.A06 = context;
        this.A05 = 1Bu.A00(67012);
        this.A04 = 1Bq.A00(67637);
        this.A03 = 1Bu.A01(context, 65953);
    }

    public static final void A00(FbUserSession fbUserSession, ThreadKey threadKey, ThreadPresenceTrigger threadPresenceTrigger, int i) {
        5SR r318;
        int i2;
        ScheduledExecutorService scheduledExecutorService;
        RunnableC1295Ad3 runnableC1295Ad3;
        ThreadSummary threadSummary;
        ThreadKey threadKey2;
        0fH.A0d(threadKey.toString(), Integer.valueOf(i), "ThreadPresenceTrigger", "threadKey:%s, threadCoPresenceAction:%d");
        ThreadSummary threadSummary2 = threadPresenceTrigger.A00;
        1F9 r310 = null;
        if (threadSummary2 != null) {
            r310 = threadSummary2.A0g;
        }
        if (r310 != 1F9.A0B) {
            if (6mC.A00(threadKey)) {
                r318 = (5SR) threadPresenceTrigger.A04.A00.get();
                i2 = 0;
            } else {
                if (threadSummary2 == null) {
                    return;
                }
                C00i c00i = threadPresenceTrigger.A04.A00;
                c00i.get();
                ThreadSummary threadSummary3 = threadPresenceTrigger.A00;
                if (threadSummary3 == null || !ThreadKey.A0f(threadSummary3.A0n) || threadSummary3.A1L.size() > 10) {
                    return;
                }
                r318 = (5SR) c00i.get();
                i2 = 1;
            }
            String valueOf = String.valueOf(threadKey.A0r());
            11T.A0F(fbUserSession, 0);
            scheduledExecutorService = (ScheduledExecutorService) r318.A06.A00.get();
            runnableC1295Ad3 = new 7NQ(fbUserSession, r318, valueOf, i, i2);
        } else {
            if (!((7NS) threadPresenceTrigger.A03.A00.get()).A00() || (threadSummary = threadPresenceTrigger.A00) == null || (threadKey2 = threadSummary.A0l) == null) {
                return;
            }
            long A0r = threadKey2.A0r();
            if (Long.valueOf(A0r) == null) {
                return;
            }
            5SR r0 = (5SR) threadPresenceTrigger.A04.A00.get();
            long A0r2 = threadKey.A0r();
            11T.A0F(fbUserSession, 0);
            scheduledExecutorService = (ScheduledExecutorService) r0.A06.A00.get();
            runnableC1295Ad3 = new RunnableC1295Ad3(fbUserSession, i, A0r2, A0r);
        }
        scheduledExecutorService.schedule(runnableC1295Ad3, 300L, TimeUnit.MILLISECONDS);
    }
}
