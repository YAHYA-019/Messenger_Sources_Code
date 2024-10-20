package X;

import java.util.List;

/* loaded from: Dr8.class */
public final class Dr8 extends C04v implements GDC {
    public final int A00;
    public final List A01;

    public Dr8(List list, int i) {
        this.A00 = i;
        this.A01 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Dr8)) {
                return false;
            }
            Dr8 dr8 = (Dr8) obj;
            if (this.A00 != dr8.A00 || !11T.A0O(this.A01, dr8.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A01, this.A00 * 31);
    }
}
