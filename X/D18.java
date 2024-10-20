package X;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: D18.class */
public final class D18 implements C29M, Serializable, Cloneable {
    public final Integer length;
    public final String link;
    public final Integer start;
    public static final C29O A03 = AbF.A0u();
    public static final C29Q A02 = AbI.A0h("start", (byte) 8);
    public static final C29Q A00 = AbI.A0i("length", (byte) 8);
    public static final C29Q A01 = AbI.A0j("link", (byte) 11);

    public D18(Integer num, Integer num2, String str) {
        this.start = num;
        this.length = num2;
        this.link = str;
    }

    @Override // X.C29M
    public String D4Y(int i, boolean z) {
        return CQq.A05(this, i, z);
    }

    @Override // X.C29M
    public void DAs(2An r302) {
        r302.A0O();
        if (this.start != null) {
            r302.A0V(A02);
            AbH.A1T(r302, this.start);
        }
        if (this.length != null) {
            r302.A0V(A00);
            AbH.A1T(r302, this.length);
        }
        if (this.link != null) {
            r302.A0V(A01);
            r302.A0Z(this.link);
        }
        r302.A0N();
        r302.A0P();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof D18)) {
                return false;
            }
            D18 d18 = (D18) obj;
            Integer num = this.start;
            boolean A1T = AnonymousClass001.A1T(num);
            Integer num2 = d18.start;
            if (!CQq.A0E(num, num2, A1T, AnonymousClass001.A1T(num2))) {
                return false;
            }
            Integer num3 = this.length;
            boolean A1T2 = AnonymousClass001.A1T(num3);
            Integer num4 = d18.length;
            if (!CQq.A0E(num3, num4, A1T2, AnonymousClass001.A1T(num4))) {
                return false;
            }
            String str = this.link;
            boolean A1T3 = AnonymousClass001.A1T(str);
            String str2 = d18.link;
            if (!CQq.A0H(str, str2, A1T3, AnonymousClass001.A1T(str2))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.start, this.length, this.link});
    }

    public String toString() {
        return CQq.A04(this);
    }
}
