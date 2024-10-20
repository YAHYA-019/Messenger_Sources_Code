package X;

import java.util.Arrays;

/* loaded from: Ktb.class */
public final class Ktb {
    public final int A00;
    public final int A01;
    public final long A02;
    public final int A03;
    public final String A04;

    public Ktb(long j, int i, int i2) {
        this.A02 = j;
        this.A00 = i;
        this.A01 = i2;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(j);
        A0k.append(':');
        A0k.append(i);
        A0k.append(':');
        this.A04 = GOn.A1B(A0k, i2);
        this.A03 = Arrays.hashCode(1BK.A1a(Long.valueOf(j), Integer.valueOf(i), i2));
    }

    public boolean equals(Object obj) {
        if (obj instanceof Ktb) {
            return 11T.A0O(((Ktb) obj).A04, this.A04);
        }
        return false;
    }

    public int hashCode() {
        return this.A03;
    }

    public String toString() {
        return this.A04;
    }
}
