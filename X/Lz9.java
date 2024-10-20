package X;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: Lz9.class */
public final class Lz9 extends C0fr implements Collection, C18t {
    public final LzC A00;

    public Lz9(LzC lzC) {
        this.A00 = lzC;
    }

    @Override // X.C0fr
    public int A00() {
        return this.A00.size();
    }

    @Override // X.C0fr, java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.A00.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        LzC lzC = this.A00;
        Lsl[] lslArr = new Lsl[8];
        int i = 0;
        do {
            lslArr[i] = new Lsl();
            i++;
        } while (i < 8);
        return new C2861Jbe(lzC, lslArr);
    }
}
