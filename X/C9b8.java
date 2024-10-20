package X;

import java.util.List;

/* renamed from: X.9b8, reason: invalid class name */
/* loaded from: 9b8.class */
public final class C9b8 {
    public final String A00;
    public final List A01;

    public C9b8(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof C9b8)) {
                return false;
            }
            C9b8 c9b8 = (C9b8) obj;
            if (!11T.A0O(this.A00, c9b8.A00)) {
                return false;
            }
            List list = this.A01;
            List list2 = c9b8.A01;
            if (list != null) {
                if (!list.equals(list2)) {
                    return false;
                }
            } else if (list2 != null) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zS.A04(this, this.A00, this.A01);
    }
}
