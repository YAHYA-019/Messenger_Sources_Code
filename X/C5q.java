package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.GroupThreadData;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: C5q.class */
public final class C5q {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04 = 1Bq.A00(83605);
    public final 1Br A05;
    public final 1De A06;

    public C5q(1De r302) {
        this.A06 = r302;
        1BY r0 = r302.A00;
        this.A03 = 1Bu.A03(r0, 82380);
        this.A01 = 1Bq.A00(68470);
        this.A02 = 1Bq.A00(67347);
        this.A00 = 1Bu.A03(r0, 66464);
        this.A05 = AbG.A0P();
    }

    public final boolean A00(ThreadSummary threadSummary) {
        GroupThreadData AoK;
        boolean z = false;
        ThreadKey threadKey = threadSummary.A0n;
        if ((threadKey.A1F() || threadKey.A1I() || ThreadKey.A0a(threadKey) || threadKey.A0w()) && !2Gt.A0D(threadSummary) && !AbI.A1a(threadSummary, (5yW) 1Br.A0B(this.A02))) {
            if (AbL.A1H(this.A04) && (AoK = threadSummary.AoK()) != null && AoK.A08 != null) {
                z = AbL.A1J(this.A03, threadSummary);
            } else {
                if (!2oI.A03(threadSummary)) {
                    return true;
                }
                1Br.A0C(this.A00);
                boolean A00 = 2oQ.A00(threadSummary);
                if (AbL.A1J(this.A03, threadSummary) && !A00) {
                    return true;
                }
            }
        }
        return z;
    }
}
