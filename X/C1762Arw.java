package X;

/* renamed from: X.Arw, reason: case insensitive filesystem */
/* loaded from: Arw.class */
public final class C1762Arw extends C04v {
    public final int A00;
    public final long A01;
    public final long A02;
    public final boolean A03;

    public C1762Arw(int i, long j, long j2, boolean z) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = j2;
        this.A03 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1762Arw)) {
                return false;
            }
            C1762Arw c1762Arw = (C1762Arw) obj;
            if (this.A00 != c1762Arw.A00 || this.A01 != c1762Arw.A01 || this.A02 != c1762Arw.A02 || this.A03 != c1762Arw.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A02, AnonymousClass002.A02(this.A01, this.A00 * 31)) + AnonymousClass002.A00(this.A03 ? 1 : 0);
    }
}
