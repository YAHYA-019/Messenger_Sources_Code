package X;

/* loaded from: Jti.class */
public final class Jti extends C04v implements MCJ {
    public final MRN A00;

    public Jti(Jtj... jtjArr) {
        MRN A00 = Kwj.A00(02L.A09(jtjArr));
        11T.A0F(A00, 1);
        this.A00 = A00;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Jti) && 11T.A0O(this.A00, ((Jti) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
