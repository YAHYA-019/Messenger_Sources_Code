package X;

import java.util.Collections;
import java.util.Set;

/* loaded from: Ktg.class */
public final class Ktg {
    public static volatile String A06;
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final Set A05;

    public Ktg(KlY klY) {
        this.A00 = klY.A00;
        this.A03 = klY.A01;
        String str = klY.A02;
        C1pq.A08("bannerIdentifier", str);
        this.A04 = str;
        String str2 = klY.A03;
        C1pq.A08("bannerMessage", str2);
        this.A01 = str2;
        String str3 = klY.A04;
        C1pq.A08("bannerTitle", str3);
        this.A02 = str3;
        this.A05 = Collections.unmodifiableSet(klY.A05);
    }

    public String A00() {
        if (this.A05.contains("actionLink")) {
            return this.A03;
        }
        if (A06 == null) {
            synchronized (this) {
                if (A06 == null) {
                    A06 = C1ic.A0g;
                }
            }
        }
        return A06;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ktg)) {
                return false;
            }
            Ktg ktg = (Ktg) obj;
            if (!11T.A0O(this.A00, ktg.A00) || !11T.A0O(A00(), ktg.A00()) || !11T.A0O(this.A04, ktg.A04) || !11T.A0O(this.A01, ktg.A01) || !11T.A0O(this.A02, ktg.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A04(this.A04, C1pq.A04(A00(), C1pq.A03(this.A00)))));
    }
}
