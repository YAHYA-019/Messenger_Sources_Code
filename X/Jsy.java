package X;

import java.util.List;

/* loaded from: Jsy.class */
public final class Jsy extends C04v {
    public final long A00;
    public final EKr A01;
    public final List A02;

    public Jsy(EKr eKr, List list, long j) {
        7zR.A1O(eKr, list);
        this.A00 = j;
        this.A01 = eKr;
        this.A02 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Jsy)) {
                return false;
            }
            Jsy jsy = (Jsy) obj;
            if (this.A00 != jsy.A00 || this.A01 != jsy.A01 || !11T.A0O(this.A02, jsy.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A02, AnonymousClass002.A05(this.A01, 7zQ.A02(this.A00)));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("promptType: ");
        A0k.append(this.A01);
        A0k.append(" createdAt: ");
        A0k.append(this.A00);
        A0k.append(" updatedFields: ");
        return AnonymousClass001.A0a(this.A02, A0k);
    }
}
