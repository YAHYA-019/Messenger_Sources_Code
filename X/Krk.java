package X;

/* loaded from: Krk.class */
public final class Krk {
    public final 6VH A00;
    public final C95s A01;
    public final boolean A02;
    public final boolean A03;

    public Krk(6VH r302, C95s c95s, boolean z, boolean z2) {
        this.A00 = r302;
        this.A03 = z;
        this.A02 = z2;
        this.A01 = c95s;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((Krk) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
