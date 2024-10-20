package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.0ri, reason: invalid class name */
/* loaded from: 0ri.class */
public final class C0ri implements Collection, AnonymousClass116 {
    public final int[] A00;

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
        if (!(obj instanceof AnonymousClass147)) {
            return false;
        }
        return 02L.A0D(this.A00, ((AnonymousClass147) obj).A00);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        11T.A0F(collection, 0);
        int[] iArr = this.A00;
        boolean z = false;
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if (!(obj instanceof AnonymousClass147) || !02L.A0D(iArr, ((AnonymousClass147) obj).A00)) {
                    break;
                }
            }
        }
        z = true;
        return z;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        int[] iArr = this.A00;
        boolean z = false;
        if ((obj instanceof C0ri) && 11T.A0O(iArr, ((C0ri) obj).A00)) {
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
        return new C0rh(this.A00);
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
        return 0Pz.A0X("UIntArray(storage=", Arrays.toString(this.A00), ')');
    }
}
