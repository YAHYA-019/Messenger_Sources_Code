package androidx.compose.foundation.layout;

import X.11T;
import X.LOB;
import X.MBG;
import kotlin.jvm.functions.Function1;

/* loaded from: PaddingValuesElement.class */
public final class PaddingValuesElement extends LOB {
    public final MBG A00;
    public final Function1 A01;

    public PaddingValuesElement(MBG mbg, Function1 function1) {
        this.A00 = mbg;
        this.A01 = function1;
    }

    public boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement;
        if (!(obj instanceof PaddingValuesElement) || (paddingValuesElement = (PaddingValuesElement) obj) == null) {
            return false;
        }
        return 11T.A0O(this.A00, paddingValuesElement.A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
