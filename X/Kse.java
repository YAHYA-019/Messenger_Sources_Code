package X;

/* loaded from: Kse.class */
public final class Kse {
    public final long A00;
    public final MBG A01;

    public /* synthetic */ Kse() {
        long j = LDp.A01;
        LN7 ln7 = new LN7(0.0f, 0.0f, 0.0f, 0.0f);
        this.A00 = 4284900966L << 32;
        this.A01 = ln7;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!11T.A0O(getClass(), JR0.A0m(obj))) {
                return false;
            }
            11T.A0I(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
            Kse kse = (Kse) obj;
            long j = this.A00;
            long j2 = kse.A00;
            long j3 = LDp.A01;
            if (j != j2 || !11T.A0O(this.A01, kse.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        long j = this.A00;
        long j2 = LDp.A01;
        return 1BK.A03(this.A01, 7zQ.A02(j));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("OverscrollConfiguration(glowColor=");
        JQz.A12(this.A00, A0k);
        A0k.append(", drawPadding=");
        return AnonymousClass002.A0K(this.A01, A0k);
    }
}
