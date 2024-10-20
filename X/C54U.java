package X;

import java.util.List;

/* renamed from: X.54U, reason: invalid class name */
/* loaded from: 54U.class */
public final class C54U extends C04v {
    public final String A00;
    public final List A01;

    public C54U() {
        this(null, C0ty.A00);
    }

    public C54U(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C54U)) {
                return false;
            }
            C54U c54u = (C54U) obj;
            if (!11T.A0O(this.A00, c54u.A00) || !11T.A0O(this.A01, c54u.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A01, 1BL.A05(this.A00) * 31);
    }
}
