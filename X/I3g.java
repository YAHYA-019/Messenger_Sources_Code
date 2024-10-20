package X;

/* loaded from: I3g.class */
public abstract class I3g {
    public double A00;
    public long A01;
    public final long A02;
    public final GGV A03;
    public final boolean A04;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.GGV] */
    public I3g() {
        this(new Object(), 0L, true, false);
    }

    public I3g(GGV ggv, long j, boolean z, boolean z2) {
        this.A00 = -1.0d;
        this.A03 = ggv;
        this.A04 = z;
        this.A02 = z2 ? j : Math.max(j, 300L);
    }

    public void A00(Object obj, double d) {
        JMX jmx = ((H3j) this).A00;
        if (jmx != null) {
            jmx.CEM(d);
        }
    }

    public final void A01(Object obj, double d) {
        synchronized (this) {
            if (d >= 0.0d && d <= 1.0d) {
                if (!this.A04 || d > this.A00) {
                    long ALY = this.A03.ALY();
                    double d2 = d - 1.0d;
                    if ((d2 >= 0.0d && d2 < 1.0E-5d) || ALY - this.A01 >= this.A02) {
                        this.A00 = d;
                        this.A01 = ALY;
                        A00(obj, d);
                    }
                }
            }
        }
    }
}
