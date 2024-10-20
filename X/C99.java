package X;

import java.util.Collections;
import java.util.Set;

/* loaded from: C99.class */
public final class C99 {
    public static volatile BOG A07;
    public final BOf A00;
    public final BOG A01;
    public final BOd A02;
    public final BOc A03;
    public final String A04;
    public final String A05;
    public final Set A06;

    public C99(C5k c5k) {
        BOf bOf = c5k.A00;
        C1pq.A08("buttonType", bOf);
        this.A00 = bOf;
        this.A01 = c5k.A01;
        this.A04 = c5k.A04;
        this.A05 = c5k.A05;
        this.A02 = c5k.A02;
        this.A03 = c5k.A03;
        this.A06 = Collections.unmodifiableSet(c5k.A06);
    }

    public BOG A00() {
        if (this.A06.contains("creationVersion")) {
            return this.A01;
        }
        if (A07 == null) {
            synchronized (this) {
                if (A07 == null) {
                    A07 = BOG.A03;
                }
            }
        }
        return A07;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C99)) {
                return false;
            }
            C99 c99 = (C99) obj;
            if (this.A00 != c99.A00 || A00() != c99.A00() || !11T.A0O(this.A04, c99.A04) || !11T.A0O(this.A05, c99.A05) || this.A02 != c99.A02 || this.A03 != c99.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = -1;
        int A03 = C3o5.A03(this.A00) + 31;
        int A04 = (((((((C1pq.A04(this.A05, (C1pq.A04(this.A04, ((((A03 * 31) + C3o5.A03(A00())) * 31) - 1) * 31) * 31) * 31) * 31) - 1) * 31) - 1) * 31) + C3o5.A03(this.A02)) * 31) + 1237;
        BOc bOc = this.A03;
        if (bOc != null) {
            i = bOc.ordinal();
        }
        return ((A04 * 31) + i) * 31;
    }
}
