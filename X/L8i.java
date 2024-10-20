package X;

/* loaded from: L8i.class */
public final class L8i {
    public double A00;
    public double A01;
    public double A02;
    public double A03;
    public double A04;
    public double A05;
    public double A06;
    public double A07;
    public boolean A08;
    public final Kgd A09 = A00(this);

    public L8i() {
    }

    public L8i(float f) {
        this.A02 = f;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.Kgd] */
    public static Kgd A00(L8i l8i) {
        l8i.A05 = Math.sqrt(1500.0d);
        l8i.A01 = 0.5d;
        l8i.A08 = false;
        l8i.A02 = Double.MAX_VALUE;
        return new Object();
    }

    public Kgd A01(double d, double d2, long j) {
        double d3;
        double d4;
        double d5;
        double d6;
        if (!this.A08) {
            if (this.A02 == Double.MAX_VALUE) {
                throw AnonymousClass001.A0N("Error: Final position of the spring must be set before the animation starts");
            }
            double d7 = this.A01;
            if (d7 > 1.0d) {
                double d8 = -d7;
                double d9 = this.A05;
                double d10 = d8 * d9;
                double sqrt = d9 * Math.sqrt((d7 * d7) - 1.0d);
                this.A04 = d10 + sqrt;
                this.A03 = d10 - sqrt;
            } else if (d7 >= 0.0d && d7 < 1.0d) {
                this.A00 = this.A05 * Math.sqrt(1.0d - (d7 * d7));
            }
            this.A08 = true;
        }
        double d11 = j / 1000.0d;
        double d12 = this.A02;
        double d13 = d - d12;
        double d14 = this.A01;
        if (d14 > 1.0d) {
            double d15 = this.A03;
            double d16 = (d15 * d13) - d2;
            double d17 = this.A04;
            double d18 = d16 / (d15 - d17);
            double d19 = d13 - d18;
            double pow = Math.pow(2.718281828459045d, d15 * d11);
            double d20 = pow * d19;
            double pow2 = Math.pow(2.718281828459045d, d17 * d11);
            d3 = d20 + (pow2 * d18);
            d6 = d19 * d15 * pow;
            d5 = d18 * d17 * pow2;
        } else {
            if (d14 != 1.0d) {
                double d21 = this.A00;
                double d22 = 1.0d / d21;
                double d23 = this.A05;
                double d24 = d22 * ((d14 * d23 * d13) + d2);
                double pow3 = Math.pow(2.718281828459045d, (-d14) * d23 * d11);
                double d25 = d21 * d11;
                double cos = Math.cos(d25);
                double d26 = cos * d13;
                double sin = Math.sin(d25);
                d3 = pow3 * (d26 + (sin * d24));
                d4 = ((-d23) * d3 * d14) + (pow3 * (((-d21) * d13 * sin) + (d24 * d21 * cos)));
                Kgd kgd = this.A09;
                kgd.A00 = (float) (d3 + d12);
                kgd.A01 = (float) d4;
                return kgd;
            }
            double d27 = this.A05;
            double d28 = d2 + (d27 * d13);
            double d29 = d13 + (d28 * d11);
            double d30 = -d27;
            double pow4 = Math.pow(2.718281828459045d, d30 * d11);
            d3 = pow4 * d29;
            d5 = d3 * d30;
            d6 = d28 * pow4;
        }
        d4 = d6 + d5;
        Kgd kgd2 = this.A09;
        kgd2.A00 = (float) (d3 + d12);
        kgd2.A01 = (float) d4;
        return kgd2;
    }

    public void A02(float f) {
        if (f < 0.0f) {
            throw AnonymousClass001.A0L("Damping ratio must be non-negative");
        }
        this.A01 = f;
        this.A08 = false;
    }

    public void A03(float f) {
        if (f <= 0.0f) {
            throw AnonymousClass001.A0L("Spring stiffness constant must be positive.");
        }
        this.A05 = Math.sqrt(f);
        this.A08 = false;
    }
}
