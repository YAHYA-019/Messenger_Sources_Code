package X;

/* loaded from: Kt4.class */
public final class Kt4 {
    public final Class A00;
    public final Class A01;

    public Kt4(Class cls, Class cls2) {
        this.A00 = cls;
        this.A01 = cls2;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof Kt4) {
            Kt4 kt4 = (Kt4) obj;
            if (kt4.A00.equals(this.A00)) {
                z = JQy.A1Z(kt4.A01, this.A01);
            }
        }
        return z;
    }

    public int hashCode() {
        return AbM.A05(this.A00, this.A01);
    }

    public String toString() {
        return 0Pz.A0j(this.A00.getSimpleName(), " with serialization type: ", this.A01.getSimpleName());
    }
}
