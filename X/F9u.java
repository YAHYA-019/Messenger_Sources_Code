package X;

/* loaded from: F9u.class */
public final class F9u {
    public final int A00;
    public final EPR A01;
    public final boolean A02;

    public F9u() {
        this(EPR.A0J, 100, false);
    }

    public F9u(EPR epr, int i, boolean z) {
        11T.A0F(epr, 1);
        this.A01 = epr;
        this.A02 = z;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof F9u)) {
                return false;
            }
            F9u f9u = (F9u) obj;
            if (this.A01 != f9u.A01 || this.A02 != f9u.A02 || this.A00 != f9u.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((1BL.A03(this.A01) * 31) + AnonymousClass002.A00(this.A02 ? 1 : 0)) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ImageUploadConfig(namespace=");
        A0k.append(this.A01);
        DKG.A1Y(A0k, ", accessToken=");
        A0k.append(", shouldEnableDedupPolicy=");
        A0k.append(this.A02);
        A0k.append(", bitmapQuality=");
        return DKH.A0p(A0k, this.A00);
    }
}
