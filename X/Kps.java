package X;

/* loaded from: Kps.class */
public abstract class Kps {
    public final long A00;
    public final long A01;
    public final KuW A02;

    public Kps(KuW kuW, long j, long j2) {
        this.A02 = kuW;
        this.A01 = j;
        this.A00 = j2;
    }

    public KuW A00(6Cu r302) {
        if (!(this instanceof K1J)) {
            return this.A02;
        }
        K1J k1j = (K1J) this;
        Kq7 kq7 = k1j.A01;
        if (kq7 == null) {
            return k1j.A02;
        }
        6Yl r0 = r302.A03;
        return new KuW(kq7.A00(r0.A0T, r0.A05, 0L, 0L), 0L, -1);
    }
}
