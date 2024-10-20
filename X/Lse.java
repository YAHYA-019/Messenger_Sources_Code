package X;

import com.google.common.base.Preconditions;
import com.google.common.collect.LinkedListMultimap;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: Lse.class */
public final class Lse implements Iterator {
    public int A00;
    public K9T A01;
    public K9T A02;
    public final Set A03;
    public final /* synthetic */ LinkedListMultimap A04;

    public Lse(LinkedListMultimap linkedListMultimap) {
        this.A04 = linkedListMultimap;
        this.A03 = new HashSet(C1my.A00(linkedListMultimap.keySet().size()));
        this.A02 = linkedListMultimap.A02;
        this.A00 = linkedListMultimap.A00;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.A04.A00 == this.A00) {
            return AnonymousClass001.A1T(this.A02);
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public Object next() {
        K9T k9t;
        if (this.A04.A00 != this.A00) {
            throw new ConcurrentModificationException();
        }
        K9T k9t2 = this.A02;
        if (k9t2 == null) {
            throw AnonymousClass001.A10();
        }
        this.A01 = k9t2;
        Set set = this.A03;
        set.add(k9t2.A05);
        do {
            k9t = this.A02.A00;
            this.A02 = k9t;
            if (k9t == null) {
                break;
            }
        } while (!set.add(k9t.A05));
        return this.A01.A05;
    }

    @Override // java.util.Iterator
    public void remove() {
        LinkedListMultimap linkedListMultimap = this.A04;
        if (linkedListMultimap.A00 != this.A00) {
            throw new ConcurrentModificationException();
        }
        Preconditions.checkState(AnonymousClass001.A1T(this.A01), "no calls to next() since the last call to remove()");
        Lt6 lt6 = new Lt6(linkedListMultimap, this.A01.A05);
        while (lt6.hasNext()) {
            lt6.next();
            lt6.remove();
        }
        this.A01 = null;
        this.A00 = linkedListMultimap.A00;
    }
}
