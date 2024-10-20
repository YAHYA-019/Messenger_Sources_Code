package X;

/* loaded from: Jtg.class */
public final class Jtg extends C04v implements MCI {
    public final MRN A00;

    public Jtg(MRN mrn) {
        11T.A0F(mrn, 1);
        this.A00 = mrn;
        if (!1BK.A1Y(mrn)) {
            throw AnonymousClass001.A0L("Must have at least a single user");
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Jtg) && 11T.A0O(this.A00, ((Jtg) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
