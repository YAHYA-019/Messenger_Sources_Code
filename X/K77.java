package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: K77.class */
public final class K77 extends K78 {
    public final transient int A00;
    public final transient LtI A01;
    public final transient Object[] A02;

    public K77(LtI ltI, Object[] objArr, int i) {
        this.A01 = ltI;
        this.A02 = objArr;
        this.A00 = i;
    }

    @Override // X.Ly5
    public final boolean A09() {
        throw 0Q8.createAndThrow();
    }

    @Override // X.Ly5
    public final int A0A(Object[] objArr, int i) {
        return A0B().A0A(objArr, 0);
    }

    @Override // X.K78
    public final K75 A0C() {
        return new K71(this);
    }

    @Override // X.Ly5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        boolean z = false;
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                z = JQy.A1Z(value, this.A01.get(key));
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return A0B().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00;
    }
}
