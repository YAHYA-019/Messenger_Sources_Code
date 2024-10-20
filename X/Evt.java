package X;

/* loaded from: Evt.class */
public final class Evt {
    public int A00 = 0;

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            if (this.A00 != ((Evt) obj).A00) {
                z = false;
            }
        }
        return z;
    }

    public int hashCode() {
        return this.A00;
    }
}
