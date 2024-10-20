package androidx.compose.foundation.layout;

import X.11T;
import X.1BK;
import X.KU3;
import X.LOB;
import kotlin.jvm.functions.Function2;

/* loaded from: WrapContentElement.class */
public final class WrapContentElement extends LOB {
    public final Integer A00;
    public final Function2 A01;
    public final Object A02;

    public WrapContentElement(Integer num, Object obj, Function2 function2) {
        this.A00 = num;
        this.A01 = function2;
        this.A02 = obj;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            WrapContentElement wrapContentElement = (WrapContentElement) obj;
            if (this.A00 != wrapContentElement.A00 || !11T.A0O(this.A02, wrapContentElement.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A02, ((KU3.A00(this.A00) * 31) + 1237) * 31);
    }
}
