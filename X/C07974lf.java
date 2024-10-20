package X;

import android.net.TrafficStats;
import android.os.DeadObjectException;
import android.os.Process;
import android.os.StrictMode;
import com.facebook.common.util.TriState;
import com.facebook.device.resourcemonitor.DataUsageBytes;
import java.io.File;

/* renamed from: X.4lf, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4lf.class */
public final class C07974lf {
    public TriState A00;
    public final boolean A01;

    public C07974lf() {
        1Bi.A03(16511);
        boolean z = false;
        try {
            long j = -1;
            if (TrafficStats.getTotalRxBytes() != j && TrafficStats.getTotalTxBytes() != j && TrafficStats.getMobileRxBytes() != j && TrafficStats.getMobileTxBytes() != j) {
                int myUid = Process.myUid();
                if (TrafficStats.getUidRxBytes(myUid) != j) {
                    if (TrafficStats.getUidTxBytes(myUid) != j) {
                        z = true;
                    }
                }
            }
        } catch (RuntimeException e) {
            A00(e);
        }
        this.A00 = TriState.UNSET;
        this.A01 = z;
    }

    public static void A00(RuntimeException runtimeException) {
        if (!(runtimeException.getCause() instanceof DeadObjectException)) {
            throw runtimeException;
        }
        0fH.A0v("FbTrafficStats", "netstats connection lost", runtimeException);
    }

    public static boolean A01(C07974lf c07974lf) {
        TriState triState = c07974lf.A00;
        if (triState == TriState.UNSET) {
            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                triState = new File("/proc/net/xt_qtaguid/stats").canRead() ? TriState.YES : TriState.NO;
                c07974lf.A00 = triState;
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        }
        boolean z = false;
        if (triState == TriState.YES) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.RuntimeException, boolean] */
    public DataUsageBytes A02(int i) {
        ?? A01 = A01(this);
        if (A01 != 0) {
            try {
                DataUsageBytes A00 = 7kU.A00(i, 0);
                DataUsageBytes A002 = 7kU.A00(i, 1);
                return new DataUsageBytes(A00.A00 + A002.A00, A00.A01 + A002.A01);
            } catch (5Ce unused) {
                return new DataUsageBytes(0L, 0L);
            }
        }
        try {
            return new DataUsageBytes(TrafficStats.getUidRxBytes(i), TrafficStats.getUidTxBytes(i));
        } catch (RuntimeException unused2) {
            A00(A01);
            return new DataUsageBytes(0L, 0L);
        }
    }
}
