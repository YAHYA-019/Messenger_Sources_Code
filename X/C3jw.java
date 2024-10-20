package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3jw, reason: invalid class name */
/* loaded from: 3jw.class */
public final class C3jw extends AbstractCollection {
    public final /* synthetic */ 1kN A00;

    public C3jw(1kN r302) {
        this.A00 = r302;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.A00.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new AbstractC05164d1(this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.A00.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        ArrayList A10 = 1BL.A10(this);
        C1Jp.A02(A10, iterator());
        return A10.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        ArrayList A10 = 1BL.A10(this);
        C1Jp.A02(A10, iterator());
        return A10.toArray(objArr);
    }
}
