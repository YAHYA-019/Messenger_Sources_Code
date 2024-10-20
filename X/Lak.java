package X;

/* loaded from: Lak.class */
public final class Lak implements C6aj {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final 6aO A04;

    public Lak(6aX r302) {
        6aO r0 = r302.A00;
        this.A04 = r0;
        r0.A0P(12);
        this.A02 = r0.A09() & 255;
        this.A03 = r0.A09();
    }

    @Override // X.C6aj
    public int Ame() {
        return -1;
    }

    @Override // X.C6aj
    public int B8Y() {
        return this.A03;
    }

    @Override // X.C6aj
    public int Cb5() {
        int i = this.A02;
        if (i == 8) {
            return this.A04.A07();
        }
        if (i == 16) {
            return this.A04.A0A();
        }
        int i2 = this.A01;
        this.A01 = i2 + 1;
        if (i2 % 2 != 0) {
            return this.A00 & 15;
        }
        int A07 = this.A04.A07();
        this.A00 = A07;
        return (A07 & 240) >> 4;
    }
}
