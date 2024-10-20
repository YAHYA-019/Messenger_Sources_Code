package X;

/* loaded from: K6S.class */
public final class K6S extends Lip {
    public final long A00;

    public K6S(long j) {
        this.A00 = j;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Lip lip = (Lip) obj;
        int A02 = A02();
        int A022 = lip.A02();
        if (A02 != A022) {
            return A02 - A022;
        }
        K6S k6s = (K6S) lip;
        long abs = Math.abs(this.A00);
        long abs2 = Math.abs(k6s.A00);
        if (abs < abs2) {
            return -1;
        }
        return AnonymousClass001.A1P((abs > abs2 ? 1 : (abs == abs2 ? 0 : -1))) ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj != null && getClass() == obj.getClass() && this.A00 == ((K6S) obj).A00);
    }

    public final int hashCode() {
        return AbM.A05(Integer.valueOf(A02()), Long.valueOf(this.A00));
    }

    public final String toString() {
        return Long.toString(this.A00);
    }
}
