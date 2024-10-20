package X;

import java.util.List;

/* renamed from: X.82i, reason: invalid class name */
/* loaded from: 82i.class */
public final class C82i extends C04v {
    public final int A00 = 0;
    public final Object A01;
    public final String A02;
    public final boolean A03;

    public C82i(Number number, String str, boolean z) {
        11T.A0F(number, 3);
        this.A02 = str;
        this.A03 = z;
        this.A01 = number;
    }

    public C82i(String str, List list) {
        this(str, list, false);
    }

    public C82i(String str, List list, int i, boolean z) {
        this.A03 = z;
        this.A02 = str;
        this.A01 = list;
    }

    public C82i(String str, List list, boolean z) {
        11T.A0F(str, 2);
        this.A01 = list;
        this.A02 = str;
        this.A03 = z;
    }

    public boolean equals(Object obj) {
        C82i c82i;
        switch (this.A00) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C82i)) {
                    return false;
                }
                c82i = (C82i) obj;
                if (c82i.A00 != 0 || !11T.A0O(this.A02, c82i.A02) || this.A03 != c82i.A03) {
                    return false;
                }
                break;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C82i)) {
                    return false;
                }
                c82i = (C82i) obj;
                if (c82i.A00 != 1 || this.A03 != c82i.A03 || !11T.A0O(this.A02, c82i.A02)) {
                    return false;
                }
                break;
            default:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C82i)) {
                    return false;
                }
                C82i c82i2 = (C82i) obj;
                return c82i2.A00 == 2 && 11T.A0O(this.A01, c82i2.A01) && 11T.A0O(this.A02, c82i2.A02) && this.A03 == c82i2.A03;
        }
        return 11T.A0O(this.A01, c82i.A01);
    }

    public int hashCode() {
        int hashCode;
        int i;
        int i2;
        int hashCode2;
        switch (this.A00) {
            case 0:
                hashCode = this.A02.hashCode() * 31;
                i = 1237;
                if (this.A03) {
                    i = 1231;
                }
                i2 = (hashCode + i) * 31;
                hashCode2 = this.A01.hashCode();
                break;
            case 1:
                int i3 = 1237;
                if (this.A03) {
                    i3 = 1231;
                }
                hashCode = i3 * 31;
                i = 1BL.A05(this.A02);
                i2 = (hashCode + i) * 31;
                hashCode2 = this.A01.hashCode();
                break;
            default:
                i2 = ((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31;
                hashCode2 = 1237;
                if (this.A03) {
                    hashCode2 = 1231;
                    break;
                }
                break;
        }
        return i2 + hashCode2;
    }
}
