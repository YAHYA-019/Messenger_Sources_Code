package X;

/* loaded from: HqS.class */
public final class HqS {
    public final int A00;
    public final int A01;
    public volatile int A05;
    public volatile int A06;
    public volatile int A07;
    public volatile byte[] A08;
    public final Object A03 = AnonymousClass001.A0R();
    public final Object A04 = AnonymousClass001.A0R();
    public final Object A02 = AnonymousClass001.A0R();

    public HqS(int i, int i2, int i3) {
        this.A01 = i2;
        this.A00 = i3;
        this.A06 = i + 1;
        this.A08 = new byte[this.A06];
        StringBuilder A0k = AnonymousClass001.A0k();
        GOq.A1J(A0k, this);
        A0k.append("]init(");
        0fH.A0j("ExpandableRingBuffer", DKH.A0p(A0k, this.A06));
    }

    public final int A00() {
        return this.A07 >= this.A05 ? this.A07 - this.A05 : (this.A06 - this.A05) + this.A07;
    }
}
