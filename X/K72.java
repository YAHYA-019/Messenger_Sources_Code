package X;

/* loaded from: K72.class */
public final class K72 extends K75 {
    public final transient int A00;
    public final transient int A01;
    public final transient Object[] A02;

    public K72(Object[] objArr, int i, int i2) {
        this.A02 = objArr;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.Ly5
    public final boolean A09() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        LBh.A01(i, this.A01);
        Object obj = this.A02[i + i + this.A00];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A01;
    }
}
