package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;

/* loaded from: DAv.class */
public final class DAv implements Callable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ CMZ A01;

    public DAv(CMZ cmz, long j) {
        this.A01 = cmz;
        this.A00 = j;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        CMZ cmz = this.A01;
        LinkedHashMap A0J = cmz.A08.A0J(null, new C1q8[]{C1q8.A0M}, 501, cmz.A02);
        if (!A0J.isEmpty()) {
            if (A0J.size() > 500) {
                CMZ.A00(cmz);
            } else {
                Iterator it = A0J.values().iterator();
                while (it.hasNext()) {
                    if (4YU.A0V(it).A05 < this.A00) {
                        CMZ.A01(cmz, A0J);
                    }
                }
            }
            A0J = 1BK.A1C();
            break;
        }
        return A0J;
    }
}
