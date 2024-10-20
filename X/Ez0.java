package X;

/* loaded from: Ez0.class */
public final class Ez0 {
    public final int A00;
    public final int A01;
    public final EMx A02;
    public final boolean A03;

    public Ez0(EMx eMx, int i, int i2, boolean z) {
        this.A02 = eMx;
        this.A00 = i;
        this.A03 = z;
        this.A01 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ez0)) {
                return false;
            }
            Ez0 ez0 = (Ez0) obj;
            if (this.A02 != ez0.A02 || this.A00 != ez0.A00 || this.A03 != ez0.A03 || this.A01 != ez0.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((AnonymousClass001.A02(this.A02) * 31) + this.A00) * 31) + AnonymousClass002.A00(this.A03 ? 1 : 0)) * 31) + this.A01;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MEmuPoseInfo(currentPose=");
        A0k.append(this.A02);
        A0k.append(", currentPoseNumber=");
        A0k.append(this.A00);
        A0k.append(", captureCurrentPose=");
        A0k.append(this.A03);
        A0k.append(", totalPoseCount=");
        return DKH.A0p(A0k, this.A01);
    }
}
