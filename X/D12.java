package X;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: D12.class */
public final class D12 implements C29M, Serializable, Cloneable {
    public final D1A moderator;
    public final D13 participant;
    public static final C29O A02 = AbF.A0u();
    public static final C29Q A01 = AbI.A0h("participant", (byte) 12);
    public static final C29Q A00 = AbI.A0i("moderator", (byte) 12);

    public D12(D1A d1a, D13 d13) {
        this.participant = d13;
        this.moderator = d1a;
    }

    @Override // X.C29M
    public String D4Y(int i, boolean z) {
        return CQq.A05(this, i, z);
    }

    @Override // X.C29M
    public void DAs(2An r302) {
        r302.A0O();
        if (this.participant != null) {
            r302.A0V(A01);
            this.participant.DAs(r302);
        }
        if (this.moderator != null) {
            r302.A0V(A00);
            this.moderator.DAs(r302);
        }
        r302.A0N();
        r302.A0P();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof D12)) {
                return false;
            }
            D12 d12 = (D12) obj;
            D13 d13 = this.participant;
            boolean A1T = AnonymousClass001.A1T(d13);
            D13 d132 = d12.participant;
            if (!CQq.A09(d13, d132, A1T, AnonymousClass001.A1T(d132))) {
                return false;
            }
            D1A d1a = this.moderator;
            boolean A1T2 = AnonymousClass001.A1T(d1a);
            D1A d1a2 = d12.moderator;
            if (!CQq.A09(d1a, d1a2, A1T2, AnonymousClass001.A1T(d1a2))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.participant, this.moderator});
    }

    public String toString() {
        return CQq.A04(this);
    }
}
