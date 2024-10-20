package X;

/* loaded from: Ey3.class */
public final class Ey3 {
    public final EHc A00;
    public final Eyc A01;

    public Ey3(EHc eHc, Eyc eyc) {
        this.A01 = eyc;
        this.A00 = eHc;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ey3)) {
                return false;
            }
            Ey3 ey3 = (Ey3) obj;
            if (!11T.A0O(this.A01, ey3.A01) || !11T.A0O(this.A00, ey3.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A00, AnonymousClass001.A02(this.A01) * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("BloksTreeUpdateOperation(treeModification=");
        A0k.append(this.A01);
        A0k.append(", variableUpdate=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
