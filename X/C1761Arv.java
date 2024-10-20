package X;

/* renamed from: X.Arv, reason: case insensitive filesystem */
/* loaded from: Arv.class */
public final class C1761Arv extends C04v {
    public final int A00;
    public final long A01;
    public final long A02;
    public final boolean A03;

    public C1761Arv(int i, long j, long j2, boolean z) {
        this.A00 = i;
        this.A02 = j;
        this.A01 = j2;
        this.A03 = z;
    }

    public boolean equals(Object obj) {
        if (1 - this.A00 != 0) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1761Arv)) {
            return false;
        }
        C1761Arv c1761Arv = (C1761Arv) obj;
        return c1761Arv.A00 == 1 && this.A02 == c1761Arv.A02 && this.A01 == c1761Arv.A01 && this.A03 == c1761Arv.A03;
    }

    public int hashCode() {
        if (1 - this.A00 != 0) {
            return super.hashCode();
        }
        long j = this.A02;
        return AnonymousClass002.A02(this.A01, ((int) (j ^ (j >>> 32))) * 31) + AnonymousClass002.A00(this.A03 ? 1 : 0);
    }
}
