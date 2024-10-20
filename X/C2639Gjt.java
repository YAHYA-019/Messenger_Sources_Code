package X;

/* renamed from: X.Gjt, reason: case insensitive filesystem */
/* loaded from: Gjt.class */
public final class C2639Gjt extends C04v implements JDB {
    public boolean A00 = true;
    public final int A01;
    public final GjU A02;
    public final boolean A03;

    public C2639Gjt(GjU gjU, int i, boolean z) {
        this.A02 = gjU;
        this.A03 = z;
        this.A01 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2639Gjt)) {
                return false;
            }
            C2639Gjt c2639Gjt = (C2639Gjt) obj;
            if (!11T.A0O(this.A02, c2639Gjt.A02) || this.A03 != c2639Gjt.A03 || this.A01 != c2639Gjt.A01 || this.A00 != c2639Gjt.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((1BL.A03(this.A02) + AnonymousClass002.A00(this.A03 ? 1 : 0)) * 31) + this.A01) * 31) + AnonymousClass002.A00(this.A00 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MsgrCallControlsViewState(callcontrolsViewState=");
        A0k.append(this.A02);
        A0k.append(", animateHideVertically=");
        A0k.append(this.A03);
        A0k.append(", callControlsHeight=");
        A0k.append(this.A01);
        A0k.append(", shouldShowTranslucentBackground=");
        return DKH.A0q(A0k, this.A00);
    }
}
