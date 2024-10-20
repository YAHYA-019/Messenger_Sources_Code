package X;

import java.io.IOException;

/* loaded from: Jtq.class */
public final class Jtq extends C04v implements MCN {
    public final int A00 = 0;
    public final Object A01;

    public Jtq(3F8 r302) {
        this.A01 = r302;
    }

    public Jtq(IOException iOException) {
        11T.A0F(iOException, 1);
        this.A01 = iOException;
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
        if (!(obj instanceof Jtq)) {
            return false;
        }
        Jtq jtq = (Jtq) obj;
        return jtq.A00 == i && 11T.A0O(this.A01, jtq.A01);
    }

    public int hashCode() {
        return this.A01.hashCode();
    }
}
