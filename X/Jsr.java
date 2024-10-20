package X;

/* loaded from: Jsr.class */
public final class Jsr extends C04v {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public Jsr(int i, boolean z, boolean z2, boolean z3) {
        this.A03 = z;
        this.A01 = z2;
        this.A00 = i;
        this.A02 = z3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Jsr)) {
                return false;
            }
            Jsr jsr = (Jsr) obj;
            if (this.A03 != jsr.A03 || this.A01 != jsr.A01 || this.A00 != jsr.A00 || this.A02 != jsr.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((AnonymousClass002.A00(this.A03 ? 1 : 0) * 31) + AnonymousClass002.A00(this.A01 ? 1 : 0)) * 31) + this.A00) * 31) + AnonymousClass002.A00(this.A02 ? 1 : 0);
    }
}
