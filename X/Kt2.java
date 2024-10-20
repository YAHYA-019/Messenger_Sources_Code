package X;

/* loaded from: Kt2.class */
public final class Kt2 {
    public final Class A00;
    public final Class A01;

    public Kt2(Class cls, Class cls2) {
        this.A00 = cls;
        this.A01 = cls2;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof Kt2) {
            Kt2 kt2 = (Kt2) obj;
            if (kt2.A00.equals(this.A00)) {
                z = JQy.A1Z(kt2.A01, this.A01);
            }
        }
        return z;
    }

    public int hashCode() {
        return AbM.A05(this.A00, this.A01);
    }

    public String toString() {
        return 0Pz.A0j(this.A00.getSimpleName(), " with primitive type: ", this.A01.getSimpleName());
    }
}
