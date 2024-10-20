package X;

/* renamed from: X.8je, reason: invalid class name */
/* loaded from: 8je.class */
public final class C8je extends C1rj {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;

    public C8je() {
        super("Bubble");
        this.A00 = 0;
        this.A01 = 0;
        this.A04 = 15;
    }

    public final Object[] A0k() {
        return 7zU.A1b(Integer.valueOf(this.A00), Integer.valueOf(this.A01), Integer.valueOf(this.A02), Integer.valueOf(this.A03), this.A04);
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        int i = this.A03;
        int i2 = this.A02;
        int i3 = this.A00;
        int i4 = this.A01;
        int i5 = this.A04;
        11T.A0F(r302, 0);
        8OI A00 = 8mA.A00(r302);
        8mA r0 = A00.A00;
        r0.A02 = i;
        r0.A01 = i4;
        r0.A00 = i3;
        A00.A2a(i5);
        A00.A2Y(i2);
        A00.A0J();
        8mA r02 = A00.A00;
        11T.A0A(r02);
        return r02;
    }
}
