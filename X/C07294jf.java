package X;

/* renamed from: X.4jf, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4jf.class */
public final class C07294jf {
    public final Boolean A00;
    public final String A01;

    public C07294jf(String str, Boolean bool) {
        this.A00 = bool;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj == null || !11T.A0O(getClass(), obj.getClass())) {
                return false;
            }
            C07294jf c07294jf = (C07294jf) obj;
            Boolean bool = this.A00;
            Boolean bool2 = c07294jf.A00;
            if (bool != null) {
                if (!bool.equals(bool2)) {
                    return false;
                }
            } else if (bool2 != null) {
                return false;
            }
            String str = this.A01;
            String str2 = c07294jf.A01;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 != null) {
                z = false;
            }
        }
        return z;
    }

    public int hashCode() {
        int i = 0;
        int A04 = AnonymousClass002.A04(this.A00) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return A04 + i;
    }
}
