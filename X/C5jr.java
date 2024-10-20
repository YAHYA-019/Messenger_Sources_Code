package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.5jr, reason: invalid class name */
/* loaded from: 5jr.class */
public final class C5jr implements 4kV {
    public final InterfaceC07554k7 A00;
    public final AnonymousClass207 A04;
    public final CopyOnWriteArraySet A01 = new CopyOnWriteArraySet();
    public final AtomicReference A03 = new AtomicReference();
    public final AtomicBoolean A02 = new AtomicBoolean(false);

    public C5jr(C07724ki c07724ki, InterfaceC07554k7 interfaceC07554k7) {
        this.A00 = interfaceC07554k7;
        this.A01.add(c07724ki);
        AnonymousClass207 Asi = interfaceC07554k7.Asi();
        11T.A0A(Asi);
        this.A04 = Asi;
    }

    public void C9B(Object obj) {
        boolean z;
        this.A03.set(obj);
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            C07724ki c07724ki = (C07724ki) it.next();
            synchronized (c07724ki) {
                z = c07724ki.A01;
            }
            if (!z) {
                C07724ki.A00(c07724ki);
            }
        }
    }
}
