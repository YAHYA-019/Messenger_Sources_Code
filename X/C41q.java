package X;

import android.net.wifi.ScanResult;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.41q, reason: invalid class name */
/* loaded from: 41q.class */
public final class C41q {
    public final long A00;
    public final C0dp A01;
    public final C0dr A02;

    public C41q(C0dp c0dp, C0dr c0dr, long j) {
        this.A01 = c0dp;
        this.A02 = c0dr;
        this.A00 = j;
    }

    public void A00(long j, List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ScanResult scanResult = (ScanResult) it.next();
                if (scanResult != null && j > 0) {
                    long now = this.A01.now() - scanResult.timestamp;
                    if (Math.abs(now) <= j) {
                        scanResult.timestamp = (this.A02.now() - now) * 1000;
                    }
                }
            }
        }
    }
}
