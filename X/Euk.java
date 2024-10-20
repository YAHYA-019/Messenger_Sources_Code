package X;

/* loaded from: Euk.class */
public final class Euk {
    public final long A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public Euk(long j, boolean z, boolean z2, boolean z3) {
        this.A02 = z;
        this.A00 = j;
        this.A03 = z2;
        this.A01 = z3;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof Euk) {
                Euk euk = (Euk) obj;
                if (this.A00 == euk.A00 && this.A02 == euk.A02 && this.A03 == euk.A03 && this.A01 == euk.A01) {
                    z = true;
                }
            }
        }
        return z;
    }
}
