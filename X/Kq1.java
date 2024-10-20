package X;

/* loaded from: Kq1.class */
public final class Kq1 {
    public final double A00;
    public final int A01;
    public final long A02;
    public final Kpz A03;

    public Kq1(Kpz kpz, double d, int i, long j) {
        this.A02 = j;
        this.A01 = i;
        this.A00 = d;
        this.A03 = kpz;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("{");
        A0k.append(this.A00);
        A0k.append(", bwe delta=");
        A0k.append(Math.round(this.A02 - this.A03.A00));
        A0k.append(" (C");
        A0k.append(this.A01);
        return AnonymousClass001.A0d(")}", A0k);
    }
}
