package X;

/* loaded from: Kpz.class */
public final class Kpz {
    public final double A00;
    public final double A01;
    public final double A02;
    public final double A03;

    public Kpz(double d, double d2, double d3) {
        this.A03 = d;
        this.A00 = d2;
        this.A01 = d3;
        this.A02 = d > 0.0d ? d2 / d : -1.0d;
    }

    public String toString() {
        return 0Pz.A0u("{avg=", ", scale=", "%}", Math.round(this.A03), Math.round(this.A02 * 100.0d));
    }
}
