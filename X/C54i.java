package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.54i, reason: invalid class name */
/* loaded from: 54i.class */
public final class C54i {
    public final 1CO A05 = (1CO) 1Bi.A03(16385);
    public String A02 = null;
    public int A01 = 0;
    public int A00 = 0;
    public AtomicBoolean A03 = new AtomicBoolean(true);
    public volatile boolean A08 = true;
    public volatile boolean A07 = false;
    public final C00i A04 = new 1BQ(85127);
    public final 3rE A06 = (3rE) 1Bi.A03(32804);

    public void A00() {
        synchronized (this) {
            if (this.A05.AZk(36317139649113098L)) {
                this.A08 = true;
                AtomicBoolean atomicBoolean = this.A03;
                synchronized (atomicBoolean) {
                    atomicBoolean.notifyAll();
                }
                C4Ut c4Ut = (C4Ut) this.A04.get();
                if (C4Ut.A00(c4Ut)) {
                    String A00 = AbstractC00603o4.A00(369);
                    0fH.A0j(A00, "markLastDeltaArrive");
                    synchronized (c4Ut) {
                    }
                    0fH.A0j(A00, "notifyListeners");
                    Iterator it = c4Ut.A02.iterator();
                    while (it.hasNext()) {
                        ((2Yc) it.next()).C3K();
                    }
                    ((7Qg) 1Br.A0B(c4Ut.A00)).A01();
                }
            }
        }
    }

    public void A01(int i, int i2) {
        if (this.A02 != null) {
            if (!this.A07) {
                this.A06.A03(this.A02, (List) null, i, i2, 0);
            }
            if (i2 == 84 || i2 == 85) {
                A02(null);
                this.A07 = false;
            }
        }
    }

    public void A02(String str) {
        synchronized (this) {
            this.A02 = str;
            if (this.A05.AZk(36317139649113098L)) {
                AtomicBoolean atomicBoolean = this.A03;
                synchronized (atomicBoolean) {
                    atomicBoolean.notifyAll();
                }
                this.A08 = true;
            }
            this.A01 = 0;
            this.A00 = 0;
        }
    }
}
