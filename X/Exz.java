package X;

/* loaded from: Exz.class */
public final class Exz {
    public final Object A00;
    public final boolean A01;

    public Exz(boolean z, Object obj) {
        this.A01 = z;
        this.A00 = obj;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Exz exz = (Exz) obj;
            if (this.A01 != exz.A01) {
                return false;
            }
            Object obj2 = this.A00;
            Object obj3 = exz.A00;
            if (obj2 != null) {
                z = obj2.equals(obj3);
            } else if (obj3 != null) {
                return false;
            }
        }
        return z;
    }

    public int hashCode() {
        return ((this.A01 ? 1 : 0) * 31) + AnonymousClass002.A04(this.A00);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("GeneratorValue{done=");
        A0k.append(this.A01);
        A0k.append(", value=");
        A0k.append(this.A00);
        return AnonymousClass001.A0f(A0k);
    }
}
