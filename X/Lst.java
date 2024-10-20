package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* loaded from: Lst.class */
public final class Lst implements List {
    public final Set A00;

    public Lst(Set set) {
        this.A00 = set;
    }

    @Override // java.util.List
    public void add(int i, Object obj) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.List
    public Object get(int i) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new Lsj(this, this.A00.iterator(), 1);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.List
    public Object remove(int i) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.List
    public Object set(int i, Object obj) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.A00.size();
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        throw AnonymousClass001.A0p();
    }
}
