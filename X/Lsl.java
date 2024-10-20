package X;

import java.util.Iterator;

/* loaded from: Lsl.class */
public abstract class Lsl implements Iterator, AnonymousClass116 {
    public int A00;
    public int A01;
    public Object[] A02 = LES.A04.A02;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return AnonymousClass001.A1R(this.A01, this.A00);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw AnonymousClass002.A0O();
    }
}
