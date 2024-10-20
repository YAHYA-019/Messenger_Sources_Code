package X;

/* renamed from: X.5ht, reason: invalid class name */
/* loaded from: 5ht.class */
public final class C5ht {
    public final C1tu A00;
    public final C2jo A01;

    public C5ht(C1tu c1tu, C2jo c2jo) {
        this.A00 = c1tu;
        this.A01 = c2jo;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C5ht c5ht = (C5ht) obj;
            if (!equals(c5ht.A00) || !this.A01.equals(c5ht.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (hashCode() * 31) + this.A01.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("PropertyHandle{ mTransitionId='");
        A0k.append(this.A00);
        A0k.append("', mProperty=");
        A0k.append(this.A01);
        return 1BL.A0v(A0k);
    }
}
