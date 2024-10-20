package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: Ls0.class */
public final class Ls0 implements Collection, AnonymousClass116 {
    public final Set A00 = 7zL.A15();

    public Ls0() {
    }

    public /* synthetic */ Ls0(Set set, DefaultConstructorMarker defaultConstructorMarker, int i) {
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return this.A00.add(obj);
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.A00.contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        return this.A00.containsAll(collection);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.A00.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return this.A00.remove(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.A00.remove(collection);
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate predicate) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.A00.retainAll(collection);
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return this.A00.size();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return C0A5.A00(this);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return C0A5.A01(this, objArr);
    }
}
