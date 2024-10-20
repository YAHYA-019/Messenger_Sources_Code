package X;

/* loaded from: Ksk.class */
public final class Ksk {
    public Object A00;
    public Object A01;

    public boolean equals(Object obj) {
        C5nf c5nf;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        boolean z = false;
        if ((obj instanceof C5nf) && (((obj2 = (c5nf = (C5nf) obj).A00) == (obj3 = this.A00) || (obj2 != null && obj2.equals(obj3))) && ((obj4 = c5nf.A01) == (obj5 = this.A01) || (obj4 != null && obj4.equals(obj5))))) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return AnonymousClass001.A02(this.A00) ^ 4YU.A03(this.A01);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Pair{");
        A0k.append(this.A00);
        A0k.append(" ");
        return AbstractC2327GOs.A0U(this.A01, A0k);
    }
}
