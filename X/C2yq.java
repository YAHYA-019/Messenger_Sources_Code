package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2yq, reason: invalid class name */
/* loaded from: 2yq.class */
public final class C2yq {
    public final java.util.Map A02 = Collections.synchronizedMap(new HashMap());
    public final java.util.Map A01 = new HashMap();
    public Set A00 = new HashSet();

    public final void A00(C1s9 c1s9) {
        synchronized (this) {
            Set set = this.A00;
            set.remove(c1s9);
            if (set.isEmpty()) {
                this.A01.clear();
                this.A02.clear();
            }
        }
    }
}
