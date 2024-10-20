package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Iterator;
import java.util.Map;

/* loaded from: C7g.class */
public final class C7g {
    public Long A00;
    public boolean A01;
    public final int A02;
    public final 1Br A03 = 7zM.A0S();

    public C7g(int i) {
        this.A02 = i;
    }

    public final void A00(long j) {
        synchronized (this) {
            if (this.A01) {
                Long l = this.A00;
                if (l != null && l.longValue() == j) {
                    this.A00 = null;
                    this.A01 = false;
                    7zP.A0e(this.A03).markerEnd(this.A02, (short) 2);
                }
            }
        }
    }

    public final void A01(java.util.Map map, long j) {
        synchronized (this) {
            if (this.A01) {
                this.A00 = null;
                this.A01 = false;
                7zP.A0e(this.A03).markerEnd(this.A02, (short) 4);
            }
            this.A00 = Long.valueOf(j);
            this.A01 = true;
            C00i c00i = this.A03.A00;
            QuickPerformanceLogger A0V = 1BK.A0V(c00i);
            int i = this.A02;
            A0V.markerStart(i);
            Iterator A0y = AnonymousClass001.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                1BK.A0V(c00i).markerAnnotate(i, AnonymousClass001.A0j(A0z), 1BK.A16(A0z));
            }
        }
    }
}
