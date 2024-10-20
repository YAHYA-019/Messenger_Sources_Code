package X;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* loaded from: D13.class */
public final class D13 implements C29M, Serializable, Cloneable {
    public final Set action_capabilities;
    public final Set action_uuids_executed;
    public static final C29O A02 = AbF.A0u();
    public static final C29Q A00 = AbI.A0h("action_capabilities", (byte) 14);
    public static final C29Q A01 = AbI.A0i("action_uuids_executed", (byte) 14);

    public D13(Set set, Set set2) {
        this.action_capabilities = set;
        this.action_uuids_executed = set2;
    }

    @Override // X.C29M
    public String D4Y(int i, boolean z) {
        return CQq.A05(this, i, z);
    }

    @Override // X.C29M
    public void DAs(2An r302) {
        r302.A0O();
        if (this.action_capabilities != null) {
            r302.A0V(A00);
            r302.A0Y(new C3Pz((byte) 8, this.action_capabilities.size()));
            for (HCl hCl : this.action_capabilities) {
                r302.A0T(hCl == null ? 0 : hCl.value);
            }
        }
        if (this.action_uuids_executed != null) {
            r302.A0V(A01);
            r302.A0Y(new C3Pz((byte) 11, this.action_uuids_executed.size()));
            Iterator it = this.action_uuids_executed.iterator();
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
            if (!(obj instanceof D13)) {
                return false;
            }
            D13 d13 = (D13) obj;
            Set set = this.action_capabilities;
            boolean A1T = AnonymousClass001.A1T(set);
            Set set2 = d13.action_capabilities;
            if (!CQq.A0L(set, set2, A1T, AnonymousClass001.A1T(set2))) {
                return false;
            }
            Set set3 = this.action_uuids_executed;
            boolean A1T2 = AnonymousClass001.A1T(set3);
            Set set4 = d13.action_uuids_executed;
            if (!CQq.A0L(set3, set4, A1T2, AnonymousClass001.A1T(set4))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.action_capabilities, this.action_uuids_executed});
    }

    public String toString() {
        return CQq.A04(this);
    }
}
