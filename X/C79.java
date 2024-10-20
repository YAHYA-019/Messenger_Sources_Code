package X;

/* loaded from: C79.class */
public final class C79 {
    public final int A00;
    public final int A01;

    public C79(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C79)) {
                return false;
            }
            C79 c79 = (C79) obj;
            if (this.A00 != c79.A00 || this.A01 != c79.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((this.A00 + 31) * 31) + this.A01;
    }
}
