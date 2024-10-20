package X;

/* loaded from: Kpd.class */
public final class Kpd {
    public long A00;
    public final long A01;
    public final long A02;

    public Kpd(long j, long j2, long j3) {
        this.A02 = j;
        this.A01 = j2;
        this.A00 = 0L;
        this.A00 = j3;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("HistoricalChange(uptimeMillis=");
        A0k.append(this.A02);
        A0k.append(", position=");
        return AnonymousClass002.A0K(LE0.A07(this.A01), A0k);
    }
}
