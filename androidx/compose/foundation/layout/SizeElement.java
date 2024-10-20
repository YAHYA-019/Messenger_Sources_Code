package androidx.compose.foundation.layout;

import X.1BL;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.JQz;
import X.LOB;
import kotlin.jvm.functions.Function1;

/* loaded from: SizeElement.class */
public final class SizeElement extends LOB {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final boolean A04 = true;
    public final Function1 A05;

    public SizeElement(Function1 function1, float f, float f2, float f3, float f4) {
        this.A03 = f;
        this.A02 = f2;
        this.A01 = f3;
        this.A00 = f4;
        this.A05 = function1;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SizeElement)) {
                return false;
            }
            SizeElement sizeElement = (SizeElement) obj;
            if (!AnonymousClass001.A1O(Float.compare(this.A03, sizeElement.A03)) || !AnonymousClass001.A1O(Float.compare(this.A02, sizeElement.A02)) || !AnonymousClass001.A1O(Float.compare(this.A01, sizeElement.A01)) || !AnonymousClass001.A1O(Float.compare(this.A00, sizeElement.A00)) || this.A04 != sizeElement.A04) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BL.A00(1BL.A00(1BL.A00(JQz.A04(this.A03), this.A02), this.A01), this.A00) + AnonymousClass002.A00(this.A04 ? 1 : 0);
    }
}
