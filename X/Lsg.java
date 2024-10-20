package X;

import java.util.Iterator;

/* loaded from: Lsg.class */
public final class Lsg implements Iterator {
    public int A00;
    public final int A01;
    public final /* synthetic */ Lj3 A02;

    public Lsg() {
    }

    public Lsg(Lj3 lj3) {
        this.A02 = lj3;
        this.A00 = 0;
        this.A01 = lj3.A01();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return AnonymousClass001.A1R(this.A00, this.A01);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        int i = this.A00;
        if (i >= this.A01) {
            throw AnonymousClass001.A10();
        }
        this.A00 = i + 1;
        return Byte.valueOf(this.A02.zza[i]);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw AnonymousClass001.A0p();
    }
}
