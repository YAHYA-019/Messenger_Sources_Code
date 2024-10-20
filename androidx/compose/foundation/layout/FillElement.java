package androidx.compose.foundation.layout;

import X.JQz;
import X.KU3;
import X.LOB;

/* loaded from: FillElement.class */
public final class FillElement extends LOB {
    public final float A00 = 1.0f;
    public final Integer A01;

    public FillElement(Integer num) {
        this.A01 = num;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FillElement)) {
                return false;
            }
            FillElement fillElement = (FillElement) obj;
            if (this.A01 != fillElement.A01 || this.A00 != fillElement.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return JQz.A07(KU3.A00(this.A01) * 31, this.A00);
    }
}
