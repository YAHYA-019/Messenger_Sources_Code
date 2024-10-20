package X;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Set;

/* loaded from: Igz.class */
public final class Igz implements C29M, Serializable, Cloneable {
    public final Set action_capabilities_as_moderator;
    public final Set action_capabilities_as_participant;
    public final Set conference_capabilities_as_moderator;
    public final Boolean is_moderator;
    public static final C29O A04 = new Object();
    public static final C29Q A03 = AbF.A0t("is_moderator", (byte) 2, 1);
    public static final C29Q A00 = AbF.A0t("action_capabilities_as_moderator", (byte) 14, 2);
    public static final C29Q A01 = AbF.A0t("action_capabilities_as_participant", (byte) 14, 3);
    public static final C29Q A02 = AbF.A0t("conference_capabilities_as_moderator", (byte) 14, 4);

    public Igz(Boolean bool, Set set, Set set2, Set set3) {
        this.is_moderator = bool;
        this.action_capabilities_as_moderator = set;
        this.action_capabilities_as_participant = set2;
        this.conference_capabilities_as_moderator = set3;
    }

    @Override // X.C29M
    public String D4Y(int i, boolean z) {
        return CQq.A05(this, i, z);
    }

    @Override // X.C29M
    public void DAs(2An r302) {
        r302.A0O();
        if (this.is_moderator != null) {
            r302.A0V(A03);
            r302.A0b(this.is_moderator.booleanValue());
        }
        if (this.action_capabilities_as_moderator != null) {
            r302.A0V(A00);
            r302.A0Y(new C3Pz((byte) 8, this.action_capabilities_as_moderator.size()));
            for (HCl hCl : this.action_capabilities_as_moderator) {
                r302.A0T(hCl == null ? 0 : hCl.value);
            }
        }
        if (this.action_capabilities_as_participant != null) {
            r302.A0V(A01);
            r302.A0Y(new C3Pz((byte) 8, this.action_capabilities_as_participant.size()));
            for (HCl hCl2 : this.action_capabilities_as_participant) {
                r302.A0T(hCl2 == null ? 0 : hCl2.value);
            }
        }
        if (this.conference_capabilities_as_moderator != null) {
            r302.A0V(A02);
            r302.A0Y(new C3Pz((byte) 8, this.conference_capabilities_as_moderator.size()));
            for (HCj hCj : this.conference_capabilities_as_moderator) {
                r302.A0T(hCj == null ? 0 : hCj.value);
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
            if (!(obj instanceof Igz)) {
                return false;
            }
            Igz igz = (Igz) obj;
            Boolean bool = this.is_moderator;
            boolean A1T = AnonymousClass001.A1T(bool);
            Boolean bool2 = igz.is_moderator;
            if (!CQq.A0B(bool, bool2, A1T, AnonymousClass001.A1T(bool2))) {
                return false;
            }
            Set set = this.action_capabilities_as_moderator;
            boolean A1T2 = AnonymousClass001.A1T(set);
            Set set2 = igz.action_capabilities_as_moderator;
            if (!CQq.A0L(set, set2, A1T2, AnonymousClass001.A1T(set2))) {
                return false;
            }
            Set set3 = this.action_capabilities_as_participant;
            boolean A1T3 = AnonymousClass001.A1T(set3);
            Set set4 = igz.action_capabilities_as_participant;
            if (!CQq.A0L(set3, set4, A1T3, AnonymousClass001.A1T(set4))) {
                return false;
            }
            Set set5 = this.conference_capabilities_as_moderator;
            boolean A1T4 = AnonymousClass001.A1T(set5);
            Set set6 = igz.conference_capabilities_as_moderator;
            if (!CQq.A0L(set5, set6, A1T4, AnonymousClass001.A1T(set6))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.is_moderator, this.action_capabilities_as_moderator, this.action_capabilities_as_participant, this.conference_capabilities_as_moderator});
    }

    public String toString() {
        return CQq.A04(this);
    }
}
