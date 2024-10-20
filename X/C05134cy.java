package X;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.4cy, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4cy.class */
public final class C05134cy extends AbstractC05144cz {
    public final /* synthetic */ 1kN A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05134cy(final 1kN r302) {
        new AbstractSet() { // from class: X.4cz
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public void clear() {
                r302.clear();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                return r302.isEmpty();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return r302.size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public Object[] toArray() {
                ArrayList arrayList = new ArrayList(size());
                C1Jp.A02(arrayList, iterator());
                return arrayList.toArray();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public Object[] toArray(Object[] objArr) {
                ArrayList A10 = 1BL.A10(this);
                C1Jp.A02(A10, iterator());
                return A10.toArray(objArr);
            }
        };
        this.A00 = r302;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new AbstractC05164d1(this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return AnonymousClass001.A1T(this.A00.remove(obj));
    }
}
