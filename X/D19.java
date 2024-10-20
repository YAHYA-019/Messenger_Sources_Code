package X;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: D19.class */
public final class D19 implements C29M, Serializable, Cloneable {
    public final QwH audience;
    public final String hostId;
    public final QwP target;
    public final String targetName;
    public static final C29O A04 = AbF.A0u();
    public static final C29Q A00 = AbI.A0h("audience", (byte) 8);
    public static final C29Q A02 = AbI.A0i("target", (byte) 8);
    public static final C29Q A03 = AbI.A0j("targetName", (byte) 11);
    public static final C29Q A01 = AbI.A0k("hostId", (byte) 11);

    public D19(QwH qwH, QwP qwP, String str, String str2) {
        this.audience = qwH;
        this.target = qwP;
        this.targetName = str;
        this.hostId = str2;
    }

    @Override // X.C29M
    public String D4Y(int i, boolean z) {
        return CQq.A05(this, i, z);
    }

    @Override // X.C29M
    public void DAs(2An r302) {
        r302.A0O();
        int i = 0;
        if (this.audience != null) {
            r302.A0V(A00);
            QwH qwH = this.audience;
            r302.A0T(qwH == null ? 0 : qwH.value);
        }
        if (this.target != null) {
            r302.A0V(A02);
            QwP qwP = this.target;
            if (qwP != null) {
                i = qwP.value;
            }
            r302.A0T(i);
        }
        if (this.targetName != null) {
            r302.A0V(A03);
            r302.A0Z(this.targetName);
        }
        if (this.hostId != null) {
            r302.A0V(A01);
            r302.A0Z(this.hostId);
        }
        r302.A0N();
        r302.A0P();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof D19)) {
                return false;
            }
            D19 d19 = (D19) obj;
            QwH qwH = this.audience;
            boolean A1T = AnonymousClass001.A1T(qwH);
            QwH qwH2 = d19.audience;
            if (!CQq.A0A(qwH, qwH2, A1T, AnonymousClass001.A1T(qwH2))) {
                return false;
            }
            QwP qwP = this.target;
            boolean A1T2 = AnonymousClass001.A1T(qwP);
            QwP qwP2 = d19.target;
            if (!CQq.A0A(qwP, qwP2, A1T2, AnonymousClass001.A1T(qwP2))) {
                return false;
            }
            String str = this.targetName;
            boolean A1T3 = AnonymousClass001.A1T(str);
            String str2 = d19.targetName;
            if (!CQq.A0H(str, str2, A1T3, AnonymousClass001.A1T(str2))) {
                return false;
            }
            String str3 = this.hostId;
            boolean A1T4 = AnonymousClass001.A1T(str3);
            String str4 = d19.hostId;
            if (!CQq.A0H(str3, str4, A1T4, AnonymousClass001.A1T(str4))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.audience, this.target, this.targetName, this.hostId});
    }

    public String toString() {
        return CQq.A04(this);
    }
}
