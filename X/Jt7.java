package X;

import com.facebook.odin.model.Feature$Companion;

/* loaded from: Jt7.class */
public final class Jt7 extends C04v {
    public static final Feature$Companion Companion = new Object();
    public final int A00;
    public final String A01;

    public Jt7(String str, int i) {
        11T.A0F(str, 1);
        this.A01 = str;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Jt7)) {
                return false;
            }
            Jt7 jt7 = (Jt7) obj;
            if (!11T.A0O(this.A01, jt7.A01) || this.A00 != jt7.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 4YV.A02(this.A01) + this.A00;
    }
}
