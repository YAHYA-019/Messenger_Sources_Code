package X;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: D15.class */
public final class D15 implements C29M, Serializable, Cloneable {
    public final D14 address;
    public final String device_type;
    public static final C29O A02 = AbF.A0u();
    public static final C29Q A00 = AbI.A0i("address", (byte) 12);
    public static final C29Q A01 = AbI.A0j("device_type", (byte) 11);

    public D15(D14 d14, String str) {
        this.address = d14;
        this.device_type = str;
    }

    @Override // X.C29M
    public String D4Y(int i, boolean z) {
        return CQq.A05(this, i, z);
    }

    @Override // X.C29M
    public void DAs(2An r302) {
        r302.A0O();
        if (this.address != null) {
            r302.A0V(A00);
            this.address.DAs(r302);
        }
        if (this.device_type != null) {
            r302.A0V(A01);
            r302.A0Z(this.device_type);
        }
        r302.A0N();
        r302.A0P();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof D15)) {
                return false;
            }
            D15 d15 = (D15) obj;
            D14 d14 = this.address;
            boolean A1T = AnonymousClass001.A1T(d14);
            D14 d142 = d15.address;
            if (!CQq.A09(d14, d142, A1T, AnonymousClass001.A1T(d142))) {
                return false;
            }
            String str = this.device_type;
            boolean A1T2 = AnonymousClass001.A1T(str);
            String str2 = d15.device_type;
            if (!CQq.A0H(str, str2, A1T2, AnonymousClass001.A1T(str2))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.address, this.device_type});
    }

    public String toString() {
        return CQq.A04(this);
    }
}
