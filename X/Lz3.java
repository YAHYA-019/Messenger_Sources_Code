package X;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: Lz3.class */
public final class Lz3 extends C00w implements Collection, AnonymousClass116 {
    public final Lz8 A00;

    public Lz3(Lz8 lz8) {
        this.A00 = lz8;
    }

    @Override // X.C00w
    public int A08() {
        return this.A00.size();
    }

    @Override // X.C00w, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.A00.containsValue(obj);
    }

    @Override // X.C00w, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        LES les = this.A00.A00;
        Lsl[] lslArr = new Lsl[8];
        int i = 0;
        do {
            lslArr[i] = new Lsl();
            i++;
        } while (i < 8);
        return new Lsr(les, lslArr);
    }
}
