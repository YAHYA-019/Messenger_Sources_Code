package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.1nu, reason: invalid class name */
/* loaded from: 1nu.class */
public abstract class C1nu {
    public final 1Up A00 = new 1Up(20);
    public final CopyOnWriteArrayList A01 = new CopyOnWriteArrayList();

    public void A00(C1nz c1nz) {
        Iterator it;
        synchronized (this) {
            this.A00.A04(c1nz);
            it = this.A01.iterator();
        }
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass001.A0Q("onAddEvent");
        }
    }
}
