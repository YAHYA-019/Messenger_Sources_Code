package X;

/* loaded from: Ey5.class */
public final class Ey5 {
    public final Exm A00;
    public final Exm A01;

    public Ey5(Exm exm, Exm exm2) {
        11T.A0F(exm, 1);
        this.A00 = exm;
        this.A01 = exm2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ey5)) {
                return false;
            }
            Ey5 ey5 = (Ey5) obj;
            if (!11T.A0O(this.A00, ey5.A00) || !11T.A0O(this.A01, ey5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BL.A03(this.A00) + AnonymousClass001.A02(this.A01);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Snapshot(sessionCacheSnapshot=");
        A0k.append(this.A00);
        A0k.append(", sessionlessCacheSnapshot=");
        return AnonymousClass002.A0K(this.A01, A0k);
    }
}
