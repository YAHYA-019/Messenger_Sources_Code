package androidx.compose.foundation.layout;

import X.1BL;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.DKH;
import X.JQz;
import X.LOB;
import X.Lis;
import kotlin.jvm.functions.Function1;

/* loaded from: OffsetElement.class */
public final class OffsetElement extends LOB {
    public final float A00;
    public final boolean A01 = true;
    public final Function1 A02;

    public OffsetElement(Function1 function1, float f) {
        this.A00 = f;
        this.A02 = function1;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            OffsetElement offsetElement = obj instanceof OffsetElement ? (OffsetElement) obj : null;
            if (offsetElement == null) {
                return false;
            }
            if (AnonymousClass001.A1O(Float.compare(this.A00, offsetElement.A00)) && AnonymousClass001.A1O(Float.compare(0.0f, 0.0f)) && this.A01 == offsetElement.A01) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return 1BL.A00(JQz.A04(this.A00), 0.0f) + AnonymousClass002.A00(this.A01 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("OffsetModifierElement(x=");
        A0k.append((Object) Lis.A00(this.A00));
        A0k.append(", y=");
        A0k.append((Object) Lis.A00(0.0f));
        A0k.append(", rtlAware=");
        return DKH.A0q(A0k, this.A01);
    }
}
