package X;

import com.facebook.acra.constants.ActionId;

/* loaded from: F9j.class */
public final class F9j {
    public final MfW A00;
    public final ESA A01;

    public F9j() {
        this(null, null);
    }

    public F9j(MfW mfW, ESA esa) {
        this.A01 = esa;
        this.A00 = mfW;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof F9j)) {
                return false;
            }
            F9j f9j = (F9j) obj;
            if (!11T.A0O(this.A01, f9j.A01) || this.A00 != f9j.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass001.A02(this.A01) * 31) + AnonymousClass001.A02(this.A00)) * 31 * 31;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CdsButtonOverrides(borderColor=");
        A0k.append(this.A01);
        A0k.append(", textColor=");
        A0k.append(this.A00);
        DKG.A1X(A0k, ", backgroundColor=");
        A0k.append(7zK.A00(ActionId.COMPONENTS_DATA_SOURCE_DID_END_UPDATES));
        return DKH.A0o("null", A0k);
    }
}
