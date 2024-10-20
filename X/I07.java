package X;

import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import com.facebook.inject.FbInjector;
import java.util.Deque;
import java.util.Iterator;

/* loaded from: I07.class */
public final class I07 {
    public Context A00;
    public final C00i A01;
    public final C00i A02;
    public final C00i A03;
    public final C00i A04;
    public final C00i A05;
    public final C00i A06 = AbH.A0N();
    public final C00i A07;
    public final C00i A08;
    public final 5Kv A09;

    public I07() {
        Context A00 = FbInjector.A00();
        this.A00 = A00;
        this.A02 = AbF.A0Q(A00, 49246);
        this.A03 = 1BQ.A00();
        this.A01 = 1BQ.A02(32888);
        this.A08 = 1BQ.A02(116097);
        this.A04 = 1BQ.A02(16687);
        this.A05 = 1BQ.A02(49322);
        this.A07 = 1BQ.A02(115216);
        this.A09 = (5Kv) 1Bi.A03(115898);
    }

    public static void A00(2R2 r301, long j, boolean z, boolean z2) {
        boolean z3;
        long j2;
        String str;
        r301.A0D("stall_time", Long.valueOf(j));
        r301.A0B("is_abandoned", Boolean.valueOf(z2));
        synchronized (5LS.A00()) {
            z3 = 5LS.A01;
        }
        if (z3) {
            5LS A00 = 5LS.A00();
            synchronized (A00) {
                try {
                    j2 = -1;
                    if (5LS.A01) {
                        Deque deque = A00.A00;
                        if (!deque.isEmpty()) {
                            Pair pair = (Pair) deque.peekLast();
                            if (pair != null) {
                                j2 = SystemClock.elapsedRealtime() - ((Long) pair.second).longValue();
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            r301.A0D("time_since_last_network_change_ms", Long.valueOf(j2));
            A00 = 5LS.A00();
            synchronized (A00) {
                if (5LS.A01) {
                    Deque deque2 = A00.A00;
                    if (!deque2.isEmpty()) {
                        StringBuilder A0k = AnonymousClass001.A0k();
                        Iterator it = deque2.iterator();
                        while (it.hasNext()) {
                            Pair pair2 = (Pair) it.next();
                            A0k.append((String) pair2.first);
                            A0k.append(":");
                            A0k.append(pair2.second);
                            if (it.hasNext()) {
                                A0k.append(";");
                            }
                        }
                        str = A0k.toString();
                    }
                }
                str = null;
            }
            r301.A0E("network_change_history", str);
        }
        if (z) {
            r301.A0B(4YT.A00(1512), 1BK.A0d());
        }
        r301.BZL();
    }
}
