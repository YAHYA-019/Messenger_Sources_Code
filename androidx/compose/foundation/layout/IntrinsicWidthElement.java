package androidx.compose.foundation.layout;

import X.1BL;
import X.AnonymousClass002;
import X.KMU;
import X.LOB;
import kotlin.jvm.functions.Function1;

/* loaded from: IntrinsicWidthElement.class */
public final class IntrinsicWidthElement extends LOB {
    public final KMU A00;
    public final boolean A01 = true;
    public final Function1 A02;

    public IntrinsicWidthElement(KMU kmu, Function1 function1) {
        this.A00 = kmu;
        this.A02 = function1;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            IntrinsicWidthElement intrinsicWidthElement = obj instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) obj : null;
            if (intrinsicWidthElement == null) {
                return false;
            }
            if (this.A00 == intrinsicWidthElement.A00 && this.A01 == intrinsicWidthElement.A01) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return 1BL.A03(this.A00) + AnonymousClass002.A00(this.A01 ? 1 : 0);
    }
}
