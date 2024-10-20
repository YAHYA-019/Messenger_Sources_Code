package X;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.19g, reason: invalid class name */
/* loaded from: 19g.class */
public final class C19g {
    public static final String A04 = C19g.class.toString();
    public static final List A05 = Collections.unmodifiableList(new 0eV(1));
    public int A00;
    public int A01;
    public final AtomicInteger A03 = new AtomicInteger(AnonymousClass001.A04(A05));
    public C08p A02 = null;

    public boolean A00() {
        boolean z = false;
        this.A01 = 0;
        int i = this.A00 + 1;
        this.A00 = i;
        if (i % 2 == 0) {
            AtomicInteger atomicInteger = this.A03;
            int i2 = atomicInteger.get() - 1;
            synchronized (this) {
                if (i2 >= 0) {
                    if (i2 < A05.size()) {
                        atomicInteger.set(i2);
                        z = true;
                    }
                }
                z = false;
            }
        }
        return z;
    }
}
