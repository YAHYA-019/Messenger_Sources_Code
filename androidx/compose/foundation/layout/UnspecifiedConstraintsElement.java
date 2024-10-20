package androidx.compose.foundation.layout;

import X.AnonymousClass001;
import X.JQz;
import X.LOB;

/* loaded from: UnspecifiedConstraintsElement.class */
public final class UnspecifiedConstraintsElement extends LOB {
    public final float A00;
    public final float A01 = 0.0f / 0.0f;

    public UnspecifiedConstraintsElement(float f) {
        this.A00 = f;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof UnspecifiedConstraintsElement) {
            UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
            if (AnonymousClass001.A1O(Float.compare(this.A01, unspecifiedConstraintsElement.A01)) && AnonymousClass001.A1O(Float.compare(this.A00, unspecifiedConstraintsElement.A00))) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return JQz.A07(JQz.A04(this.A01), this.A00);
    }
}
