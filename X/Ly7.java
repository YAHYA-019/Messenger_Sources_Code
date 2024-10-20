package X;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: Ly7.class */
public final class Ly7 extends AbstractList implements MRI, RandomAccess {
    public final MRI A00;

    public Ly7(MRI mri) {
        this.A00 = mri;
    }

    @Override // X.MRI
    public final MRI DCc() {
        return this;
    }

    @Override // X.MRI
    public final List DCs() {
        return this.A00.DCs();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.A00.A02(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new LsS(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new Lt1(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00.size();
    }
}
