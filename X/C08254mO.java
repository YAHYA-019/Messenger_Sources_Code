package X;

/* renamed from: X.4mO, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4mO.class */
public final class C08254mO implements 43Q {
    public double A00;
    public int A01;
    public final double A02;
    public final int A03;

    public C08254mO(double d) {
        this.A02 = d;
        this.A03 = d == 0.0d ? (-1) >>> 1 : (int) Math.ceil(1.0d / d);
        this.A00 = -1.0d;
    }

    public void A6M(double d) {
        double log;
        double log2;
        double d2 = this.A02;
        double d3 = 1.0d - d2;
        int i = this.A01;
        if (i <= this.A03) {
            if (i > 0) {
                double d4 = i;
                double d5 = (d3 * d4) / (d4 + 1.0d);
                log = d5 * Math.log(this.A00);
                log2 = (1.0d - d5) * Math.log(d);
            }
            this.A00 = d;
            this.A01 = i + 1;
        }
        log = d3 * Math.log(this.A00);
        log2 = d2 * Math.log(d);
        d = Math.exp(log + log2);
        this.A00 = d;
        this.A01 = i + 1;
    }

    public double AYQ() {
        return this.A00;
    }

    public void reset() {
        this.A00 = -1.0d;
        this.A01 = 0;
    }
}
