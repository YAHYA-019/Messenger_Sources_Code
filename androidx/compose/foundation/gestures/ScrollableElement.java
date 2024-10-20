package androidx.compose.foundation.gestures;

import X.11T;
import X.1BL;
import X.AnonymousClass002;
import X.KMT;
import X.LOB;
import X.MBC;
import X.MJw;
import X.MKN;
import X.MMs;

/* loaded from: ScrollableElement.class */
public final class ScrollableElement extends LOB {
    public final MJw A00;
    public final MBC A01;
    public final KMT A02;
    public final MKN A03;
    public final MMs A04;
    public final boolean A05;
    public final boolean A06;

    public ScrollableElement(MJw mJw, MBC mbc, KMT kmt, MKN mkn, MMs mMs, boolean z, boolean z2) {
        this.A03 = mkn;
        this.A02 = kmt;
        this.A00 = mJw;
        this.A05 = z;
        this.A06 = z2;
        this.A01 = mbc;
        this.A04 = mMs;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ScrollableElement)) {
                return false;
            }
            ScrollableElement scrollableElement = (ScrollableElement) obj;
            if (!11T.A0O(this.A03, scrollableElement.A03) || this.A02 != scrollableElement.A02 || !11T.A0O(this.A00, scrollableElement.A00) || this.A05 != scrollableElement.A05 || this.A06 != scrollableElement.A06 || !11T.A0O(this.A01, scrollableElement.A01) || !11T.A0O(this.A04, scrollableElement.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((((((AnonymousClass002.A05(this.A02, 1BL.A03(this.A03)) + AnonymousClass002.A04(this.A00)) * 31) + AnonymousClass002.A00(this.A05 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A06 ? 1 : 0)) * 31) + AnonymousClass002.A04(this.A01)) * 31) + AnonymousClass002.A04(this.A04)) * 31;
    }
}
