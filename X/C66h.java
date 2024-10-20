package X;

/* renamed from: X.66h, reason: invalid class name */
/* loaded from: 66h.class */
public final class C66h {
    public double A00;
    public double A01;

    public C66h(double d, double d2) {
        this.A01 = d;
        this.A00 = d2;
    }

    public static C66h A00() {
        return A03(140.0d, 10.0d);
    }

    public static C66h A01() {
        return A03(40.0d, 7.0d);
    }

    public static C66h A02(double d, double d2) {
        6FR r0 = new 6FR(d, d2);
        return A03(r0.A01, r0.A00);
    }

    public static C66h A03(double d, double d2) {
        return new C66h(((d - 30.0d) * 3.62d) + 194.0d, ((d2 - 8.0d) * 3.0d) + 25.0d);
    }
}
