package X;

/* loaded from: L3j.class */
public final class L3j {
    public final long A00;

    public static String A00(long j) {
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append('(');
        JR0.A1G(A0k, Lis.A00(DKH.A00(j)));
        return AnonymousClass002.A0K(Lis.A00(JR1.A02(j)), A0k);
    }

    public boolean equals(Object obj) {
        long j = this.A00;
        boolean z = false;
        if ((obj instanceof L3j) && j == ((L3j) obj).A00) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return 1BL.A01(this.A00);
    }

    public String toString() {
        return A00(this.A00);
    }
}
