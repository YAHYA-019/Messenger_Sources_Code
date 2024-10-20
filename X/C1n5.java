package X;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.1n5, reason: invalid class name */
/* loaded from: 1n5.class */
public class C1n5 extends AbstractCollection {
    public final Predicate A00;
    public final Collection A01;

    public C1n5(Predicate predicate, Collection collection) {
        this.A01 = collection;
        this.A00 = predicate;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        Preconditions.checkArgument(this.A00.apply(obj));
        return this.A01.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Preconditions.checkArgument(this.A00.apply(it.next()));
        }
        return this.A01.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        2Ri.A0G(this.A00, this.A01);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        Collection collection = this.A01;
        collection.getClass();
        try {
            if (collection.contains(obj)) {
                return this.A00.apply(obj);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean containsAll(Collection collection) {
        return C52z.A01(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return !2Ri.A0F(this.A00, this.A01);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        Iterator it = this.A01.iterator();
        Predicate predicate = this.A00;
        it.getClass();
        predicate.getClass();
        return new 3CS(predicate, it);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r301.A01.remove(r302) == false) goto L6;
     */
    @Override // java.util.AbstractCollection, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean remove(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            boolean r0 = r0.contains(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L1f
            r0 = r301
            java.util.Collection r0 = r0.A01
            r304 = r0
            r0 = r304
            r1 = r302
            boolean r0 = r0.remove(r1)
            r305 = r0
            r0 = 1
            r303 = r0
            r0 = r305
            if (r0 != 0) goto L23
        L1f:
            r0 = 0
            r303 = r0
            r0 = 0
            r304 = r0
        L23:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1n5.remove(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        Iterator it = this.A01.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.A00.apply(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        Iterator it = this.A01.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.A00.apply(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        Iterator it = this.A01.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.A00.apply(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        C1Jp.A02(arrayList, it);
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList A0s = AnonymousClass001.A0s();
        C1Jp.A02(A0s, it);
        return A0s.toArray(objArr);
    }
}
