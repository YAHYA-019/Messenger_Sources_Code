package X;

import java.util.Iterator;

/* loaded from: Liz.class */
public final class Liz implements Iterable {
    public final int A00;

    public Liz(int i) {
        this.A00 = i;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        switch (this.A00) {
            case 0:
                return KcJ.A01;
            case 1:
                return KcO.A01;
            default:
                return null;
        }
    }
}
