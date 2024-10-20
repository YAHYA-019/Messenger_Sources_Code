package X;

/* loaded from: Jtp.class */
public final class Jtp extends C04v implements MCN {
    public final int A00;

    public Jtp(int i) {
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Jtp) && this.A00 == ((Jtp) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }
}
