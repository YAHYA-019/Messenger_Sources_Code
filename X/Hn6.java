package X;

/* loaded from: Hn6.class */
public final class Hn6 {
    public final long A00;
    public final long A01;

    public Hn6(long j, long j2) {
        if (j2 == 0) {
            this.A01 = 0L;
            this.A00 = 1L;
        } else {
            this.A01 = j;
            this.A00 = j2;
        }
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(this.A01);
        A0k.append("/");
        return AnonymousClass001.A0h(A0k, this.A00);
    }
}
