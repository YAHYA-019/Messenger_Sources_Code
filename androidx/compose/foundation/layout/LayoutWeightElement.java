package androidx.compose.foundation.layout;

import X.AnonymousClass002;
import X.JQz;
import X.LOB;

/* loaded from: LayoutWeightElement.class */
public final class LayoutWeightElement extends LOB {
    public final float A00 = 1.0f;
    public final boolean A01 = true;

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
            if (layoutWeightElement == null) {
                return false;
            }
            if (this.A00 == layoutWeightElement.A00 && this.A01 == layoutWeightElement.A01) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return JQz.A04(this.A00) + AnonymousClass002.A00(this.A01 ? 1 : 0);
    }
}
