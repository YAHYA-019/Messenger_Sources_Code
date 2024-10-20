package androidx.compose.foundation.layout;

import X.1BL;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.JQz;
import X.LOB;
import kotlin.jvm.functions.Function1;

/* loaded from: PaddingElement.class */
public final class PaddingElement extends LOB {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public boolean A04 = true;
    public final Function1 A05;

    public PaddingElement(Function1 function1, float f, float f2, float f3, float f4) {
        this.A02 = f;
        this.A03 = f2;
        this.A01 = f3;
        this.A00 = f4;
        this.A05 = function1;
        if ((f < 0.0f && !AnonymousClass001.A1O(Float.compare(f, 0.0f / 0.0f))) || ((f2 < 0.0f && !AnonymousClass001.A1O(Float.compare(f2, 0.0f / 0.0f))) || ((f3 < 0.0f && !AnonymousClass001.A1O(Float.compare(f3, 0.0f / 0.0f))) || (f4 < 0.0f && !AnonymousClass001.A1O(Float.compare(f4, 0.0f / 0.0f)))))) {
            throw AnonymousClass001.A0L("Padding must be non-negative");
        }
    }

    public boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        boolean z = false;
        if (paddingElement != null && AnonymousClass001.A1O(Float.compare(this.A02, paddingElement.A02)) && AnonymousClass001.A1O(Float.compare(this.A03, paddingElement.A03)) && AnonymousClass001.A1O(Float.compare(this.A01, paddingElement.A01)) && AnonymousClass001.A1O(Float.compare(this.A00, paddingElement.A00)) && this.A04 == paddingElement.A04) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return 1BL.A00(1BL.A00(1BL.A00(JQz.A04(this.A02), this.A03), this.A01), this.A00) + AnonymousClass002.A00(this.A04 ? 1 : 0);
    }
}
