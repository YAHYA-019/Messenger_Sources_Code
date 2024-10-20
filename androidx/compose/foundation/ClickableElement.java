package androidx.compose.foundation;

import X.11T;
import X.1BK;
import X.1BL;
import X.AnonymousClass002;
import X.C00m;
import X.ExZ;
import X.LOB;
import X.MMr;
import X.MMs;

/* loaded from: ClickableElement.class */
public final class ClickableElement extends LOB {
    public final MMr A00;
    public final MMs A01;
    public final ExZ A02;
    public final String A03;
    public final C00m A04;
    public final boolean A05;

    public ClickableElement(MMr mMr, MMs mMs, ExZ exZ, String str, C00m c00m, boolean z) {
        this.A01 = mMs;
        this.A00 = mMr;
        this.A05 = z;
        this.A03 = str;
        this.A02 = exZ;
        this.A04 = c00m;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ClickableElement clickableElement = (ClickableElement) obj;
            if (!11T.A0O(this.A01, clickableElement.A01) || !11T.A0O(this.A00, clickableElement.A00) || this.A05 != clickableElement.A05 || !11T.A0O(this.A03, clickableElement.A03) || !11T.A0O(this.A02, clickableElement.A02) || this.A04 != clickableElement.A04) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A04 = ((((((AnonymousClass002.A04(this.A01) * 31) + AnonymousClass002.A04(this.A00)) * 31) + AnonymousClass002.A00(this.A05 ? 1 : 0)) * 31) + 1BL.A06(this.A03)) * 31;
        ExZ exZ = this.A02;
        if (exZ != null) {
            i = exZ.A00;
        }
        return 1BK.A03(this.A04, (A04 + i) * 31);
    }
}
