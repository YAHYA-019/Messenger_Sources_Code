package X;

import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Maps$EntryFunction;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: Ly3.class */
public final class Ly3 extends AbstractCollection {
    public final MQl A00;

    public Ly3(MQl mQl) {
        this.A00 = mQl;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.A00.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new 4uU(this.A00.AQp().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        K9W k9w = this.A00;
        Predicate predicate = k9w.A00;
        Iterator it = k9w.A01.AQp().iterator();
        while (it.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(it);
            if (predicate.apply(A0z) && Objects.equal(A0z.getValue(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        K9W k9w = this.A00;
        return 2Ri.A0G(Predicates.and(k9w.A00, new Predicates.CompositionPredicate(new Predicates.InPredicate(collection), Maps$EntryFunction.A01)), k9w.A01.AQp());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        K9W k9w = this.A00;
        return 2Ri.A0G(Predicates.and(k9w.A00, new Predicates.CompositionPredicate(new Predicates.NotPredicate(new Predicates.InPredicate(collection)), Maps$EntryFunction.A01)), k9w.A01.AQp());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.A00.size();
    }
}
