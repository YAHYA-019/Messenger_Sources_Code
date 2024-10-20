package X;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: DqB.class */
public final class DqB extends C04v {
    public long A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final Set A07;

    public /* synthetic */ DqB(String str, String str2, String str3, String str4, int i, int i2) {
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        11T.A0A(newSetFromMap);
        this.A01 = i;
        this.A02 = i2;
        this.A06 = str;
        this.A05 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A00 = -1;
        this.A07 = newSetFromMap;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DqB)) {
                return false;
            }
            DqB dqB = (DqB) obj;
            if (this.A01 != dqB.A01 || this.A02 != dqB.A02 || !11T.A0O(this.A06, dqB.A06) || !11T.A0O(this.A05, dqB.A05) || !11T.A0O(this.A03, dqB.A03) || !11T.A0O(this.A04, dqB.A04) || this.A00 != dqB.A00 || !11T.A0O(this.A07, dqB.A07)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A07, AnonymousClass002.A02(this.A00, ((((((((((this.A01 * 31) + this.A02) * 31) + 1BL.A05(this.A06)) * 31) + 1BL.A05(this.A05)) * 31) + 1BL.A05(this.A03)) * 31) + 7zN.A05(this.A04)) * 31));
    }
}
