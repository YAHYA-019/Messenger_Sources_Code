package X;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: Igy.class */
public final class Igy implements C29M, Serializable, Cloneable {
    public final Integer number;
    public static final C29O A01 = new Object();
    public static final C29Q A00 = AbF.A0t("number", (byte) 8, 1);

    public Igy(Integer num) {
        this.number = num;
    }

    @Override // X.C29M
    public String D4Y(int i, boolean z) {
        return CQq.A05(this, i, z);
    }

    @Override // X.C29M
    public void DAs(2An r302) {
        r302.A0O();
        if (this.number != null) {
            r302.A0V(A00);
            r302.A0T(this.number.intValue());
        }
        r302.A0N();
        r302.A0P();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof Igy)) {
                return false;
            }
            Integer num = this.number;
            boolean A1T = AnonymousClass001.A1T(num);
            Integer num2 = ((Igy) obj).number;
            if (!CQq.A0E(num, num2, A1T, AnonymousClass001.A1T(num2))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.number});
    }

    public String toString() {
        return CQq.A04(this);
    }
}
