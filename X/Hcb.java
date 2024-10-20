package X;

import java.util.List;

/* loaded from: Hcb.class */
public final class Hcb {
    public double A00;
    public List A01;

    public static final double A00(double d, double d2, double d3) {
        double d4 = 2.6d * d3;
        return (Math.min(Math.max(d, d2 - d4), d4 + d2) - d2) / d3;
    }
}
