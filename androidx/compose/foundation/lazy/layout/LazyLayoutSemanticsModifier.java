package androidx.compose.foundation.lazy.layout;

import X.11T;
import X.1BL;
import X.AnonymousClass002;
import X.C00m;
import X.KMT;
import X.LOB;
import X.MBP;

/* loaded from: LazyLayoutSemanticsModifier.class */
public final class LazyLayoutSemanticsModifier extends LOB {
    public final KMT A00;
    public final MBP A01;
    public final C00m A02;
    public final boolean A03;
    public final boolean A04;

    public LazyLayoutSemanticsModifier(KMT kmt, MBP mbp, C00m c00m, boolean z, boolean z2) {
        this.A02 = c00m;
        this.A01 = mbp;
        this.A00 = kmt;
        this.A04 = z;
        this.A03 = z2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof LazyLayoutSemanticsModifier)) {
                return false;
            }
            LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
            if (this.A02 != lazyLayoutSemanticsModifier.A02 || !11T.A0O(this.A01, lazyLayoutSemanticsModifier.A01) || this.A00 != lazyLayoutSemanticsModifier.A00 || this.A04 != lazyLayoutSemanticsModifier.A04 || this.A03 != lazyLayoutSemanticsModifier.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass002.A05(this.A00, AnonymousClass002.A05(this.A01, 1BL.A03(this.A02))) + AnonymousClass002.A00(this.A04 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A03 ? 1 : 0);
    }
}
