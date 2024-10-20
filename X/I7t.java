package X;

/* loaded from: I7t.class */
public final class I7t {
    public final double A00;
    public final double A01;
    public final double A02;
    public final double A03;
    public final double A04;
    public final double A05;
    public final double A06;
    public final double A07;
    public final double A08;
    public final double A09;
    public final double A0A;
    public final double A0B;
    public final double A0C;
    public final double A0D;
    public final double A0E;
    public final double A0F;

    public I7t(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.A01 = d;
        this.A09 = d2;
        this.A03 = d3;
        this.A0B = d4;
        this.A06 = d5;
        this.A0E = d6;
        this.A05 = d7;
        this.A0D = d8;
        this.A07 = d9;
        this.A0F = d10;
        this.A04 = d11;
        this.A0C = d12;
        this.A02 = d13;
        this.A0A = d14;
        this.A00 = d15;
        this.A08 = d16;
    }

    public static double A00(Hjj hjj, I7t i7t, double d, int i) {
        return 1.0d / (Math.exp((-1.0d) * (d + (hjj.A00 * Hcb.A00(i, i7t.A00, i7t.A08)))) + 1.0d);
    }

    public static double A01(Hjj hjj, I7t i7t, int i, int i2, int i3) {
        return hjj.A08 + (hjj.A01 * Hcb.A00(i, i7t.A01, i7t.A09)) + (hjj.A03 * Hcb.A00(i2, i7t.A03, i7t.A0B)) + (hjj.A06 * Hcb.A00(i3, i7t.A06, i7t.A0E));
    }
}
