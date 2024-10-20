package X;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: D16.class */
public final class D16 implements C29M, Serializable, Cloneable {
    public final String threadId;
    public final C4Ri threadType;
    public static final C29O A02 = AbF.A0u();
    public static final C29Q A00 = AbI.A0h("threadId", (byte) 11);
    public static final C29Q A01 = AbI.A0i("threadType", (byte) 8);

    public D16(C4Ri c4Ri, String str) {
        this.threadId = str;
        this.threadType = c4Ri;
    }

    @Override // X.C29M
    public String D4Y(int i, boolean z) {
        return CQq.A05(this, i, z);
    }

    @Override // X.C29M
    public void DAs(2An r302) {
        r302.A0O();
        if (this.threadId != null) {
            r302.A0V(A00);
            r302.A0Z(this.threadId);
        }
        if (this.threadType != null) {
            r302.A0V(A01);
            C4Ri c4Ri = this.threadType;
            r302.A0T(c4Ri == null ? 0 : c4Ri.value);
        }
        r302.A0N();
        r302.A0P();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof D16)) {
                return false;
            }
            D16 d16 = (D16) obj;
            String str = this.threadId;
            boolean A1T = AnonymousClass001.A1T(str);
            String str2 = d16.threadId;
            if (!CQq.A0H(str, str2, A1T, AnonymousClass001.A1T(str2))) {
                return false;
            }
            C4Ri c4Ri = this.threadType;
            boolean A1T2 = AnonymousClass001.A1T(c4Ri);
            C4Ri c4Ri2 = d16.threadType;
            if (!CQq.A0A(c4Ri, c4Ri2, A1T2, AnonymousClass001.A1T(c4Ri2))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.threadId, this.threadType});
    }

    public String toString() {
        return CQq.A04(this);
    }
}
