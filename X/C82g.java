package X;

/* renamed from: X.82g, reason: invalid class name */
/* loaded from: 82g.class */
public final class C82g extends C04v {
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C82g(int i) {
        this(0, 0, null, 0);
        this.A00 = i;
        this.A00 = 0;
    }

    public C82g(int i, int i2, String str, int i3) {
        this.A00 = i3;
        if (i3 != 0) {
            11T.A0F(str, 3);
        }
        this.A02 = i;
        this.A01 = i2;
        this.A03 = str;
    }

    public boolean equals(Object obj) {
        int i;
        switch (this.A00) {
            case 0:
                if (this == obj) {
                    return true;
                }
                i = 0;
                break;
            case 1:
                if (this == obj) {
                    return true;
                }
                i = 1;
                break;
            default:
                return super.equals(obj);
        }
        if (!(obj instanceof C82g)) {
            return false;
        }
        C82g c82g = (C82g) obj;
        return c82g.A00 == i && this.A02 == c82g.A02 && this.A01 == c82g.A01 && 11T.A0O(this.A03, c82g.A03);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public int hashCode() {
        int i;
        String str;
        int hashCode;
        switch (this.A00) {
            case 0:
                i = ((this.A02 * 31) + this.A01) * 31;
                str = this.A03;
                if (str == null) {
                    hashCode = 0;
                    return i + hashCode;
                }
                hashCode = str.hashCode();
                return i + hashCode;
            case 1:
                i = ((this.A02 * 31) + this.A01) * 31;
                str = this.A03;
                hashCode = str.hashCode();
                return i + hashCode;
            default:
                return super.hashCode();
        }
    }
}
