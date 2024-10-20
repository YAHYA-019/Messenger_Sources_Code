package X;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Set;

/* loaded from: Li0.class */
public final class Li0 implements Closeable {
    public volatile boolean A00 = false;
    public final /* synthetic */ Keg A01;
    public final /* synthetic */ LVK A02;
    public final /* synthetic */ String A03;

    public Li0(Keg keg, LVK lvk, String str) {
        this.A02 = lvk;
        this.A03 = str;
        this.A01 = keg;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A00 = true;
        Ken ken = this.A02.A01;
        String str = this.A03;
        Keg keg = this.A01;
        synchronized (ken) {
            HashMap hashMap = ken.A00;
            Set set = (Set) hashMap.get(str);
            if (set != null) {
                set.remove(keg);
                if (set.isEmpty()) {
                    hashMap.remove(str);
                }
            }
        }
    }

    public void finalize() {
        int A03 = 0FI.A03(-1475001757);
        if (!this.A00) {
            close();
        }
        0FI.A09(882677059, A03);
    }
}
