package X;

/* loaded from: Fjt.class */
public final class Fjt implements JDB {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public Fjt(int i, boolean z, boolean z2, boolean z3) {
        this.A00 = i;
        this.A01 = z;
        this.A02 = z2;
        this.A03 = z3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Fjt)) {
                return false;
            }
            Fjt fjt = (Fjt) obj;
            if (this.A00 != fjt.A00 || this.A01 != fjt.A01 || this.A02 != fjt.A02 || this.A03 != fjt.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A02(C1pq.A02(this.A00 + 31, this.A01), this.A02), this.A03);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ScreenSharingDrawerPluginViewState{bottomPaddingPx=");
        A0k.append(this.A00);
        A0k.append(", isContentTopAligned=");
        A0k.append(this.A01);
        A0k.append(", isInFullDrawer=");
        A0k.append(this.A02);
        A0k.append(", isSharing=");
        A0k.append(this.A03);
        return 1BL.A0v(A0k);
    }
}
