package X;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1qf, reason: invalid class name */
/* loaded from: 1qf.class */
public final class C1qf {
    public final int A02;
    public final AtomicInteger A01 = new AtomicInteger(1);
    public final HashMap A00 = new HashMap();

    public C1qf(int i) {
        this.A02 = i;
    }

    public final long A00(String str, int i) {
        int intValue;
        synchronized (this) {
            HashMap hashMap = this.A00;
            Object obj = hashMap.get(str);
            if (obj == null) {
                obj = Integer.valueOf(this.A01.getAndIncrement());
                hashMap.put(str, obj);
            }
            intValue = ((Number) obj).intValue();
        }
        return (i << 32) | intValue | (this.A02 << 35);
    }
}
