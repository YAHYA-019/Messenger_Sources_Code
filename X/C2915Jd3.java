package X;

/* renamed from: X.Jd3, reason: case insensitive filesystem */
/* loaded from: Jd3.class */
public final class C2915Jd3 extends Krv {
    public float A00 = 1.0f;
    public Kdj A01;
    public final long A02;

    public C2915Jd3(long j) {
        this.A02 = j;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2915Jd3)) {
                return false;
            }
            long j = this.A02;
            long j2 = ((C2915Jd3) obj).A02;
            long j3 = LDp.A01;
            if (j != j2) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        long j = this.A02;
        long j2 = LDp.A01;
        return 1BL.A01(j);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ColorPainter(color=");
        return AnonymousClass002.A0K(LDp.A07(this.A02), A0k);
    }
}
