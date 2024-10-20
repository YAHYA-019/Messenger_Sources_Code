package X;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.HashMap;

/* renamed from: X.1mX, reason: invalid class name */
/* loaded from: 1mX.class */
public final class C1mX implements 1mY {
    public final 1mZ A00 = (1mZ) 1Bi.A03(16794);

    public ImmutableMap get() {
        ImmutableSet A07;
        HashMap hashMap = new HashMap();
        1mZ r0 = this.A00;
        synchronized (r0) {
            A07 = ImmutableSet.A07(r0.A00);
        }
        1Du it = A07.iterator();
        while (it.hasNext()) {
            C2e4 c2e4 = (C2e4) it.next();
            if (c2e4.A00) {
                hashMap.put(c2e4.A02, c2e4.A01);
            }
        }
        return ImmutableMap.copyOf((java.util.Map) hashMap);
    }
}
