package X;

import java.util.Set;

/* loaded from: Ey4.class */
public final class Ey4 {
    public final Object A00;
    public final Set A01;

    public Ey4(Object obj, Set set) {
        11T.A0F(set, 2);
        this.A00 = obj;
        this.A01 = set;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ey4)) {
                return false;
            }
            Ey4 ey4 = (Ey4) obj;
            if (!11T.A0O(this.A00, ey4.A00) || !11T.A0O(this.A01, ey4.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A01, AnonymousClass001.A02(this.A00) * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ValueEntry(value=");
        A0k.append(this.A00);
        A0k.append(", variableLog=");
        return AnonymousClass002.A0K(this.A01, A0k);
    }
}
