package X;

import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0lo, reason: invalid class name */
/* loaded from: 0lo.class */
public final class C0lo implements 17S {
    public final Set A00 = AnonymousClass001.A0v();

    public boolean CxB(java.util.Map map) {
        Iterator it = this.A00.iterator();
        boolean z = true;
        while (true) {
            boolean z2 = z;
            if (!it.hasNext()) {
                return z2;
            }
            z = z2 & ((17S) it.next()).CxB(map);
        }
    }
}
