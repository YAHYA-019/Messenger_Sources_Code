package X;

/* loaded from: L3h.class */
public final class L3h {
    public final int A00;

    public static String A00(int i) {
        return i == 1 ? "Left" : i == 2 ? "Right" : i == 3 ? "Center" : i == 4 ? "Justify" : i == 5 ? "Start" : i == 6 ? "End" : i == ((-1) << (-1)) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        int i = this.A00;
        boolean z = false;
        if ((obj instanceof L3h) && i == ((L3h) obj).A00) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return this.A00;
    }

    public String toString() {
        return A00(this.A00);
    }
}
