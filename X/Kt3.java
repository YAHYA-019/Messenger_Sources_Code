package X;

/* loaded from: Kt3.class */
public final class Kt3 {
    public final L4o A00;
    public final Class A01;

    public Kt3(L4o l4o, Class cls) {
        this.A01 = cls;
        this.A00 = l4o;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof Kt3) {
            Kt3 kt3 = (Kt3) obj;
            if (kt3.A01.equals(this.A01)) {
                z = JQy.A1Z(kt3.A00, this.A00);
            }
        }
        return z;
    }

    public int hashCode() {
        return AbM.A05(this.A01, this.A00);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(this.A01.getSimpleName());
        A0k.append(", object identifier: ");
        return AnonymousClass001.A0a(this.A00, A0k);
    }
}
