package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableSet;

/* loaded from: Cvy.class */
public final class Cvy implements 6ND {
    public final int A00;
    public final Object A01;

    public Cvy(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void CN9(5Cz r302, UserKey userKey) {
        ThreadKey threadKey;
        switch (this.A00) {
            case 0:
                6O4 r0 = (6O4) this.A01;
                ThreadSummary threadSummary = r0.A01;
                if (threadSummary == null || (threadKey = threadSummary.A0n) == null || !threadKey.A1F()) {
                    if (r0.A05 == r302 && !AbL.A1H(r0.A0C)) {
                        return;
                    }
                    r0.A05 = r302;
                    ((2Iq) 1Br.A0B(r0.A0B)).A01("canonical_new_presence_push");
                }
                r0.A03();
                return;
            case 1:
                11T.A0H(userKey, r302);
                6NE r02 = (6NE) this.A01;
                ThreadKey threadKey2 = r02.A00;
                if (threadKey2 != null) {
                    if ((threadKey2.A1F() || threadKey2.A1I() || threadKey2.A1B()) && !2yD.A03(C1mr.A00(r02.A03), 36310512514695480L)) {
                        return;
                    }
                    java.util.Map map = r02.A06;
                    5Cz r03 = (5Cz) map.get(userKey);
                    if (r03 != r302) {
                        if (r03 != null && r03.A06 == r302.A06 && r03.A05.get(threadKey2) == r302.A05.get(threadKey2)) {
                            return;
                        }
                        if (map.containsKey(userKey)) {
                            map.remove(userKey);
                        }
                        if (r302.A00(threadKey2)) {
                            map.put(userKey, r302);
                        }
                        6ND r04 = r02.A01;
                        if (r04 != null) {
                            r04.CN9(r302, userKey);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                6F2 r05 = (6F2) this.A01;
                ImmutableSet immutableSet = 6F2.A4P;
                6F2.A0t(r05, ((6NE) r05.A3J.get()).A03(), true);
                return;
        }
    }
}
