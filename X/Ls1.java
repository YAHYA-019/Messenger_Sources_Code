package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* loaded from: Ls1.class */
public final class Ls1 implements Collection, AnonymousClass116 {
    public static final Ls1 A02 = new Ls1(C0ty.A00);
    public final int A00;
    public final List A01;

    public Ls1(List list) {
        this.A01 = list;
        this.A00 = list.size();
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Collection
    public void clear() {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof KsQ) {
            return this.A01.contains(obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        return this.A01.containsAll(collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Ls1) && 11T.A0O(this.A01, ((Ls1) obj).A01));
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.A01.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.A01.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.A01.iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate predicate) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return this.A00;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return C0A5.A00(this);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return C0A5.A01(this, objArr);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("LocaleList(localeList=");
        return AnonymousClass002.A0K(this.A01, A0k);
    }
}
