package X;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: C1b.class */
public final class C1b {
    public final AtomicReference A00 = new AtomicReference();

    public boolean A00(String str) {
        Object obj;
        boolean z = false;
        if (str != null && (obj = this.A00.get()) != null) {
            z = !str.equals(obj);
        }
        return z;
    }
}
