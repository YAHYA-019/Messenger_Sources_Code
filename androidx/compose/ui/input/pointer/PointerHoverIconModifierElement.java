package androidx.compose.ui.input.pointer;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.DKH;
import X.LOB;
import X.MLN;

/* loaded from: PointerHoverIconModifierElement.class */
public final class PointerHoverIconModifierElement extends LOB {
    public final MLN A00;

    public PointerHoverIconModifierElement(MLN mln) {
        this.A00 = mln;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof PointerHoverIconModifierElement) && 11T.A0O(this.A00, ((PointerHoverIconModifierElement) obj).A00));
    }

    public int hashCode() {
        return 1BL.A03(this.A00) + 1237;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("PointerHoverIconModifierElement(icon=");
        A0k.append(this.A00);
        A0k.append(", overrideDescendants=");
        return DKH.A0q(A0k, false);
    }
}
