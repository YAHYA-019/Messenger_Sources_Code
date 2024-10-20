package X;

/* loaded from: K73.class */
public final class K73 extends K75 {
    public final transient int A00;
    public final transient int A01;
    public final /* synthetic */ K75 zzc;

    public K73(K75 k75, int i, int i2) {
        this.zzc = k75;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.Ly5
    public final int A06() {
        return this.zzc.A07() + this.A00 + this.A01;
    }

    @Override // X.Ly5
    public final int A07() {
        return this.zzc.A07() + this.A00;
    }

    @Override // X.Ly5
    public final Object[] A08() {
        return this.zzc.A08();
    }

    @Override // X.Ly5
    public final boolean A09() {
        return true;
    }

    @Override // X.K75
    /* renamed from: A0C */
    public final K75 subList(int i, int i2) {
        LBh.A03(i, i2, this.A01);
        int i3 = this.A00;
        return this.zzc.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        LBh.A01(i, this.A01);
        return this.zzc.get(i + this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A01;
    }
}
