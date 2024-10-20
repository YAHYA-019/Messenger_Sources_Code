package X;

import java.util.Iterator;

/* loaded from: Lsi.class */
public final class Lsi implements Iterator {
    public int A00;
    public final int A01;
    public final /* synthetic */ Lj6 A02;

    public Lsi() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Lsi(Lj6 lj6) {
        this();
        this.A02 = lj6;
        this.A00 = 0;
        this.A01 = lj6.A05();
    }

    private final byte A00() {
        int i = this.A00;
        if (i >= this.A01) {
            throw AnonymousClass001.A10();
        }
        this.A00 = i + 1;
        return this.A02.A03(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return AnonymousClass001.A1R(this.A00, this.A01);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return Byte.valueOf(A00());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw AnonymousClass001.A0p();
    }
}
