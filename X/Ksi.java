package X;

/* loaded from: Ksi.class */
public final class Ksi {
    public int[] A00 = Kbi.A00;
    public Object[] A01 = Kbi.A01;

    public boolean equals(Object obj) {
        if (this != obj && !(obj instanceof Ksi)) {
            if (!(obj instanceof java.util.Map)) {
                return false;
            }
            try {
                if (0 != ((java.util.Map) obj).size()) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "{}";
    }
}
