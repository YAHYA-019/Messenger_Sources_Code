package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.0rl, reason: invalid class name */
/* loaded from: 0rl.class */
public final class C0rl implements Collection, AnonymousClass116 {
    public final long[] A00;

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
        if (!(obj instanceof AnonymousClass141)) {
            return false;
        }
        return 02L.A0E(this.A00, ((AnonymousClass141) obj).A00);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        11T.A0F(collection, 0);
        long[] jArr = this.A00;
        boolean z = false;
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if (!(obj instanceof AnonymousClass141) || !02L.A0E(jArr, ((AnonymousClass141) obj).A00)) {
                    break;
                }
            }
        }
        z = true;
        return z;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        long[] jArr = this.A00;
        boolean z = false;
        if ((obj instanceof C0rl) && 11T.A0O(jArr, ((C0rl) obj).A00)) {
            z = true;
        }
        return z;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return AnonymousClass001.A1O(this.A00.length);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C0rk(this.A00);
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
    public boolean retainAll(Collection collection) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ int size() {
        return this.A00.length;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return C0A5.A00(this);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return 11T.A0Q(this, objArr);
    }

    public String toString() {
        return 0Pz.A0X("ULongArray(storage=", Arrays.toString(this.A00), ')');
    }
}
