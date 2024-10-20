package androidx.compose.ui.input.rotary;

import X.11T;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.LOB;
import kotlin.jvm.functions.Function1;

/* loaded from: RotaryInputElement.class */
public final class RotaryInputElement extends LOB {
    public final Function1 A00;

    public RotaryInputElement(Function1 function1) {
        this.A00 = function1;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof RotaryInputElement) && 11T.A0O(this.A00, ((RotaryInputElement) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass001.A02(this.A00) * 31;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("RotaryInputElement(onRotaryScrollEvent=");
        A0k.append(this.A00);
        A0k.append(", onPreRotaryScrollEvent=");
        return AnonymousClass002.A0K(null, A0k);
    }
}
