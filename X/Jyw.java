package X;

import java.util.Iterator;

/* loaded from: Jyw.class */
public final class Jyw extends 3AV {
    public Iterator A00;
    public 24X A01;

    public /* bridge */ /* synthetic */ 3sX A01() {
        return ((3AV) this).A02;
    }

    public C42h A06() {
        Iterator it = this.A00;
        if (!it.hasNext()) {
            this.A01 = null;
            return C42h.A01;
        }
        ((3sX) this).A00++;
        24X r0 = (24X) it.next();
        this.A01 = r0;
        return r0.AAi();
    }

    public 24X A07() {
        return this.A01;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.Jyw, X.3AV] */
    public Jyw A08() {
        24X r0 = this.A01;
        ?? r02 = new 3AV(this, 1);
        r02.A00 = r0.A0L();
        return r02;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.Jyy, X.3AV] */
    public Jyy A09() {
        24X r0 = this.A01;
        ?? r02 = new 3AV(this, 2);
        r02.A00 = r0.A0N();
        r02.A01 = true;
        return r02;
    }
}
