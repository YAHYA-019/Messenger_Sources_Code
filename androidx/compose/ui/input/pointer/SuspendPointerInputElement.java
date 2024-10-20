package androidx.compose.ui.input.pointer;

import X.11T;
import X.1BK;
import X.AnonymousClass002;
import X.LOB;
import kotlin.jvm.functions.Function2;

/* loaded from: SuspendPointerInputElement.class */
public final class SuspendPointerInputElement extends LOB {
    public final Object A00;
    public final Function2 A01;

    public SuspendPointerInputElement(Object obj, Function2 function2) {
        this.A00 = obj;
        this.A01 = function2;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof SuspendPointerInputElement)) {
                return false;
            }
            SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
            if (!11T.A0O(this.A00, suspendPointerInputElement.A00)) {
                return false;
            }
            if (this.A01 != suspendPointerInputElement.A01) {
                z = false;
            }
        }
        return z;
    }

    public int hashCode() {
        return 1BK.A03(this.A01, AnonymousClass002.A04(this.A00) * 31 * 31 * 31);
    }
}
