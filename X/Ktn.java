package X;

import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* loaded from: Ktn.class */
public final class Ktn {
    public final int A00;
    public final int A01;
    public final long A02;
    public final Lie A03;
    public final L4F A04;
    public final MBi A05;
    public final MNh A06;
    public final KMW A07;
    public final List A08;
    public final boolean A09;

    public Ktn(Lie lie, L4F l4f, MBi mBi, MNh mNh, KMW kmw, List list, int i, int i2, long j, boolean z) {
        this.A03 = lie;
        this.A04 = l4f;
        this.A08 = list;
        this.A00 = i;
        this.A09 = z;
        this.A01 = i2;
        this.A06 = mNh;
        this.A07 = kmw;
        this.A05 = mBi;
        this.A02 = j;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ktn)) {
                return false;
            }
            Ktn ktn = (Ktn) obj;
            if (!11T.A0O(this.A03, ktn.A03) || !11T.A0O(this.A04, ktn.A04) || !11T.A0O(this.A08, ktn.A08) || this.A00 != ktn.A00 || this.A09 != ktn.A09 || this.A01 != ktn.A01 || !11T.A0O(this.A06, ktn.A06) || this.A07 != ktn.A07 || !11T.A0O(this.A05, ktn.A05) || this.A02 != ktn.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A05(this.A05, AnonymousClass002.A05(this.A07, AnonymousClass002.A05(this.A06, (((((AnonymousClass002.A05(this.A08, AnonymousClass002.A05(this.A04, 1BL.A03(this.A03))) + this.A00) * 31) + AnonymousClass002.A00(this.A09 ? 1 : 0)) * 31) + this.A01) * 31))) + 1BL.A01(this.A02);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("TextLayoutInput(text=");
        A0k.append((Object) this.A03);
        A0k.append(", style=");
        A0k.append(this.A04);
        A0k.append(", placeholders=");
        A0k.append(this.A08);
        A0k.append(", maxLines=");
        A0k.append(this.A00);
        A0k.append(", softWrap=");
        A0k.append(this.A09);
        A0k.append(", overflow=");
        int i = this.A01;
        A0k.append(i == 1 ? "Clip" : i == 2 ? "Ellipsis" : i == 3 ? "Visible" : "Invalid");
        A0k.append(", density=");
        A0k.append(this.A06);
        A0k.append(", layoutDirection=");
        A0k.append(this.A07);
        A0k.append(", fontFamilyResolver=");
        A0k.append(this.A05);
        A0k.append(", constraints=");
        return AnonymousClass002.A0K(Constraints.A07(this.A02), A0k);
    }
}
