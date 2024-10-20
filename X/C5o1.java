package X;

import java.util.List;

/* renamed from: X.5o1, reason: invalid class name */
/* loaded from: 5o1.class */
public final class C5o1 extends C04v {
    public static final C5o1 A02 = new C5o1(null, C0ty.A00);
    public final String A00;
    public final List A01;

    public C5o1(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C5o1)) {
                return false;
            }
            C5o1 c5o1 = (C5o1) obj;
            if (!11T.A0O(this.A00, c5o1.A00) || !11T.A0O(this.A01, c5o1.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A01, 1BL.A05(this.A00) * 31);
    }
}
