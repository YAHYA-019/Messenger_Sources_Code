package X;

import com.google.common.base.Predicate;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* renamed from: X.7hW, reason: invalid class name */
/* loaded from: 7hW.class */
public final class C7hW extends C1n4 implements SortedSet {
    @Override // java.util.SortedSet
    public Comparator comparator() {
        return ((SortedSet) this.A01).comparator();
    }

    @Override // java.util.SortedSet
    public Object first() {
        Iterator it = this.A01.iterator();
        Predicate predicate = this.A00;
        it.getClass();
        predicate.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (predicate.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.SortedSet, X.1n5] */
    @Override // java.util.SortedSet
    public SortedSet headSet(Object obj) {
        return new C1n5(this.A00, ((SortedSet) this.A01).headSet(obj));
    }

    @Override // java.util.SortedSet
    public Object last() {
        SortedSet sortedSet = (SortedSet) this.A01;
        while (true) {
            SortedSet sortedSet2 = sortedSet;
            Object last = sortedSet2.last();
            if (this.A00.apply(last)) {
                return last;
            }
            sortedSet = sortedSet2.headSet(last);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.SortedSet, X.1n5] */
    @Override // java.util.SortedSet
    public SortedSet subSet(Object obj, Object obj2) {
        return new C1n5(this.A00, ((SortedSet) this.A01).subSet(obj, obj2));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.SortedSet, X.1n5] */
    @Override // java.util.SortedSet
    public SortedSet tailSet(Object obj) {
        return new C1n5(this.A00, ((SortedSet) this.A01).tailSet(obj));
    }
}
