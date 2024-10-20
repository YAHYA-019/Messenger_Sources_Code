package X;

/* loaded from: Jts.class */
public final class Jts extends C04v implements MIg {
    public final String A00;

    public Jts(String str) {
        this.A00 = str;
    }

    @Override // X.MIg
    public byte[] BIn() {
        return DKC.A1a(this.A00, C03r.A05);
    }

    @Override // X.MIg
    public String BIo() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Jts) && 11T.A0O(this.A00, ((Jts) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return JQz.A0q("String(value=", this.A00);
    }
}
