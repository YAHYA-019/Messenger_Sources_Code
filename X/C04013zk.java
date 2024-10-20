package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* renamed from: X.3zk, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3zk.class */
public final class C04013zk {
    public int A00;
    public boolean A01;
    public final QuickPerformanceLogger A02;
    public final C04023zl A03;

    public C04013zk() {
        02O qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
        this.A02 = qPLInstance == null ? QuickPerformanceLoggerProvider.A01 : qPLInstance;
        this.A03 = new C04023zl();
    }

    public static final void A00(C04013zk c04013zk, int i) {
        if (c04013zk.A01) {
            QuickPerformanceLogger quickPerformanceLogger = c04013zk.A02;
            quickPerformanceLogger.markerPoint(716778457, "QpSdkReliabilityQpl_clear_points_counter");
            C04023zl c04023zl = c04013zk.A03;
            synchronized (c04023zl) {
                c04023zl.A00.clear();
            }
            quickPerformanceLogger.markerEnd(716778457, i, (short) 2);
            c04013zk.A01 = false;
        }
    }

    public static final void A01(C04013zk c04013zk, ImmutableList immutableList, int i) {
        if (c04013zk.A01) {
            return;
        }
        if (i != c04013zk.A00) {
            c04013zk.A00 = i;
        }
        Iterator it = immutableList.iterator();
        while (it.hasNext()) {
            c04013zk.A02.markerLinkPivot(716778457, i, 0Pz.A0W("qp_surface_", (String) it.next()));
        }
        c04013zk.A02.markerStart(716778457, i, false);
        c04013zk.A01 = true;
    }
}
