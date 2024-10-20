package X;

import java.util.Arrays;

/* loaded from: JTa.class */
public final class JTa {
    public final Object A00;
    public final Object[] A01;

    public JTa(Object[] objArr, Object obj) {
        this.A00 = obj;
        this.A01 = objArr;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !1BL.A1V(this, obj)) {
                return false;
            }
            JTa jTa = (JTa) obj;
            if (!11T.A0O(this.A00, jTa.A00) || !Arrays.equals(this.A01, jTa.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BL.A03(this.A00) + Arrays.hashCode(this.A01);
    }
}
