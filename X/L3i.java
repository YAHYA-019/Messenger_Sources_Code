package X;

/* loaded from: L3i.class */
public final class L3i {
    public final int A00;

    public static String A00(int i) {
        return i == 1 ? "Ltr" : i == 2 ? "Rtl" : i == 3 ? "Content" : i == 4 ? "ContentOrLtr" : i == 5 ? "ContentOrRtl" : i == ((-1) << (-1)) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        int i = this.A00;
        boolean z = false;
        if ((obj instanceof L3i) && i == ((L3i) obj).A00) {
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
