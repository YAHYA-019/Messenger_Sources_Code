package X;

/* loaded from: K64.class */
public final class K64 extends K65 {
    public static final K65 A02 = new K64(new Object[0], 0);
    public final transient int A00;
    public final transient Object[] A01;

    public K64(Object[] objArr, int i) {
        this.A01 = objArr;
        this.A00 = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        L6F.A01(i, this.A00);
        Object obj = this.A01[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00;
    }
}
