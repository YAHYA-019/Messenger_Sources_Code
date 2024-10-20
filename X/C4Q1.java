package X;

import java.util.List;

/* renamed from: X.4Q1, reason: invalid class name */
/* loaded from: 4Q1.class */
public final class C4Q1 extends C04v implements C4YG {
    public final List A00;
    public final AbU A01;

    public C4Q1(AbU abU, List list) {
        this.A00 = list;
        this.A01 = abU;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C4Q1)) {
                return false;
            }
            C4Q1 c4q1 = (C4Q1) obj;
            if (!11T.A0O(this.A00, c4q1.A00) || this.A01 != c4q1.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }
}
