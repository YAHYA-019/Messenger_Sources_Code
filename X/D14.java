package X;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: D14.class */
public final class D14 implements C29M, Serializable, Cloneable {
    public final String instance_id;
    public final Long user_id;
    public static final C29O A02 = AbF.A0u();
    public static final C29Q A01 = AbI.A0i("user_id", (byte) 10);
    public static final C29Q A00 = AbI.A0j("instance_id", (byte) 11);

    public D14(String str, Long l) {
        this.user_id = l;
        this.instance_id = str;
    }

    @Override // X.C29M
    public String D4Y(int i, boolean z) {
        return CQq.A05(this, i, z);
    }

    @Override // X.C29M
    public void DAs(2An r302) {
        r302.A0O();
        if (this.user_id != null) {
            r302.A0V(A01);
            AbG.A1T(r302, this.user_id);
        }
        if (this.instance_id != null) {
            r302.A0V(A00);
            r302.A0Z(this.instance_id);
        }
        r302.A0N();
        r302.A0P();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof D14)) {
                return false;
            }
            D14 d14 = (D14) obj;
            Long l = this.user_id;
            boolean A1T = AnonymousClass001.A1T(l);
            Long l2 = d14.user_id;
            if (!CQq.A0F(l, l2, A1T, AnonymousClass001.A1T(l2))) {
                return false;
            }
            String str = this.instance_id;
            boolean A1T2 = AnonymousClass001.A1T(str);
            String str2 = d14.instance_id;
            if (!CQq.A0H(str, str2, A1T2, AnonymousClass001.A1T(str2))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.user_id, this.instance_id});
    }

    public String toString() {
        return CQq.A04(this);
    }
}
