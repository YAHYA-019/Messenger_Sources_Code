package X;

import com.google.common.base.Predicate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1n1, reason: invalid class name */
/* loaded from: 1n1.class */
public final class C1n1 extends C1mz {
    public final Set A00;

    public C1n1(Predicate predicate, java.util.Map map) {
        super(predicate, map);
        this.A00 = C1n3.A07(((C1mz) this).A00, map.entrySet());
    }

    @Override // X.C1n0
    public Set A02() {
        return new C1n7() { // from class: X.1n6
            {
                super(C1n1.this);
            }

            @Override // X.C1n7, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                C1n1 c1n1 = C1n1.this;
                if (!c1n1.containsKey(obj)) {
                    return false;
                }
                ((C1mz) c1n1).A01.remove(obj);
                return true;
            }

            @Override // X.C1n8, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection collection) {
                C1n1 c1n1 = C1n1.this;
                java.util.Map map = ((C1mz) c1n1).A01;
                Predicate predicate = ((C1mz) c1n1).A00;
                Iterator A0y = AnonymousClass001.A0y(map);
                boolean z = false;
                while (A0y.hasNext()) {
                    Map.Entry A0z = AnonymousClass001.A0z(A0y);
                    if (predicate.apply(A0z) && collection.contains(A0z.getKey())) {
                        A0y.remove();
                        z = true;
                    }
                }
                return z;
            }

            @Override // X.C1n8, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection collection) {
                C1n1 c1n1 = C1n1.this;
                java.util.Map map = ((C1mz) c1n1).A01;
                Predicate predicate = ((C1mz) c1n1).A00;
                Iterator A0y = AnonymousClass001.A0y(map);
                boolean z = false;
                while (A0y.hasNext()) {
                    Map.Entry A0z = AnonymousClass001.A0z(A0y);
                    if (predicate.apply(A0z) && !collection.contains(A0z.getKey())) {
                        A0y.remove();
                        z = true;
                    }
                }
                return z;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public Object[] toArray() {
                Iterator<E> it = iterator();
                ArrayList arrayList = new ArrayList();
                C1Jp.A02(arrayList, it);
                return arrayList.toArray();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public Object[] toArray(Object[] objArr) {
                Iterator<E> it = iterator();
                ArrayList A0s = AnonymousClass001.A0s();
                C1Jp.A02(A0s, it);
                return A0s.toArray(objArr);
            }
        };
    }

    @Override // X.C1n0
    public Set A03() {
        return new C1n9(this);
    }
}
