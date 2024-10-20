package X;

import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: C21.class */
public final class C21 {
    public final 1Br A00 = 1BK.A0D();

    public final void A00(ThreadKey threadKey, int i, long j) {
        2R2 A08 = AbF.A08(1BK.A08(1Br.A02(this.A00), 1BJ.A00(1817)), 248);
        if (4YU.A1X(A08)) {
            A08.A0D("limit", Long.valueOf(j));
            A08.A0G(i);
            A08.A09(AbstractC03573yf.A00(threadKey), "thread_type");
            A08.BZL();
        }
    }
}
