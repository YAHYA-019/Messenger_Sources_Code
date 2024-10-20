package X;

/* renamed from: X.82l, reason: invalid class name */
/* loaded from: 82l.class */
public final class C82l extends C04v {
    public final int A00;
    public final String A01;
    public final String A02;

    public C82l(String str, String str2, int i) {
        this.A00 = i;
        if (i != 0) {
            11T.A0F(str, 1);
            11T.A0F(str2, 2);
        }
        this.A02 = str;
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            i = 1;
        } else {
            if (this == obj) {
                return true;
            }
            i = 0;
        }
        if (!(obj instanceof C82l)) {
            return false;
        }
        C82l c82l = (C82l) obj;
        return c82l.A00 == i && 11T.A0O(this.A02, c82l.A02) && 11T.A0O(this.A01, c82l.A01);
    }

    public int hashCode() {
        return (this.A02.hashCode() * 31) + this.A01.hashCode();
    }
}
