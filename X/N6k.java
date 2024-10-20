package X;

/* loaded from: N6k.class */
public final class N6k implements C2kf {
    public final int A00;
    public final int A01;
    public final int A02;
    public final 2kZ A03;
    public final MhY A04;
    public final boolean A05;
    public final boolean A06;

    public N6k(2kZ r302, MhY mhY, int i, int i2, int i3, boolean z, boolean z2) {
        this.A01 = i;
        this.A02 = i2;
        this.A05 = z;
        this.A06 = z2;
        this.A00 = i3;
        this.A03 = r302;
        this.A04 = mhY;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.N6j, X.2kX, java.lang.Object] */
    @Override // X.C2kf
    public /* bridge */ /* synthetic */ 2kX A3t() {
        ?? obj = new Object();
        obj.A01 = 2;
        obj.A02 = 1;
        obj.A05 = false;
        obj.A06 = false;
        obj.A00 = 0;
        obj.A03 = N6j.A07;
        obj.A04 = N6j.A08;
        obj.A01 = this.A01;
        obj.A02 = this.A02;
        obj.A05 = this.A05;
        obj.A06 = this.A06;
        obj.A00 = this.A00;
        obj.A03 = this.A03;
        obj.A04 = this.A04;
        return obj;
    }

    @Override // X.C2kf
    public C2X7 AtV(1Iw r302) {
        return new 5xR(this.A01, this.A02, this.A00, this.A05);
    }

    @Override // X.C2kf
    public int B0Y() {
        return this.A02;
    }

    @Override // X.C2kf
    public 2kZ B6R() {
        return this.A03;
    }

    @Override // X.C2kf
    public 3wX BBJ() {
        return null;
    }

    @Override // X.C2kf
    public int BBK() {
        return (-1) << (-1);
    }
}
