package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: Lj0.class */
public final class Lj0 implements Iterable {
    public final Object A02 = AnonymousClass001.A0R();
    public final java.util.Map A03 = AnonymousClass001.A0u();
    public Set A01 = Collections.emptySet();
    public List A00 = Collections.emptyList();

    public Set A00() {
        Set set;
        synchronized (this.A02) {
            set = this.A01;
        }
        return set;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        Iterator it;
        synchronized (this.A02) {
            it = this.A00.iterator();
        }
        return it;
    }
}
