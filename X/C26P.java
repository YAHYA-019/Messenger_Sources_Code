package X;

/* renamed from: X.26P, reason: invalid class name */
/* loaded from: 26P.class */
public final class C26P {
    public final long A00;

    public /* synthetic */ C26P(long j) {
        this.A00 = j;
    }

    public static final int A00(long j) {
        return C26Q.A00((int) j).A00(j);
    }

    public static final int A01(long j) {
        return C26Q.A00((int) (j >>> 32)).A01(j);
    }

    public static final int A02(long j) {
        return C26Q.A00((int) j).A02(j);
    }

    public static final int A03(long j) {
        return C26Q.A00((int) (j >>> 32)).A03(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r307v0 */
    public static String A04(long j) {
        23W A00 = C26Q.A00((int) (j >>> 32));
        int A01 = A00.A01(j);
        ?? r307 = "Infinity";
        int i = (-1) >>> 1;
        Integer valueOf = A01 == i ? r307 == true ? 1 : 0 : Integer.valueOf(A01);
        23W A002 = C26Q.A00((int) j);
        int A003 = A002.A00(j);
        Integer num = r307;
        if (A003 != i) {
            num = Integer.valueOf(A003);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConstraints[minWidth = ");
        sb.append(A00.A03(j));
        sb.append(", maxWidth = ");
        sb.append(valueOf);
        sb.append(", minHeight = ");
        sb.append(A002.A02(j));
        sb.append(", maxHeight = ");
        sb.append(num);
        sb.append(']');
        return sb.toString();
    }

    public static final boolean A05(long j) {
        boolean z = false;
        if (C26Q.A00((int) j).A00(j) != ((-1) >>> 1)) {
            z = true;
        }
        return z;
    }

    public static final boolean A06(long j) {
        boolean z = false;
        if (C26Q.A00((int) (j >>> 32)).A01(j) != ((-1) >>> 1)) {
            z = true;
        }
        return z;
    }

    public static final boolean A07(long j) {
        23W A00 = C26Q.A00((int) j);
        boolean z = false;
        if (A00.A00(j) == A00.A02(j)) {
            z = true;
        }
        return z;
    }

    public static final boolean A08(long j) {
        23W A00 = C26Q.A00((int) (j >>> 32));
        boolean z = false;
        if (A00.A01(j) == A00.A03(j)) {
            z = true;
        }
        return z;
    }

    public boolean equals(Object obj) {
        long j = this.A00;
        boolean z = false;
        if ((obj instanceof C26P) && j == ((C26P) obj).A00) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return 1BL.A01(this.A00);
    }

    public String toString() {
        return A04(this.A00);
    }
}
