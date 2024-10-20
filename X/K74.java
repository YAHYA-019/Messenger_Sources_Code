package X;

/* loaded from: K74.class */
public final class K74 extends K75 {
    public static final K75 A02 = new K74(new Object[0], 0);
    public final transient Object[] A00;
    public final transient int A01;

    public K74(Object[] objArr, int i) {
        this.A00 = objArr;
        this.A01 = i;
    }

    @Override // X.Ly5
    public final int A06() {
        return this.A01;
    }

    @Override // X.Ly5
    public final int A07() {
        return 0;
    }

    @Override // X.Ly5
    public final Object[] A08() {
        return this.A00;
    }

    @Override // X.Ly5
    public final boolean A09() {
        return false;
    }

    @Override // X.K75, X.Ly5
    public final int A0A(Object[] objArr, int i) {
        Object[] objArr2 = this.A00;
        int i2 = this.A01;
        System.arraycopy(objArr2, 0, objArr, 0, i2);
        return i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        LBh.A01(i, this.A01);
        Object obj = this.A00[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A01;
    }
}
