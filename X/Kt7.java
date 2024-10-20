package X;

/* loaded from: Kt7.class */
public final class Kt7 {
    public final int A00;
    public final KOH A01;

    public Kt7(KOH koh, int i) {
        this.A01 = koh;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Kt7)) {
                return false;
            }
            Kt7 kt7 = (Kt7) obj;
            if (this.A01 != kt7.A01 || this.A00 != kt7.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BL.A03(this.A01) + this.A00;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("QPLEventPayload(type=");
        A0k.append(this.A01);
        A0k.append(", key=");
        return DKH.A0p(A0k, this.A00);
    }
}
