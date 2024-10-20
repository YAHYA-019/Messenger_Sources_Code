package X;

/* renamed from: X.GjK, reason: case insensitive filesystem */
/* loaded from: GjK.class */
public final class C2626GjK extends C04v {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public C2626GjK(int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
    }

    public final float A00(C2626GjK c2626GjK) {
        int i;
        int i2;
        int i3 = c2626GjK.A02;
        int i4 = c2626GjK.A01;
        if (i3 - i4 == 0) {
            return 0.0f;
        }
        int i5 = c2626GjK.A00;
        int i6 = c2626GjK.A03;
        if (i5 - i6 == 0) {
            return 0.0f;
        }
        int i7 = this.A01;
        if (i7 >= i3 || i4 >= (i = this.A02)) {
            return 0.0f;
        }
        int i8 = this.A03;
        if (i8 >= i5 || i6 >= (i2 = this.A00)) {
            return 0.0f;
        }
        if (i7 < i4) {
            i7 = i4;
        }
        if (i8 < i6) {
            i8 = i6;
        }
        if (i <= i3) {
            i3 = i;
        }
        if (i2 <= i5) {
            i5 = i2;
        }
        return ((i3 - i7) * (i5 - i8)) / ((i - i7) * (i2 - i8));
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2626GjK)) {
                return false;
            }
            C2626GjK c2626GjK = (C2626GjK) obj;
            if (this.A01 != c2626GjK.A01 || this.A03 != c2626GjK.A03 || this.A02 != c2626GjK.A02 || this.A00 != c2626GjK.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((this.A01 * 31) + this.A03) * 31) + this.A02) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ImmutableRect(left=");
        A0k.append(this.A01);
        A0k.append(", top=");
        A0k.append(this.A03);
        A0k.append(", right=");
        A0k.append(this.A02);
        A0k.append(", bottom=");
        return DKH.A0p(A0k, this.A00);
    }
}
