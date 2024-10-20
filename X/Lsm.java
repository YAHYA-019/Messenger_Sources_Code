package X;

import java.util.Iterator;

/* loaded from: Lsm.class */
public final class Lsm implements Iterator, AnonymousClass116 {
    public final C2861Jbe A00;

    public Lsm(LzC lzC) {
        Lsl[] lslArr = new Lsl[8];
        int i = 0;
        do {
            lslArr[i] = new C2866Jbj(this);
            i++;
        } while (i < 8);
        this.A00 = new C2861Jbe(lzC, lslArr);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.A00.hasNext();
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return this.A00.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.A00.remove();
    }
}
