package X;

import com.google.common.collect.EvictingQueue;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.43q, reason: invalid class name */
/* loaded from: 43q.class */
public final class C43q {
    public 1BY A00;
    public final C00i A02;
    public final boolean A04;
    public final long A05;
    public final C00i A06;
    public final C00i A08;
    public final C00i A09;
    public final C00i A03 = new 1BQ(49776);
    public final C00i A01 = new 1BQ(16918);
    public final C00i A07 = new 1BQ(131081);

    public C43q(1BO r302) {
        1BQ r0 = new 1BQ(16385);
        this.A08 = r0;
        this.A09 = new 1BQ(67262);
        this.A06 = new 1BV((1BY) null, 83719);
        this.A02 = new 1BQ(99390);
        this.A00 = new 1BY(r302);
        this.A05 = ((2yD) r0.get()).Auy(36607586811911968L);
        this.A04 = ((2yD) r0.get()).AZl(2342169121048974621L, true);
    }

    public L5D A00() {
        long j = this.A05;
        L5D l5d = null;
        if (j > 0 && A02()) {
            l5d = LBf.A02((C5ez) this.A07.get(), "CellTowerAndWifiInfoHelper", 363864663, j, false);
        }
        return l5d;
    }

    public String A01() {
        ImmutableList copyOf;
        Double d;
        EvictingQueue evictingQueue = ((C5ez) this.A07.get()).A07;
        synchronized (evictingQueue) {
            copyOf = ImmutableList.copyOf((Collection) evictingQueue);
        }
        if (copyOf == null || copyOf.isEmpty()) {
            return null;
        }
        C26T c26t = C26T.A00;
        C03353xs c03353xs = new C03353xs(c26t);
        long A08 = 1BL.A08(this.A02);
        Iterator it = copyOf.iterator();
        while (it.hasNext()) {
            4UG r0 = (4UG) it.next();
            if (!this.A04 || ((d = r0.A04) != null && d.doubleValue() != 0.0d)) {
                2DM r02 = new 2DM(c26t);
                r02.A0j("freshness_ms", A08 - r0.A01);
                r02.A0o("message_type", r0.A07);
                r02.A0l("svn", r0.A05);
                r02.A0l("elevation", r0.A03);
                r02.A0l("azimuth", r0.A02);
                r02.A0l("snr", r0.A04);
                r02.A0i("batch_hash", r0.A00);
                c03353xs.A0d(r02);
            }
        }
        2DM r03 = new 2DM(c26t);
        r03.A0e(c03353xs, "messages");
        return r03.toString();
    }

    public boolean A02() {
        C00i c00i = this.A09;
        boolean z = false;
        if (c00i.get() == null) {
            return false;
        }
        if (((1Rv) c00i.get()).A08("android.permission.ACCESS_FINE_LOCATION") && ((C5ez) this.A07.get()).A01.isProviderEnabled("gps")) {
            return true;
        }
        if (((1Rv) c00i.get()).A08("android.permission.ACCESS_FINE_LOCATION") || ((1Rv) c00i.get()).A08("android.permission.ACCESS_COARSE_LOCATION")) {
            if (((C5ez) this.A07.get()).A01.isProviderEnabled("network")) {
                z = true;
            }
        }
        return z;
    }
}
