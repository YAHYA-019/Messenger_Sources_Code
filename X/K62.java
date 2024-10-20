package X;

/* loaded from: K62.class */
public final class K62 extends K65 {
    public final transient int A00;
    public final transient int A01;
    public final /* synthetic */ K65 zzc;

    public K62(K65 k65, int i, int i2) {
        this.zzc = k65;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        L6F.A01(i, this.A01);
        return this.zzc.get(i + this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A01;
    }
}
