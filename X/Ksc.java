package X;

/* loaded from: Ksc.class */
public final class Ksc {
    public long A00;

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof Ksc)) {
                return false;
            }
            if (this.A00 != ((Ksc) obj).A00) {
                z = false;
            }
        }
        return z;
    }

    public int hashCode() {
        return DKD.A04(Long.valueOf(this.A00));
    }

    public String toString() {
        return Long.toString(this.A00);
    }
}
