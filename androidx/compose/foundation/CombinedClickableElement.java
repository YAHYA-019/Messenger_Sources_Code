package androidx.compose.foundation;

import X.11T;
import X.1BL;
import X.AnonymousClass002;
import X.C00m;
import X.ExZ;
import X.JQz;
import X.LOB;
import X.MMr;
import X.MMs;

/* loaded from: CombinedClickableElement.class */
public final class CombinedClickableElement extends LOB {
    public final MMr A00;
    public final MMs A01;
    public final ExZ A02;
    public final String A03;
    public final String A04;
    public final C00m A05;
    public final C00m A06;
    public final C00m A07;
    public final boolean A08;

    public CombinedClickableElement(MMr mMr, MMs mMs, ExZ exZ, String str, String str2, C00m c00m, C00m c00m2, C00m c00m3, boolean z) {
        this.A01 = mMs;
        this.A00 = mMr;
        this.A08 = z;
        this.A03 = str;
        this.A02 = exZ;
        this.A05 = c00m;
        this.A04 = str2;
        this.A07 = c00m2;
        this.A06 = c00m3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
            if (!11T.A0O(this.A01, combinedClickableElement.A01) || !11T.A0O(this.A00, combinedClickableElement.A00) || this.A08 != combinedClickableElement.A08 || !11T.A0O(this.A03, combinedClickableElement.A03) || !11T.A0O(this.A02, combinedClickableElement.A02) || this.A05 != combinedClickableElement.A05 || !11T.A0O(this.A04, combinedClickableElement.A04) || this.A07 != combinedClickableElement.A07 || this.A06 != combinedClickableElement.A06) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = ((((((AnonymousClass002.A04(this.A01) * 31) + AnonymousClass002.A04(this.A00)) * 31) + AnonymousClass002.A00(this.A08 ? 1 : 0)) * 31) + 1BL.A06(this.A03)) * 31;
        ExZ exZ = this.A02;
        return ((((AnonymousClass002.A05(this.A05, (A04 + (exZ != null ? exZ.A00 : 0)) * 31) + 1BL.A06(this.A04)) * 31) + AnonymousClass002.A04(this.A07)) * 31) + JQz.A0E(this.A06, 0);
    }
}
