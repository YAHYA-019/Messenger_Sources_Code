package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.1A3, reason: invalid class name */
/* loaded from: 1A3.class */
public abstract class C1A3 extends C0s8 {
    public static final int A1D(Iterable iterable, int i) {
        11T.A0F(iterable, 0);
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        }
        return i;
    }

    public static ArrayList A1E(Iterable iterable) {
        return new ArrayList(A1D(iterable, 10));
    }

    public static final ArrayList A1F(Iterable iterable) {
        11T.A0F(iterable, 0);
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            0QU.A0t((Iterable) it.next(), A0s);
        }
        return A0s;
    }
}
