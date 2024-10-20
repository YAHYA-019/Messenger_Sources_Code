package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: Jyy.class */
public final class Jyy extends 3AV {
    public Iterator A00;
    public boolean A01;
    public Map.Entry A02;

    public /* bridge */ /* synthetic */ 3sX A01() {
        return ((3AV) this).A02;
    }

    public C42h A06() {
        if (!this.A01) {
            this.A01 = true;
            return ((24X) this.A02.getValue()).AAi();
        }
        Iterator it = this.A00;
        String str = null;
        if (!it.hasNext()) {
            ((3AV) this).A00 = null;
            this.A02 = null;
            return C42h.A02;
        }
        ((3sX) this).A00++;
        this.A01 = false;
        Map.Entry A0z = AnonymousClass001.A0z(it);
        this.A02 = A0z;
        if (A0z != null) {
            str = (String) A0z.getKey();
        }
        ((3AV) this).A00 = str;
        return C42h.A03;
    }

    public 24X A07() {
        Map.Entry entry = this.A02;
        if (entry == null) {
            return null;
        }
        return (24X) entry.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.Jyw, X.3AV] */
    public Jyw A08() {
        24X A07 = A07();
        ?? r0 = new 3AV(this, 1);
        r0.A00 = A07.A0L();
        return r0;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.Jyy, X.3AV] */
    public Jyy A09() {
        24X A07 = A07();
        ?? r0 = new 3AV(this, 2);
        r0.A00 = A07.A0N();
        r0.A01 = true;
        return r0;
    }
}
