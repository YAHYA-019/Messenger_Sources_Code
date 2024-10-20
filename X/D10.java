package X;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: D10.class */
public final class D10 implements C29M, Serializable, Cloneable {
    public final Long time;
    public static final C29O A01 = AbF.A0u();
    public static final C29Q A00 = AbI.A0h("time", (byte) 10);

    public D10(Long l) {
        this.time = l;
    }

    @Override // X.C29M
    public String D4Y(int i, boolean z) {
        return CQq.A05(this, i, z);
    }

    @Override // X.C29M
    public void DAs(2An r302) {
        r302.A0O();
        if (this.time != null) {
            r302.A0V(A00);
            AbG.A1T(r302, this.time);
        }
        r302.A0N();
        r302.A0P();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof D10)) {
                return false;
            }
            Long l = this.time;
            boolean A1T = AnonymousClass001.A1T(l);
            Long l2 = ((D10) obj).time;
            if (!CQq.A0F(l, l2, A1T, AnonymousClass001.A1T(l2))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.time});
    }

    public String toString() {
        return CQq.A04(this);
    }
}
