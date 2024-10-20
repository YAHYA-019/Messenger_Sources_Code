package X;

import java.util.Collections;
import java.util.Set;

/* renamed from: X.9hp, reason: invalid class name */
/* loaded from: 9hp.class */
public final class C9hp {
    public static volatile Integer A07;
    public final Ex0 A00;
    public final ER1 A01;
    public final String A02;
    public final boolean A03;
    public final Integer A04;
    public final Set A05;
    public final boolean A06;

    public C9hp(Ex0 ex0, ER1 er1, Integer num, String str, Set set, boolean z, boolean z2) {
        this.A00 = ex0;
        this.A02 = str;
        this.A06 = z;
        this.A03 = z2;
        this.A04 = num;
        this.A01 = er1;
        this.A05 = Collections.unmodifiableSet(set);
    }

    private Integer A00() {
        if (this.A05.contains("state")) {
            return this.A04;
        }
        if (A07 == null) {
            synchronized (this) {
                if (A07 == null) {
                    A07 = 0S2.A00;
                }
            }
        }
        return A07;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C9hp)) {
                return false;
            }
            C9hp c9hp = (C9hp) obj;
            if (!11T.A0O(this.A00, c9hp.A00) || !11T.A0O(this.A02, c9hp.A02) || this.A06 != c9hp.A06 || this.A03 != c9hp.A03 || A00() != c9hp.A00() || this.A01 != c9hp.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = -1;
        int A02 = (C1pq.A02(C1pq.A02(C1pq.A04(this.A02, C1pq.A03(this.A00)), this.A06), this.A03) * 31) + C3o5.A04(A00());
        ER1 er1 = this.A01;
        if (er1 != null) {
            i = er1.ordinal();
        }
        return (A02 * 31) + i;
    }
}
