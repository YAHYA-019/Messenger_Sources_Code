package X;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: Ih0.class */
public final class Ih0 implements C29M, Serializable, Cloneable {
    public final String action_context;
    public final String action_issued_by;
    public final Long action_issued_time;
    public final HCl action_type;
    public final String action_uuid;
    public static final C29O A05 = new Object();
    public static final C29Q A04 = AbF.A0t("action_uuid", (byte) 11, 1);
    public static final C29Q A03 = AbF.A0t("action_type", (byte) 8, 2);
    public static final C29Q A01 = AbF.A0t("action_issued_by", (byte) 11, 3);
    public static final C29Q A00 = AbF.A0t("action_context", (byte) 11, 4);
    public static final C29Q A02 = AbF.A0t("action_issued_time", (byte) 10, 5);

    public Ih0(HCl hCl, Long l, String str, String str2, String str3) {
        this.action_uuid = str;
        this.action_type = hCl;
        this.action_issued_by = str2;
        this.action_context = str3;
        this.action_issued_time = l;
    }

    @Override // X.C29M
    public String D4Y(int i, boolean z) {
        return CQq.A05(this, i, z);
    }

    @Override // X.C29M
    public void DAs(2An r302) {
        r302.A0O();
        if (this.action_uuid != null) {
            r302.A0V(A04);
            r302.A0Z(this.action_uuid);
        }
        if (this.action_type != null) {
            r302.A0V(A03);
            HCl hCl = this.action_type;
            r302.A0T(hCl == null ? 0 : hCl.value);
        }
        if (this.action_issued_by != null) {
            r302.A0V(A01);
            r302.A0Z(this.action_issued_by);
        }
        if (this.action_context != null) {
            r302.A0V(A00);
            r302.A0Z(this.action_context);
        }
        if (this.action_issued_time != null) {
            r302.A0V(A02);
            r302.A0U(this.action_issued_time.longValue());
        }
        r302.A0N();
        r302.A0P();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof Ih0)) {
                return false;
            }
            Ih0 ih0 = (Ih0) obj;
            String str = this.action_uuid;
            boolean A1T = AnonymousClass001.A1T(str);
            String str2 = ih0.action_uuid;
            if (!CQq.A0H(str, str2, A1T, AnonymousClass001.A1T(str2))) {
                return false;
            }
            HCl hCl = this.action_type;
            boolean A1T2 = AnonymousClass001.A1T(hCl);
            HCl hCl2 = ih0.action_type;
            if (!CQq.A0A(hCl, hCl2, A1T2, AnonymousClass001.A1T(hCl2))) {
                return false;
            }
            String str3 = this.action_issued_by;
            boolean A1T3 = AnonymousClass001.A1T(str3);
            String str4 = ih0.action_issued_by;
            if (!CQq.A0H(str3, str4, A1T3, AnonymousClass001.A1T(str4))) {
                return false;
            }
            String str5 = this.action_context;
            boolean A1T4 = AnonymousClass001.A1T(str5);
            String str6 = ih0.action_context;
            if (!CQq.A0H(str5, str6, A1T4, AnonymousClass001.A1T(str6))) {
                return false;
            }
            Long l = this.action_issued_time;
            boolean A1T5 = AnonymousClass001.A1T(l);
            Long l2 = ih0.action_issued_time;
            if (!CQq.A0F(l, l2, A1T5, AnonymousClass001.A1T(l2))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.action_uuid, this.action_type, this.action_issued_by, this.action_context, this.action_issued_time});
    }

    public String toString() {
        return CQq.A04(this);
    }
}
