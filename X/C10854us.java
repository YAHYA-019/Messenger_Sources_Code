package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.4us, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4us.class */
public final class C10854us {
    public final 1Br A01 = 1Bu.A00(66804);
    public final 1Br A03 = 1Bq.A00(16467);
    public final 1Br A05 = 1Bu.A00(82461);
    public final 1Br A04 = 1Bu.A00(67579);
    public final 1Br A00 = 1Bq.A00(67900);
    public final 1Br A02 = 1Bq.A00(66351);
    public final ConcurrentMap A0A = new ConcurrentHashMap();
    public final ArrayList A06 = new ArrayList();
    public final ConcurrentMap A07 = new ConcurrentHashMap();
    public final ConcurrentMap A09 = new ConcurrentHashMap();
    public final ConcurrentMap A08 = new ConcurrentHashMap();

    public static final C11314w5 A00(C10854us c10854us) {
        return (C11314w5) 1Lm.A06(((1Fv) c10854us.A02.A00.get()).A04(), 49366);
    }

    public static final void A01(C10854us c10854us) {
        Iterator it = c10854us.A06.iterator();
        while (it.hasNext()) {
            C10834uq c10834uq = ((C10874uu) it.next()).A00;
            if (c10834uq.A00) {
                c10834uq.A01.A02(c10834uq.A02.A0A.size());
            }
        }
    }

    public static final void A02(C10854us c10854us, ThreadKey threadKey) {
        if (((C1gs) c10854us.A01.A00.get()).A01()) {
            ConcurrentMap concurrentMap = c10854us.A07;
            if (concurrentMap.containsKey(threadKey.toString())) {
                C21N c21n = (C21N) 1Lm.A06(((1Fv) c10854us.A02.A00.get()).A04(), 33124);
                C21h c21h = (C21h) concurrentMap.get(threadKey.toString());
                if (c21h != null) {
                    c21n.A01(c21h);
                }
                concurrentMap.remove(threadKey.toString());
            }
        }
    }

    public final void A03(ThreadKey threadKey) {
        if (threadKey != null) {
            A02(this, threadKey);
            Object remove = this.A0A.remove(threadKey);
            ThreadSummary A06 = ((2fE) 1Lm.A06(((1Fv) this.A02.A00.get()).A04(), 17064)).A06(threadKey);
            if (A06 != null) {
                A00(this).A05(4wA.A00(A06.A0n), false);
            }
            if (remove != null) {
                A01(this);
            }
        }
    }
}
