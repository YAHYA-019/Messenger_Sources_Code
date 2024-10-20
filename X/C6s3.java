package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.6s3, reason: invalid class name */
/* loaded from: 6s3.class */
public final class C6s3 implements C6s4 {
    public final C6s2 A00;

    public C6s3(C6s2 c6s2) {
        this.A00 = c6s2;
    }

    @Override // X.C6s4
    public 6Ku CkJ(List list) {
        Object next;
        Iterator it = list.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                C6s2 c6s2 = this.A00;
                int A00 = c6s2.A00((6Ku) next);
                do {
                    Object next2 = it.next();
                    int A002 = c6s2.A00((6Ku) next2);
                    if (A00 > A002) {
                        next = next2;
                        A00 = A002;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        return (6Ku) next;
    }
}
