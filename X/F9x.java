package X;

/* loaded from: F9x.class */
public final class F9x {
    public final float A00;
    public final ELB A01;
    public final boolean A02;

    public F9x() {
        this(ELB.A02, 6.0f, false);
    }

    public F9x(ELB elb, float f, boolean z) {
        this.A00 = f;
        this.A01 = elb;
        this.A02 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof F9x)) {
                return false;
            }
            F9x f9x = (F9x) obj;
            if (Float.compare(this.A00, f9x.A00) != 0 || this.A01 != f9x.A01 || this.A02 != f9x.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A05(this.A01, Float.floatToIntBits(this.A00) * 31) + AnonymousClass002.A00(this.A02 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("AssetData(radius=");
        A0k.append(this.A00);
        A0k.append(", assetType=");
        A0k.append(this.A01);
        A0k.append(", isActive=");
        return DKH.A0q(A0k, this.A02);
    }
}
