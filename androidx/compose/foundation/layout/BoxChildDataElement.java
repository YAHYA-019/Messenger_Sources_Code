package androidx.compose.foundation.layout;

import X.11T;
import X.1BL;
import X.LOB;
import androidx.compose.ui.Alignment;
import kotlin.jvm.functions.Function1;

/* loaded from: BoxChildDataElement.class */
public final class BoxChildDataElement extends LOB {
    public final Alignment A00;
    public final Function1 A01;

    public BoxChildDataElement(Alignment alignment, Function1 function1) {
        this.A00 = alignment;
        this.A01 = function1;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
            if (boxChildDataElement == null) {
                return false;
            }
            if (!11T.A0O(this.A00, boxChildDataElement.A00)) {
                z = false;
            }
        }
        return z;
    }

    public int hashCode() {
        return 1BL.A03(this.A00) + 1237;
    }
}
