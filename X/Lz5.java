package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: Lz5.class */
public abstract class Lz5 extends C00v implements MRG {
    @Override // X.C00w, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return 4YV.A1W(indexOf(obj), -1);
    }

    @Override // X.C00w, java.util.Collection
    public boolean containsAll(Collection collection) {
        if (collection == null || !collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // X.C00v, X.C00w, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator();
    }

    @Override // X.C00v, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // X.C00v, java.util.List
    public /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return new Lz4(this, i, i2);
    }
}
