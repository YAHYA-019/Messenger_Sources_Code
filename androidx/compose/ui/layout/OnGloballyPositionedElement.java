package androidx.compose.ui.layout;

import X.LOB;
import kotlin.jvm.functions.Function1;

/* loaded from: OnGloballyPositionedElement.class */
public final class OnGloballyPositionedElement extends LOB {
    public final Function1 A00;

    public OnGloballyPositionedElement(Function1 function1) {
        this.A00 = function1;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof OnGloballyPositionedElement)) {
                return false;
            }
            if (this.A00 != ((OnGloballyPositionedElement) obj).A00) {
                z = false;
            }
        }
        return z;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
