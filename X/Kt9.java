package X;

/* loaded from: Kt9.class */
public final class Kt9 {
    public final int A00;
    public final int A01;
    public final MJR A02;

    public Kt9(MJR mjr, int i, int i2) {
        this.A02 = mjr;
        this.A01 = i;
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Kt9)) {
                return false;
            }
            Kt9 kt9 = (Kt9) obj;
            if (!11T.A0O(this.A02, kt9.A02) || this.A01 != kt9.A01 || this.A00 != kt9.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((1BL.A03(this.A02) + this.A01) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ParagraphIntrinsicInfo(intrinsics=");
        A0k.append(this.A02);
        A0k.append(", startIndex=");
        A0k.append(this.A01);
        A0k.append(", endIndex=");
        return DKH.A0p(A0k, this.A00);
    }
}
