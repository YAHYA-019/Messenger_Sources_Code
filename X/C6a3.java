package X;

/* renamed from: X.6a3, reason: invalid class name */
/* loaded from: 6a3.class */
public final class C6a3 {
    public final int A00;

    public C6a3(int i) {
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            if (this.A00 != ((C6a3) obj).A00) {
                z = false;
            }
        }
        return z;
    }

    public int hashCode() {
        return this.A00 * 31;
    }
}
