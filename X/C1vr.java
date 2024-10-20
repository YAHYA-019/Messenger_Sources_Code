package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;

/* renamed from: X.1vr, reason: invalid class name */
/* loaded from: 1vr.class */
public final class C1vr extends C1vp {
    public java.util.Map A00;
    public final C00i A01;

    public C1vr() {
        1BQ r0 = new 1BQ(16855);
        this.A01 = r0;
        this.A00 = Collections.synchronizedMap(new HashMap());
        ((C1vt) r0.get()).A00.add(this);
    }

    @Override // X.C1vp
    public boolean A00(C1wd c1wd) {
        boolean z;
        synchronized (this) {
            C1vt c1vt = (C1vt) this.A01.get();
            1wM r0 = c1wd.A01;
            Integer valueOf = Integer.valueOf(((1wN) r0).A00);
            ConcurrentHashMap concurrentHashMap = c1vt.A01;
            ConcurrentSkipListSet concurrentSkipListSet = (ConcurrentSkipListSet) concurrentHashMap.get(valueOf);
            if (concurrentSkipListSet == null || concurrentSkipListSet.isEmpty()) {
                concurrentHashMap.remove(valueOf);
            } else {
                Iterator it = concurrentSkipListSet.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (c1vt.A03.contains(next)) {
                        it.remove();
                        ConcurrentHashMap concurrentHashMap2 = c1vt.A02;
                        ConcurrentSkipListSet concurrentSkipListSet2 = (ConcurrentSkipListSet) concurrentHashMap2.get(next);
                        if (concurrentSkipListSet2 != null) {
                            concurrentSkipListSet2.remove(valueOf);
                            if (concurrentSkipListSet2.isEmpty()) {
                                concurrentHashMap2.remove(next);
                            }
                        }
                    } else {
                        0fH.A0d(valueOf, next, "JobDependencyManager", "hasDependencies jobId[%d] -> [%d]");
                    }
                }
                if (concurrentSkipListSet.isEmpty()) {
                    concurrentHashMap.remove(valueOf);
                    0fH.A0g(valueOf, "JobDependencyManager", "hasDependencies jobId[%d] has no dependencies");
                } else {
                    0fH.A0d(valueOf, ((1wN) r0).A04, "JobDependencyConstraint", "Job[%d] BLOCKED by the DEPENDENCY constraint, moving to pending list..\t\thints[%s]");
                    this.A00.put(valueOf, c1wd);
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }
}
