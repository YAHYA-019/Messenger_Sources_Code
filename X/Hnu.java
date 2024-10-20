package X;

/* loaded from: Hnu.class */
public final class Hnu {
    public final long A00;
    public final long A01;

    public Hnu(long j, long j2) {
        if (j2 == 0) {
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
