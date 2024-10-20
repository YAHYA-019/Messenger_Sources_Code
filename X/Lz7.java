package X;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: Lz7.class */
public abstract class Lz7 extends C00v implements MRH {
    @Override // X.C00w, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return 4YV.A1W(indexOf(obj), -1);
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
        return new Lz6(this, i, i2);
    }
}
