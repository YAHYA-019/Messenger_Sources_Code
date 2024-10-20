package X;

/* renamed from: X.3Yw, reason: invalid class name */
/* loaded from: 3Yw.class */
public final class C3Yw implements C3m5 {
    public int A00;
    public int A01;
    public int[] A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;

    public C3Yw(int i, int i2, int i3, int i4) {
        this.A06 = i;
        this.A03 = i2;
        this.A04 = i3;
        this.A05 = i4;
        this.A02 = new int[i4];
    }

    @Override // X.C3m5
    public void A4z(C2hn c2hn, int i, int i2) {
        int[] iArr = this.A02;
        int i3 = this.A00;
        int i4 = iArr[i3];
        if (this.A04 == 1) {
            i = i2;
        }
        int i5 = i4 + i;
        iArr[i3] = i5;
        this.A01 = Math.max(this.A01, i5);
        int i6 = i3 + 1;
        this.A00 = i6;
        if (i6 == this.A05) {
            this.A00 = 0;
        }
    }

    @Override // X.C3m5
    public int AmU() {
        return this.A01;
    }

    @Override // X.C3m5
    public boolean DAB() {
        boolean z = true;
        if (this.A01 >= (this.A04 == 1 ? this.A03 : this.A06)) {
            z = false;
        }
        return z;
    }
}
