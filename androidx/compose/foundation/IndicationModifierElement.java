package androidx.compose.foundation;

import X.11T;
import X.1BK;
import X.1BL;
import X.LOB;
import X.MBF;
import X.MMr;

/* loaded from: IndicationModifierElement.class */
public final class IndicationModifierElement extends LOB {
    public final MMr A00;
    public final MBF A01;

    public IndicationModifierElement(MMr mMr, MBF mbf) {
        this.A01 = mbf;
        this.A00 = mMr;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof IndicationModifierElement)) {
                return false;
            }
            IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
            if (!11T.A0O(this.A01, indicationModifierElement.A01) || !11T.A0O(this.A00, indicationModifierElement.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A00, 1BL.A03(this.A01));
    }
}
