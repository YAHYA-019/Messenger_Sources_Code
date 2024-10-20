package X;

import java.io.Closeable;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: Lhz.class */
public final class Lhz implements Closeable {
    public final AtomicBoolean A00 = 7zO.A15();
    public final /* synthetic */ Ku2 A01;
    public final /* synthetic */ String A02;

    public Lhz(Ku2 ku2, String str) {
        this.A01 = ku2;
        this.A02 = str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.A00.compareAndSet(false, true)) {
            Ku2 ku2 = this.A01;
            String str = this.A02;
            synchronized (ku2) {
                java.util.Map map = ku2.A02;
                if (map.containsKey(str)) {
                    int A0G = JQy.A0G(str, map);
                    if (A0G == 1) {
                        map.remove(str);
                        ku2.A01.remove(str);
                        KkB kkB = ku2.A00;
                        0fH.A0A(KkB.class, "Clearing the cache");
                        HashMap hashMap = kkB.A02;
                        synchronized (hashMap) {
                            hashMap.clear();
                        }
                    } else {
                        1BK.A1P(str, map, A0G - 1);
                    }
                } else {
                    0fH.A0F(Ku2.class, "Decreasing session count of a closed session");
                }
            }
        }
    }

    public void finalize() {
        int A03 = 0FI.A03(-210839563);
        if (!this.A00.get()) {
            close();
        }
        0FI.A09(278638475, A03);
    }
}
