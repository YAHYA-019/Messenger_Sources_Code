package X;

/* renamed from: X.16y, reason: invalid class name */
/* loaded from: 16y.class */
public final class C16y extends C0zx {
    public boolean equals(Object obj) {
        if (!(obj instanceof C16y)) {
            return false;
        }
        long j = this.A00;
        long j2 = this.A01;
        if (j > j2) {
            C0zx c0zx = (C0zx) obj;
            if (c0zx.A00 > c0zx.A01) {
                return true;
            }
        }
        C0zx c0zx2 = (C0zx) obj;
        return j == c0zx2.A00 && j2 == c0zx2.A01;
    }

    public int hashCode() {
        long j = this.A00;
        long j2 = this.A01;
        if (j > j2) {
            return -1;
        }
        return (int) ((31 * (j ^ (j >>> 32))) + (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(this.A00);
        A0k.append("..");
        return AnonymousClass001.A0h(A0k, this.A01);
    }
}
