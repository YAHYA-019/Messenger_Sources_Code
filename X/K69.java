package X;

import java.util.Iterator;

/* loaded from: K69.class */
public final class K69 extends K60 {
    public static final K69 A05;
    public static final Object[] A06;
    public final transient int A00;
    public final transient Object[] A01;
    public final transient Object[] A02;
    public final transient int A03;
    public final transient int A04;

    static {
        Object[] objArr = new Object[0];
        A06 = objArr;
        A05 = new K69(objArr, objArr, 0, 0, 0);
    }

    public K69(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        this.A01 = objArr;
        this.A03 = i;
        this.A02 = objArr2;
        this.A04 = i2;
        this.A00 = i3;
    }

    @Override // X.Ly4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        boolean z = false;
        if (obj != null) {
            Object[] objArr = this.A02;
            if (objArr.length != 0) {
                int A062 = JQz.A06(obj.hashCode());
                while (true) {
                    int i = A062 & this.A04;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        break;
                    }
                    if (obj2.equals(obj)) {
                        z = true;
                        break;
                    }
                    A062 = i + 1;
                }
            }
        }
        return z;
    }

    @Override // X.K60, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.A03;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return A08().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00;
    }
}
