package androidx.work.impl;

import X.4JS;
import X.4JT;
import X.4JU;
import X.4JV;
import X.4JW;
import X.4JX;
import X.4JY;
import X.4KU;
import X.4KV;
import X.4KX;
import X.C4Il;
import X.C4K9;
import X.C4Ko;
import X.C4Kz;
import X.LRp;

/* loaded from: WorkDatabase.class */
public abstract class WorkDatabase extends C4Il {
    public 4JT A09() {
        4JT r0;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this;
        if (workDatabase_Impl.A00 != null) {
            return workDatabase_Impl.A00;
        }
        synchronized (workDatabase_Impl) {
            if (workDatabase_Impl.A00 == null) {
                workDatabase_Impl.A00 = new C4Kz(workDatabase_Impl);
            }
            r0 = workDatabase_Impl.A00;
        }
        return r0;
    }

    public 4JY A0A() {
        4JY r0;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this;
        if (workDatabase_Impl.A01 != null) {
            return workDatabase_Impl.A01;
        }
        synchronized (workDatabase_Impl) {
            if (workDatabase_Impl.A01 == null) {
                workDatabase_Impl.A01 = new 4KX(workDatabase_Impl);
            }
            r0 = workDatabase_Impl.A01;
        }
        return r0;
    }

    public 4JV A0B() {
        4JV r0;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this;
        if (workDatabase_Impl.A03 != null) {
            return workDatabase_Impl.A03;
        }
        synchronized (workDatabase_Impl) {
            if (workDatabase_Impl.A03 == null) {
                workDatabase_Impl.A03 = new C4K9(workDatabase_Impl);
            }
            r0 = workDatabase_Impl.A03;
        }
        return r0;
    }

    public 4JW A0C() {
        4JW r0;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this;
        if (workDatabase_Impl.A04 != null) {
            return workDatabase_Impl.A04;
        }
        synchronized (workDatabase_Impl) {
            if (workDatabase_Impl.A04 == null) {
                workDatabase_Impl.A04 = new LRp(workDatabase_Impl);
            }
            r0 = workDatabase_Impl.A04;
        }
        return r0;
    }

    public 4JX A0D() {
        4JX r0;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this;
        if (workDatabase_Impl.A05 != null) {
            return workDatabase_Impl.A05;
        }
        synchronized (workDatabase_Impl) {
            if (workDatabase_Impl.A05 == null) {
                workDatabase_Impl.A05 = new 4KV(workDatabase_Impl);
            }
            r0 = workDatabase_Impl.A05;
        }
        return r0;
    }

    public 4JS A0E() {
        4JS r0;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this;
        if (workDatabase_Impl.A06 != null) {
            return workDatabase_Impl.A06;
        }
        synchronized (workDatabase_Impl) {
            if (workDatabase_Impl.A06 == null) {
                workDatabase_Impl.A06 = new 4KU(workDatabase_Impl);
            }
            r0 = workDatabase_Impl.A06;
        }
        return r0;
    }

    public 4JU A0F() {
        4JU r0;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this;
        if (workDatabase_Impl.A07 != null) {
            return workDatabase_Impl.A07;
        }
        synchronized (workDatabase_Impl) {
            if (workDatabase_Impl.A07 == null) {
                workDatabase_Impl.A07 = new C4Ko(workDatabase_Impl);
            }
            r0 = workDatabase_Impl.A07;
        }
        return r0;
    }
}
