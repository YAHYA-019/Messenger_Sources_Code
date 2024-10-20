package X;

/* renamed from: X.179, reason: invalid class name */
/* loaded from: 179.class */
public final class AnonymousClass179 extends C0zv {
    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass179)) {
            return false;
        }
        char c = this.A00;
        char c2 = this.A01;
        if (11T.A00(c, c2) > 0) {
            C0zv c0zv = (C0zv) obj;
            if (11T.A00(c0zv.A00, c0zv.A01) > 0) {
                return true;
            }
        }
        C0zv c0zv2 = (C0zv) obj;
        return c == c0zv2.A00 && c2 == c0zv2.A01;
    }

    public int hashCode() {
        char c = this.A00;
        char c2 = this.A01;
        int i = -1;
        if (11T.A00(c, c2) <= 0) {
            i = (c * 31) + c2;
        }
        return i;
    }

    public String toString() {
        return 0Pz.A0L("..", this.A00, this.A01);
    }
}
