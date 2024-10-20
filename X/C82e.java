package X;

/* renamed from: X.82e, reason: invalid class name */
/* loaded from: 82e.class */
public final class C82e extends C04v {
    public final int A00;
    public final int A01;
    public final String A02;

    public C82e(int i, String str) {
        this.A00 = 0;
        this.A01 = i;
        this.A02 = str;
    }

    public C82e(String str, int i, int i2) {
        this.A00 = i2;
        if (1 - i2 != 0) {
            11T.A0F(str, 1);
        }
        this.A02 = str;
        this.A01 = i;
    }

    public boolean equals(Object obj) {
        int i;
        switch (this.A00) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C82e)) {
                    return false;
                }
                C82e c82e = (C82e) obj;
                return c82e.A00 == 0 && this.A01 == c82e.A01 && 11T.A0O(this.A02, c82e.A02);
            case 1:
                if (this == obj) {
                    return true;
                }
                i = 1;
                break;
            default:
                if (this == obj) {
                    return true;
                }
                i = 2;
                break;
        }
        if (!(obj instanceof C82e)) {
            return false;
        }
        C82e c82e2 = (C82e) obj;
        return c82e2.A00 == i && 11T.A0O(this.A02, c82e2.A02) && this.A01 == c82e2.A01;
    }

    public int hashCode() {
        int i;
        int hashCode;
        if (this.A00 != 0) {
            i = this.A02.hashCode() * 31;
            hashCode = this.A01;
        } else {
            i = this.A01 * 31;
            String str = this.A02;
            hashCode = str == null ? 0 : str.hashCode();
        }
        return i + hashCode;
    }
}
