package X;

import java.util.List;

/* loaded from: C71.class */
public final class C71 {
    public final String A00;
    public final List A01;

    public C71(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof C71)) {
                return false;
            }
            C71 c71 = (C71) obj;
            if (!11T.A0O(this.A00, c71.A00)) {
                return false;
            }
            List list = this.A01;
            List list2 = c71.A01;
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
