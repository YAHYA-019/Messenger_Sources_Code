package X;

/* loaded from: Etf.class */
public final class Etf {
    public final FyG A00;
    public final DLQ A01;
    public final GJj A02;

    public Etf(FyG fyG, DLQ dlq, GJj gJj) {
        this.A01 = dlq;
        this.A00 = fyG;
        this.A02 = gJj;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if ((obj instanceof Etf) && ((Etf) obj).A02 == this.A02) {
            z = true;
        }
        return z;
    }
}
