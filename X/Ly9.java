package X;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: Ly9.class */
public final class Ly9 extends AbstractList implements MRJ, RandomAccess {
    public final MRJ A00;

    public Ly9(MRJ mrj) {
        this.A00 = mrj;
    }

    @Override // X.MRJ
    public final MRJ DCe() {
        return this;
    }

    @Override // X.MRJ
    public final Object DCl(int i) {
        return this.A00.DCl(i);
    }

    @Override // X.MRJ
    public final List DCx() {
        return this.A00.DCx();
    }

    @Override // X.MRJ
    public final void DD4(Lj6 lj6) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.A00.A04(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new LsU(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new Lt2(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00.size();
    }
}
