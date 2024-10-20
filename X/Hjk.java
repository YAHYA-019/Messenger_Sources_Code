package X;

/* loaded from: Hjk.class */
public final class Hjk {
    public int A00;
    public int A01;
    public HsS A02;
    public HsY A03;
    public boolean A04;
    public final int A05;
    public final int A06;
    public final HhA A07;
    public final JL0 A08;
    public final boolean A09;

    public Hjk(JL0 jl0, int i, int i2, boolean z) {
        this.A08 = jl0;
        this.A06 = i;
        this.A05 = i2;
        this.A09 = z;
        this.A03 = jl0.AIZ(i, i2, this.A04);
        I2I A00 = I2I.A00();
        I7A.A01(A00, new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f}, 2);
        this.A07 = I7A.A00(A00, new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    }
}
