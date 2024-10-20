package X;

/* loaded from: Dr7.class */
public final class Dr7 extends C04v implements GDB {
    public final int A00;

    public Dr7(int i) {
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Dr7) && this.A00 == ((Dr7) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }
}
