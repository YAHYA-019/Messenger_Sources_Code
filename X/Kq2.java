package X;

import android.util.Pair;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: Kq2.class */
public final class Kq2 {
    public final int A00;
    public final int A01;
    public final 5IO A02;
    public final AtomicReference A03 = new AtomicReference();

    public Kq2(5IO r302, int i, int i2) {
        this.A02 = r302;
        this.A01 = i;
        this.A00 = i2;
    }

    public void finalize() {
        int i;
        Object obj;
        int A03 = 0FI.A03(235331846);
        Pair pair = (Pair) this.A03.get();
        if (pair == null || (obj = pair.second) == null) {
            i = 909890311;
        } else {
            ((2EU) obj).close();
            i = 2092142440;
        }
        0FI.A09(i, A03);
    }
}
