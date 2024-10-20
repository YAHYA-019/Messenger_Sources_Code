package X;

/* loaded from: L4E.class */
public final class L4E {
    public static final L4E A03 = new L4E(new AnonymousClass175(0.0f, 0.0f), 0.0f, 0);
    public final float A00;
    public final int A01;
    public final C0zw A02;

    public L4E(C0zw c0zw, float f, int i) {
        this.A00 = f;
        this.A02 = c0zw;
        this.A01 = i;
        if (!(!Float.isNaN(f))) {
            throw AnonymousClass001.A0L("current must not be NaN");
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof L4E)) {
                return false;
            }
            L4E l4e = (L4E) obj;
            if (this.A00 != l4e.A00 || !11T.A0O(this.A02, l4e.A02) || this.A01 != l4e.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A05(this.A02, JQz.A04(this.A00)) + this.A01;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ProgressBarRangeInfo(current=");
        A0k.append(this.A00);
        A0k.append(", range=");
        A0k.append(this.A02);
        A0k.append(", steps=");
        return DKH.A0p(A0k, this.A01);
    }
}
