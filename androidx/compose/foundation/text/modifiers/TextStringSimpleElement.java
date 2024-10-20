package androidx.compose.foundation.text.modifiers;

import X.11T;
import X.4YV;
import X.AnonymousClass002;
import X.L4F;
import X.LOB;
import X.MBi;

/* loaded from: TextStringSimpleElement.class */
public final class TextStringSimpleElement extends LOB {
    public final int A00;
    public final int A01;
    public final int A02;
    public final L4F A03;
    public final MBi A04;
    public final String A05;
    public final boolean A06;

    public TextStringSimpleElement(L4F l4f, MBi mBi, String str, int i, int i2, int i3, boolean z) {
        this.A05 = str;
        this.A03 = l4f;
        this.A04 = mBi;
        this.A02 = i;
        this.A06 = z;
        this.A00 = i2;
        this.A01 = i3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof TextStringSimpleElement)) {
                return false;
            }
            TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
            if (!11T.A0O(this.A05, textStringSimpleElement.A05) || !11T.A0O(this.A03, textStringSimpleElement.A03) || !11T.A0O(this.A04, textStringSimpleElement.A04) || this.A02 != textStringSimpleElement.A02 || this.A06 != textStringSimpleElement.A06 || this.A00 != textStringSimpleElement.A00 || this.A01 != textStringSimpleElement.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((((AnonymousClass002.A05(this.A04, AnonymousClass002.A05(this.A03, 4YV.A02(this.A05))) + this.A02) * 31) + AnonymousClass002.A00(this.A06 ? 1 : 0)) * 31) + this.A00) * 31) + this.A01) * 31;
    }
}
