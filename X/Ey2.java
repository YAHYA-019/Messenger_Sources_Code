package X;

/* loaded from: Ey2.class */
public final class Ey2 {
    public final Ek5 A00;
    public final EzR A01;

    public Ey2(Ek5 ek5, EzR ezR) {
        11T.A0F(ek5, 2);
        this.A01 = ezR;
        this.A00 = ek5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ey2)) {
                return false;
            }
            Ey2 ey2 = (Ey2) obj;
            if (!11T.A0O(this.A01, ey2.A01) || !11T.A0O(this.A00, ey2.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A00, 1BL.A03(this.A01));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("PendingResponse(queryDefinition=");
        A0k.append(this.A01);
        A0k.append(", response=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
