package X;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: D11.class */
public final class D11 implements C29M, Serializable, Cloneable {
    public final List eligibleParticipants;
    public final D1B matchState;
    public static final C29O A02 = AbF.A0u();
    public static final C29Q A01 = AbI.A0h("matchState", (byte) 12);
    public static final C29Q A00 = AbI.A0i("eligibleParticipants", (byte) 15);

    public D11(D1B d1b, List list) {
        this.matchState = d1b;
        this.eligibleParticipants = list;
    }

    @Override // X.C29M
    public String D4Y(int i, boolean z) {
        return CQq.A05(this, i, z);
    }

    @Override // X.C29M
    public void DAs(2An r302) {
        r302.A0O();
        if (this.matchState != null) {
            r302.A0V(A01);
            this.matchState.DAs(r302);
        }
        if (this.eligibleParticipants != null) {
            r302.A0V(A00);
            AbN.A1O(r302, this.eligibleParticipants, (byte) 11);
            Iterator it = this.eligibleParticipants.iterator();
            while (it.hasNext()) {
                AbJ.A1T(r302, it);
            }
        }
        r302.A0N();
        r302.A0P();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof D11)) {
                return false;
            }
            D11 d11 = (D11) obj;
            D1B d1b = this.matchState;
            boolean A1T = AnonymousClass001.A1T(d1b);
            D1B d1b2 = d11.matchState;
            if (!CQq.A09(d1b, d1b2, A1T, AnonymousClass001.A1T(d1b2))) {
                return false;
            }
            List list = this.eligibleParticipants;
            boolean A1T2 = AnonymousClass001.A1T(list);
            List list2 = d11.eligibleParticipants;
            if (!CQq.A0I(list, list2, A1T2, AnonymousClass001.A1T(list2))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.matchState, this.eligibleParticipants});
    }

    public String toString() {
        return CQq.A04(this);
    }
}
