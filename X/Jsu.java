package X;

/* loaded from: Jsu.class */
public final class Jsu extends C04v {
    public final long A00;
    public final long A01;
    public final long A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public Jsu(String str, long j, long j2, long j3, boolean z, boolean z2) {
        11T.A0F(str, 6);
        this.A05 = z;
        this.A04 = z2;
        this.A02 = j;
        this.A00 = j2;
        this.A01 = j3;
        this.A03 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Jsu)) {
                return false;
            }
            Jsu jsu = (Jsu) obj;
            if (this.A05 != jsu.A05 || this.A04 != jsu.A04 || this.A02 != jsu.A02 || this.A00 != jsu.A00 || this.A01 != jsu.A01 || !11T.A0O(this.A03, jsu.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A03, AnonymousClass002.A02(this.A01, AnonymousClass002.A02(this.A00, AnonymousClass002.A02(this.A02, ((AnonymousClass002.A00(this.A05 ? 1 : 0) * 31) + AnonymousClass002.A00(this.A04 ? 1 : 0)) * 31))));
    }
}
