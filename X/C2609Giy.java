package X;

/* renamed from: X.Giy, reason: case insensitive filesystem */
/* loaded from: Giy.class */
public final class C2609Giy extends C04v {
    public final int A00;
    public final int A01;
    public final boolean A02;

    public C2609Giy(int i, boolean z, int i2) {
        this.A00 = i2;
        this.A01 = i;
        this.A02 = z;
    }

    public boolean equals(Object obj) {
        int i;
        int i2;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2609Giy)) {
                return false;
            }
            C2609Giy c2609Giy = (C2609Giy) obj;
            if (c2609Giy.A00 != 1 || this.A01 != c2609Giy.A01) {
                return false;
            }
            i = this.A02 ? 1 : 0;
            i2 = c2609Giy.A02 ? 1 : 0;
        } else {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2609Giy)) {
                return false;
            }
            C2609Giy c2609Giy2 = (C2609Giy) obj;
            if (c2609Giy2.A00 != 0 || this.A02 != c2609Giy2.A02) {
                return false;
            }
            i = this.A01;
            i2 = c2609Giy2.A01;
        }
        return i == i2;
    }

    public int hashCode() {
        int A00;
        int i;
        if (this.A00 != 0) {
            A00 = this.A01 * 31;
            i = AnonymousClass002.A00(this.A02 ? 1 : 0);
        } else {
            A00 = AnonymousClass002.A00(this.A02 ? 1 : 0) * 31;
            i = this.A01;
        }
        return A00 + i;
    }
}
