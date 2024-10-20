package X;

/* loaded from: Ksh.class */
public final class Ksh {
    public final Object A00;
    public final Object A01;

    public Ksh(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ksh)) {
                return false;
            }
            Ksh ksh = (Ksh) obj;
            if (!11T.A0O(this.A00, ksh.A00) || !11T.A0O(this.A01, ksh.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object obj = this.A00;
        int ordinal = (obj instanceof Enum ? ((Enum) obj).ordinal() : AnonymousClass002.A04(obj)) * 31;
        Object obj2 = this.A01;
        return ordinal + (obj2 instanceof Enum ? ((Enum) obj2).ordinal() : obj2.hashCode());
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("JoinedKey(left=");
        A0k.append(this.A00);
        A0k.append(AnonymousClass000.A00(66));
        return AnonymousClass002.A0K(this.A01, A0k);
    }
}
