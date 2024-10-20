package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: Lsp.class */
public final class Lsp implements Iterator, AnonymousClass116 {
    public int A00;
    public final int A01;
    public final LjA A02;
    public final int A03;

    public Lsp(LjA ljA, int i, int i2) {
        this.A02 = ljA;
        this.A03 = i2;
        this.A00 = i;
        this.A01 = ljA.A03;
        if (ljA.A07) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return AnonymousClass001.A1R(this.A00, this.A03);
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        LjA ljA = this.A02;
        int i = ljA.A03;
        int i2 = this.A01;
        if (i != i2) {
            throw new ConcurrentModificationException();
        }
        int i3 = this.A00;
        this.A00 = ljA.A08[(i3 * 5) + 3] + i3;
        return new Lj9(ljA, i3, i2);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw AnonymousClass002.A0O();
    }
}
