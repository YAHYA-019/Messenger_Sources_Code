package X;

/* loaded from: Lwa.class */
public final class Lwa implements MQv {
    public int A00;
    public long A01;
    public L8p A02;
    public boolean A03;
    public final LwX A04;
    public final MRZ A05;

    public Lwa(MRZ mrz) {
        this.A05 = mrz;
        LwX ACc = mrz.ACc();
        this.A04 = ACc;
        L8p l8p = ACc.A01;
        this.A02 = l8p;
        this.A00 = l8p != null ? l8p.A01 : -1;
    }

    @Override // X.MQv
    public long Cat(LwX lwX, long j) {
        L8p l8p;
        L8p l8p2;
        long j2 = 0;
        if (j < 0) {
            throw JQy.A0h("byteCount < 0: ", j);
        }
        if (this.A03) {
            throw AnonymousClass001.A0N("closed");
        }
        L8p l8p3 = this.A02;
        if (l8p3 != null && (l8p3 != (l8p2 = this.A04.A01) || this.A00 != l8p2.A01)) {
            throw AnonymousClass001.A0N("Peek source is invalid because upstream source was used");
        }
        if (j != 0) {
            if (this.A05.Cgi(this.A01 + 1)) {
                if (this.A02 == null && (l8p = this.A04.A01) != null) {
                    this.A02 = l8p;
                    this.A00 = l8p.A01;
                }
                LwX lwX2 = this.A04;
                long j3 = lwX2.A00;
                long j4 = this.A01;
                long min = Math.min(j, j3 - j4);
                lwX2.A0H(lwX, j4, min);
                this.A01 += min;
                return min;
            }
            j2 = -1;
        }
        return j2;
    }

    @Override // X.MQv, X.MQy
    public L5K D4G() {
        return this.A05.D4G();
    }

    @Override // X.MQv, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, X.MQy
    public void close() {
        this.A03 = true;
    }
}
