package X;

/* loaded from: Ksg.class */
public final class Ksg {
    public final int A00;
    public final int A01;

    public Ksg(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        if (i < 0) {
            throw AnonymousClass001.A0L("negative start index");
        }
        if (i2 < i) {
            throw AnonymousClass001.A0L("end index greater than start");
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ksg)) {
                return false;
            }
            Ksg ksg = (Ksg) obj;
            if (this.A01 != ksg.A01 || this.A00 != ksg.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public String toString() {
        return 0Pz.A0b("Interval(start=", ", end=", ')', this.A01, this.A00);
    }
}
