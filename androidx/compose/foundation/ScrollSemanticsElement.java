package androidx.compose.foundation;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.DKH;
import X.LMp;
import X.LOB;
import X.MBC;

/* loaded from: ScrollSemanticsElement.class */
public final class ScrollSemanticsElement extends LOB {
    public final LMp A00;
    public final MBC A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public ScrollSemanticsElement(LMp lMp, MBC mbc, boolean z, boolean z2, boolean z3) {
        this.A00 = lMp;
        this.A04 = z;
        this.A01 = mbc;
        this.A02 = z2;
        this.A03 = z3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ScrollSemanticsElement)) {
                return false;
            }
            ScrollSemanticsElement scrollSemanticsElement = (ScrollSemanticsElement) obj;
            if (!11T.A0O(this.A00, scrollSemanticsElement.A00) || this.A04 != scrollSemanticsElement.A04 || !11T.A0O(this.A01, scrollSemanticsElement.A01) || this.A02 != scrollSemanticsElement.A02 || this.A03 != scrollSemanticsElement.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((1BL.A03(this.A00) + AnonymousClass002.A00(this.A04 ? 1 : 0)) * 31) + AnonymousClass001.A02(this.A01)) * 31) + AnonymousClass002.A00(this.A02 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A03 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ScrollSemanticsElement(state=");
        A0k.append(this.A00);
        A0k.append(", reverseScrolling=");
        A0k.append(this.A04);
        A0k.append(", flingBehavior=");
        A0k.append(this.A01);
        A0k.append(", isScrollable=");
        A0k.append(this.A02);
        A0k.append(", isVertical=");
        return DKH.A0q(A0k, this.A03);
    }
}
