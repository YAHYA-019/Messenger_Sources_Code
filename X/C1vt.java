package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;

/* renamed from: X.1vt, reason: invalid class name */
/* loaded from: 1vt.class */
public final class C1vt {
    public final ConcurrentHashMap A01 = new ConcurrentHashMap();
    public final ConcurrentHashMap A02 = new ConcurrentHashMap();
    public final ConcurrentSkipListSet A03 = new ConcurrentSkipListSet();
    public final List A00 = new ArrayList();

    public void A00(int i) {
        ConcurrentSkipListSet concurrentSkipListSet = this.A03;
        Integer valueOf = Integer.valueOf(i);
        concurrentSkipListSet.add(valueOf);
        AbstractCollection abstractCollection = (AbstractCollection) this.A02.remove(valueOf);
        if (abstractCollection == null || abstractCollection.isEmpty()) {
            return;
        }
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            ConcurrentHashMap concurrentHashMap = this.A01;
            AbstractCollection abstractCollection2 = (AbstractCollection) concurrentHashMap.get(next);
            if (abstractCollection2 != null) {
                abstractCollection2.remove(valueOf);
                0fH.A0d(next, valueOf, "JobDependencyManager", "Removing dependency [%s] -> [%s]");
                if (abstractCollection2.isEmpty()) {
                    concurrentHashMap.remove(next);
                    0fH.A0g(next, "JobDependencyManager", "jobId[%d] is now independent");
                    for (C1vr c1vr : this.A00) {
                        synchronized (c1vr) {
                            C1wd c1wd = (C1wd) c1vr.A00.remove(next);
                            if (c1wd != null) {
                                0fH.A0g(next, "JobDependencyConstraint", "Job[%d] is now UNBLOCKED by the DEPENDENCY constraint. Adding job to the top of the queue...");
                                C1vj c1vj = ((C1vp) c1vr).A00.A00;
                                c1vj.A02.addFirst(c1wd);
                                c1vj.A01();
                            } else {
                                0fH.A0g(next, "JobDependencyConstraint", "Job[%d] NOT FOUND while unblocking by the DEPENDENCY constraint. Ignoring...");
                            }
                        }
                    }
                } else {
                    continue;
                }
            }
        }
    }
}
