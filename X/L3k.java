package X;

/* loaded from: L3k.class */
public final class L3k {
    public final long A00;

    public /* synthetic */ L3k(long j) {
        this.A00 = j;
    }

    public static L3k A00(int i) {
        long j = i << 32;
        long j2 = LDp.A01;
        return new L3k(j);
    }

    public boolean equals(Object obj) {
        long j = this.A00;
        boolean z = false;
        if (obj instanceof L3k) {
            long j2 = ((L3k) obj).A00;
            long j3 = LDp.A01;
            if (j == j2) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        long j = this.A00;
        long j2 = LDp.A01;
        return 1BL.A01(j);
    }

    public String toString() {
        long j = this.A00;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MdsColor(value=");
        return AnonymousClass002.A0K(LDp.A07(j), A0k);
    }
}
