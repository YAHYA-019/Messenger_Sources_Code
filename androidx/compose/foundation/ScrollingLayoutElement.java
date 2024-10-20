package androidx.compose.foundation;

import X.11T;
import X.1BL;
import X.AnonymousClass002;
import X.LMp;
import X.LOB;

/* loaded from: ScrollingLayoutElement.class */
public final class ScrollingLayoutElement extends LOB {
    public final LMp A00;
    public final boolean A01;
    public final boolean A02;

    public ScrollingLayoutElement(LMp lMp, boolean z, boolean z2) {
        this.A00 = lMp;
        this.A01 = z;
        this.A02 = z2;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof ScrollingLayoutElement) {
            ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
            if (11T.A0O(this.A00, scrollingLayoutElement.A00) && this.A01 == scrollingLayoutElement.A01 && this.A02 == scrollingLayoutElement.A02) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return ((1BL.A03(this.A00) + AnonymousClass002.A00(this.A01 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A02 ? 1 : 0);
    }
}
